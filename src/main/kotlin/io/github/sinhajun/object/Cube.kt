package io.github.sinhajun.`object`

import net.kyori.adventure.text.Component
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.World
import org.bukkit.entity.BlockDisplay

class Cube {
    fun spawn(world: World, location: Location) {
        world.spawn(location, BlockDisplay::class.java) {
            it.customName(Component.text().content("cubic").asComponent())
            it.isCustomNameVisible = false
            it.block = Material.STONE.createBlockData()
        }
    }
}