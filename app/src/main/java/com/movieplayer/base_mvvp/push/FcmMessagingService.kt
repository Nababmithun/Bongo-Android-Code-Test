package com.movieplayer.base_mvvp.push

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.movieplayer.base_mvvp.R
import com.movieplayer.base_mvvp.data.local.PrefKeys
import com.movieplayer.base_mvvp.data.local.SharedPrefManager
import com.movieplayer.base_mvvp.utils.NotificationUtils
import org.json.JSONObject

class FcmMessagingService : FirebaseMessagingService() {

    private var mNotificationUtils: NotificationUtils? = null
    private var mPrefs: SharedPrefManager? = null


    override fun onCreate() {
        super.onCreate()
        mNotificationUtils = NotificationUtils(this)
        mPrefs = SharedPrefManager(this)
    }

    override fun onNewToken(newToken: String) {
        mPrefs?.let {
            mPrefs!!.putString(PrefKeys.DEVICE_TOKEN, newToken)
        }
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage) {

        remoteMessage.notification?.let {
            val title = remoteMessage.notification!!.title
            val body = remoteMessage.notification!!.body
            handleNotificationMessage(title, body)
        }

        /*...................................................
            Handle Data Payload
         ..................................................*/

        if (remoteMessage.data.isNotEmpty()) {
            try {
                val json = JSONObject(remoteMessage.data as Map<*, *>)
                handleDataMessage(json)
            } catch (e: Exception) {
                // Log.d(TAG, e.message)
            }

        }
    }

    private fun handleNotificationMessage(title: String?, message: String?) {
        /* If app is in background, notification will be handled by fireBase itself.
        We have to show notification manually if app is in foreground. */
        mNotificationUtils?.let {
            if (mNotificationUtils!!.isAppIsInBackground(applicationContext)) {
                if (mPrefs != null) {
                    if (mPrefs!!.getBoolean(PrefKeys.IS_NOTIFICATION_ENABLED, true)) {
                        mNotificationUtils!!.showNotification(R.mipmap.ic_launcher, title, message, null)
                    }
                }

            }
        }
    }

    private fun handleDataMessage(notificationJson: JSONObject) {
        val title = notificationJson.optString("title")
        val message = notificationJson.optString("message")
        val imageUrl = notificationJson.optString("image")
        mNotificationUtils?.let {
            if (mPrefs != null) {
                if (mPrefs!!.getBoolean(PrefKeys.IS_NOTIFICATION_ENABLED, true)) {
                    mNotificationUtils!!.showNotification(
                        R.mipmap.ic_launcher,
                        title,
                        message,
                        imageUrl
                    )

                }
            }
        }
    }
}
