package com.example.mvvmdemo.model

data class Person(var name:String, var tutorial:String) {
    fun ajust(tmpname:String){
        name=tmpname

    }
}