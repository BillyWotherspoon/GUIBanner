package me.warpednova.guibanner.event;

import java.util.Arrays;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.warpednova.guibanner.Main;
import me.warpednova.guibanner.commands.Tempban;

public final class SelectionScreen implements Listener {
	private static final ItemStack tempbanButton = new ItemStack(Main.getMaterial("DIAMOND_SWORD"));
	private static final ItemStack cancelButton = new ItemStack(Main.getMaterial("STAINED_GLASS_PANE"));
	private static final HashMap<Inventory, String> targets = new HashMap<Inventory, String>();
	private TempbanScreen tempbanscreen;

	public SelectionScreen(TempbanScreen passed) {
		this.tempbanscreen = passed;
		
		ItemMeta tempbanMeta = tempbanButton.getItemMeta();
		tempbanMeta.setDisplayName(ChatColor.GREEN + "Tempban Menu");
		tempbanMeta.setLore(Arrays.asList(new String[] { ChatColor.GOLD + "Click To Open Tempban Menu..." }));
		tempbanButton.setItemMeta(tempbanMeta);
		
		
		ItemMeta cancelMeta = cancelButton.getItemMeta();
		cancelMeta.setDisplayName(ChatColor.RED + "Cancel");
		cancelButton.setItemMeta(cancelMeta);
	}
	
	@Deprecated
	public static void openBanSelectionScreen(Player player) {
		openBanSelectionScreen(player, Tempban.targetPlayer);
	}

	public static void openBanSelectionScreen(Player player, String target) {
		Inventory selectionScreen = Bukkit.createInventory(null, 9, ChatColor.DARK_RED + "Select to Continue");
		targets.put(selectionScreen, target);
		
		selectionScreen.setItem(3, tempbanButton);
		selectionScreen.setItem(5, cancelButton);

		player.openInventory(selectionScreen);
	}

	@EventHandler
	private void onSelectionScreenClick(InventoryClickEvent event) {
		Inventory inventory = event.getInventory();
		if (!inventory.contains(tempbanButton) || event.getInventory() != event.getClickedInventory()) return;
		
		Player player = (Player) event.getWhoClicked();
		ItemStack button = event.getCurrentItem();
		String target = targets.get(inventory);
		
		if (button == null) return;
		if (button.equals(tempbanButton)) tempbanscreen.openTempbanOptionScreen(player, target);
		else if (button.equals(cancelButton)) {
			player.sendMessage(ChatColor.GREEN + "[GUI Banner] " + ChatColor.DARK_RED + "Ban Cancelled");
			player.closeInventory();
		} else return;
		targets.remove(event.getInventory());;
	}
}
