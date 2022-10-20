package com.example.ca_proverka.domain.usecases

import com.example.ca_proverka.domain.models.ShopItem
import com.example.ca_proverka.domain.ShopListRepository

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopList():List<ShopItem>{
        return shopListRepository.getShopList()
    }
}