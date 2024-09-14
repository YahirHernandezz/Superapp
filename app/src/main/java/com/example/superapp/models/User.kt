package com.example.superapp.models

data class User(val name:String, val email:String, val password: String){
    val startName : String get() = "Hola, $name"
    companion object{
        val users = listOf(
            User("Yahir","yahir16@gmail.com", "12345"),
            User("Jared","yahir17@gmail.com", "09876")
        )
    }
}
