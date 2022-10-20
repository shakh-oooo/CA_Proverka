package com.example.ca_proverka.domain.usecases

import com.example.ca_proverka.domain.models.ShopItem
import com.example.ca_proverka.domain.ShopListRepository

class GetShopItemUseCase(private val shopListRepository: ShopListRepository){
    fun getShopItem(shopItemId:Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}