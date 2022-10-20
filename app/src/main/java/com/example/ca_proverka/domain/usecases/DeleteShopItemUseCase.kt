package com.example.ca_proverka.domain.usecases

import com.example.ca_proverka.domain.models.ShopItem
import com.example.ca_proverka.domain.ShopListRepository

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository){
    fun deleteShopItem(shopItem: ShopItem){
        shopListRepository.deleteShopItem(shopItem)
    }
}