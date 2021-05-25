package net.teamfekker.tfcore.listeners.tfcreative;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import net.teamfekker.tfcore.Main;


public class Listeners implements Listener {



	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {	
		if (Main.plugin.getConfig().getBoolean("Enable automatic creative mode?")) {
			Player player = event.getPlayer();
			player.setGameMode(GameMode.CREATIVE);
			player.sendMessage("Creative Mode Activated");
		}
	}
}
