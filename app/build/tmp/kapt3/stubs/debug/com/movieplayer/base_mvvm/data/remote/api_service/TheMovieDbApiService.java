package com.movieplayer.base_mvvm.data.remote.api_service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\rH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/movieplayer/base_mvvm/data/remote/api_service/TheMovieDbApiService;", "", "getMovieDetails", "Lio/reactivex/Single;", "Lcom/movieplayer/android/data/network/api_response/MovieDetailsResponse;", "movieId", "", "apiKey", "getMovieTrailers", "Lcom/movieplayer/android/data/network/api_response/MovieTrailerResponse;", "getPopularMovies", "Lcom/movieplayer/base_mvvm/data/remote/api_response/PopularMovieResponse;", "page", "", "app_debug"})
public abstract interface TheMovieDbApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie/popular")
    public abstract io.reactivex.Single<com.movieplayer.base_mvvm.data.remote.api_response.PopularMovieResponse> getPopularMovies(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie/{movie_id}")
    public abstract io.reactivex.Single<com.movieplayer.android.data.network.api_response.MovieDetailsResponse> getMovieDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "movie_id")
    java.lang.String movieId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie/{movie_id}/videos")
    public abstract io.reactivex.Single<com.movieplayer.android.data.network.api_response.MovieTrailerResponse> getMovieTrailers(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "movie_id")
    java.lang.String movieId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey);
}