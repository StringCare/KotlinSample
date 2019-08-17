package com.stringcare.sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.stringcare.library.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SC.init { applicationContext }

        kenobi.text = R.string.kenobi.reveal()
        r2d2.text = R.string.r2d2.reveal()
        c3po.text = R.string.c3po.reveal(false)

        "test.json".asyncJson { json ->
            tv_json.text = json.toString()
        }
        "test.json".asyncBytes({ false }) { bytes ->
            tv_json_original.text = String(bytes)
        }
    }
}
