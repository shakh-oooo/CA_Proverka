package com.example.ca_proverka.presentation.mvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.ca_proverka.data.RepositoryImpl
import com.example.ca_proverka.domain.usecases.DeleteShopItemUseCase
import com.example.ca_proverka.domain.usecases.EditShopItemUseCase
import com.example.ca_proverka.domain.usecases.GetShopListUseCase


class Factory : ViewModelProvider.Factory {

    private val repository = RepositoryImpl

    private val deleteShopItem = DeleteShopItemUseCase(repository)
    private val editShopItem = EditShopItemUseCase(repository)
    private val getShopList = GetShopListUseCase(repository)


    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(
            deleteShopItem = deleteShopItem,
            editShopItem = editShopItem,
            getShopList = getShopList
        ) as T
    }
}