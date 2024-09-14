package com.example.superapp.models

data class User(val email:String, val password: String){
    companion object{
        val users = listOf(
            User("yahir16@gmail.com", "12345"),
            User("yahir17@gmail.com", "09876")
        )
    }
}
