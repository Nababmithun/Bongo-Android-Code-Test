package com.movieplayer.base_mvvp.loc

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.location.Location
import android.location.LocationManager
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.movieplayer.base_mvvp.utils.Constants.Keys.IntentKeys
import com.google.android.gms.location.*

class SSFusedLocationProviderClient constructor(val mContext: Context) {

    private val INTERVAL = (1000 * 10).toLong() // 10 Sec
    private val LOCATION_REFRESH_TIME = (1000 * 2).toLong() // 5 Sec

    private var fusedLocationProviderClient: FusedLocationProviderClient? = null
    private var mLastLocation: Location? = null
    private var mLocationRequest: LocationRequest? = null
    private var mLocationCallback: LocationCallback? = null

    companion object {
        var mLatitude: Double = 0.0 // mLatitude
        var mLongitude: Double = 0.0 // mLongitude
    }

    init {
        buildLocationRequest()
        buildLocationCallback()
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(mContext)
    }

    private fun buildLocationRequest() {
        mLocationRequest = LocationRequest.create()
            .setInterval(INTERVAL)
            .setFastestInterval(LOCATION_REFRESH_TIME)
            .setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY)
    }

    private fun buildLocationCallback() {
        mLocationCallback = object : LocationCallback() {
            override fun onLocationResult(locationResult: LocationResult?) {
                locationResult?.let {
                    // mContext.showToast("Location received")
                    for (location in locationResult.locations) {
                        if (location != null) {
                            mLastLocation = location
                            mLatitude = location.latitude
                            mLongitude = location.longitude

                            val locationIntent = Intent(IntentKeys.LOCATION_ACTION)
                            locationIntent.putExtra(IntentKeys.LATITUDE, "$mLatitude")
                            locationIntent.putExtra(IntentKeys.LONGITUDE, "$mLongitude")
                            LocalBroadcastManager.getInstance(mContext).sendBroadcast(locationIntent)
                            // val locationName = "${getCurrentAddress(mLatitude, mLongitude)}"
                            // mContext.showToast(locationName)
                            break
                        }
                    }
                }
            }
        }
    }

    @SuppressLint("MissingPermission")
    fun startLocationUpdates() {
        if (isLocationProviderEnabled()) {
            fusedLocationProviderClient?.requestLocationUpdates(mLocationRequest, mLocationCallback, null)
        }
    }

    fun stopLocationUpdates() {
        fusedLocationProviderClient?.removeLocationUpdates(mLocationCallback)
    }

    fun isLocationProviderEnabled(): Boolean {
        val lm = mContext.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        val isGpsProviderEnabled = lm.isProviderEnabled(LocationManager.GPS_PROVIDER)
        val isNetworkProviderEnabled = lm.isProviderEnabled(LocationManager.NETWORK_PROVIDER)
        return isGpsProviderEnabled || isNetworkProviderEnabled
    }

    fun onDestroy() {
        mLocationCallback = null
        mLocationRequest = null
        fusedLocationProviderClient = null
    }
}

/** How to use ??????????????
 *
 *
 * */