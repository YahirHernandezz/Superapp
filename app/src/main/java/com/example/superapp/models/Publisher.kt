package com.example.superapp.models

data class Publisher(val id: Int,val name:String,val image:String){
    companion object{
        val restaurants = mutableListOf<Publisher>(
            Publisher(1,"Marvel","https://cdn.inspireuplift.com/uploads/images/seller_products/1678343923_MarvelRed.jpg"),
            Publisher(2,"DCComics","https://brandemia.org/contenido/subidas/2022/10/marca-mcdonalds-logo-1024x572.png"),
        )
    }
}
