package dev.dipper.bow.Bow;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import dev.dipper.bow.Bows;
import net.md_5.bungee.api.ChatColor;

public class BowListerner implements Listener{
    private final Bows plugin;

    public BowListerner(Bows plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onArrowLand(ProjectileHitEvent event) {
        plugin.getLogger().info("ProjectileHitEvent fired");

        if (event.getEntity() == null) {
            plugin.getLogger().info("event entity is null");
            return;
        }
        
        Object shooter = event.getEntity().getShooter();
        if (!(event.getEntity().getShooter() instanceof Player)) {
             plugin.getLogger().info("Shooter is not a Player: " + (shooter == null ? "null" : shooter.getClass().getName()));
            return;
        }

        Player player = (Player) event.getEntity().getShooter();
        ItemStack itemInMainHand = player.getInventory().getItemInMainHand();
        plugin.getLogger().info("Shooter player: " + player.getName());

        if (itemInMainHand == null) {
            plugin.getLogger().info("Player has no item in main hand.");
            return;
        }

        if (itemInMainHand == null && itemInMainHand.hasItemMeta() && itemInMainHand.getItemMeta().hasDisplayName()) {
            plugin.getLogger().info("Item in hand has no display name / meta.");
            return;
        }

        String displayName = itemInMainHand.getItemMeta().getDisplayName();
        plugin.getLogger().info("Item display name: " + displayName);

        String strippedName = ChatColor.stripColor(displayName);
        if (strippedName == null) strippedName = displayName;
        plugin.getLogger().info(" Stripped name: " + strippedName);

        Bow bow = Bow.getBow(strippedName);
        plugin.getLogger().info("Bow lookup -> " + (bow == null ? "null" : bow.getClass().getSimpleName()));

        if (bow != null) {
            Location hitLocation = event.getEntity().getLocation();
            bow.handleHit(player, hitLocation, event);
            event.getEntity().remove();
            player.sendMessage("shot bow " + displayName);
        }
    }
}   