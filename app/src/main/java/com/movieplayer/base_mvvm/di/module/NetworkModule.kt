package com.movieplayer.base_mvvm.di.module

import android.content.Context
import com.movieplayer.base_mvvm.data.local.SharedPrefManager
import com.movieplayer.base_mvvm.data.remote.ApiServiceBuilder
import com.movieplayer.base_mvvm.data.remote.RetrofitApiClient
import com.movieplayer.base_mvvm.data.remote.api_service.TheMovieDbApiService
import com.movieplayer.base_mvvm.utils.NetworkUtils
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofitApiClient(
        context: Context,
        networkUtils: NetworkUtils,
        preferenceManager: SharedPrefManager
    ): Retrofit {
        return RetrofitApiClient.getRetrofit(context, networkUtils, preferenceManager)
    }

    @Provides
    @Singleton
    fun provideApiServiceBuilder(retrofit: Retrofit): ApiServiceBuilder {
        return ApiServiceBuilder(retrofit)
    }

    //////////////////////////////////////////////////////////////////


    @Provides
    @Singleton
    fun provideTheMovieDbApiService(apiServiceBuilder: ApiServiceBuilder): TheMovieDbApiService {
        return apiServiceBuilder.buildService(TheMovieDbApiService::class.java)
    }

}