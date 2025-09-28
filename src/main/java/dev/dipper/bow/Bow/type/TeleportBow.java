package dev.dipper.bow.Bow.type;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.ProjectileHitEvent;

import dev.dipper.bow.Bow.Bow;

public class TeleportBow extends Bow {
    public TeleportBow() {
        super("Teleport Bow");
    }

    @Override
    public void handleHit(Player player, Location hitLocation, ProjectileHitEvent event) {
        player.teleport(hitLocation);
    }
}
