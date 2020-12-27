package com.example.mvvmdemo.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.example.mvvmdemo.model.UserResponse
import com.example.mvvmdemo.repository.UserRepository

class UserViewModel(application: Application):AndroidViewModel(application) {
    val userResponseMediatorLiveData:MediatorLiveData<UserResponse>
    val userRepository: UserRepository
    val listUsers:LiveData<UserResponse>
    get() {
        userResponseMediatorLiveData.addSource(userRepository.users) { userResponse: UserResponse -> userResponseMediatorLiveData.setValue(userResponse) }
        return userResponseMediatorLiveData
    }

    init {
        userResponseMediatorLiveData= MediatorLiveData();
        userRepository =UserRepository()
    }

}