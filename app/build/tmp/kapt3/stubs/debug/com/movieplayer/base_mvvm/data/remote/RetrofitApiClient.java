package com.movieplayer.base_mvvm.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/movieplayer/base_mvvm/data/remote/RetrofitApiClient;", "", "()V", "CACHE_SIZE", "", "HEADER_CACHE_CONTROL", "", "HEADER_PRAGMA", "MAX_AGE", "MAX_STALE", "getRetrofit", "Lretrofit2/Retrofit;", "context", "Landroid/content/Context;", "networkUtils", "Lcom/movieplayer/base_mvvm/utils/NetworkUtils;", "preferenceManager", "Lcom/movieplayer/base_mvvm/data/local/SharedPrefManager;", "app_debug"})
public final class RetrofitApiClient {
    private static final java.lang.String HEADER_CACHE_CONTROL = "Cache-Control";
    private static final java.lang.String HEADER_PRAGMA = "Pragma";
    private static final int CACHE_SIZE = 10485760;
    private static final int MAX_AGE = 10;
    private static final int MAX_STALE = 1;
    public static final com.movieplayer.base_mvvm.data.remote.RetrofitApiClient INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit getRetrofit(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.movieplayer.base_mvvm.utils.NetworkUtils networkUtils, @org.jetbrains.annotations.NotNull()
    com.movieplayer.base_mvvm.data.local.SharedPrefManager preferenceManager) {
        return null;
    }
    
    private RetrofitApiClient() {
        super();
    }
}