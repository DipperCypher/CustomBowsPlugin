package dev.dipper.bow.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class items {
    public static ItemStack ElectricBow() {
        final ItemStack rod = new ItemStack(Material.BOW, 1);
        final ItemMeta rodwMeta = rod.getItemMeta();
        rodwMeta.setDisplayName(ChatColor.AQUA + "Electric Bow");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "Strikes bolt of lightning");
        lore.add(ChatColor.GRAY + "Arrow lands");
        lore.add("");
        rodwMeta.setLore(lore);
        rod.setItemMeta(rodwMeta);
        return rod;
    }
}
