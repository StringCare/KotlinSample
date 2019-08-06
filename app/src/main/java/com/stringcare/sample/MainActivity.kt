package com.stringcare.sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.stringcare.library.SC
import com.stringcare.library.reveal
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SC.init { applicationContext }

        kenobi.text = R.string.kenobi.reveal()
        r2d2.text = R.string.r2d2.reveal()
        c3po.text = R.string.c3po.reveal(false)
    }
}
