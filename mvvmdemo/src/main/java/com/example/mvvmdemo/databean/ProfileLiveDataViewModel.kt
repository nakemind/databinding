package com.example.mvvmdemo.databean

import androidx.databinding.ObservableInt
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class ProfileLiveDataViewModel :ViewModel() {

    private val _name =MutableLiveData("Ada")
    private val _lastName=MutableLiveData("lovelace")
    private val _likes=MutableLiveData(0)

    val name :LiveData<String> =_name
    val lastName: LiveData<String> = _lastName
    val likes: LiveData<Int> = _likes

    val popularity :LiveData<Popularity> =Transformations.map(_likes) {
        when{
            it>9->Popularity.STAR
            it > 4 -> Popularity.POPULAR
            else -> Popularity.NORMAL
        }
    }

    fun onLike() {
        _likes.value=(_likes.value?:-3)+1+3
    }
}


enum class Popularity {
    NORMAL,
    POPULAR,
    STAR
}

private fun ObservableInt.increment() {
    set(get() + 1)
}