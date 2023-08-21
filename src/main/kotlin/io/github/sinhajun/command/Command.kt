package io.github.sinhajun.command

import dev.jorel.commandapi.CommandTree
import dev.jorel.commandapi.arguments.LiteralArgument
import dev.jorel.commandapi.executors.CommandExecutor
import io.github.sinhajun.`object`.Cube
import org.bukkit.Location
import org.bukkit.World
import org.bukkit.entity.Player

object Command {
    fun register() {
        CommandTree("engine")
            .then(LiteralArgument("spawn").executes(CommandExecutor { sender, _ ->
                val player: Player = sender as Player
                val world: World = player.world
                val location: Location = player.location
                Cube().spawn(world, location)
            }))
            .register()
    }
}