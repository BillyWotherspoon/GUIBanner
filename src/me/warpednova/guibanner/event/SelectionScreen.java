package me.warpednova.guibanner.event;

import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public final class SelectionScreen implements Listener {
	private TempbanScreen tempbanscreen;

	public SelectionScreen(TempbanScreen passed) {
		this.tempbanscreen = passed;
	}

	public static void openBanSelectionScreen(Player player) {
		Inventory selectionScreen = Bukkit.createInventory(null, 9, ChatColor.DARK_RED + "Select to Continue");
		ItemStack tempbanOptionButton;
		ItemMeta tempbanOptionButtonMeta = (tempbanOptionButton = new ItemStack(Material.DIAMOND_SWORD)).getItemMeta();
		ItemStack cancelButton;
		ItemMeta cancelButtonMeta = (cancelButton = new ItemStack(Material.STAINED_GLASS_PANE)).getItemMeta();

		List<String> tempbanOptionButtonLore = Arrays
				.asList(new String[] { ChatColor.GOLD + "Click To Open Tempban Menu..." });

		tempbanOptionButtonMeta.setDisplayName(ChatColor.GREEN + "Tempban Menu");
		tempbanOptionButtonMeta.setLore(tempbanOptionButtonLore);
		tempbanOptionButton.setItemMeta(tempbanOptionButtonMeta);

		cancelButtonMeta.setDisplayName(ChatColor.RED + "Cancel");
		cancelButton.setItemMeta(cancelButtonMeta);

		selectionScreen.setItem(3, tempbanOptionButton);
		selectionScreen.setItem(5, cancelButton);

		player.openInventory(selectionScreen);
	}

	@EventHandler
	private void onSelectionScreenClick(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		if (!event.getInventory().getName().equalsIgnoreCase(ChatColor.DARK_RED + "Select to Continue")) {
			return;
		}
		ItemStack tempbanOptionButton = event.getCurrentItem();
		if (tempbanOptionButton.getType() == Material.DIAMOND_SWORD) {
			player.closeInventory();
			this.tempbanscreen.openTempbanOptionScreen(player);
			return;
		} else {
			ItemStack cancelButton = event.getCurrentItem();
			if (cancelButton.getType() == Material.STAINED_GLASS_PANE) {
				player.closeInventory();
				player.sendMessage(ChatColor.GREEN + "[GUI Banner] " + ChatColor.DARK_RED + "Ban Cancelled");
				return;
			}
		}
		player.closeInventory();
	}
}
