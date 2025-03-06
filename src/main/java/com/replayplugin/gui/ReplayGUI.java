package com.replayplugin.gui;

import com.replayplugin.recording.ReplayManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ReplayGUI implements Listener {

    public static void openReplayMenu(Player player) {
        Inventory gui = Bukkit.createInventory(null, 9, ChatColor.BLUE + "Deine Replays");

        // Positionen für die Replays in der Mitte (Slot 3, 4, 5)
        int[] slots = {3, 4, 5};

        // Beispielhafte Replays laden (später durch gespeicherte Replays ersetzen)
        for (int i = 0; i < 3; i++) {
            ItemStack replayItem = createReplayItem(player.getUniqueId(), i + 1);
            gui.setItem(slots[i], replayItem);
        }

        player.openInventory(gui);
    }

    private static ItemStack createReplayItem(UUID playerUUID, int replayNumber) {
        ItemStack bed = new ItemStack(Material.RED_BED);
        ItemMeta meta = bed.getItemMeta();
        if (meta != null) {
            meta.setDisplayName(ChatColor.YELLOW + "Replay #" + replayNumber);

            List<String> lore = new ArrayList<>();
            lore.add(ChatColor.GRAY + "Datum: 00.00.0000");
            lore.add(ChatColor.GRAY + "Uhrzeit: 00:00");
            lore.add(ChatColor.GRAY + "ID: " + playerUUID.toString() + "-" + replayNumber);

            meta.setLore(lore);
            bed.setItemMeta(meta);
        }
        return bed;
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (!event.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "Deine Replays")) {
            return;
        }

        event.setCancelled(true);

        if (event.getCurrentItem() == null || event.getCurrentItem().getType() != Material.RED_BED) {
            return;
        }

        Player player = (Player) event.getWhoClicked();
        player.closeInventory();
        
        // Teleport in Replay-Welt (später durch richtige Speicherung ersetzen)
        ReplayManager.playReplay(player);
    }
}