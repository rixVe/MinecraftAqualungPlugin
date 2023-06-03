package me.rixv.aqualung.listeners;

import me.rixv.aqualung.Aqualung;
import me.rixv.aqualung.ItemLogicManager.ItemLogicManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuitListener implements Listener {

    private final Aqualung plugin;

    public PlayerQuitListener(Aqualung plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        ItemLogicManager.ApplyLogic(plugin, player);
    }

}
