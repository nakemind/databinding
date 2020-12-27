package com.example.mvvmdemo.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvm_architecture_sample_code.network.RetrofitClient
import com.example.mvvmdemo.model.User
import com.example.mvvmdemo.model.UserResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserRepository {
    val users: LiveData<UserResponse>
        get() {
            val userResponseMutableLiveData = MutableLiveData<UserResponse>()
            val call = RetrofitClient.instance?.get_Ers_API()?.users
            val fff2 = call?.enqueue(object : Callback<List<User?>?> {
                override fun onResponse(
                    call: Call<List<User?>?>,
                    response: Response<List<User?>?>
                ) {
                    if (response.isSuccessful) {
                        //userResponseMutableLiveData.postValue(response.body()?.let { UserResponse(it) })
                        userResponseMutableLiveData.postValue(
                            response.body()?.let { UserResponse(it) })
                    } else if (response.code() == 404) {
                        userResponseMutableLiveData.postValue(
                            UserResponse(
                                response.code(),
                                "Results not found"
                            )
                        )
                    }
                }

                override fun onFailure(call: Call<List<User?>?>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            })
            return userResponseMutableLiveData
        }
}