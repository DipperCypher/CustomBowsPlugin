package dev.dipper.bow.Bow;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.ChatColor;

public class BowListerner implements Listener{

    @EventHandler
    public static void onArrowLand(ProjectileHitEvent event) {
        if (event.getEntity().getShooter() instanceof Player) {
            Player player = (Player) event.getEntity().getShooter();
            ItemStack itemInMainHand = player.getInventory().getItemInMainHand();

            if (itemInMainHand.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "Electric Bow")) {
                Location hitLocation = event.getEntity().getLocation();
                hitLocation.getWorld().strikeLightning(hitLocation);
                return;
            }
        }
    }

    @EventHandler
    public static void onArrowLand2(ProjectileHitEvent event) {
        Player player = (Player) event.getEntity().getShooter();
        ItemStack itemInMainHand = player.getInventory().getItemInMainHand();
            
        if (itemInMainHand.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "Teleport Bow")) {
            Location hiLocation = event.getEntity().getLocation();
            player.teleport(hiLocation);
            return;
        }
    }
}    
