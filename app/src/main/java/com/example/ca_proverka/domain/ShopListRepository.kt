package com.example.ca_proverka.domain

import com.example.ca_proverka.domain.models.ShopItem

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)
    fun deleteShopItem(shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem)
    fun getShopItem(shopItemId:Int): ShopItem
    fun getShopList():List<ShopItem>

}