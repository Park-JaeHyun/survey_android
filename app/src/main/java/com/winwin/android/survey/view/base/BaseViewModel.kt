package com.winwin.android.survey.view.base

import android.arch.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * Created by jaehyunpark on 2018. 11. 14..
 */
open class BaseViewModel : ViewModel() {
    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    fun launch(job: () -> Disposable) {
        compositeDisposable.add(job())
    }

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }
}