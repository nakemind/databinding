package com.example.mvvmdemo.model

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.Setter

class User {
    class Address {
     val street: String? = null
     val suite: String? = null
     val city: String? = null
     val zipcode: String? = null
     val geo: Geo? = null

        class Geo {
           val lat: String? = null
           val lng: String? = null
        }
    }
    class Company {
    val name: String? = null
    val catchPhrase: String? = null
    val bs: String? = null
    }
    //user POJO
    val id = 0
    val name: String? = null
    val username: String? = null
    val email: String? = null

    val phone: String? = null
    val website: String? = null
    var address: User.Address? = null
    var company: User.Company? = null
}