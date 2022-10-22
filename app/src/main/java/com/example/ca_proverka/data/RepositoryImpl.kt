package com.example.ca_proverka.data

import com.example.ca_proverka.domain.ShopListRepository
import com.example.ca_proverka.domain.models.ShopItem

object RepositoryImpl : ShopListRepository {

    private val allList = mutableListOf<ShopItem>()
    private var cin = 0

    init {
        for (i in 0 until 10) {
            val item = ShopItem("name $i", i, true)
            addShopItem(item)
        }
    }

    override fun addShopItem(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEFINE_ID) {
            shopItem.id = cin++
        }
        allList.add(shopItem)
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        allList.remove(shopItem)
    }

    override fun editShopItem(shopItem: ShopItem) {
        val oldElement = getShopItem(shopItem.id)
        allList.remove(oldElement)
        addShopItem(shopItem)
    }

    override fun getShopItem(shopItemId: Int): ShopItem {
        return allList.find { it.id == shopItemId }
            ?: throw java.lang.RuntimeException("Element with id $shopItemId not found")
    }

    override fun getShopList(): List<ShopItem> {
        return allList.toList()
    }

}