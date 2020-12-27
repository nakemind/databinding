package com.example.mvvmdemo.util

import android.content.Context
import android.net.ConnectivityManager

object NetworkStatus {

    fun isDeviceConnected(mContext :Context) :Boolean {
        val connectivityManager = mContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val  activeNetwork = connectivityManager.activeNetworkInfo
        return activeNetwork!=null&&activeNetwork.isConnectedOrConnecting
    }

}