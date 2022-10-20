package com.example.ca_proverka.domain.usecases

import com.example.ca_proverka.domain.models.ShopItem
import com.example.ca_proverka.domain.ShopListRepository

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun editShopItem(shopItem: ShopItem){
        shopListRepository.editShopItem(shopItem)
    }
}