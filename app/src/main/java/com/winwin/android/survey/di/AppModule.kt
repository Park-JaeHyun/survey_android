package com.winwin.android.survey.di

import com.winwin.android.survey.view.survey.SurveyListViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

/**
 * Created by jaehyunpark on 2018. 11. 14..
 */
private val viewModelModule = module {
    viewModel {
        SurveyListViewModel()
    }
}

val appModule = listOf(viewModelModule)