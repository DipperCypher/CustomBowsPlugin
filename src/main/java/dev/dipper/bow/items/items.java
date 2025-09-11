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

    public static ItemStack TeleportBow() {
        final ItemStack tbow = new ItemStack(Material.BOW, 1);
        final ItemMeta tbowMeta = tbow.getItemMeta();
        tbowMeta.setDisplayName(ChatColor.AQUA + "Teleport Bow");
        List<String> tbowlore = new ArrayList<>();
        tbowlore.add("");
        tbowlore.add(ChatColor.GRAY + "Teleport player to");
        tbowlore.add(ChatColor.GRAY + "Arrow lands location");
        tbowlore.add("");
        tbowMeta.setLore(tbowlore);
        tbow.setItemMeta(tbowMeta);
        return tbow;
    }

    public static ItemStack ExplosionBow() {
        final ItemStack ebow = new ItemStack(Material.BOW, 1);
        final ItemMeta ebowMeta = ebow.getItemMeta();
        ebowMeta.setDisplayName(ChatColor.AQUA + "Explosion Bow");
        List<String> ebowlore = new ArrayList<>();
        ebowlore.add("");
        ebowlore.add("");
        ebowlore.add("");
        ebowlore.add("");
        ebowMeta.setLore(ebowlore);
        ebow.setItemMeta(ebowMeta);
        return ebow;
    }
}
