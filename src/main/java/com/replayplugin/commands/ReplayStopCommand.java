package com.replayplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ReplayStopCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Nur Spieler können diesen Befehl nutzen!");
            return true;
        }

        Player player = (Player) sender;

        // Hier wird das Replay gestoppt (kommt in Schritt 4)
        player.sendMessage(ChatColor.YELLOW + "Replay gestoppt (noch nicht implementiert).");

        return true;
    }
}