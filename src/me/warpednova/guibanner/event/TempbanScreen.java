package me.warpednova.guibanner.event;

import java.util.Arrays;
import java.util.List;

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
	private Main main;

	public TempbanScreen(Main passed) {
		this.main = passed;
	}

	public final void openTempbanOptionScreen(Player player) {
		Inventory Einv = Bukkit.createInventory(null, 18, ChatColor.AQUA + "EssentialsX Tempban " + Tempban.targetPlayer);
		List<String> Button1Lore = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban",
				ChatColor.GOLD + this.main.getConfig().getString("TempBanTimes.Hacks.Button1") });
		List<String> Button2Lore = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban",
				ChatColor.GOLD + this.main.getConfig().getString("TempBanTimes.Hacks.Button2") });
		List<String> Button3Lore = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban",
				ChatColor.GOLD + this.main.getConfig().getString("TempBanTimes.Hacks.Button3") });
		List<String> Button4Lore = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban",
				ChatColor.GOLD + this.main.getConfig().getString("TempBanTimes.Hacks.Button4") });
		List<String> Button5Lore = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban",
				ChatColor.GOLD + this.main.getConfig().getString("TempBanTimes.Hacks.Button5") });
		List<String> Button6Lore = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban",
				ChatColor.GOLD + this.main.getConfig().getString("TempBanTimes.Hacks.Button6") });
		List<String> Button7Lore = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban",
				ChatColor.GOLD + this.main.getConfig().getString("TempBanTimes.Hacks.Button7") });
		List<String> Button8Lore = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban",
				ChatColor.GOLD + this.main.getConfig().getString("TempBanTimes.Hacks.Button8") });
		List<String> Button9Lore = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban",
				ChatColor.GOLD + this.main.getConfig().getString("TempBanTimes.Hacks.Button9") });
		List<String> Button10Lore = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban",
				ChatColor.GOLD + this.main.getConfig().getString("TempBanTimes.Hacks.Button10") });
		List<String> Button11Lore = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban",
				ChatColor.GOLD + this.main.getConfig().getString("TempBanTimes.Hacks.Button11") });
		List<String> Button12Lore = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban",
				ChatColor.GOLD + this.main.getConfig().getString("TempBanTimes.Hacks.Button12") });
		List<String> Button13Lore = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban",
				ChatColor.GOLD + this.main.getConfig().getString("TempBanTimes.Hacks.Button13") });
		List<String> Button14Lore = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban",
				ChatColor.GOLD + this.main.getConfig().getString("TempBanTimes.Hacks.Button14") });
		List<String> Button15Lore = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban",
				ChatColor.GOLD + this.main.getConfig().getString("TempBanTimes.Hacks.Button15") });
		List<String> Button16Lore = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban",
				ChatColor.GOLD + this.main.getConfig().getString("TempBanTimes.Hacks.Button16") });
		List<String> Button17Lore = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban",
				ChatColor.GOLD + this.main.getConfig().getString("TempBanTimes.Hacks.Button17") });
		List<String> Button18Lore = Arrays.asList(new String[] { ChatColor.GOLD + "Temp Ban",
				ChatColor.GOLD + this.main.getConfig().getString("TempBanTimes.Hacks.Button18") });
		ItemStack Button1;
		ItemMeta Button1Meta = (Button1 = new ItemStack(Main.getMaterial("DIAMOND"))).getItemMeta();
		ItemStack Button2;
		ItemMeta Button2Meta = (Button2 = new ItemStack(Main.getMaterial("FEATHER"))).getItemMeta();
		ItemStack Button3;
		ItemMeta Button3Meta = (Button3 = new ItemStack(Main.getMaterial("IRON_SWORD"))).getItemMeta();
		ItemStack Button4;
		ItemMeta Button4Meta = (Button4 = new ItemStack(Main.getMaterial("ENDER_CHEST"))).getItemMeta();
		ItemStack Button5;
		ItemMeta Button5Meta = (Button5 = new ItemStack(Main.getMaterial("TNT"))).getItemMeta();
		ItemStack Button6;
		ItemMeta Button6Meta = (Button6 = new ItemStack(Main.getMaterial("BOOK_AND_QUILL"))).getItemMeta();
		ItemStack Button7;
		@SuppressWarnings("deprecation")
		ItemMeta Button7Meta = (Button7 = new ItemStack(Main.getMaterial("SKULL_ITEM"), 1, (byte) 4)).getItemMeta();
		ItemStack Button8;
		ItemMeta Button8Meta = (Button8 = new ItemStack(Main.getMaterial("COMPASS"))).getItemMeta();
		ItemStack Button9;
		ItemMeta Button9Meta = (Button9 = new ItemStack(Main.getMaterial("BED"))).getItemMeta();
		ItemStack Button10;
		ItemMeta Button10Meta = (Button10 = new ItemStack(Main.getMaterial("COAL_ORE"))).getItemMeta();
		ItemStack Button11;
		ItemMeta Button11Meta = (Button11 = new ItemStack(Main.getMaterial("REDSTONE_ORE"))).getItemMeta();
		ItemStack Button12;
		ItemMeta Button12Meta = (Button12 = new ItemStack(Main.getMaterial("LAPIS_ORE"))).getItemMeta();
		ItemStack Button13;
		ItemMeta Button13Meta = (Button13 = new ItemStack(Main.getMaterial("IRON_ORE"))).getItemMeta();
		ItemStack Button14;
		ItemMeta Button14Meta = (Button14 = new ItemStack(Main.getMaterial("GOLD_ORE"))).getItemMeta();
		ItemStack Button15;
		ItemMeta Button15Meta = (Button15 = new ItemStack(Main.getMaterial("EMERALD_ORE"))).getItemMeta();
		ItemStack Button16;
		ItemMeta Button16Meta = (Button16 = new ItemStack(Main.getMaterial("DIAMOND_ORE"))).getItemMeta();
		ItemStack Button17;
		ItemMeta Button17Meta = (Button17 = new ItemStack(Main.getMaterial("LOG"))).getItemMeta();
		ItemStack Button18;
		ItemMeta Button18Meta = (Button18 = new ItemStack(Main.getMaterial("BEDROCK"))).getItemMeta();

		String Button1Name = this.main.getConfig().getString("Names.Button1");
		String Button2Name = this.main.getConfig().getString("Names.Button2");
		String Button3Name = this.main.getConfig().getString("Names.Button3");
		String Button4Name = this.main.getConfig().getString("Names.Button4");
		String Button5Name = this.main.getConfig().getString("Names.Button5");
		String Button6Name = this.main.getConfig().getString("Names.Button6");
		String Button7Name = this.main.getConfig().getString("Names.Button7");
		String Button8Name = this.main.getConfig().getString("Names.Button8");
		String Button9Name = this.main.getConfig().getString("Names.Button9");
		String Button10Name = this.main.getConfig().getString("Names.Button10");
		String Button11Name = this.main.getConfig().getString("Names.Button11");
		String Button12Name = this.main.getConfig().getString("Names.Button12");
		String Button13Name = this.main.getConfig().getString("Names.Button13");
		String Button14Name = this.main.getConfig().getString("Names.Button14");
		String Button15Name = this.main.getConfig().getString("Names.Button15");
		String Button16Name = this.main.getConfig().getString("Names.Button16");
		String Button17Name = this.main.getConfig().getString("Names.Button17");
		String Button18Name = this.main.getConfig().getString("Names.Button18");

		Button1Meta.setDisplayName(ChatColor.GREEN + Button1Name);
		Button1Meta.setLore(Button1Lore);
		Button1.setItemMeta(Button1Meta);

		Button2Meta.setDisplayName(ChatColor.GREEN + Button2Name);
		Button2Meta.setLore(Button2Lore);
		Button2.setItemMeta(Button2Meta);

		Button3Meta.setDisplayName(ChatColor.GREEN + Button3Name);
		Button3Meta.setLore(Button3Lore);
		Button3.setItemMeta(Button3Meta);

		Button4Meta.setDisplayName(ChatColor.GREEN + Button4Name);
		Button4Meta.setLore(Button4Lore);
		Button4.setItemMeta(Button4Meta);

		Button5Meta.setDisplayName(ChatColor.GREEN + Button5Name);
		Button5Meta.setLore(Button5Lore);
		Button5.setItemMeta(Button5Meta);

		Button6Meta.setDisplayName(ChatColor.GREEN + Button6Name);
		Button6Meta.setLore(Button6Lore);
		Button6.setItemMeta(Button6Meta);

		Button7Meta.setDisplayName(ChatColor.GREEN + Button7Name);
		Button7Meta.setLore(Button7Lore);
		Button7.setItemMeta(Button7Meta);

		Button8Meta.setDisplayName(ChatColor.GREEN + Button8Name);
		Button8Meta.setLore(Button8Lore);
		Button8.setItemMeta(Button8Meta);

		Button9Meta.setDisplayName(ChatColor.GREEN + Button9Name);
		Button9Meta.setLore(Button9Lore);
		Button9.setItemMeta(Button9Meta);

		Button10Meta.setDisplayName(ChatColor.GREEN + Button10Name);
		Button10Meta.setLore(Button10Lore);
		Button10.setItemMeta(Button10Meta);

		Button11Meta.setDisplayName(ChatColor.GREEN + Button11Name);
		Button11Meta.setLore(Button11Lore);
		Button11.setItemMeta(Button11Meta);

		Button12Meta.setDisplayName(ChatColor.GREEN + Button12Name);
		Button12Meta.setLore(Button12Lore);
		Button12.setItemMeta(Button12Meta);

		Button13Meta.setDisplayName(ChatColor.GREEN + Button13Name);
		Button13Meta.setLore(Button13Lore);
		Button13.setItemMeta(Button13Meta);

		Button14Meta.setDisplayName(ChatColor.GREEN + Button14Name);
		Button14Meta.setLore(Button14Lore);
		Button14.setItemMeta(Button14Meta);

		Button15Meta.setDisplayName(ChatColor.GREEN + Button15Name);
		Button15Meta.setLore(Button15Lore);
		Button15.setItemMeta(Button15Meta);

		Button16Meta.setDisplayName(ChatColor.GREEN + Button16Name);
		Button16Meta.setLore(Button16Lore);
		Button16.setItemMeta(Button16Meta);

		Button17Meta.setDisplayName(ChatColor.GREEN + Button17Name);
		Button17Meta.setLore(Button17Lore);
		Button17.setItemMeta(Button17Meta);

		Button18Meta.setDisplayName(ChatColor.GREEN + Button18Name);
		Button18Meta.setLore(Button18Lore);
		Button18.setItemMeta(Button18Meta);
		Einv.setItem(0, Button1);
		Einv.setItem(1, Button2);
		Einv.setItem(2, Button3);
		Einv.setItem(3, Button4);
		Einv.setItem(4, Button5);
		Einv.setItem(5, Button6);
		Einv.setItem(6, Button7);
		Einv.setItem(7, Button8);
		Einv.setItem(8, Button9);
		Einv.setItem(9, Button10);
		Einv.setItem(10, Button11);
		Einv.setItem(11, Button12);
		Einv.setItem(12, Button13);
		Einv.setItem(13, Button14);
		Einv.setItem(14, Button15);
		Einv.setItem(15, Button16);
		Einv.setItem(16, Button17);
		Einv.setItem(17, Button18);
		player.openInventory(Einv);
	}

	@EventHandler
	private void onHackScreenClick(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		if (!event.getView().getTitle().equalsIgnoreCase(ChatColor.AQUA + "EssentialsX TempBan " + Tempban.targetPlayer)) {
			return;
		}
		String Button1BanMessage = this.main.getConfig().getString("BanMessages.Hacks.Button1");
		String Button2BanMessage = this.main.getConfig().getString("BanMessages.Hacks.Button2");
		String Button3BanMessage = this.main.getConfig().getString("BanMessages.Hacks.Button3");
		String Button4BanMessage = this.main.getConfig().getString("BanMessages.Hacks.Button4");
		String Button5BanMessage = this.main.getConfig().getString("BanMessages.Hacks.Button5");
		String Button6BanMessage = this.main.getConfig().getString("BanMessages.Hacks.Button6");
		String Button7BanMessage = this.main.getConfig().getString("BanMessages.Hacks.Button7");
		String Button8BanMessage = this.main.getConfig().getString("BanMessages.Hacks.Button8");
		String Button9BanMessage = this.main.getConfig().getString("BanMessages.Hacks.Button9");
		String Button10BanMessage = this.main.getConfig().getString("BanMessages.Hacks.Button10");
		String Button11BanMessage = this.main.getConfig().getString("BanMessages.Hacks.Button11");
		String Button12BanMessage = this.main.getConfig().getString("BanMessages.Hacks.Button12");
		String Button13BanMessage = this.main.getConfig().getString("BanMessages.Hacks.Button13");
		String Button14BanMessage = this.main.getConfig().getString("BanMessages.Hacks.Button14");
		String Button15BanMessage = this.main.getConfig().getString("BanMessages.Hacks.Button15");
		String Button16BanMessage = this.main.getConfig().getString("BanMessages.Hacks.Button16");
		String Button17BanMessage = this.main.getConfig().getString("BanMessages.Hacks.Button17");
		String Button18BanMessage = this.main.getConfig().getString("BanMessages.Hacks.Button18");

		String Button1BanTime = this.main.getConfig().getString("TempBanTimes.Hacks.Button1");
		String Button2BanTime = this.main.getConfig().getString("TempBanTimes.Hacks.Button2");
		String Button3BanTime = this.main.getConfig().getString("TempBanTimes.Hacks.Button3");
		String Button4BanTime = this.main.getConfig().getString("TempBanTimes.Hacks.Button4");
		String Button5BanTime = this.main.getConfig().getString("TempBanTimes.Hacks.Button5");
		String Button6BanTime = this.main.getConfig().getString("TempBanTimes.Hacks.Button6");
		String Button7BanTime = this.main.getConfig().getString("TempBanTimes.Hacks.Button7");
		String Button8BanTime = this.main.getConfig().getString("TempBanTimes.Hacks.Button8");
		String Button9BanTime = this.main.getConfig().getString("TempBanTimes.Hacks.Button9");
		String Button10BanTime = this.main.getConfig().getString("TempBanTimes.Hacks.Button10");
		String Button11BanTime = this.main.getConfig().getString("TempBanTimes.Hacks.Button11");
		String Button12BanTime = this.main.getConfig().getString("TempBanTimes.Hacks.Button12");
		String Button13BanTime = this.main.getConfig().getString("TempBanTimes.Hacks.Button13");
		String Button14BanTime = this.main.getConfig().getString("TempBanTimes.Hacks.Button14");
		String Button15BanTime = this.main.getConfig().getString("TempBanTimes.Hacks.Button15");
		String Button16BanTime = this.main.getConfig().getString("TempBanTimes.Hacks.Button16");
		String Button17BanTime = this.main.getConfig().getString("TempBanTimes.Hacks.Button17");
		String Button18BanTime = this.main.getConfig().getString("TempBanTimes.Hacks.Button18");

		String B1B = ChatColor.translateAlternateColorCodes('&',this.main.getConfig().getString("BroadcastMessage.Message"));
		B1B = B1B.replace("%player%", player.getName());
		B1B = B1B.replace("%targetplayer%", Tempban.targetPlayer);
		B1B = B1B.replace("%bantime%", Button1BanTime);
		B1B = B1B.replace("%reason%", Button1BanMessage);
		ChatColor.translateAlternateColorCodes('&', B1B);
		
		String B2B = ChatColor.translateAlternateColorCodes('&',this.main.getConfig().getString("BroadcastMessage.Message"));
		B2B = B2B.replace("%player%", player.getName());
		B2B = B2B.replace("%targetplayer%", Tempban.targetPlayer);
		B2B = B2B.replace("%bantime%", Button2BanTime);
		B2B = B2B.replace("%reason%", Button2BanMessage);
		ChatColor.translateAlternateColorCodes('&', B2B);
		
		String B3B = ChatColor.translateAlternateColorCodes('&',this.main.getConfig().getString("BroadcastMessage.Message"));
		B3B = B3B.replace("%player%", player.getName());
		B3B = B3B.replace("%targetplayer%", Tempban.targetPlayer);
		B3B = B3B.replace("%bantime%", Button3BanTime);
		B3B = B3B.replace("%reason%", Button3BanMessage);
		ChatColor.translateAlternateColorCodes('&', B3B);
		
		String B4B = ChatColor.translateAlternateColorCodes('&',this.main.getConfig().getString("BroadcastMessage.Message"));
		B4B = B4B.replace("%player%", player.getName());
		B4B = B4B.replace("%targetplayer%", Tempban.targetPlayer);
		B4B = B4B.replace("%bantime%", Button4BanTime);
		B4B = B4B.replace("%reason%", Button4BanMessage);
		ChatColor.translateAlternateColorCodes('&', B4B);
		
		String B5B = ChatColor.translateAlternateColorCodes('&',this.main.getConfig().getString("BroadcastMessage.Message"));
		B5B = B5B.replace("%player%", player.getName());
		B5B = B5B.replace("%targetplayer%", Tempban.targetPlayer);
		B5B = B5B.replace("%bantime%", Button5BanTime);
		B5B = B5B.replace("%reason%", Button5BanMessage);
		
		String B6B = ChatColor.translateAlternateColorCodes('&',this.main.getConfig().getString("BroadcastMessage.Message"));
		B6B = B6B.replace("%player%", player.getName());
		B6B = B6B.replace("%targetplayer%", Tempban.targetPlayer);
		B6B = B6B.replace("%bantime%", Button6BanTime);
		B6B = B6B.replace("%reason%", Button6BanMessage);
		ChatColor.translateAlternateColorCodes('&', B6B);
		
		String B7B = ChatColor.translateAlternateColorCodes('&',this.main.getConfig().getString("BroadcastMessage.Message"));
		B7B = B7B.replace("%player%", player.getName());
		B7B = B7B.replace("%targetplayer%", Tempban.targetPlayer);
		B7B = B7B.replace("%bantime%", Button7BanTime);
		B7B = B7B.replace("%reason%", Button7BanMessage);
		ChatColor.translateAlternateColorCodes('&', B7B);
		
		String B8B = ChatColor.translateAlternateColorCodes('&',this.main.getConfig().getString("BroadcastMessage.Message"));
		B8B = B8B.replace("%player%", player.getName());
		B8B = B8B.replace("%targetplayer%", Tempban.targetPlayer);
		B8B = B8B.replace("%bantime%", Button8BanTime);
		B8B = B8B.replace("%reason%", Button8BanMessage);
		ChatColor.translateAlternateColorCodes('&', B8B);
		
		String B9B = ChatColor.translateAlternateColorCodes('&',this.main.getConfig().getString("BroadcastMessage.Message"));
		B9B = B9B.replace("%player%", player.getName());
		B9B = B9B.replace("%targetplayer%", Tempban.targetPlayer);
		B9B = B9B.replace("%bantime%", Button9BanTime);
		B9B = B9B.replace("%reason%", Button9BanMessage);
		ChatColor.translateAlternateColorCodes('&', B9B);
		
		String B10B = ChatColor.translateAlternateColorCodes('&',this.main.getConfig().getString("BroadcastMessage.Message"));
		B10B = B10B.replace("%player%", player.getName());
		B10B = B10B.replace("%targetplayer%", Tempban.targetPlayer);
		B10B = B10B.replace("%bantime%", Button10BanTime);
		B10B = B10B.replace("%reason%", Button10BanMessage);
		ChatColor.translateAlternateColorCodes('&', B10B);

		String B11B = ChatColor.translateAlternateColorCodes('&',this.main.getConfig().getString("BroadcastMessage.Message"));
		B11B = B11B.replace("%player%", player.getName());
		B11B = B11B.replace("%targetplayer%", Tempban.targetPlayer);
		B11B = B11B.replace("%bantime%", Button11BanTime);
		B11B = B11B.replace("%reason%", Button11BanMessage);
		ChatColor.translateAlternateColorCodes('&', B11B);
		
		String B12B = ChatColor.translateAlternateColorCodes('&',this.main.getConfig().getString("BroadcastMessage.Message"));
		B12B = B12B.replace("%player%", player.getName());
		B12B = B12B.replace("%targetplayer%", Tempban.targetPlayer);
		B12B = B12B.replace("%bantime%", Button12BanTime);
		B12B = B12B.replace("%reason%", Button12BanMessage);
		ChatColor.translateAlternateColorCodes('&', B12B);
		
		String B13B = ChatColor.translateAlternateColorCodes('&',this.main.getConfig().getString("BroadcastMessage.Message"));
		B13B = B13B.replace("%player%", player.getName());
		B13B = B13B.replace("%targetplayer%", Tempban.targetPlayer);
		B13B = B13B.replace("%bantime%", Button13BanTime);
		B13B = B13B.replace("%reason%", Button13BanMessage);
		ChatColor.translateAlternateColorCodes('&', B13B);
		
		String B14B = ChatColor.translateAlternateColorCodes('&',this.main.getConfig().getString("BroadcastMessage.Message"));
		B14B = B14B.replace("%player%", player.getName());
		B14B = B14B.replace("%targetplayer%", Tempban.targetPlayer);
		B14B = B14B.replace("%bantime%", Button14BanTime);
		B14B = B14B.replace("%reason%", Button14BanMessage);
		ChatColor.translateAlternateColorCodes('&', B14B);
		
		String B15B = ChatColor.translateAlternateColorCodes('&',this.main.getConfig().getString("BroadcastMessage.Message"));
		B15B = B15B.replace("%player%", player.getName());
		B15B = B15B.replace("%targetplayer%", Tempban.targetPlayer);
		B15B = B15B.replace("%bantime%", Button15BanTime);
		B15B = B15B.replace("%reason%", Button15BanMessage);
		ChatColor.translateAlternateColorCodes('&', B15B);
		
		String B16B = ChatColor.translateAlternateColorCodes('&',this.main.getConfig().getString("BroadcastMessage.Message"));
		B16B = B16B.replace("%player%", player.getName());
		B16B = B16B.replace("%targetplayer%", Tempban.targetPlayer);
		B16B = B16B.replace("%bantime%", Button16BanTime);
		B16B = B16B.replace("%reason%", Button16BanMessage);
		ChatColor.translateAlternateColorCodes('&', B16B);
		
		String B17B = ChatColor.translateAlternateColorCodes('&',this.main.getConfig().getString("BroadcastMessage.Message"));
		B17B = B17B.replace("%player%", player.getName());
		B17B = B17B.replace("%targetplayer%", Tempban.targetPlayer);
		B17B = B17B.replace("%bantime%", Button17BanTime);
		B17B = B17B.replace("%reason%", Button17BanMessage);
		ChatColor.translateAlternateColorCodes('&', B17B);
		
		String B18B = ChatColor.translateAlternateColorCodes('&',this.main.getConfig().getString("BroadcastMessage.Message"));
		B18B = B18B.replace("%player%", player.getName());
		B18B = B18B.replace("%targetplayer%", Tempban.targetPlayer);
		B18B = B18B.replace("%bantime%", Button18BanTime);
		B18B = B18B.replace("%reason%", Button18BanMessage);
		ChatColor.translateAlternateColorCodes('&', B18B);
		
		String OnBanCommand = this.main.getConfig().getString("OnBanCommand.Command");
		OnBanCommand = OnBanCommand.replace("%targetplayer%", Tempban.targetPlayer);

		ItemStack Button1 = event.getCurrentItem();
		if (Button1.getType() == Main.getMaterial("DIAMOND")) {
			Bukkit.getServer().dispatchCommand(player, OnBanCommand);
			Bukkit.getServer().dispatchCommand(player,
					"essentials:tempban " + Tempban.targetPlayer + " " + Button1BanTime + " " + Button1BanMessage);
			player.closeInventory();
			Bukkit.broadcast(B1B, "guibanner.broadcast");
		}
		ItemStack Button2 = event.getCurrentItem();
		if (Button2.getType() == Main.getMaterial("FEATHER")) {
			Bukkit.getServer().dispatchCommand(player, OnBanCommand);
			Bukkit.getServer().dispatchCommand(player,
					"essentials:tempban " + Tempban.targetPlayer + " " + Button2BanTime + " " + Button2BanMessage);
			player.closeInventory();
			Bukkit.broadcast(B2B, "guibanner.broadcast");
		}
		ItemStack Button3 = event.getCurrentItem();
		if (Button3.getType() == Main.getMaterial("IRON_SWORD")) {
			Bukkit.getServer().dispatchCommand(player, OnBanCommand);
			Bukkit.getServer().dispatchCommand(player,
					"essentials:tempban " + Tempban.targetPlayer + " " + Button3BanTime + " " + Button3BanMessage);
			player.closeInventory();
			Bukkit.broadcast(B3B, "guibanner.broadcast");
		}
		ItemStack Button4 = event.getCurrentItem();
		if (Button4.getType() == Main.getMaterial("ENDER_CHEST")) {
			Bukkit.getServer().dispatchCommand(player, OnBanCommand);
			Bukkit.getServer().dispatchCommand(player,
					"essentials:tempban " + Tempban.targetPlayer + " " + Button4BanTime + " " + Button4BanMessage);
			player.closeInventory();
			Bukkit.broadcast(B4B, "guibanner.broadcast");
		}
		ItemStack Button5 = event.getCurrentItem();
		if (Button5.getType() == Main.getMaterial("TNT")) {
			Bukkit.getServer().dispatchCommand(player, OnBanCommand);
			Bukkit.getServer().dispatchCommand(player,
					"essentials:tempban " + Tempban.targetPlayer + " " + Button5BanTime + " " + Button5BanMessage);
			player.closeInventory();
			Bukkit.broadcast(B5B, "guibanner.broadcast");
		}
		ItemStack Button6 = event.getCurrentItem();
		if (Button6.getType() == Main.getMaterial("BOOK_AND_QUILL")) {
			Bukkit.getServer().dispatchCommand(player, OnBanCommand);
			Bukkit.getServer().dispatchCommand(player,
					"essentials:tempban " + Tempban.targetPlayer + " " + Button6BanTime + " " + Button6BanMessage);
			player.closeInventory();
			Bukkit.broadcast(B6B, "guibanner.broadcast");
		}
		ItemStack Button7 = event.getCurrentItem();
		if (Button7.getType() == Main.getMaterial("SKULL_ITEM")) {
			Bukkit.getServer().dispatchCommand(player, OnBanCommand);
			Bukkit.getServer().dispatchCommand(player,
					"essentials:tempban " + Tempban.targetPlayer + " " + Button7BanTime + " " + Button7BanMessage);
			player.closeInventory();
			Bukkit.broadcast(B7B, "guibanner.broadcast");
		}
		ItemStack Button8 = event.getCurrentItem();
		if (Button8.getType() == Main.getMaterial("COMPASS")) {

			Bukkit.getServer().dispatchCommand(player, OnBanCommand);
			Bukkit.getServer().dispatchCommand(player,
					"essentials:tempban " + Tempban.targetPlayer + " " + Button8BanTime + " " + Button8BanMessage);
			player.closeInventory();
			Bukkit.broadcast(B8B, "guibanner.broadcast");
		}
		ItemStack Button9 = event.getCurrentItem();
		if (Button9.getType() == Main.getMaterial("BED")) {
			Bukkit.getServer().dispatchCommand(player, OnBanCommand);
			Bukkit.getServer().dispatchCommand(player,
					"essentials:tempban " + Tempban.targetPlayer + " " + Button9BanTime + " " + Button9BanMessage);
			player.closeInventory();
			Bukkit.broadcast(B9B, "guibanner.broadcast");
		}
		ItemStack Button10 = event.getCurrentItem();
		if (Button10.getType() == Main.getMaterial("COAL_ORE")) {
			Bukkit.getServer().dispatchCommand(player, OnBanCommand);
			Bukkit.getServer().dispatchCommand(player,
					"essentials:tempban " + Tempban.targetPlayer + " " + Button10BanTime + " " + Button10BanMessage);
			player.closeInventory();
			Bukkit.broadcast(B10B, "guibanner.broadcast");
		}
		ItemStack Button11 = event.getCurrentItem();
		if (Button11.getType() == Main.getMaterial("REDSTONE_ORE")) {
			Bukkit.getServer().dispatchCommand(player, OnBanCommand);
			Bukkit.getServer().dispatchCommand(player,
					"essentials:tempban " + Tempban.targetPlayer + " " + Button11BanTime + " " + Button11BanMessage);
			player.closeInventory();
			Bukkit.broadcast(B11B, "guibanner.broadcast");
		}
		ItemStack Button12 = event.getCurrentItem();
		if (Button12.getType() == Main.getMaterial("LAPIS_ORE")) {
			Bukkit.getServer().dispatchCommand(player, OnBanCommand);
			Bukkit.getServer().dispatchCommand(player,
					"essentials:tempban " + Tempban.targetPlayer + " " + Button12BanTime + " " + Button12BanMessage);
			player.closeInventory();
			Bukkit.broadcast(B12B, "guibanner.broadcast");
		}
		ItemStack Button13 = event.getCurrentItem();
		if (Button13.getType() == Main.getMaterial("IRON_ORE")) {
			Bukkit.getServer().dispatchCommand(player, OnBanCommand);
			Bukkit.getServer().dispatchCommand(player,
					"essentials:tempban " + Tempban.targetPlayer + " " + Button13BanTime + " " + Button13BanMessage);
			player.closeInventory();
			Bukkit.broadcast(B13B, "guibanner.broadcast");
		}
		ItemStack Button14 = event.getCurrentItem();
		if (Button14.getType() == Main.getMaterial("GOLD_ORE")) {
			Bukkit.getServer().dispatchCommand(player, OnBanCommand);
			Bukkit.getServer().dispatchCommand(player,
					"essentials:tempban " + Tempban.targetPlayer + " " + Button14BanTime + " " + Button14BanMessage);
			player.closeInventory();
			Bukkit.broadcast(B14B, "guibanner.broadcast");
		}
		ItemStack Button15 = event.getCurrentItem();
		if (Button15.getType() == Main.getMaterial("EMERALD_ORE")) {
			Bukkit.getServer().dispatchCommand(player, OnBanCommand);
			Bukkit.getServer().dispatchCommand(player,
					"essentials:tempban " + Tempban.targetPlayer + " " + Button15BanTime + " " + Button15BanMessage);
			player.closeInventory();
			Bukkit.broadcast(B15B, "guibanner.broadcast");
		}
		ItemStack Button16 = event.getCurrentItem();
		if (Button16.getType() == Main.getMaterial("DIAMOND_ORE")) {
			Bukkit.getServer().dispatchCommand(player, OnBanCommand);
			Bukkit.getServer().dispatchCommand(player,
					"essentials:tempban " + Tempban.targetPlayer + " " + Button16BanTime + " " + Button16BanMessage);
			player.closeInventory();
			Bukkit.broadcast(B16B, "guibanner.broadcast");
		}
		ItemStack Button17 = event.getCurrentItem();
		if (Button17.getType() == Main.getMaterial("LOG")) {
			Bukkit.getServer().dispatchCommand(player, OnBanCommand);
			Bukkit.getServer().dispatchCommand(player,
					"essentials:tempban " + Tempban.targetPlayer + " " + Button17BanTime + " " + Button17BanMessage);
			player.closeInventory();
			Bukkit.broadcast(B17B, "guibanner.broadcast");
		}
		ItemStack Button18 = event.getCurrentItem();
		if (Button18.getType() == Main.getMaterial("BEDROCK")) {
			Bukkit.getServer().dispatchCommand(player, OnBanCommand);
			Bukkit.getServer().dispatchCommand(player,
					"essentials:tempban " + Tempban.targetPlayer + " " + Button18BanTime + " " + Button18BanMessage);
			player.closeInventory();
			Bukkit.broadcast(B18B, "guibanner.broadcast");
		}
		player.closeInventory();
	}
}
