package com.movieplayer.base_mvvp.ui.activity.movie

import androidx.lifecycle.MutableLiveData
import com.movieplayer.base_mvvp.base.BaseViewModel
import com.movieplayer.base_mvvp.data.remote.api_response.PopularMovieResponse
import com.movieplayer.base_mvvp.data.remote.api_service.TheMovieDbApiService
import io.reactivex.observers.DisposableSingleObserver
import javax.inject.Inject

class PopularMoviesViewModel @Inject constructor() : BaseViewModel() {

    var popularMovieResponse = MutableLiveData<PopularMovieResponse>()

    @Inject
    lateinit var theMovieDbApiService: TheMovieDbApiService


    fun getPopularMovies(apiKey: String, page: Int) {
        if (this::theMovieDbApiService.isInitialized) {
            loading.value = true
            mCompositeDisposable.add(
                theMovieDbApiService.getPopularMovies(apiKey, page)
                    .subscribeOn(appSchedulerProvider.io())
                    .unsubscribeOn(appSchedulerProvider.computation())
                    .observeOn(appSchedulerProvider.ui())
                    .subscribeWith(object : DisposableSingleObserver<PopularMovieResponse>() {
                        override fun onSuccess(t: PopularMovieResponse) {
                            loading.value = false
                            popularMovieResponse.value = t
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