package dev.dipper.bow.Api.menu;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Consumer;

public abstract class CypherMenu implements MenuInvtory {
    private final Map<Integer,Consumer<Player>> actions = new HashMap<>();
    private final Inventory inventory;

    public CypherMenu(Rows rows, String title) {
        this.inventory = Bukkit.createInventory(this, rows.getSize());
    }

    @Override
    public void click(Player player, int slot) {
        final Consumer<Player> action = this.actions.get(slot);

        if (action != null) {
            action.accept(player);
        }
    }

    @Override
    public void setItem(int slot, ItemStack item) {
        setItem(slot, item, player -> {});
    }

    @Override
    public void setItem(int slot, ItemStack item, Consumer<Player> action) {
        this.actions.put(slot, action);
        getInventory().setItem(slot, item);
    }

    public abstract void onSetItem();

    @Override
    public Inventory getInventory() {
        return inventory;
    }

    @Override
    public Inventory getiInventory() {
        return inventory;
    }

    public enum Rows {
        ONE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6);

        private final int size;

        Rows(int rows) {
            this.size = rows * 9;
        }

        public int getSize() {
            return size;
        }
    }
}
