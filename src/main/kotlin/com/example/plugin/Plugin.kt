package com.example.plugin

import com.example.plugin.commands.ExampleCommand
import com.example.plugin.modules.ExampleModule
import org.progreso.api.Api
import org.progreso.api.plugin.AbstractPlugin

class Plugin : AbstractPlugin() {
    override fun load() {
        Api.LOGGER.info("Loading progreso plugin template...")

        addCommand(ExampleCommand)
        addModule(ExampleModule)
    }

    override fun unload() {
        Api.LOGGER.info("Unloading progreso plugin template...")
    }
}