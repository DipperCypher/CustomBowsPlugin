package dev.dipper.bow.menu;

import org.bukkit.Sound;

import dev.dipper.bow.Bows;
import dev.dipper.bow.Api.menu.CypherMenu;
import dev.dipper.bow.Bow.BowManager;
import net.md_5.bungee.api.ChatColor;

public class BowsMenu extends CypherMenu {
    private final Bows plugin;

    public BowsMenu(Bows plugin) {
        super(Rows.SIX, "Bows Menu");
        this.plugin = plugin;
    }

    @Override
    public void onSetItem() {
        setItem(11, dev.dipper.bow.items.items.ElectricBow(), player -> {
            BowManager.giveElectricBow(player);
            player.sendMessage(ChatColor.AQUA + "given player ElectricTouchBow");
            player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
            player.closeInventory();
            plugin.getLogger().info(player.getName() + " was given the ElectricTouchItem");
        } );

        setItem(12, dev.dipper.bow.items.items.TeleportBow(), player -> {
            BowManager.giveTeleportBow(player);
            player.sendMessage(ChatColor.AQUA + "given player TeleportBow");
            player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
            player.closeInventory();
            plugin.getLogger().info(player.getName() + " was given the TeleportBow");
        });
    }
}
