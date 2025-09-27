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
    public void onArrowLand(ProjectileHitEvent event) {
        if (!(event.getEntity().getShooter() instanceof Player)) {
            return;
        }

        Player player = (Player) event.getEntity().getShooter();
        ItemStack itemInMainHand = player.getInventory().getItemInMainHand();

        if (itemInMainHand != null && itemInMainHand.hasItemMeta() && itemInMainHand.getItemMeta().hasDisplayName()) {

            String displayName = itemInMainHand.getItemMeta().getDisplayName();
            String strippedName = ChatColor.stripColor(displayName);

            Bow bow = Bow.getBow(strippedName);
            
            if (bow != null) {
                Location hitLocation = event.getEntity().getLocation();
                bow.handleHit(player, hitLocation, event);
                event.getEntity().remove();
                player.sendMessage("shot bow " + displayName);
            }
        } 
    }

}