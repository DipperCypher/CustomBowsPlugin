package dev.dipper.bow.Bow;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import dev.dipper.bow.items.items;

public class BowManager {
    public static void giveElectricBow(Player player) {
        ItemStack ItemElectricBow = items.ElectricBow();
        player.getInventory().addItem(ItemElectricBow);
    }

    public static void giveTeleportBow(Player player) {
        ItemStack ItemTeleportBow = items.TeleportBow();
        player.getInventory().addItem(ItemTeleportBow);
    }

    public static void giveExplosionBow(Player player) {
        ItemStack ItemExplosionBow = items.ExplosionBow();
        player.getInventory().addItem(ItemExplosionBow);
    }
}
