package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Huggy Wuggy plugin enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Huggy Wuggy plugin disabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("spawnhuggywuggy")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                // Spawn Huggy Wuggy monster logic here
                player.sendMessage("Huggy Wuggy has been spawned!");
                return true;
            } else {
                sender.sendMessage("This command can only be run by a player.");
                return false;
            }
        } else if (command.getName().equalsIgnoreCase("hug")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                // Hug player logic here
                player.sendMessage("You have been hugged by Huggy Wuggy!");
                return true;
            } else {
                sender.sendMessage("This command can only be run by a player.");
                return false;
            }
        }
        return false;
    }
}