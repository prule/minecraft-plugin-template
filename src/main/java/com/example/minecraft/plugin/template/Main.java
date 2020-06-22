package com.example.minecraft.plugin.template;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("onEnable()");
        this.getCommand("echo").setExecutor(new EchoCommand(this));
    }

    @Override
    public void onDisable() {
        getLogger().info("onDisabled()");
    }
}
