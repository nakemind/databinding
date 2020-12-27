package com.example.mvvm_architecture_sample_code.network

import com.example.mvvmdemo.network.App_API_Interface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient private constructor() {
    /**
     * Singleton class for Retrofit
     */
    var SERVICE_BASE_URL = "https://jsonplaceholder.typicode.com/"
    private val retrofit: Retrofit
    fun get_Ers_API(): App_API_Interface {
        return retrofit.create(App_API_Interface::class.java)
    }

    companion object {
        private var mInstance: RetrofitClient? = null

        //retrofit instance not yet created
        @JvmStatic
        @get:Synchronized
        val instance: RetrofitClient?
            get() {
                if (mInstance == null) { //retrofit instance not yet created
                    mInstance = RetrofitClient()
                }
                return mInstance
            }
    }

    init {
        retrofit = Retrofit.Builder()
                .baseUrl(SERVICE_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }
}