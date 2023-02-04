package com.hyuga.tsukui.springmodulith.playground

import org.junit.jupiter.api.Test
import org.springframework.modulith.core.ApplicationModules

class ModularityTests {

    @Test
    fun verifyModularity() {
        val modules = ApplicationModules.of(SpringModulithPlaygroundApplication::class.java)
        modules.forEach { println(it) }
        modules.verify()
    }
}