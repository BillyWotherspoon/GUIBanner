package me.warpednova.guibanner.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.warpednova.guibanner.Main;
import me.warpednova.guibanner.event.SelectionScreen;

public final class Tempban implements CommandExecutor {
	private Main main;
	@Deprecated
	public static String targetPlayer;

	public Tempban(Main passed) {
		this.main = passed;
	}

	public final boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!cmd.getName().equalsIgnoreCase("tempban")) return true;
		if (!(sender instanceof Player)) {
			Bukkit.dispatchCommand(sender, "essentials:tempban " + String.join(" ", args));
			return true;
		}
		if ((args.length != 1) || (args == null)) { sender.sendMessage(ChatColor.RED + this.main.invalidUsageMessage); return true; }
		if (!sender.hasPermission("essentials.tempban")) { sender.sendMessage(ChatColor.DARK_RED + this.main.noAccessMessage); return true; }
		
		Player player = (Player) sender;
		String target = (targetPlayer = args[0]);
		SelectionScreen.openBanSelectionScreen(player, target);
		return true;
	}
}