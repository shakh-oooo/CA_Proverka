package com.example.ca_proverka.presentation.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ca_proverka.domain.models.ShopItem
import com.example.ca_proverka.domain.usecases.DeleteShopItemUseCase
import com.example.ca_proverka.domain.usecases.EditShopItemUseCase
import com.example.ca_proverka.domain.usecases.GetShopListUseCase

class MainViewModel(
    private val deleteShopItem: DeleteShopItemUseCase,
    private val editShopItem: EditShopItemUseCase,
    private val getShopList: GetShopListUseCase
) : ViewModel() {

    /*private val repository = RepositoryImpl*/

    /*private val deleteShopItem = DeleteShopItemUseCase(repository)
    private val editShopItem = EditShopItemUseCase(repository)
    private val getShopList = GetShopListUseCase(repository)*/

    val obnovlenie = MutableLiveData<List<ShopItem>>()

    fun shopList() {
        val list = getShopList.getShopList()
        obnovlenie.value = list
    }

    fun delete(shopItem: ShopItem) {
        deleteShopItem.deleteShopItem(shopItem)
        shopList()
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItem.editShopItem(newItem)
        shopList()
    }
}