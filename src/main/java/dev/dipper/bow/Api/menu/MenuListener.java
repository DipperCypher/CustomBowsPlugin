package dev.dipper.bow.Api.menu;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class MenuListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        final Inventory clickedInventory = event.getClickedInventory();

        if (clickedInventory == null) {
            return;
        }

        if (!(clickedInventory.getHolder() instanceof MenuInvtory)) {
            return;
        }

        event.setCancelled(true);
        MenuInvtory menuInvtory = (MenuInvtory) clickedInventory.getHolder();
        menuInvtory.click((Player) event.getWhoClicked(), event.getSlot());
    }
}
