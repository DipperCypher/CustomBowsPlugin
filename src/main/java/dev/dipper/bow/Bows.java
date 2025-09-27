package dev.dipper.bow;

import org.bukkit.plugin.java.JavaPlugin;

import dev.dipper.bow.Api.menu.MenuListener;
import dev.dipper.bow.Bow.Bow;
import dev.dipper.bow.Bow.BowListerner;
import dev.dipper.bow.Bow.type.ElectricBow;
import dev.dipper.bow.Bow.type.ExplosionBow;
import dev.dipper.bow.Bow.type.TeleportBow;
import dev.dipper.bow.commands.bow;

public class Bows extends JavaPlugin {
    private static Bows instance;

    @Override
    public void onEnable() {
        instance = this;

        Bow.registerBow(new ElectricBow());
        Bow.registerBow(new TeleportBow());
        Bow.registerBow(new ExplosionBow());
        getLogger().info("Registered bow types.");

        getServer().getPluginManager().registerEvents(new BowListerner(), this);
        getServer().getPluginManager().registerEvents(new MenuListener(), this);
        getLogger().info("Registered listeners.");

        getCommand("bow").setExecutor(new bow());
    }

         public static Bows getInstance() {
        return instance;
    }
}