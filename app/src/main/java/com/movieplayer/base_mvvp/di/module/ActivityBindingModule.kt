package com.movieplayer.base_mvvp.di.module

import com.movieplayer.base_mvvp.di.scope.ActivityScope
import com.movieplayer.base_mvvp.ui.activity.movie.PopularMoviesActivity
import com.movieplayer.base_mvvp.ui.activity.movie_details.MovieDetailsActivity
import com.movieplayer.base_mvvp.ui.activity.youtube_player.YoutubePlayerActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [FragmentBindingModule::class])
abstract class ActivityBindingModule {

    @SuppressWarnings("unused")
    @ActivityScope
    @ContributesAndroidInjector
    abstract fun bidndPopularMoviesActivity(): PopularMoviesActivity


    @SuppressWarnings("unused")
    @ActivityScope
    @ContributesAndroidInjector
    abstract fun bidndMovieDetailsActivity(): MovieDetailsActivity


}