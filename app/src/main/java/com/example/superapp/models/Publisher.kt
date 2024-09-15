package com.example.superapp.models

data class Publisher(val id: Int,val name:String,val image:String){
    companion object{
        val publishers = mutableListOf<Publisher>(
            Publisher(1,"Marvel","https://cdn.inspireuplift.com/uploads/images/seller_products/1678343923_MarvelRed.jpg"),
            Publisher(2,"DCComics","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.hobbyconsolas.com%2Fnoticias%2Fdc-comics-anuncia-nueva-pagina-web-pero-ha-olvidado-comics-camino-1104077&psig=AOvVaw28VGAqTTRMTd0dESWh2m9U&ust=1726389569312000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCPiUvMuEwogDFQAAAAAdAAAAABAE"),
        )
    }
}
