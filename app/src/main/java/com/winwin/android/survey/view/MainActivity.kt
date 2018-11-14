package com.winwin.android.survey.view

import android.os.Bundle
import android.widget.Toast
import com.winwin.android.survey.R
import com.winwin.android.survey.view.base.BaseActivity
import com.winwin.android.survey.view.survey.SurveyListFragment
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by jaehyunpark on 2018. 11. 14..
 */
class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initNavigationBar()
    }

    private fun initNavigationBar() {
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.itemList -> {
                    showSurveyList()
                    true
                }
                R.id.itemHistory -> {
                    showHistoryToast()
                    true
                }
                R.id.itemSetting -> {
                    showSettingToast()
                    true
                }
                else -> false
            }
        }
        bottomNavigationView.selectedItemId = R.id.itemList
    }

    private fun showSurveyList() {
        addFragment(R.id.mainContentLayout, SurveyListFragment())
    }

    private fun showHistoryToast() {
        Toast.makeText(this, "show history", Toast.LENGTH_LONG).show()
    }

    private fun showSettingToast() {
        Toast.makeText(this, "show setting", Toast.LENGTH_LONG).show()
    }
}