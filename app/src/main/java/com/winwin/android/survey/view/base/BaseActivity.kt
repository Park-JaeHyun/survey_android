package com.winwin.android.survey.view.base

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

/**
 * Created by jaehyunpark on 2018. 11. 14..
 */
open class BaseActivity : AppCompatActivity() {
    fun addFragment(containerViewId: Int, fragment: Fragment) {
        val tag: String = fragment.javaClass.simpleName
        if (supportFragmentManager.findFragmentByTag(tag) == null) {
            supportFragmentManager.beginTransaction()
                    .add(containerViewId, fragment, tag)
                    .commitAllowingStateLoss()
        }
    }

    fun replaceFragment(containerViewId: Int, fragment: Fragment) {
        val tag: String = fragment.javaClass.simpleName
        if (supportFragmentManager.findFragmentByTag(tag) == null) {
            supportFragmentManager.beginTransaction()
                    .replace(containerViewId, fragment, tag)
                    .commitAllowingStateLoss()
        }
    }
}