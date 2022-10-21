package com.example.ca_proverka.data

import com.example.ca_proverka.domain.ShopListRepository
import com.example.ca_proverka.domain.models.ShopItem

object RepositoryImpl:ShopListRepository {

    private val xxx = mutableListOf<ShopItem>()
    private var cin = 0

    override fun addShopItem(shopItem: ShopItem) {
        if(shopItem.id==ShopItem.UNDEFINE_ID){
            shopItem.id = cin++
        }
        xxx.add(shopItem)
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        xxx.remove(shopItem)
    }

    override fun editShopItem(shopItem: ShopItem) {
        val oldElement = getShopItem(shopItem.id)
        xxx.remove(oldElement)
        addShopItem(shopItem)
    }

    override fun getShopItem(shopItemId: Int): ShopItem {
        return xxx.find { it.id == shopItemId }?:
        throw java.lang.RuntimeException("Element with id $shopItemId not found")
    }

    override fun getShopList(): List<ShopItem> {
        return xxx.toList()
    }

}