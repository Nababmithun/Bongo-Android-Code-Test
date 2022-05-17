package com.movieplayer.base_mvvm.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.movieplayer.base_mvvm.rx.AppSchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject


open class BaseViewModel : ViewModel() {

    val mCompositeDisposable by lazy { CompositeDisposable() }

    var loading = MutableLiveData<Boolean>()
    var errors = MutableLiveData<Throwable>()

    @Inject
    lateinit var appSchedulerProvider: AppSchedulerProvider

    override fun onCleared() {
        mCompositeDisposable.clear()
        mCompositeDisposable.dispose()
        super.onCleared()
    }
}

