package me.warpednova.guibanner.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.warpednova.guibanner.Main;
import me.warpednova.guibanner.event.SelectionScreen;

public final class Tempban implements CommandExecutor {
	private Main main;
	public static String targetPlayer;

	public Tempban(Main passed) {
		this.main = passed;
	}

	public final boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		;
		;
		if ((cmd.getName().equalsIgnoreCase("tempban")) && ((sender instanceof Player))) {
			Player player = (Player) sender;
			if (((player = (Player) sender).hasPermission("essentials.tempban"))) {
				if (args.length == 1) {
					targetPlayer = args[0];
					SelectionScreen.openBanSelectionScreen(player);
				}
				if ((args.length != 1) || (args == null)) {
					player.sendMessage(ChatColor.RED + this.main.invalidUsageMessage);
				}
			    if (!player.hasPermission("essentials.tempban")) {
				player.sendMessage(ChatColor.DARK_RED + this.main.noAccessMessage);
			    }
			}
		}
		return true;
	}
}