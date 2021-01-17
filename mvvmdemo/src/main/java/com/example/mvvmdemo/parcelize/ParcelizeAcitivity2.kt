package com.example.mvvmdemo.parcelize

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvmdemo.databinding.ActivityParcelizeDemoBinding

class ParcelizeAcitivity2 :AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       val binding = ActivityParcelizeDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnNewAcitivyt.setOnClickListener {
            val info = UserInfo("12","cn")
            val intent= Intent (this,ParcelizeActivity::class.java)
            intent.putExtra("akui",info)
            startActivity(intent)
        }
    }
}