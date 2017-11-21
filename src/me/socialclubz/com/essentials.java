package me.socialclubz.com;

import cn.nukkit.Player;
import cn.nukkit.PlayerFood;
import cn.nukkit.Server;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.event.Listener;
import cn.nukkit.inventory.PlayerInventory;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.Config;

import java.io.File;
import java.util.LinkedHashMap;

public class essentials
        extends PluginBase
        implements Listener
{
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(this, this);
        getDataFolder().mkdir();

        Config config = new Config(new File(
                getDataFolder(), "config.yml"), 2, new LinkedHashMap() {});
        config.save();
        getServer().getLogger().info("-----------------------");
        getServer().getLogger().info("|       Enabled!      |");
        getServer().getLogger().info("|    AC-Essentials    |");
        getServer().getLogger().info("|         by          |");
        getServer().getLogger().info("|     SocialClubz     |");
        getServer().getLogger().info("-----------------------");
    }

    public void onDisable()
    {
        getServer().getLogger().info("-----------------------");
        getServer().getLogger().info("|      Disabled!      |");
        getServer().getLogger().info("|    AC-Essentials    |");
        getServer().getLogger().info("|         by          |");
        getServer().getLogger().info("|     SocialClubz     |");
        getServer().getLogger().info("-----------------------");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        Player player = null;
        if ((sender instanceof Player)) {
            player = (Player)sender;
        }
        if (cmd.getName().equalsIgnoreCase("scc"))
        {
            if (player == null)
            {
                sender.sendMessage("You have to be a Player");
                return true;
            }
            if (player != null)
            {
                if (player.hasPermission("social.scc"))
                {
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                    Server.getInstance().broadcastMessage(" ");
                }
                Server.getInstance().broadcastMessage("Global Chat Cleared");
                return true;
            }
        }
        if (cmd.getName().equalsIgnoreCase("cc"))
        {
            if (player == null)
            {
                sender.sendMessage("You have to be a Player");
                return true;
            }
            if (player != null)
            {
                if (player.hasPermission("social.cc"))
                {
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                    sender.sendMessage(" ");
                }
                sender.sendMessage("You Cleared Your Chat");
                return true;
            }
        }
        if ((sender instanceof Player)) {
            player = (Player)sender;
        }
        if (cmd.getName().equalsIgnoreCase("ci"))
        {
            if (player == null)
            {
                sender.sendMessage("You have to be a Player");
                return true;
            }
            if (player != null)
            {
                if (player.hasPermission("social.ci"))
                {
                    player.isOp();
                    PlayerInventory inv = player.getInventory();
                    inv.clearAll();
                    sender.sendMessage("Your Inventory has been cleared");
                }
                return true;
            }
        }
        if ((sender instanceof Player)) {
            player = (Player)sender;
        }
        if (cmd.getName().equalsIgnoreCase("fly"))
        {
            if (player == null)
            {
                sender.sendMessage("You have to be a Player");
                return true;
            }
            if (player != null)
            {
                if (player.hasPermission("social.fly")) {
                    if (!player.getAllowFlight())
                    {
                        player.sendMessage("Fly Enabled");
                        player.setAllowFlight(true);
                    }
                    else
                    {
                        sender.sendMessage("Fly Disabled");
                        player.setAllowFlight(false);
                    }
                }
            }
            else {
                sender.sendMessage("No permissions");
            }
            return true;
        }
        Player player1 = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("heal"))
        {
            player1.heal(20.0F);
            player1.sendMessage("Some stranger Healed you with a kiss");
        }
        if (cmd.getName().equalsIgnoreCase("eat"))
        {
            PlayerFood f = player1.getFoodData();
            f.setLevel(20);
            player1.sendMessage("You have been feed by the gods");
        }
        if (cmd.getName().equalsIgnoreCase("ext"))
        {
            player1.isOnFire();
            player1.extinguish();
            player1.sendMessage("Water was thrown on you");
        }
        if (cmd.getName().equalsIgnoreCase("healer"))
        {
            player1.heal(20.0F);
            PlayerFood f = player1.getFoodData();
            f.setLevel(20);
            player1.isOnFire();
            player1.extinguish();
            player1.sendMessage("You are relaxed after some fun");
        }
        return false;
    }
}
