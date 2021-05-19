package net.teamfekker.tfcore.listeners.tfcreative;

import org.bukkit.GameMode;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import net.teamfekker.tfcore.Main;


public class Listeners implements Listener {
    private FileConfiguration config;
    private Main plugin;
	public Listeners(Main plugin) {
		this.plugin = plugin;
		this.config = plugin.getConfig();
	}



	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {	
		if (config.getBoolean("Enable automatic creative mode?")) {
			Player player = event.getPlayer();
			player.setGameMode(GameMode.CREATIVE);
			player.sendMessage("Creative Mode Activated");
		}
	}
}
