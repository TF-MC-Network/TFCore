package net.teamfekker.tfcore;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
	
	@SuppressWarnings("unused")
	private static Plugin plugin;
    FileConfiguration config = this.getConfig();
	
	@Override
	public void onEnable() {
		plugin = this;
		//config things
    	config.addDefault("Enable automatic creative mode?", false);
		config.options().copyDefaults(true);
		saveConfig();

		//class registers
		Bukkit.getPluginManager().registerEvents(new net.teamfekker.tfcore.listeners.tfcreative.Listeners(this), this);
		Bukkit.getPluginCommand("purgeall").setExecutor(new net.teamfekker.tfcore.listeners.PurgeCommand());
		
	}
	
	public void onDisable() {
		plugin = null;
	}
	

	
    
	
	

}
