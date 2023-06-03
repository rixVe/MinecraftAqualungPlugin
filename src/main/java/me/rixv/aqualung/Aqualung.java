package me.rixv.aqualung;

import me.rixv.aqualung.ItemManager.ItemManager;
import me.rixv.aqualung.commands.AqualungCommand;
import me.rixv.aqualung.listeners.PlayerQuitListener;
import me.rixv.aqualung.listeners.PlayerMoveListener;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Aqualung extends JavaPlugin {

    public List<Player> hasSpeed = new ArrayList<>();
    public List<Player> hasSlow = new ArrayList<>();
    public List<Player> hasNightVision = new ArrayList<>();
    public List<Player> hasBlind = new ArrayList<>();
    public List<Player> hasWaterBreathing = new ArrayList<>();

    @Override
    public void onEnable() {
        ItemManager.init();
        Objects.requireNonNull(getCommand("aqualung")).setExecutor(new AqualungCommand());
        getServer().getPluginManager().registerEvents(new PlayerMoveListener(this), this);
        getServer().getPluginManager().registerEvents(new PlayerQuitListener(this), this);
    }

}
