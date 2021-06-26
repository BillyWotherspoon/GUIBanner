package me.warpednova.guibanner;


import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.warpednova.guibanner.commands.Tempban;

public final class InventoryStealPrevention implements Listener {
	@EventHandler
	private static void onInventoryClick(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		if (event.getInventory().getName().equalsIgnoreCase(ChatColor.AQUA + "Tempban " + Tempban.targetPlayer)) {
			event.setCancelled(true);
			player.updateInventory();
		}
	}
}
