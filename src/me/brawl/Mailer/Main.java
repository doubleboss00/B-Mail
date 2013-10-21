package me.brawl.Mailer;


import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	private Mailer PlayerListener = new Mailer(this);
	
	public void onEnable() {
		
		PluginManager m = getServer().getPluginManager();
		m.registerEvents(this.PlayerListener, this);
		
	}

}
