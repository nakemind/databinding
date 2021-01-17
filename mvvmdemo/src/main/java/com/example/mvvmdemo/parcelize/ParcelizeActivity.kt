package com.example.mvvmdemo.parcelize

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class ParcelizeActivity :AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        //receive the intent
        val user = intent.getParcelableExtra<UserInfo>("akui")
        Log.d("","")
        // Format user data
        //val data = "Username:\n ${user.username} \n Age: ${user.age}"
    }
}