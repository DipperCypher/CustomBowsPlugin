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
        if (!(event.getEntity().getShooter() instanceof Player)) {
            return;
        }

        Player player = (Player) event.getEntity().getShooter();
        ItemStack itemInMainHand = player.getInventory().getItemInMainHand();

         if (itemInMainHand != null && itemInMainHand.hasItemMeta() && itemInMainHand.getItemMeta().hasDisplayName()) {
            String displayName = itemInMainHand.getItemMeta().getDisplayName();
            if (ChatColor.stripColor(displayName).equalsIgnoreCase("Electric Bow")) {
                Location hitLocation = event.getEntity().getLocation();
                hitLocation.getWorld().strikeLightning(hitLocation);
                event.getEntity().remove();
                return;
            }
         }
    }

    @EventHandler
    public static void onArrowLand2(ProjectileHitEvent event) {
        if (!(event.getEntity().getShooter() instanceof Player)) {
            return;
        }

        Player player = (Player) event.getEntity().getShooter();
        ItemStack itemInMainHand = player.getInventory().getItemInMainHand();

         if (itemInMainHand != null && itemInMainHand.hasItemMeta() && itemInMainHand.getItemMeta().hasDisplayName()) {
            String displayName = itemInMainHand.getItemMeta().getDisplayName();
            if (ChatColor.stripColor(displayName).equalsIgnoreCase("Teleport Bow")) {
                Location hitLocation = event.getEntity().getLocation();
                player.teleport(hitLocation);
                event.getEntity().remove();
                return;
            }
         }
    }

    @EventHandler
    public static void onArrowLand3(ProjectileHitEvent event) {
        if (!(event.getEntity().getShooter() instanceof Player)) {
            return;
        }

        Player player = (Player) event.getEntity().getShooter();
        ItemStack itemInMainHand = player.getInventory().getItemInMainHand();

        if (itemInMainHand != null && itemInMainHand.hasItemMeta() && itemInMainHand.getItemMeta().hasDisplayName()) {
            String displayName = itemInMainHand.getItemMeta().getDisplayName();
            if (ChatColor.stripColor(displayName).equalsIgnoreCase("Explosion Bow")) {
                Location hitLocation = event.getEntity().getLocation();
                hitLocation.getWorld().createExplosion(hitLocation, 4.0f);
                event.getEntity().remove();
            }
        }
    }
}    