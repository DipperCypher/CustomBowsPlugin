package dev.dipper.bow;

import org.bukkit.plugin.java.JavaPlugin;

import dev.dipper.bow.Api.menu.MenuListener;
import dev.dipper.bow.Bow.BowListerner;
import dev.dipper.bow.commands.bow;

public final class Bows extends JavaPlugin {
    private static Bows instance;

    @Override
    public void onEnable() {
        instance = this;

        getServer().getPluginManager().registerEvents(new BowListerner(), this);
        getServer().getPluginManager().registerEvents(new MenuListener(), this);

        getCommand("bow").setExecutor(new bow());
    }

         public static Bows getInstance() {
        return instance;
    }
}