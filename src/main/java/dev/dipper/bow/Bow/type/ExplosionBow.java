package dev.dipper.bow.Bow.type;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.ProjectileHitEvent;

import dev.dipper.bow.Bow.Bow;

public class ExplosionBow extends Bow { 
    public ExplosionBow() {
        super("&bExplosion Bow");
    }

    @Override
    public void handleHit(Player player, Location hitLocation, ProjectileHitEvent event) {
        hitLocation.getWorld().createExplosion(hitLocation, 20.0f);
    }
}
