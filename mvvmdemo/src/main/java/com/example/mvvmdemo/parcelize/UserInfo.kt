package com.example.mvvmdemo.parcelize

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class UserInfo(val name: String, val country: String) :Parcelable