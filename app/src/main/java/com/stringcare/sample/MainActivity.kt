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

        val json = "config.json".jsonArray { false }
        val bytes = "config.json".bytes { false }
        "test.json".asyncJson({ false }) { json ->
            tv_json.text = json.toString()
        }
        "config.json".asyncBytes { bytes ->
            tv_json_original.text = String(bytes)
        }
    }
}
