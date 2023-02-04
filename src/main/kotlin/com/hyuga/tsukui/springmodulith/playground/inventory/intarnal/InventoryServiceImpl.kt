package com.hyuga.tsukui.springmodulith.playground.inventory.intarnal

import com.hyuga.tsukui.springmodulith.playground.inventory.InventoryDto
import com.hyuga.tsukui.springmodulith.playground.inventory.InventoryService
import org.springframework.stereotype.Component

@Component
class InventoryServiceImpl: InventoryService {
    override fun fetch(): InventoryDto {
        return InventoryDto(
            id = 1,
            name = "商品1"
        )
    }
}