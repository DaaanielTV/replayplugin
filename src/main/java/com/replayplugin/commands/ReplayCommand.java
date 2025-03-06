package com.replayplugin.commands;

import com.replayplugin.gui.ReplayGUI;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ReplayCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Nur Spieler können diesen Befehl nutzen!");
            return true;
        }

        Player player = (Player) sender;
        ReplayGUI.openReplayMenu(player);
        return true;
    }
}