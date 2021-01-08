package com.example.mvvmdemo.fragment

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvmdemo.databinding.ActivityMainInflatorBinding

class MainActivityFragment : AppCompatActivity() {

    private lateinit var binding:ActivityMainInflatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainInflatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val my = ArrayList<String>();
        for(i:Int in 1..30) {
            my.add(i.toString())
        }
        Handler(Looper.myLooper()!!).postDelayed(Runnable { my.removeAt(0) },1000)

        val sub=my.subList(0,3)
        Handler(Looper.myLooper()!!).postDelayed(Runnable { sub.toString() },3000)

    }

    override fun onStart() {
        super.onStart()
        binding.textViewActivity.text="you are the best people"
    }




}