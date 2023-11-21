package com.example.bakeryapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bakeryapp.R
import com.example.bakeryapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}