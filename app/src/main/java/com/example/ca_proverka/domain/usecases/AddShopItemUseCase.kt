package com.example.ca_proverka.domain.usecases

import com.example.ca_proverka.domain.models.ShopItem
import com.example.ca_proverka.domain.ShopListRepository

class AddShopItemUseCase(private val shopListRepository: ShopListRepository ) {
   fun addShopItem(shopItem: ShopItem){
        shopListRepository.addShopItem(shopItem)
    }
}