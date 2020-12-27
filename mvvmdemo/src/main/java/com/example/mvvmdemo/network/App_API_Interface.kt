package com.example.mvvmdemo.network

import com.example.mvvmdemo.model.User
import retrofit2.Call
import retrofit2.http.GET

interface App_API_Interface {

    @get:GET("users")
    val users: Call<List<User?>?>?

}