package com.movieplayer.base_mvvp.file

import android.annotation.SuppressLint
import android.content.ContentResolver
import android.content.ContentUris
import android.content.Context
import android.content.CursorLoader
import android.database.Cursor
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.DocumentsContract
import android.provider.MediaStore
import android.text.TextUtils
import android.util.Log
import android.webkit.MimeTypeMap
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class FileUtils private constructor() {

    companion object { val sharedInstance by lazy { FileUtils }}

    private var errorReason: String? = null
    private var isDriveFile: Boolean = false
    private var isFromUnknownProvider: Boolean = false
    private var unknownProviderCalledBefore = false
    private var asyncTask: DownloadAsyncTask? = null
    private var pickItCallbacks: CallbackGetPathFromUri? = null

    /**
     * Gets the extension of a file name, like ".png" or ".jpg".
     *
     * @param uri
     * @return Extension including the dot("."); "" if there is no extension;
     * null if file was null.
     */
    fun getFileExtension(uri: String?): String? {
        uri?.let {
            val dot = it.lastIndexOf(".")
            return if (dot >= 0) {
                it.substring(dot)
            } else null
        }
        return null
    }

    /**
     * Convert File into Uri.
     */
    private fun getUriFromFile(file: File?): Uri? {
        return if (file != null) {
            Uri.fromFile(file)
        } else null
    }


    fun getFile(context: Context, filePath: String): File? {
        return if (filePath.isNotEmpty())
            File(filePath)
        else null
    }


    /** Creating Request body from String >>>>>*/
    fun createRequestBodyFromString(text: String): RequestBody {
        return RequestBody.create(MultipartBody.FORM, text)
    }


    /** Creating MultiPart Body From File >>>>>>>>> */
    fun createMultipartBody(
        fileName: String,
        filePath: String?
    ): MultipartBody.Part? {
        filePath?.let {
            val file = File(filePath)
            return createMultiPartBody(fileName, file)
        }
        return null
    }

    fun createMultiPartBody(
        fileName: String,
        file: File?
    ): MultipartBody.Part? {
        file?.let {
            val requestBody: RequestBody = RequestBody.create(MediaType.parse("*/*"), it)
            return MultipartBody.Part.createFormData(fileName, it.name, requestBody)
        }
        return null
    }


    /**
     * get file size from file path and from file .....
     *
     *  * if path is null or empty or inSize is not in kb, mb or gob , return -1
     *  * if path exist and it is a file, return file size, else return -1
     */
    fun getFileSize(filePath: String, inSize: String = "KB"): Long {
        if (TextUtils.isEmpty(filePath)) {
            return -1
        }
        val file = File(filePath)
        return getFileSize(file, inSize)
    }


    fun getFileSize(file: File?, inSize: String = "KB"): Long {
        return if (file != null && file.exists() && file.isFile) {
            when {
                inSize.toLowerCase() == "kb" -> file.length() / 1024 // file size in kb
                inSize.toLowerCase() == "mb" -> file.length() / 1024 / 1024 // file size in mb
                inSize.toLowerCase() == "gb" -> file.length() / 1024 / 1024 / 1024 // file size in mb
                inSize.isEmpty() -> file.length()
                else -> -1

            }
        } else -1
    }


    /**
     * delete file or directory
     *
     *  * if path is null or empty, return true
     *  * if path not exist, return true
     *  * if path exist, delete recursion. return true
     *
     *
     * @param path 文件路径
     * @return 是否删除成功
     */
    fun deleteFile(path: String): Boolean {
        if (TextUtils.isEmpty(path)) {
            return true
        }

        val file = File(path)
        return deleteFile(file)
    }


    fun deleteFile(file: File?): Boolean {
        if (file == null || !file.exists()) {
            return false
        }
        if (file.isFile) {
            return file.delete()
        }
        if (!file.isDirectory) {
            return false
        }
        val childFile = file.listFiles()
        if (childFile == null || childFile.isEmpty()) {
            return file.delete()
        }
        for (f in childFile) {
            deleteFile(f)
        }
        return file.delete()
    }


    /***************************************************************/
    /** TODO: Code Copied from PickIT >>>>> */
    fun getPathFromUri(context: Context, uri: Uri, APILevel: Int, PickItCallbacks: CallbackGetPathFromUri) {
        val returnedPath: String?
        if (APILevel >= 19) {
            // Drive file was selected
            if (isOneDrive(uri) || isDropBox(uri) || isGoogleDrive(uri)) {
                isDriveFile = true
                downloadFile(uri, context)
            } else {
                returnedPath = getRealPathFromUriAPI19(context, uri)

                //Get the file extension
                val mime = MimeTypeMap.getSingleton()
                val subStringExtension = returnedPath.toString().substring(returnedPath.toString().lastIndexOf(".") + 1)
                val extensionFromMime = mime.getExtensionFromMimeType(context.contentResolver.getType(uri))

                // Path is null
                if (returnedPath == null || returnedPath == "") {
                    // This can be caused by two situations
                    // 1. The file was selected from a third party app and the data column returned null (for example EZ File Explorer)
                    // Some file providers (like EZ File Explorer) will return a URI as shown below:
                    // content://es.fileexplorer.filebrowser.ezfilemanager.externalstorage.documents/document/primary%3AFolderName%2FNameOfFile.mp4
                    // When you try to read the _data column, it will return null, without trowing an exception
                    // In this case the file need to copied/created a new file in the temporary folder
                    // 2. There was an error
                    // In this case call onCompleteListener and get/provide the reason why it failed

                    //We first check if it was called before, avoiding multiple calls
                    if (!unknownProviderCalledBefore) {
                        unknownProviderCalledBefore = true
                        if (uri.scheme != null && uri.scheme == ContentResolver.SCHEME_CONTENT) {
                            //Then we check if the _data colomn returned null
                            if (errorReason != null && errorReason.equals("dataReturnedNull")) {
                                isFromUnknownProvider = true
                                //Copy the file to the temporary folder
                                downloadFile(uri, context)
                                return
                            } else if (errorReason != null && errorReason!!.contains("column '_data' does not exist")) {
                                isFromUnknownProvider = true
                                //Copy the file to the temporary folder
                                downloadFile(uri, context)
                                return
                            }
                        }
                    }
                    //Else an error occurred, get/set the reason for the error
                    PickItCallbacks.onCompleteListener(
                        returnedPath, false, false, false,
                        errorReason
                    )
                } else {
                    // This can be caused by two situations
                    // 1. The file was selected from an unknown provider (for example a file that was downloaded from a third party app)
                    // 2. getFileExtensionFromMimeType returned an unknown mime type for example "audio/mp4"
                    //
                    // When this is case we will copy/write the file to the temp folder, same as when a file is selected from Google Drive etc.
                    // We provide a name by getting the text after the last "/"
                    // Remember if the extension can't be found, it will not be added, but you will still be able to use the file
                    //Todo: Add checks for unknown file extensions

                    if (subStringExtension != extensionFromMime && uri.scheme != null && uri.scheme == ContentResolver.SCHEME_CONTENT) {
                        isFromUnknownProvider = true
                        downloadFile(uri, context)
                        return
                    }

                    // Path can be returned, no need to make a "copy"
                    PickItCallbacks.onCompleteListener(returnedPath, false, false, true, "")
                }// Path is not null
            }// Local file was selected
        } else {
            // Todo: Test API <19
            returnedPath = getRealPathFromURIBelowAPI19(context, uri)
            PickItCallbacks.onCompleteListener(returnedPath, false, false, true, "")
        }
    }

    // Create a new file from the Uri that was selected
    private fun downloadFile(uri: Uri, context: Context) {
        asyncTask = DownloadAsyncTask(uri, context, callbackTask)
        asyncTask?.execute()
    }

    // End the "copying" of the file
    fun cancelTask(context: Context) {
        if (asyncTask != null) {
            asyncTask?.cancel(true)
            deleteTemporaryFile(context)
        }
    }

    // Delete the temporary folder
    fun deleteTemporaryFile(context: Context) {
        val folder = context.getExternalFilesDir("Temp")
        if (folder != null) {
            if (deleteDirectory(folder)) {
                Log.i("PickiT ", " deleteDirectory was called")
            }
        }
    }

    private fun deleteDirectory(path: File): Boolean {
        if (path.exists()) {
            val files = path.listFiles() ?: return false
            for (file in files) {
                if (file.isDirectory) {
                    deleteDirectory(file)
                } else {
                    val wasSuccessful = file.delete()
                    if (wasSuccessful) {
                        Log.i("Deleted ", "successfully")
                    }
                }
            }
        }
        return path.delete()
    }


    // Check different providers

    fun wasLocalFileSelected(uri: Uri): Boolean {
        return !isDropBox(uri) && !isGoogleDrive(uri) && !isOneDrive(uri)
    }

    private fun isDropBox(uri: Uri): Boolean {
        return uri.toString().toLowerCase().contains("content://com.dropbox.android")
    }

    private fun isGoogleDrive(uri: Uri): Boolean {
        return uri.toString().toLowerCase().contains("com.google.android.apps")
    }

    private fun isOneDrive(uri: Uri): Boolean {
        return uri.toString().toLowerCase().contains("com.microsoft.skydrive.content")
    }


    /// TODO: From PickIT
    @SuppressLint("NewApi")
    @Suppress("DEPRECATION")
    private fun getRealPathFromUriAPI19(context: Context, uri: Uri): String? {

        val isKitKat = Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT

        if (isKitKat && DocumentsContract.isDocumentUri(context, uri)) {
            when {
                isExternalStorageDocument(uri) -> {
                    val docId = DocumentsContract.getDocumentId(uri)
                    val split = docId.split(":".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                    val type = split[0]

                    return if ("primary".equals(type, ignoreCase = true)) {
                        if (split.size > 1) {
                            "${Environment.getExternalStorageDirectory()}${split[1]}"
                        } else {
                            "${Environment.getExternalStorageDirectory()}/"
                        }
                    } else {
                        "storage" + "/" + docId.replace(":", "/")
                    }

                }
                isRawDownloadsDocument(uri) -> {
                    val fileName = getFilePath(context, uri)
                    val subFolderName = getSubFolders(uri)

                    if (fileName != null) {
                        return Environment.getExternalStorageDirectory().toString() + "/Download/" + subFolderName + fileName
                    }
                    val id = DocumentsContract.getDocumentId(uri)

                    val contentUri = ContentUris.withAppendedId(
                        Uri.parse("content://downloads/public_downloads"),
                        java.lang.Long.valueOf(id)
                    )
                    return dataColumn(context, contentUri, null, null)
                }
                isDownloadsDocument(uri) -> {
                    val fileName = getFilePath(context, uri)

                    if (fileName != null) {
                        return Environment.getExternalStorageDirectory().toString() + "/Download/" + fileName
                    }
                    var id = DocumentsContract.getDocumentId(uri)
                    if (id.startsWith("raw:")) {
                        id = id.replaceFirst("raw:".toRegex(), "")
                        val file = File(id)
                        if (file.exists())
                            return id
                    }
                    if (id.startsWith("raw%3A%2F")) {
                        id = id.replaceFirst("raw%3A%2F".toRegex(), "")
                        val file = File(id)
                        if (file.exists())
                            return id
                    }
                    val contentUri = ContentUris.withAppendedId(
                        Uri.parse("content://downloads/public_downloads"),
                        java.lang.Long.valueOf(id)
                    )
                    return dataColumn(context, contentUri, null, null)
                }
                isMediaDocument(uri) -> {
                    val docId = DocumentsContract.getDocumentId(uri)
                    val split = docId.split(":".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                    val type = split[0]

                    var contentUri: Uri? = null
                    when (type) {
                        "image" -> contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
                        "video" -> contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI
                        "audio" -> contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
                    }

                    val selection = "_id=?"
                    val selectionArgs = arrayOf(split[1])
                    return dataColumn(context, contentUri!!, selection, selectionArgs)
                }
            }
        } else if ("content".equals(uri.scheme!!, ignoreCase = true)) {
            if (isGooglePhotosUri(uri)) {
                return uri.lastPathSegment
            }
            if (dataColumn(context, uri, null, null) == null) {
                errorReason = "dataReturnedNull"
            }
            return dataColumn(context, uri, null, null)
        } else if ("file".equals(uri.scheme!!, ignoreCase = true)) {
            return uri.path
        }

        return null
    }

    private fun getSubFolders(uri: Uri): String {
        val replaceChars = uri.toString().replace("%2F", "/").replace("%20", " ").replace("%3A", ":")
        val bits = replaceChars.split("/".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val sub5 = bits[bits.size - 2]
        val sub4 = bits[bits.size - 3]
        val sub3 = bits[bits.size - 4]
        val sub2 = bits[bits.size - 5]
        val sub1 = bits[bits.size - 6]
        return if (sub1 == "Download") {
            "$sub2/$sub3/$sub4/$sub5/"
        } else if (sub2 == "Download") {
            "$sub3/$sub4/$sub5/"
        } else if (sub3 == "Download") {
            "$sub4/$sub5/"
        } else if (sub4 == "Download") {
            "$sub5/"
        } else {
            ""
        }
    }

    @Suppress("DEPRECATION")
    private fun getRealPathFromURIBelowAPI19(context: Context, contentUri: Uri): String {
        val projection = arrayOf(MediaStore.Video.Media.DATA)
        val loader = CursorLoader(context, contentUri, projection, null, null, null)
        val cursor = loader.loadInBackground()
        val columnIndex = cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DATA)
        cursor.moveToFirst()
        val result = cursor.getString(columnIndex)
        cursor.close()
        return result
    }

    private fun dataColumn(context: Context, uri: Uri, selection: String?, selectionArgs: Array<String>?): String? {
        var cursor: Cursor? = null
        val column = "_data"
        val projection = arrayOf(column)
        try {
            cursor = context.contentResolver.query(uri, projection, selection, selectionArgs, null)
            if (cursor != null && cursor.moveToFirst()) {
                val index = cursor.getColumnIndexOrThrow(column)
                return cursor.getString(index)
            }
        } catch (e: Exception) {
            errorReason = e.message
        } finally {
            cursor?.close()
        }
        return null
    }

    private fun getFilePath(context: Context, uri: Uri): String? {
        var cursor: Cursor? = null
        val projection = arrayOf(MediaStore.Files.FileColumns.DISPLAY_NAME)
        try {
            cursor = context.contentResolver.query(uri, projection, null, null, null)
            if (cursor != null && cursor.moveToFirst()) {
                val index = cursor.getColumnIndexOrThrow(MediaStore.Files.FileColumns.DISPLAY_NAME)
                return cursor.getString(index)
            }
        } catch (e: Exception) {
            errorReason = e.message
        } finally {
            cursor?.close()
        }
        return null
    }

    private fun isExternalStorageDocument(uri: Uri): Boolean {
        return "com.android.externalstorage.documents" == uri.authority
    }

    private fun isDownloadsDocument(uri: Uri): Boolean {
        return "com.android.providers.downloads.documents" == uri.authority
    }

    private fun isRawDownloadsDocument(uri: Uri): Boolean {
        val uriToString = uri.toString()
        return uriToString.contains("com.android.providers.downloads.documents/document/raw")
    }

    private fun isMediaDocument(uri: Uri): Boolean {
        return "com.android.providers.media.documents" == uri.authority
    }

    private fun isGooglePhotosUri(uri: Uri): Boolean {
        return "com.google.android.apps.photos.content" == uri.authority
    }

    private val callbackTask = object : CallBackDownloadAsyncTask {

        override fun onPreExecute() {
            pickItCallbacks?.onStartListener()
        }

        override fun onProgressUpdate(progress: Int?) {
            pickItCallbacks?.onProgressUpdate(progress)
        }

        override fun onPostExecute(path: String, wasDriveFile: Boolean, wasSuccessful: Boolean, reason: String) {
            unknownProviderCalledBefore = false
            if (wasSuccessful) {
                if (isDriveFile) {
                    pickItCallbacks?.onCompleteListener(path, true, false, true, "");
                } else if (isFromUnknownProvider) {
                    pickItCallbacks?.onCompleteListener(path, false, true, true, "");
                }
            } else {
                if (isDriveFile) {
                    pickItCallbacks?.onCompleteListener(path, true, false, false, reason);
                } else if (isFromUnknownProvider) {
                    pickItCallbacks?.onCompleteListener(path, false, true, false, reason);
                }
            }
        }
    }

    interface CallbackGetPathFromUri {
        fun onStartListener()
        fun onProgressUpdate(progress: Int?)
        fun onCompleteListener(
            path: String?,
            wasDriveFile: Boolean,
            wasUnknownProvider: Boolean,
            wasSuccessful: Boolean,
            Reason: String?
        )
    }

    interface CallBackDownloadAsyncTask {
        fun onPreExecute()
        fun onProgressUpdate(progress: Int?)
        fun onPostExecute(path: String, wasDriveFile: Boolean, wasSuccessful: Boolean, reason: String)
    }
}

/** How to use ????????????????
 *
 *
 */
