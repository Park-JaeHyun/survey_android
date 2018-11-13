package com.winwin.android.survey.view

import android.os.Bundle
import com.winwin.android.survey.R
import com.winwin.android.survey.view.base.BaseActivity
import com.winwin.android.survey.view.survey.SurveyListFragment

/**
 * Created by jaehyunpark on 2018. 11. 14..
 */
class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showSurveyList()
    }

    private fun showSurveyList() {
        addFragment(R.id.main_content_layout, SurveyListFragment())
    }
}