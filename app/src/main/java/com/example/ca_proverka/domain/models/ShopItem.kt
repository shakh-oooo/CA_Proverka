package com.example.ca_proverka.domain.models

data class ShopItem(

    val name : String,
    val count : Int,
    val enabled : Boolean,

    var id : Int = UNDEFINE_ID
){
    companion object{
        const val UNDEFINE_ID = -1
    }

}



