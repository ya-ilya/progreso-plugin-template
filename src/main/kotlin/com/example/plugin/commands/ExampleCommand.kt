package com.example.plugin.commands

import org.progreso.api.command.AbstractCommand

@AbstractCommand.Register("example")
object ExampleCommand : AbstractCommand() {
    init {
        executes {
            info("Example command executed")
        }
    }
}