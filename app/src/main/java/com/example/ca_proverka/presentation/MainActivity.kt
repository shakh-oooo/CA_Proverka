package com.example.ca_proverka.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.ca_proverka.R
import com.example.ca_proverka.presentation.mvvm.Factory
import com.example.ca_proverka.presentation.mvvm.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var mvvm: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mvvm = ViewModelProvider(this, Factory())[MainViewModel::class.java]

        mvvm.obnovlenie.observe(this) {
            Log.d("MainTest", "$it")
        }
    }
}