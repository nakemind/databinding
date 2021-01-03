package com.example.mvvmdemo.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvmdemo.databinding.ActivityMainInflatorBinding

class MainActivityFragment : AppCompatActivity() {

    private lateinit var binding:ActivityMainInflatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainInflatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.textViewActivity.text="you are the best people"
    }


}