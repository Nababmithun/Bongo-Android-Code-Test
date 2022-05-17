package com.movieplayer.base_mvvm.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H!\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH!\u00a2\u0006\u0002\b\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/movieplayer/base_mvvm/di/module/ViewModelBindingModule;", "", "()V", "bindMovieDetailsViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/movieplayer/base_mvvm/ui/activity/movie_details/MovieDetailsViewModel;", "bindMovieDetailsViewModel$app_debug", "bindPopularMoviesViewModel", "Lcom/movieplayer/base_mvvm/ui/activity/movie/PopularMoviesViewModel;", "bindPopularMoviesViewModel$app_debug", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "Lcom/movieplayer/base_mvvm/base/ViewModelFactory;", "app_debug"})
@dagger.Module()
public abstract class ViewModelBindingModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.movieplayer.base_mvvm.base.ViewModelKey(value = com.movieplayer.base_mvvm.ui.activity.movie.PopularMoviesViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindPopularMoviesViewModel$app_debug(@org.jetbrains.annotations.NotNull()
    com.movieplayer.base_mvvm.ui.activity.movie.PopularMoviesViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.movieplayer.base_mvvm.base.ViewModelKey(value = com.movieplayer.base_mvvm.ui.activity.movie_details.MovieDetailsViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindMovieDetailsViewModel$app_debug(@org.jetbrains.annotations.NotNull()
    com.movieplayer.base_mvvm.ui.activity.movie_details.MovieDetailsViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.movieplayer.base_mvvm.base.ViewModelFactory viewModelFactory);
    
    public ViewModelBindingModule() {
        super();
    }
}