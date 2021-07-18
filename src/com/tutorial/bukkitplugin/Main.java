package com.tutorial.bukkitplugin;

import com.tutorial.bukkitplugin.commands.TutorialCommand;
import com.tutorial.bukkitplugin.commands.TutorialCommand2;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public void onEnable(){
        System.out.println("(!) Tutorial Plugin Works!");
        this.getCommand("tutorial").setExecutor((CommandExecutor)new TutorialCommand());
        //this.getCommand("tutorial2").setExecutor((CommandExecutor)new TutorialCommand2());
    }

    public void onDisable(){
        System.out.println("(!) Tutorial Plugin Shutting Down!");
    }
}
