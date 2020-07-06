package com.movieplayer.base_mvvp.ui.activity.movie_details

import androidx.lifecycle.MutableLiveData
import com.movieplayer.android.data.network.api_response.MovieDetailsResponse
import com.movieplayer.android.data.network.api_response.MovieTrailerResponse
import com.movieplayer.base_mvvp.base.BaseViewModel
import com.movieplayer.base_mvvp.data.remote.api_service.TheMovieDbApiService
import io.reactivex.observers.DisposableSingleObserver
import javax.inject.Inject

class MovieDetailsViewModel @Inject constructor() : BaseViewModel() {


    val movieDetailsResponse = MutableLiveData<MovieDetailsResponse>()
    val trailerResponse = MutableLiveData<MovieTrailerResponse>()

    @Inject
    lateinit var theMovieDbApiService: TheMovieDbApiService


    fun getMovieDetails(movieId: String, apiKey: String) {
        if (this::theMovieDbApiService.isInitialized) {
            loading.value = true
            mCompositeDisposable.add(
                theMovieDbApiService.getMovieDetails(movieId, apiKey)
                    .subscribeOn(appSchedulerProvider.io())
                    .unsubscribeOn(appSchedulerProvider.computation())
                    .observeOn(appSchedulerProvider.ui())
                    .subscribeWith(object : DisposableSingleObserver<MovieDetailsResponse>() {
                        override fun onSuccess(t: MovieDetailsResponse) {
                            loading.value = false
                            movieDetailsResponse.value = t
                        }

                        override fun onError(e: Throwable) {
                            loading.value = false
                            errors.value = e
                        }
                    })
            )
        }
    }



    fun getMovieTrailers(movieId: String, apiKey: String) {
        if (this::theMovieDbApiService.isInitialized) {
            loading.value = true
            mCompositeDisposable.add(
                theMovieDbApiService.getMovieTrailers(movieId, apiKey)
                    .subscribeOn(appSchedulerProvider.io())
                    .unsubscribeOn(appSchedulerProvider.computation())
                    .observeOn(appSchedulerProvider.ui())
                    .subscribeWith(object : DisposableSingleObserver<MovieTrailerResponse>() {
                        override fun onSuccess(t: MovieTrailerResponse) {
                            loading.value = false
                            trailerResponse.value = t
                        }

                        override fun onError(e: Throwable) {
                            loading.value = false
                            errors.value = e
                        }
                    })
            )
        }
    }
}