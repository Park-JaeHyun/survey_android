package com.winwin.android.survey.view.survey

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.winwin.android.survey.R
import com.winwin.android.survey.view.base.BaseFragment
import org.koin.android.viewmodel.ext.android.viewModel

/**
 * Created by jaehyunpark on 2018. 11. 14..
 */
class SurveyListFragment : BaseFragment() {
    private val viewModel: SurveyListViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_survey_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        observeEvents()

        fetchList()
    }

    private fun observeEvents() {
        viewModel.surveyList.observe(this, Observer {
            Toast.makeText(activity, "FetchSurveyList is observed.", Toast.LENGTH_LONG).show()
        })
    }

    private fun fetchList() {
        viewModel.fetchSurveyList()
    }
}