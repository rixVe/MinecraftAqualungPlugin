package me.rixv.aqualung.ItemManager;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack aqualungChest;
    public static ItemStack aqualungBoots;
    public static ItemStack aqualungHelmet;

    public static void init() {
        CreateAqualungChestplate();
        CreateAqualungBoots();
        CreateAqualungHelmet();
    }

    private static void CreateAqualungChestplate() {

        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE, 1);

        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();

        meta.setColor(Color.fromRGB(29, 29, 33));

        meta.setDisplayName("Aqualung");
        meta.setUnbreakable(true);

        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY + "Makes you able to breath underwater");
        meta.setLore(lore);

        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_DYE);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);

        item.setItemMeta(meta);

        aqualungChest = item;
    }

    private static void CreateAqualungBoots() {

        ItemStack item = new ItemStack(Material.LEATHER_BOOTS, 1);

        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();

        meta.setColor(Color.fromRGB(29, 29, 33));

        meta.setDisplayName("Flippers");
        meta.setUnbreakable(true);

        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY + "Make you faster when you're in the water");
        lore.add(ChatColor.GRAY + "but slower when you're on the ground");
        meta.setLore(lore);

        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_DYE);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);

        item.setItemMeta(meta);

        aqualungBoots = item;
    }

    private static void CreateAqualungHelmet() {

        ItemStack item = new ItemStack(Material.LEATHER_HELMET, 1);

        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();

        meta.setColor(Color.fromRGB(29, 29, 33));

        meta.setDisplayName("Goggles");
        meta.setUnbreakable(true);

        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY + "Make you able to see better when you're in water");
        lore.add(ChatColor.GRAY + "but significantly worse when you're on the ground");
        meta.setLore(lore);

        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_DYE);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);

        item.setItemMeta(meta);

        aqualungHelmet = item;
    }

}
