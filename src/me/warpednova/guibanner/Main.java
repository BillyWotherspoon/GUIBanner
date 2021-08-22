package me.warpednova.guibanner;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import me.warpednova.guibanner.commands.Tempban;
import me.warpednova.guibanner.event.SelectionScreen;
import me.warpednova.guibanner.event.TempbanScreen;

public class Main extends JavaPlugin implements Listener {
	public String noAccessMessage = getConfig().getString("Messages.NoAccess");
	public String invalidUsageMessage = getConfig().getString("Messages.InvalidUsage");
	String reloadMessage = getConfig().getString("Messages.ReloadMessage");
	public FileConfiguration config;
	public static JavaPlugin pl;
	File cfile;
	
	public void onEnable() {
		pl = this;
		getLogger().info("GUI Banner has been enabled.");

		getCommand("tempban").setExecutor(new Tempban(this));

		Bukkit.getPluginManager().registerEvents(new TempbanScreen(this), this);
		Bukkit.getPluginManager().registerEvents(new SelectionScreen(new TempbanScreen(this)), this);

		Bukkit.getPluginManager().registerEvents(new InventoryStealPrevention(), this);
		
		Bukkit.getPluginManager().registerEvents(this, this);

		config = getConfig();
		config.options().copyDefaults(true);
		saveConfig();
		cfile = new File(getDataFolder(), "config.yml");
		return;
	}
	
	public static Material getMaterial(String name) {
		Material ret;
		if ((ret = Material.getMaterial(name)) == null &&
				(Material.getMaterial(name, true)) == null) {
			pl.getLogger().warning("Invalid material: " + name);
			ret = Material.STONE;
		}
		return ret;
	}
	
	public void onDisable() {
		getLogger().info("GUI Banner has been disabled");
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("guireload")) {
			if (sender.hasPermission("guibanner.reload")) {
				reloadConfig();
				sender.sendMessage(ChatColor.GREEN + "[GUI Banner] " + ChatColor.BLUE + reloadMessage);
			}
		}
		return true;
	}
}