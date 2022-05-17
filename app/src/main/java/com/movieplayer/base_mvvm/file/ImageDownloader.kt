package com.movieplayer.base_mvvm.file

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.AsyncTask
import com.movieplayer.base_mvvm.utils.NotificationUtils
import java.io.IOException
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.MalformedURLException
import java.net.URL

class ImageDownloader(
    private val imageUrl: String,
    private val callbackImageDownload: CallbackImageDownload
) : AsyncTask<String, Void, Bitmap>() {

    override fun doInBackground(vararg params: String): Bitmap? {
        try {
            val url = URL(imageUrl)
            val inputStream: InputStream
            val connection = url.openConnection() as HttpURLConnection
            connection.doInput = true
            connection.connect()
            inputStream = connection.inputStream
            return BitmapFactory.decodeStream(inputStream)

        } catch (e: MalformedURLException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        }

        return null
    }

    override fun onPostExecute(bitmap: Bitmap) {
        callbackImageDownload.imageDidDownload(bitmap)
    }

    interface CallbackImageDownload {

        fun imageDidDownload(bitmap: Bitmap?)
    }
}