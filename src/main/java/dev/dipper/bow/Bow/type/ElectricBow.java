package dev.dipper.bow.Bow.type;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.ProjectileHitEvent;

import dev.dipper.bow.Bow.Bow;

public class ElectricBow extends Bow {
    public ElectricBow() {
        super("&bElectric Bow");
    }

    @Override
    public void handleHit(Player player, Location hitLocation, ProjectileHitEvent event) {
        hitLocation.getWorld().strikeLightning(hitLocation);
    }
}
