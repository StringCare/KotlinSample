package com.stringcare.sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.stringcare.library.SC
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SC.init { applicationContext }

        kenobi.text = SC.reveal(R.string.kenobi)
        r2d2.text = SC.reveal(R.string.r2d2)
        c3po.text = SC.reveal(R.string.c3po, false)
    }
}
