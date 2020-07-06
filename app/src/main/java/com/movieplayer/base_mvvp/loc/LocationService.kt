package com.movieplayer.base_mvvp.loc

import android.app.Service
import android.content.Intent
import android.os.IBinder

class LocationService : Service() {

    private var ssFusedLocationApiClient: SSFusedLocationProviderClient? = null

    override fun onCreate() {
        super.onCreate()
        ssFusedLocationApiClient = SSFusedLocationProviderClient(this)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        ssFusedLocationApiClient?.startLocationUpdates()
        return START_NOT_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onDestroy() {
        ssFusedLocationApiClient?.stopLocationUpdates()
        ssFusedLocationApiClient?.onDestroy()
        ssFusedLocationApiClient = null
        super.onDestroy()
    }
}

/** How to use ???????????
 *
 *
 *
 *
 *
 * */