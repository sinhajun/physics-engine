package io.github.sinhajun.plugin

import io.github.sinhajun.command.Command
import org.bukkit.plugin.java.JavaPlugin

class Plugin : JavaPlugin() {
    override fun onEnable() {
        Command.register()
    }
}