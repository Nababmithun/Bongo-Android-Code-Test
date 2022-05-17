package com.movieplayer.base_mvvm.ui.activity.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0016"}, d2 = {"Lcom/movieplayer/base_mvvm/ui/activity/movie/PopularMoviesViewModel;", "Lcom/movieplayer/base_mvvm/base/BaseViewModel;", "()V", "popularMovieResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/movieplayer/base_mvvm/data/remote/api_response/PopularMovieResponse;", "getPopularMovieResponse", "()Landroidx/lifecycle/MutableLiveData;", "setPopularMovieResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "theMovieDbApiService", "Lcom/movieplayer/base_mvvm/data/remote/api_service/TheMovieDbApiService;", "getTheMovieDbApiService", "()Lcom/movieplayer/base_mvvm/data/remote/api_service/TheMovieDbApiService;", "setTheMovieDbApiService", "(Lcom/movieplayer/base_mvvm/data/remote/api_service/TheMovieDbApiService;)V", "getPopularMovies", "", "apiKey", "", "page", "", "app_debug"})
public final class PopularMoviesViewModel extends com.movieplayer.base_mvvm.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.movieplayer.base_mvvm.data.remote.api_response.PopularMovieResponse> popularMovieResponse;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.movieplayer.base_mvvm.data.remote.api_service.TheMovieDbApiService theMovieDbApiService;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.movieplayer.base_mvvm.data.remote.api_response.PopularMovieResponse> getPopularMovieResponse() {
        return null;
    }
    
    public final void setPopularMovieResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.movieplayer.base_mvvm.data.remote.api_response.PopularMovieResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.movieplayer.base_mvvm.data.remote.api_service.TheMovieDbApiService getTheMovieDbApiService() {
        return null;
    }
    
    public final void setTheMovieDbApiService(@org.jetbrains.annotations.NotNull()
    com.movieplayer.base_mvvm.data.remote.api_service.TheMovieDbApiService p0) {
    }
    
    public final void getPopularMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, int page) {
    }
    
    @javax.inject.Inject()
    public PopularMoviesViewModel() {
        super();
    }
}