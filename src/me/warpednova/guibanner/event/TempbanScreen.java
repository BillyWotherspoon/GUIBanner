package me.warpednova.guibanner.event;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

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

import me.warpednova.guibanner.Main;
import me.warpednova.guibanner.commands.Tempban;

public final class TempbanScreen implements Listener {
	private static HashMap<Integer, Short> damage = new HashMap<Integer, Short>();
	private static List<ItemStack> items = new Vector<ItemStack>();
	private static Main main;
	
	private static String[] materials = new String[] {
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

	public TempbanScreen(Main passed) {
		main = passed;
		damage.put(7, (short) 4);
		reloadItems();
	}
	
	public static void reloadItems() {
		items.clear();
		
		for (int i = 1; i < 19; i++) {
			String[] lore = { ChatColor.GOLD + "Temp Ban",
					ChatColor.GOLD + main.getConfig().getString("TempBanTimes.Hacks.Button" + i) };
			
			Material material = Main.getMaterial(materials[i - 1]);
			ItemStack item = (damage.containsKey(i)) ? new ItemStack(material, 1,  damage.get(i)) : new ItemStack(material, 1);
			ItemMeta meta = item.getItemMeta();
			meta.setDisplayName(ChatColor.GREEN + main.getConfig().getString("Names.Button" + i));
			meta.setLore(Arrays.asList(lore));
			item.setItemMeta(meta);
			items.add(item);
		}
	}
	
	@Deprecated
	public final void openTempbanOptionScreen(Player player) {
		openTempbanOptionScreen(player, Tempban.targetPlayer);
	}

	public final void openTempbanOptionScreen(Player player, String target) {
		Inventory Einv = Bukkit.createInventory(null, 18, ChatColor.AQUA + "Tempban " + target);
		for (ItemStack item: items) Einv.addItem(item);
		player.openInventory(Einv);
	}

	@EventHandler
	private void onHackScreenClick(InventoryClickEvent event) {
		ItemStack item = event.getCurrentItem();
		if (!items.contains(item) || event.getInventory() != event.getClickedInventory()) return;
		int i = items.indexOf(item) + 1;
		event.setCancelled(true);
		
		Player player = (Player) event.getWhoClicked();
		player.updateInventory();
		String[] tmp = event.getView().getTitle().split(" ");
		String target = tmp[tmp.length - 1];
		String reason = main.getConfig().getString("BanMessages.Hacks.Button" + i);
		String time = main.getConfig().getString("TempBanTimes.Hacks.Button" + i);
		String command = main.getConfig().getString("OnBanCommand.Command").replace("%targetplayer%", target);
		String message = ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("BroadcastMessage.Message"))
			.replace("%player%", player.getName())
			.replace("%targetplayer%", target)
			.replace("%bantime%", time)
			.replace("%reason%", reason);
		message = ChatColor.translateAlternateColorCodes('&', message);

		
		Bukkit.getServer().dispatchCommand(player, command);
		Bukkit.getServer().dispatchCommand(player, "essentials:tempban " + target + " " + time + " " + reason);
		Bukkit.broadcast(message, "guibanner.broadcast");
		player.closeInventory();
	}
}
