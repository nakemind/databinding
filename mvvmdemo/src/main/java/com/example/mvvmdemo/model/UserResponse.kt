package com.example.mvvmdemo.model

class UserResponse {

    var userList: List<User?>?
 var error: Throwable?
 var status: Int
 var message: String?

    constructor(userList: List<User?>) {
        this.userList = userList
        error = null
        status = 0
        message = null
    }

    constructor(error: Throwable?) {
        userList = null
        this.error = error
        status = 0
        message = null
    }

    constructor(status: Int, message: String?) {
        userList = null
        error = null
        this.status = status
        this.message = message
    }
}