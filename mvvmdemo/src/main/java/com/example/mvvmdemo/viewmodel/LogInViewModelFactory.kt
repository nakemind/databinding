package com.example.mvvmdemo.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class LogInViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass.newInstance() //使用newInstance反射实例ViewModel，并且传出去
    }


    //override fun <T : ViewModel?> create(modelClass: Class<T>): T = LogInViewModelFactory() as T

}