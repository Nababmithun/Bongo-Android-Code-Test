package com.movieplayer.base_mvvm.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/movieplayer/base_mvvm/di/module/NetworkModule;", "", "()V", "provideApiServiceBuilder", "Lcom/movieplayer/base_mvvm/data/remote/ApiServiceBuilder;", "retrofit", "Lretrofit2/Retrofit;", "provideRetrofitApiClient", "context", "Landroid/content/Context;", "networkUtils", "Lcom/movieplayer/base_mvvm/utils/NetworkUtils;", "preferenceManager", "Lcom/movieplayer/base_mvvm/data/local/SharedPrefManager;", "provideTheMovieDbApiService", "Lcom/movieplayer/base_mvvm/data/remote/api_service/TheMovieDbApiService;", "apiServiceBuilder", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofitApiClient(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.movieplayer.base_mvvm.utils.NetworkUtils networkUtils, @org.jetbrains.annotations.NotNull()
    com.movieplayer.base_mvvm.data.local.SharedPrefManager preferenceManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.movieplayer.base_mvvm.data.remote.ApiServiceBuilder provideApiServiceBuilder(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.movieplayer.base_mvvm.data.remote.api_service.TheMovieDbApiService provideTheMovieDbApiService(@org.jetbrains.annotations.NotNull()
    com.movieplayer.base_mvvm.data.remote.ApiServiceBuilder apiServiceBuilder) {
        return null;
    }
    
    public NetworkModule() {
        super();
    }
}