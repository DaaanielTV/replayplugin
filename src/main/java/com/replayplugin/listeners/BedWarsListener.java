package com.replayplugin.listeners;

import com.replayplugin.recording.ReplayManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.screamingsandals.bedwars.api.game.Game;
import org.screamingsandals.bedwars.api.events.BedwarsGameStartedEvent;
import org.screamingsandals.bedwars.api.events.BedwarsGameEndEvent;

import java.util.UUID;

public class BedWarsListener implements Listener {

    @EventHandler
    public void onGameStart(BedwarsGameStartedEvent event) {
        Bukkit.broadcastMessage(ChatColor.AQUA + "[Replay] Die Replay-Aufzeichnung wurde gestartet!");

        
        }

    @EventHandler
    public void onGameEnd(BedwarsGameEndEvent event) {
        Bukkit.broadcastMessage(ChatColor.YELLOW + "[Replay] Die Replay-Aufzeichnung wurde gestoppt!");
    }
}