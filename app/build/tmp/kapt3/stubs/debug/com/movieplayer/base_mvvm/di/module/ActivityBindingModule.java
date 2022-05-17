package com.movieplayer.base_mvvm.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/movieplayer/base_mvvm/di/module/ActivityBindingModule;", "", "()V", "bidndMovieDetailsActivity", "Lcom/movieplayer/base_mvvm/ui/activity/movie_details/MovieDetailsActivity;", "bidndPopularMoviesActivity", "Lcom/movieplayer/base_mvvm/ui/activity/movie/PopularMoviesActivity;", "app_debug"})
@dagger.Module(includes = {com.movieplayer.base_mvvm.di.module.FragmentBindingModule.class})
public abstract class ActivityBindingModule {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.SuppressWarnings(value = {"unused"})
    @dagger.android.ContributesAndroidInjector()
    @com.movieplayer.base_mvvm.di.scope.ActivityScope()
    public abstract com.movieplayer.base_mvvm.ui.activity.movie.PopularMoviesActivity bidndPopularMoviesActivity();
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.SuppressWarnings(value = {"unused"})
    @dagger.android.ContributesAndroidInjector()
    @com.movieplayer.base_mvvm.di.scope.ActivityScope()
    public abstract com.movieplayer.base_mvvm.ui.activity.movie_details.MovieDetailsActivity bidndMovieDetailsActivity();
    
    public ActivityBindingModule() {
        super();
    }
}