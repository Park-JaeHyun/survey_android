package com.winwin.android.survey.view

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.winwin.android.survey.R

class EntryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entry)

        showMainActivity()
    }

    private fun showMainActivity() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}
