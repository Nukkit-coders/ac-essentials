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

import static cn.nukkit.level.Level.TIME_DAY;
import static cn.nukkit.level.Level.TIME_NIGHT;

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
//Clear Global Chat
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
//Clear Personal Chat
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
//Clear Inventory
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
//set self fly
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
//heal
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
//removes fire
        if (cmd.getName().equalsIgnoreCase("ext"))
        {
            player1.isOnFire();
            player1.extinguish();
            player1.sendMessage("Water was thrown on you");
        }
//removes fire, add full food and hearts
        if (cmd.getName().equalsIgnoreCase("healer"))
        {
            player1.heal(20.0F);
            PlayerFood f = player1.getFoodData();
            f.setLevel(20);
            player1.isOnFire();
            player1.extinguish();
            player1.sendMessage("You are relaxed after some fun");
        }
//day
        if (cmd.getName().equalsIgnoreCase("day")) {
            if (player == null) {
                sender.sendMessage("You have to be a Player");
                return true;
            }
            if (player != null) {
                if (player.hasPermission("social.day")) {
                    player.getLevel().setTime(TIME_DAY);
                    sender.sendMessage("Time Set To Day");
                }
                return true;
            }
        }
//night
        if (cmd.getName().equalsIgnoreCase("night")) {
            if (player == null) {
                sender.sendMessage("You have to be a Player");
                return true;
            }
            if (player != null) if (player.hasPermission("social.night")) {
                player.getLevel().setTime(TIME_NIGHT);
                sender.sendMessage("Time Set To Night");
                return true;
            }
        }
//sun
        if (cmd.getName().equalsIgnoreCase("sun")) {
            if (player == null) {
                sender.sendMessage("You have to be a Player");
                return true;
            }
            if (player != null) if (player.hasPermission("social.sun")) {
                player.getLevel().setRainTime(0);
                sender.sendMessage("Its Sunny Now");
                return true;
            }
        }
//sun
        if (cmd.getName().equalsIgnoreCase("rain")) {
            if (player == null) {
                sender.sendMessage("You have to be a Player");
                return true;
            }
            if (player != null) if (player.hasPermission("social.rain")) {
                player.getLevel().setRainTime(100);
                sender.sendMessage("Storm Mode Now Active");
                return true;
            }
        }
//stoptime
        if (cmd.getName().equalsIgnoreCase("stoptime")) {
            if (player == null) {
                sender.sendMessage("You have to be a Player");
                return true;
            }
            if (player != null) if (player.hasPermission("social.stoptime")) {
                player.getLevel().stopTime();
                sender.sendMessage("You Locked The Time");
                return true;
            }
        }
//starttime
        if (cmd.getName().equalsIgnoreCase("starttime")) {
            if (player == null) {
                sender.sendMessage("You have to be a Player");
                return true;
            }
            if (player != null) if (player.hasPermission("social.starttime")) {
                player.getLevel().startTime();
                sender.sendMessage("You Locked The Time");
                return true;
            }
        }
        return false;
    }
}