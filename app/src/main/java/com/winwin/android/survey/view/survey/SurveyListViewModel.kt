package com.winwin.android.survey.view.survey

import android.arch.lifecycle.MutableLiveData
import com.winwin.android.survey.view.base.BaseViewModel
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import timber.log.Timber

/**
 * Created by jaehyunpark on 2018. 11. 14..
 */
class SurveyListViewModel : BaseViewModel() {
    val surveyList: MutableLiveData<List<String>> = MutableLiveData()

    fun fetchSurveyList() {
        launch {
            Single.fromCallable({ getList() })
                    .subscribeOn(Schedulers.computation())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(surveyList::setValue, Timber::i)
        }
    }

    private fun getList(): List<String> = listOf("SurveyList")
}