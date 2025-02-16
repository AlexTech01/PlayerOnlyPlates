package com.alexcraft112.playeronlyplates;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityInteractEvent;

public class PressurePlateListener implements Listener {
    @EventHandler
    public void onEntityInteract(EntityInteractEvent event) {
        if (!(event.getEntity() instanceof Player)) {
            Block block = event.getBlock();
            if (block.getType().toString().endsWith("_PRESSURE_PLATE")) {
                event.setCancelled(true);
            }
        }
    }
}