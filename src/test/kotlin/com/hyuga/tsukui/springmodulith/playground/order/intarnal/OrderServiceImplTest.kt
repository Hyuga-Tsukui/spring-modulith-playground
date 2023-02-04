package com.hyuga.tsukui.springmodulith.playground.order.intarnal

import com.hyuga.tsukui.springmodulith.playground.inventory.InventoryService
import org.junit.jupiter.api.Test
import org.springframework.modulith.test.ApplicationModuleTest


@ApplicationModuleTest(mode = ApplicationModuleTest.BootstrapMode.DIRECT_DEPENDENCIES)
class OrderServiceImplTest(
    inventoryService: InventoryService
) {

    private  val service = OrderServiceImpl(inventoryService)

    @Test
    fun fetch() {
        service.fetch()
    }
}