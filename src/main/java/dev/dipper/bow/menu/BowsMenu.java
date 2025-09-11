package dev.dipper.bow.menu;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.google.inject.Inject;

import dev.dipper.bow.Bows;
import dev.dipper.bow.Api.menu.CypherMenu;
import dev.dipper.bow.Bow.BowManager;
import net.md_5.bungee.api.ChatColor;

public class BowsMenu extends CypherMenu {
    private final Bows plugin;

    @Inject
    public BowsMenu(Bows plugin) {
        super(Rows.SIX, "Bows Menu");
        this.plugin = plugin;
    }

    @Override
    public void onSetItem() {
        setItem(11, dev.dipper.bow.items.items.ElectricBow(), player -> {
            giveBow(player, "ElectricBow", dev.dipper.bow.items.items.ElectricBow());
            player.closeInventory();
        } );

        setItem(12, dev.dipper.bow.items.items.TeleportBow(), player -> {
            giveBow(player, "TeleportBow", dev.dipper.bow.items.items.ElectricBow());
            player.closeInventory();
        });

        setItem(13, dev.dipper.bow.items.items.ExplosionBow(), player -> {
            giveBow(player, "ExplosionBow", dev.dipper.bow.items.items.ExplosionBow());
            player.closeInventory();
        });
    }

    private void giveBow(Player player, String bowName, ItemStack bowitem) {
        if ("ElectricBow".equals(bowName)) {
            BowManager.giveElectricBow(player);
            return;
        }

        if ("TeleportBow".equals(bowName)) {
            BowManager.giveTeleportBow(player);
            return;
        }

        if ("ExplosionBow".equals(bowName)) {
            BowManager.giveExplosionBow(player);
            return;
        }

        player.sendMessage(ChatColor.AQUA + "given player " + bowName);
        player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
        player.closeInventory();
        plugin.getLogger().info(player.getName() + " was given " + bowName);
    } 
}
