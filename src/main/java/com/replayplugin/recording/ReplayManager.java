package com.replayplugin.recording;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.*;

public class ReplayManager {

    private static final Map<UUID, String> recordedReplays = new HashMap<>();

    public static void startRecording(Player player) {
        String replayID = player.getUniqueId().toString() + "-" + System.currentTimeMillis();
        recordedReplays.put(player.getUniqueId(), replayID);
        player.sendMessage(ChatColor.GREEN + "Replay-Aufzeichnung gestartet!");
    }

    public static void stopRecording(Player player) {
        if (!recordedReplays.containsKey(player.getUniqueId())) {
            player.sendMessage(ChatColor.RED + "Es gibt kein aktives Replay für dich.");
            return;
        }

        player.sendMessage(ChatColor.YELLOW + "Replay gespeichert!");
    }

    public static void playReplay(Player player) {
        player.sendMessage(ChatColor.GREEN + "Replay wird abgespielt... (noch nicht implementiert)");
    }
}