package titlepopup;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.utils.Config;
import me.socialclubz.com.Command.essentials;

public class tt
    extends essentials
{
    public static final String pp = "[AC-Essentials]> ";

    public boolean onCommand(CommandSender paramCommandSender, Command paramCommand, String paramString, String[] paramArrayOfString)
    {
        Player localPlayer;
        if (paramCommand.getName().equalsIgnoreCase("tt")) {
            if (paramArrayOfString.length == 0)
            {
                paramCommandSender.sendMessage("[AC-Essentials]> Use /tt <player> <text>");
            }
            else if (paramArrayOfString.length == 1)
            {
                paramCommandSender.sendMessage("[AC-Essentials]> Text cannot be empty!");
            }
            else
            {
                paramCommandSender.sendMessage("[AC-Essentials]> Sending...");
                localPlayer = getServer().getPlayer(paramArrayOfString[0]);
                Config localConfig = getConfig();
                String str = String.valueOf(localConfig.get("mode"));

                localPlayer.sendTitle(paramArrayOfString[1]);

                paramCommandSender.sendMessage("[AC-Essentials]> Title has been successfully sent to " + localPlayer.getName());
            }
        }
        if (paramCommand.getName().equalsIgnoreCase("ttp")) {
            if (paramArrayOfString.length == 0)
            {
                paramCommandSender.sendMessage("[AC-Essentials]> Use /ttp <player> <text>");
            }
            else if (paramArrayOfString.length == 1)
            {
                paramCommandSender.sendMessage("[AC-Essentials]> Text cannot be empty!");
            }
            else
            {
                paramCommandSender.sendMessage("[AC-Essentials]> Sending...");
                localPlayer = getServer().getPlayer(paramArrayOfString[0]);

                localPlayer.sendPopup(paramArrayOfString[1]);

                paramCommandSender.sendMessage("[AC-Essentials]> Popup has been successfully sent to " + localPlayer.getName());
            }
        }
        return false;
    }

    @EventHandler
    public void PlayerJoinHandler(PlayerJoinEvent paramPlayerJoinEvent) {}
}
