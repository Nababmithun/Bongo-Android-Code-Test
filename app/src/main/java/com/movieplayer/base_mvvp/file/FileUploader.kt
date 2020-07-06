package com.movieplayer.base_mvvp.file

import android.content.Context
import android.content.CursorLoader
import android.net.Uri
import android.provider.MediaStore
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class FileUploader(private val context: Context) {

    fun getMultipartBodyPart(fileName: String, fileUri: Uri?): MultipartBody.Part? {
        if (fileUri != null) {
            val file = File(getRealPathFromUri(fileUri)!!)
            val requestFile = RequestBody.create(MediaType.parse(context.contentResolver.getType(fileUri)!!), file)
            return MultipartBody.Part.createFormData(fileName, file.name, requestFile)
        } else
            return null
    }

    fun getMultipartBodyPartFromFile(fileName: String, file: File?): MultipartBody.Part? {
        return if (file != null) {
            val requestFile = RequestBody.create(MediaType.parse("image/*"), file)
            MultipartBody.Part.createFormData(fileName, file.name, requestFile)
        } else {
            null
        }
    }

    fun getRealPathFromUri(fileUri: Uri): String? {
        val filePathColumn = arrayOf(MediaStore.Images.Media.DATA)
        val loader = CursorLoader(context, fileUri, filePathColumn, null, null, null)
        val cursor = loader.loadInBackground()
        if (cursor == null) {
            return fileUri.path
        } else {
            val columnIndex = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA)
            cursor.moveToFirst()
            val picturePath = cursor.getString(columnIndex)
            cursor.close()
            return picturePath
        }
    }

    fun createPartFromString(text: String): RequestBody {
        return RequestBody.create(MultipartBody.FORM, text)
    }
}
