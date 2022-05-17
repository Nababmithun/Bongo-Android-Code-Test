package com.movieplayer.base_mvvm.ui.activity.movie_details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J\u0016\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/movieplayer/base_mvvm/ui/activity/movie_details/MovieDetailsViewModel;", "Lcom/movieplayer/base_mvvm/base/BaseViewModel;", "()V", "movieDetailsResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/movieplayer/android/data/network/api_response/MovieDetailsResponse;", "getMovieDetailsResponse", "()Landroidx/lifecycle/MutableLiveData;", "theMovieDbApiService", "Lcom/movieplayer/base_mvvm/data/remote/api_service/TheMovieDbApiService;", "getTheMovieDbApiService", "()Lcom/movieplayer/base_mvvm/data/remote/api_service/TheMovieDbApiService;", "setTheMovieDbApiService", "(Lcom/movieplayer/base_mvvm/data/remote/api_service/TheMovieDbApiService;)V", "trailerResponse", "Lcom/movieplayer/android/data/network/api_response/MovieTrailerResponse;", "getTrailerResponse", "getMovieDetails", "", "movieId", "", "apiKey", "getMovieTrailers", "app_debug"})
public final class MovieDetailsViewModel extends com.movieplayer.base_mvvm.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.movieplayer.android.data.network.api_response.MovieDetailsResponse> movieDetailsResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.movieplayer.android.data.network.api_response.MovieTrailerResponse> trailerResponse = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.movieplayer.base_mvvm.data.remote.api_service.TheMovieDbApiService theMovieDbApiService;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.movieplayer.android.data.network.api_response.MovieDetailsResponse> getMovieDetailsResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.movieplayer.android.data.network.api_response.MovieTrailerResponse> getTrailerResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.movieplayer.base_mvvm.data.remote.api_service.TheMovieDbApiService getTheMovieDbApiService() {
        return null;
    }
    
    public final void setTheMovieDbApiService(@org.jetbrains.annotations.NotNull()
    com.movieplayer.base_mvvm.data.remote.api_service.TheMovieDbApiService p0) {
    }
    
    public final void getMovieDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String movieId, @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey) {
    }
    
    public final void getMovieTrailers(@org.jetbrains.annotations.NotNull()
    java.lang.String movieId, @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey) {
    }
    
    @javax.inject.Inject()
    public MovieDetailsViewModel() {
        super();
    }
}