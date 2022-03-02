package com.example.ca_todo.domain

class AddShopItem(private val shopListRepository: ShopListRepository) {

    fun addShopItem(shopItem: ShopItem){
        shopListRepository.addShopItem(shopItem)
    }
}