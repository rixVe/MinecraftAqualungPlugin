package me.rixv.aqualung.commands;

import me.rixv.aqualung.ItemManager.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class AqualungCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if(!(sender instanceof Player)){
            sender.sendMessage(ChatColor.RED + "You con only run this command as a player");
            return true;
        }
        else {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.GREEN + "Aqualung added!");
            player.getInventory().addItem(ItemManager.aqualungChest);
            player.getInventory().addItem(ItemManager.aqualungBoots);
            player.getInventory().addItem(ItemManager.aqualungHelmet);
        }

        return true;
    }
}
