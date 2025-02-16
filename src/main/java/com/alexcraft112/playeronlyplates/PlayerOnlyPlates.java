package com.alexcraft112.playeronlyplates;

import org.bukkit.plugin.java.JavaPlugin;

public class PlayerOnlyPlates extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("PlayerOnlyPlates has been loaded");
        getServer().getPluginManager().registerEvents(new PressurePlateListener(), this);
    }
}