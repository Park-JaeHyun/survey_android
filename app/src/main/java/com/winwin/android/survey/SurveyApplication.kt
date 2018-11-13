package com.winwin.android.survey

import android.app.Application
import com.facebook.stetho.Stetho
import com.winwin.android.survey.di.appModule
import org.koin.android.ext.android.startKoin

/**
 * Created by jaehyunpark on 2018. 11. 14..
 */
class SurveyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        initDependencies()
    }

    private fun initDependencies() {
        initKoin()
        initStetho()
    }

    private fun initKoin() {
        startKoin(this, appModule)
    }

    private fun initStetho() {
        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this)
        }
    }
}