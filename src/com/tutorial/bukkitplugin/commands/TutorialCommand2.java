package com.tutorial.bukkitplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TutorialCommand2 implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (sender instanceof Player){
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6This works2!"));
        }
        else {
            sender.sendMessage("Hey! You can't use this in the terminal!");
        }
        return true;
    }

}

