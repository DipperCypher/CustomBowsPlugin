package dev.dipper.bow.Bow;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import dev.dipper.bow.items.items;

public class BowManager {
    public static void giveElectricBow(Player player) {
        ItemStack itemElectricBow = items.ElectricBow();
        player.getInventory().addItem(itemElectricBow);
    }

    public static void giveBurn(Player player) {
        ItemStack itemBurn = items.Burn();
        player.getInventory().addItem(itemBurn);
    }
}
