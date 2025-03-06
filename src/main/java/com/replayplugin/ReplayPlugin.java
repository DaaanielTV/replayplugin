package com.replayplugin;

import com.replayplugin.commands.ReplayCommand;
import com.replayplugin.commands.ReplayAdminCommand;
import com.replayplugin.commands.ReplayStopCommand;
import com.replayplugin.listeners.BedWarsListener;
import com.replayplugin.recording.ReplayRecorder;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;

public class ReplayPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("ReplayPlugin wurde aktiviert!");

        // ProtocolLib-Recorder initialisieren
        ReplayRecorder.init(this);

        // Befehle registrieren
        getCommand("replay").setExecutor(new ReplayCommand());
        getCommand("replayadmin").setExecutor(new ReplayAdminCommand());
        getCommand("replaystop").setExecutor(new ReplayStopCommand());

        // Listener registrieren
        Bukkit.getPluginManager().registerEvents(new BedWarsListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("ReplayPlugin wurde deaktiviert!");
    }
}