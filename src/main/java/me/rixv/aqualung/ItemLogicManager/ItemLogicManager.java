package me.rixv.aqualung.ItemLogicManager;

import me.rixv.aqualung.Aqualung;
import me.rixv.aqualung.ItemManager.ItemManager;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

public class ItemLogicManager {

    public static void ApplyLogic(Aqualung plugin, Player player) {
        BootsLogic(plugin, player);
        HelmetLogic(plugin, player);
        ChestplateLogic(plugin, player);
    }

    private static void BootsLogic(Aqualung plugin, Player player) {
        if(Objects.equals(player.getInventory().getBoots(), ItemManager.aqualungBoots)) {
            if (player.getLocation().getBlock().getType() == Material.AIR) {
                if (!plugin.hasSlow.contains(player)) {
                    if (plugin.hasSpeed.contains(player)) {
                        player.removePotionEffect(PotionEffectType.DOLPHINS_GRACE);
                        plugin.hasSpeed.remove(player);
                    }
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 2, false, false, false));
                    plugin.hasSlow.add(player);
                }
            } else if (player.getLocation().getBlock().getType() == Material.WATER) {
                if (!plugin.hasSpeed.contains(player)) {
                    if (plugin.hasSlow.contains(player)) {
                        player.removePotionEffect(PotionEffectType.SLOW);
                        plugin.hasSlow.remove(player);
                    }
                    player.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 2, false, false, false));
                    plugin.hasSpeed.add(player);
                }
            }
        }
        else {
            if(plugin.hasSlow.contains(player)) {
                player.removePotionEffect(PotionEffectType.SLOW);
                plugin.hasSlow.remove(player);
            }
            if(plugin.hasSpeed.contains(player)) {
                player.removePotionEffect(PotionEffectType.DOLPHINS_GRACE);
                plugin.hasSpeed.remove(player);
            }
        }
    }
    private static void HelmetLogic(Aqualung plugin, Player player) {
        if(Objects.equals(player.getInventory().getHelmet(), ItemManager.aqualungHelmet)){
            if(new Location(player.getWorld(), player.getLocation().getX(), player.getLocation().getY() + 1, player.getLocation().getZ()).getBlock().getType() == Material.AIR) {
                if(!plugin.hasBlind.contains(player)) {
                    if(plugin.hasNightVision.contains(player)){
                        player.removePotionEffect(PotionEffectType.NIGHT_VISION);
                        plugin.hasNightVision.remove(player);
                    }
                    player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, Integer.MAX_VALUE, 0, false, false, false));
                    plugin.hasBlind.add(player);
                }
            }
            else if (new Location(player.getWorld(), player.getLocation().getX(), player.getLocation().getY() + 1, player.getLocation().getZ()).getBlock().getType() == Material.WATER) {
                if(!plugin.hasNightVision.contains(player)) {
                    if(plugin.hasBlind.contains(player)){
                        player.removePotionEffect(PotionEffectType.BLINDNESS);
                        plugin.hasBlind.remove(player);
                    }
                    player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, Integer.MAX_VALUE, Integer.MAX_VALUE, false, false, false));
                    plugin.hasNightVision.add(player);
                }
            }
        }
        else {
            if(plugin.hasBlind.contains(player)) {
                player.removePotionEffect(PotionEffectType.BLINDNESS);
                plugin.hasBlind.remove(player);
            }

            if(plugin.hasNightVision.contains(player)) {
                player.removePotionEffect(PotionEffectType.NIGHT_VISION);
                plugin.hasNightVision.remove(player);
            }
        }
    }
    private static void ChestplateLogic(Aqualung plugin, Player player) {
        if(Objects.equals(player.getInventory().getChestplate(), ItemManager.aqualungChest)) {
            if(player.getLocation().getBlock().getType() == Material.AIR) {
                if(plugin.hasWaterBreathing.contains(player)) {
                    player.removePotionEffect(PotionEffectType.WATER_BREATHING);
                    plugin.hasWaterBreathing.remove(player);
                }
            }
            else if (player.getLocation().getBlock().getType() == Material.WATER) {
                if (!plugin.hasWaterBreathing.contains(player)) {
                    player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, Integer.MAX_VALUE, 0, false, false, false));
                    plugin.hasWaterBreathing.add(player);
                }
            }
        }
        else {
            if(plugin.hasWaterBreathing.contains(player)) {
                player.removePotionEffect(PotionEffectType.WATER_BREATHING);
                plugin.hasWaterBreathing.remove(player);
            }
        }
    }
}
