package com.replayplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ReplayAdminCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("replayplugin.admin")) {
            sender.sendMessage(ChatColor.RED + "Du hast keine Berechtigung für diesen Befehl!");
            return true;
        }

        if (args.length < 1) {
            sender.sendMessage(ChatColor.RED + "Benutzung: /replayadmin <Replay-ID>");
            return true;
        }

        String replayId = args[0];
        
        // Replay laden (kommt in Schritt 4)
        sender.sendMessage(ChatColor.GREEN + "Replay mit ID " + replayId + " wird geladen (noch nicht implementiert).");

        return true;
    }
}