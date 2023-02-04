package com.hyuga.tsukui.springmodulith.playground.order.intarnal

import com.hyuga.tsukui.springmodulith.playground.inventory.InventoryService
import com.hyuga.tsukui.springmodulith.playground.order.OrderDto
import com.hyuga.tsukui.springmodulith.playground.order.OrderService
import org.springframework.stereotype.Component

@Component
class OrderServiceImpl(
    private val inventoryService: InventoryService
): OrderService {
    override fun fetch(): OrderDto {
        val inventory = inventoryService.fetch()
        return OrderDto(
            id = 1,
            inventories = listOf(inventory)
        )
    }
}