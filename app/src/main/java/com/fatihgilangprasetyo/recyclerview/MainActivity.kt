package com.fatihgilangprasetyo.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fatihgilangprasetyo.recyclerview.databinding.ActivityMainBinding
import com.fatihgilangprasetyo.recyclerview.model.Pemain

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    val listPemain = ArrayList<Pemain>()

    }
}