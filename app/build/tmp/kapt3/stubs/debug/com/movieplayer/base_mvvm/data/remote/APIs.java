package com.movieplayer.base_mvvm.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\r\u0010\bR\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/movieplayer/base_mvvm/data/remote/APIs;", "", "()V", "BASE_URL", "", "CACHING_URLs", "", "getCACHING_URLs", "()[Ljava/lang/String;", "[Ljava/lang/String;", "MOVIE_DETAILS", "MOVIE_TRAILERS", "NO_AUTH_URLs", "getNO_AUTH_URLs", "POPULAR_MOVIES", "THUMB_BASE", "app_debug"})
public final class APIs {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://api.themoviedb.org";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POPULAR_MOVIES = "/3/movie/popular";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String THUMB_BASE = "http://image.tmdb.org/t/p/w185/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOVIE_DETAILS = "/3/movie/{movie_id}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOVIE_TRAILERS = "/3/movie/{movie_id}/videos";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] NO_AUTH_URLs = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] CACHING_URLs = null;
    public static final com.movieplayer.base_mvvm.data.remote.APIs INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getNO_AUTH_URLs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getCACHING_URLs() {
        return null;
    }
    
    private APIs() {
        super();
    }
}