package dev.dipper.bow.Api.menu;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Consumer;

public interface MenuInvtory extends InventoryHolder{
    void click(Player Player, int slot);

    void setItem(int slot, ItemStack item);

    void setItem(int slot, ItemStack item, Consumer<Player> action);

    void onSetItem();

    default void open(Player player) {
        onSetItem();
        player.openInventory(getInventory());
    }

    Inventory getiInventory();
}
