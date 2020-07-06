package com.movieplayer.base_mvvp.utils

import android.os.AsyncTask
import org.jsoup.Jsoup
import java.io.IOException


class PlayStoreVersionChecker(private val packageName: String) : AsyncTask<String, String, String>() {

    private var playStoreVersion: String = "0.0"

    override fun doInBackground(vararg params: String?): String {
        try {
            playStoreVersion =
                    Jsoup.connect("https://play.google.com/store/apps/details?id=$packageName&hl=en")
                        .timeout(30000)
                        .userAgent("Mozilla/5.0 (Windows; U; WindowsNT 5.1; en-US; rv1.8.1.6) Gecko/20070725 Firefox/2.0.0.6")
                        .referrer("http://www.google.com")
                        .get()
                        .select("div.hAyfc:nth-child(4) > span:nth-child(2) > div:nth-child(1) > span:nth-child(1)")
                        .first()
                        .ownText()
        } catch (e: IOException) {
        }
        return playStoreVersion
    }
}

/**
 * THis will return version Name.
 * This is basically web scrapping with jsoup library
 * */