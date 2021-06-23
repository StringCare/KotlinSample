package com.stringcare.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.stringcare.library.*
import com.stringcare.sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        SC.init { applicationContext }

        binding.kenobi.text = R.string.kenobi.reveal()
        binding.r2d2.text = R.string.r2d2.reveal()
        binding.c3po.text = R.string.c3po.reveal(false)

        binding.tvJson.text = "test.json".json().toString()
        binding.tvJsonOriginal.text = String("test.json".bytes { false })
    }
}
