package com.example.plugin.modules

import org.progreso.api.Api
import org.progreso.api.module.AbstractModule
import org.progreso.api.module.Category

@AbstractModule.Register("Example", Category.Misc)
object ExampleModule : AbstractModule() {
    init {
        onEnable {
            Api.CHAT.info("Example module enabled")
        }

        onDisable {
            Api.CHAT.info("Example module disabled")
        }
    }
}