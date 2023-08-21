package io.github.sinhajun.plugin

import org.bukkit.plugin.java.JavaPlugin

class Plugin : JavaPlugin() {
    override fun onEnable() {
        logger.info("test success")
    }
}