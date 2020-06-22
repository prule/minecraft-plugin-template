package com.example.minecraft.plugin.template;

import com.google.common.base.Joiner;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class EchoCommand implements CommandExecutor {

    private final Main plugin;

    public EchoCommand(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        plugin.getLogger().info("onCommand() Echo "+command + " " + label + " "+Joiner.on(",").join(args) );
        return false;
    }
}
