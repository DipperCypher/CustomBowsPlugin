package dev.dipper.bow.Bow;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.ProjectileHitEvent;

import net.md_5.bungee.api.ChatColor;

public abstract class Bow {
    private final String name;
    private static final Map<String, Bow> BOWS = new HashMap<>();

    public Bow(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void handleHit(Player player, Location hitLocation, ProjectileHitEvent event);

    public static void registerBow(Bow bow) {
        BOWS.put(ChatColor.stripColor(bow.getName()).toLowerCase(), bow);
    }

    public static Bow getBow(String name) {
        return BOWS.get(ChatColor.stripColor(name).toLowerCase());
    }
}
