package me.warpednova.guibanner.event;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

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

public final class TempbanScreen implements Listener {
	private HashMap<Integer, Short> damage = new HashMap<Integer, Short>();
	private List<ItemStack> items = new Vector<ItemStack>();
	private String[] materials = new String[] {
			"DIAMOND",
			"FEATHER",
			"IRON_SWORD",
			"ENDER_CHEST",
			"TNT",
			"BOOK_AND_QUILL",
			"SKULL_ITEM",
			"COMPASS",
			"BED",
			"COAL_ORE",
			"REDSTONE_ORE",
			"LAPIS_ORE",
			"IRON_ORE",
			"GOLD_ORE",
			"EMERALD_ORE",
			"DIAMOND_ORE",
			"LOG",
			"BEDROCK"
	};
	private Main main;

	public TempbanScreen(Main passed) {
		this.main = passed;
		damage.put(7, (short) 4);
		
		
		for (int i = 1; i < 19; i++) {
			String[] lore = { ChatColor.GOLD + "Temp Ban",
					ChatColor.GOLD + main.getConfig().getString("TempBanTimes.Hacks.Button" + i) };
			
			ItemStack item = new ItemStack(Main.getMaterial(materials[i - 1]));
			ItemMeta meta = item.getItemMeta();
			meta.setDisplayName(ChatColor.GREEN + main.getConfig().getString("Names.Button" + i));
			meta.setLore(Arrays.asList(lore));
			item.setItemMeta(meta);
			items.add(item);
		}
	}

	public final void openTempbanOptionScreen(Player player) {
		Inventory Einv = Bukkit.createInventory(null, 18, ChatColor.AQUA + "EssentialsX Tempban " + Tempban.targetPlayer);
		for (ItemStack item: items) Einv.addItem(item);
		player.openInventory(Einv);
	}

	@EventHandler
	private void onHackScreenClick(InventoryClickEvent event) {
		ItemStack item = event.getCurrentItem();
		if (!items.contains(item)) return;
		int i = items.indexOf(item) + 1;
		event.setCancelled(true);
		
		
		Player player = (Player) event.getWhoClicked();
		String reason = main.getConfig().getString("BanMessages.Hacks.Button" + i);
		String time = main.getConfig().getString("TempBanTimes.Hacks.Button" + i);
		String command = main.getConfig().getString("OnBanCommand.Command").replace("%targetplayer%", Tempban.targetPlayer);
		String message = ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("BroadcastMessage.Message"))
			.replace("%player%", player.getName())
			.replace("%targetplayer%", Tempban.targetPlayer)
			.replace("%bantime%", time)
			.replace("%reason%", reason);
		message = ChatColor.translateAlternateColorCodes('&', message);

		
		Bukkit.getServer().dispatchCommand(player, command);
		Bukkit.getServer().dispatchCommand(player, "essentials:tempban " + Tempban.targetPlayer + " " + time + " " + reason);
		Bukkit.broadcast(message, "guibanner.broadcast");
		player.closeInventory();
	}
}
