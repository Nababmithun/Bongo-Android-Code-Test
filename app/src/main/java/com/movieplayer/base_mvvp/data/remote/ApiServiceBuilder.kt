package com.movieplayer.base_mvvp.data.remote
import retrofit2.Retrofit

class ApiServiceBuilder (private val retrofit: Retrofit) {

    fun <T> buildService(serviceType: Class<T>): T {
        return retrofit.create(serviceType)
    }
}