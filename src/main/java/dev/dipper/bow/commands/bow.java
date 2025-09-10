package dev.dipper.bow.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import dev.dipper.bow.menu.BowsMenu;
import net.md_5.bungee.api.ChatColor;

public class bow implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String Label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be used by players.");
            return true;
        }

        if (!sender.hasPermission("bow.givetroll")) {
            sender.sendMessage(ChatColor.RED + "You don't have permissions to execute this command.");
            return true;
        }
        
        Player player = (Player) sender;
        new BowsMenu(null).open(player);
        return true;
    }    
}
