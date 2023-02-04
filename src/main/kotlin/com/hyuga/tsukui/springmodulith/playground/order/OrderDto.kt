package com.hyuga.tsukui.springmodulith.playground.order

import com.hyuga.tsukui.springmodulith.playground.inventory.InventoryDto

data class OrderDto (
    val id: Int,
    val inventories: List<InventoryDto>
)