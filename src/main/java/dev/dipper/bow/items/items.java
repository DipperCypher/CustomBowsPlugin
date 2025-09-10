package dev.dipper.bow.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class items {
    public static ItemStack ElectricBow() {
        final ItemStack rod = new ItemStack(Material.LIGHTNING_ROD, 1);
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

    public static ItemStack Burn() {
        ItemStack burn = new ItemStack(Material.FLINT_AND_STEEL);
        ItemMeta burnMeta = burn.getItemMeta();
        burnMeta.setDisplayName(ChatColor.AQUA + "Burn");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "Lights the block the player");
        lore.add(ChatColor.GRAY + "is standing on a fire");
        lore.add("");
        burnMeta.setLore(lore);
        burn.setItemMeta(burnMeta);
        return burn;
    }

    public static ItemStack Anviled() {
        ItemStack anviled = new ItemStack(Material.ANVIL);
        ItemMeta anviledMeta = anviled.getItemMeta();
        anviledMeta.setDisplayName(ChatColor.AQUA + "Anviled");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "An anvil spawns 10 blocks");
        lore.add(ChatColor.GRAY + "above the player's head");
        lore.add("");
        anviledMeta.setLore(lore);
        anviled.setItemMeta(anviledMeta);
        return anviled;
    }

    public static ItemStack BallAndChain() {
        ItemStack ballandchain = new ItemStack(Material.CHAIN);
        ItemMeta ballandchainMeta = ballandchain.getItemMeta();
        ballandchainMeta.setDisplayName(ChatColor.AQUA + "Ball And Chain");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "Gives the player slowness V");
        lore.add(ChatColor.GRAY + "for 5 seconds");
        lore.add("");
        ballandchainMeta.setLore(lore);
        ballandchain.setItemMeta(ballandchainMeta);
        return ballandchain;
    }

    public static ItemStack BlindingSpray() {
        ItemStack blindingspray = new ItemStack(Material.BLACK_WOOL);
        ItemMeta blindingsprayMeta = blindingspray.getItemMeta();
        blindingsprayMeta.setDisplayName(ChatColor.AQUA + "Blinding Spray");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "Gives the clicked player");
        lore.add(ChatColor.GRAY + "blindness for 10 seconds!");
        lore.add("");
        blindingsprayMeta.setLore(lore);
        blindingspray.setItemMeta(blindingsprayMeta);
        return blindingspray;
    }

    public static ItemStack Boom() {
        ItemStack boom = new ItemStack(Material.CREEPER_HEAD);
        ItemMeta boomMeta = boom.getItemMeta();
        boomMeta.setDisplayName(ChatColor.AQUA + "Boom Boom Boom");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "Spawns 2 creepers 4 blocks away");
        lore.add(ChatColor.GRAY + "from the clicked player!");
        lore.add("");
        boomMeta.setLore(lore);
        boom.setItemMeta(boomMeta);
        return boom;
    }
}
