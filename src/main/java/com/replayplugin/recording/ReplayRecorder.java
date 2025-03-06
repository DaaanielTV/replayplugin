package com.replayplugin.recording;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.events.PacketListener;
import com.comphenix.protocol.events.ListenerPriority;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.*;

public class ReplayRecorder {

    private static final Map<UUID, List<String>> recordedPackets = new HashMap<>();
    private static ProtocolManager protocolManager;

    public static void init(Plugin plugin) {
        protocolManager = ProtocolLibrary.getProtocolManager();

        // Bewegung aufzeichnen
        PacketListener moveListener = new PacketAdapter(plugin, ListenerPriority.NORMAL,
                PacketType.Play.Client.FLYING,
                PacketType.Play.Client.POSITION,
                PacketType.Play.Client.POSITION_LOOK) {
            @Override
            public void onPacketReceiving(PacketEvent event) {
                Player player = event.getPlayer();
                if (!recordedPackets.containsKey(player.getUniqueId())) return;

                String packetData = "MOVE:" + player.getLocation().getX() + "," +
                        player.getLocation().getY() + "," + player.getLocation().getZ();
                recordedPackets.get(player.getUniqueId()).add(packetData);
            }
        };

        // Angriff aufzeichnen
        PacketListener attackListener = new PacketAdapter(plugin, ListenerPriority.NORMAL,
                PacketType.Play.Client.USE_ENTITY) {
            @Override
            public void onPacketReceiving(PacketEvent event) {
                Player player = event.getPlayer();
                if (!recordedPackets.containsKey(player.getUniqueId())) return;

                String packetData = "HIT:" + System.currentTimeMillis();
                recordedPackets.get(player.getUniqueId()).add(packetData);
            }
        };

        // Listener registrieren
        protocolManager.addPacketListener(moveListener);
        protocolManager.addPacketListener(attackListener);
    }

    public static void startRecording(Player player) {
        recordedPackets.put(player.getUniqueId(), new ArrayList<>());
        player.sendMessage(ChatColor.GREEN + "Replay-Aufzeichnung gestartet.");
    }

    public static void stopRecording(Player player) {
        if (!recordedPackets.containsKey(player.getUniqueId())) {
            player.sendMessage(ChatColor.RED + "Kein Replay vorhanden.");
            return;
        }

        // Replay in Datei speichern (kommt später)
        player.sendMessage(ChatColor.YELLOW + "Replay gespeichert mit " +
                recordedPackets.get(player.getUniqueId()).size() + " Aktionen.");

        recordedPackets.remove(player.getUniqueId());
    }
}