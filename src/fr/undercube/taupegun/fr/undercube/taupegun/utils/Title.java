package fr.undercube.taupegun.fr.undercube.taupegun.utils;

import net.minecraft.server.v1_8_R2.IChatBaseComponent;
import net.minecraft.server.v1_8_R2.PacketPlayOutChat;
import net.minecraft.server.v1_8_R2.PacketPlayOutTitle;
import org.bukkit.craftbukkit.v1_8_R2.entity.CraftPlayer;
import org.bukkit.entity.Player;

/**
 * Created by Lucas on 22/01/2017.
 */
public class Title {

    public static void sendTitle(Player player, String title, String subTitle, int ticks) {

        IChatBaseComponent chatTitle = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + title + "\"}");
        IChatBaseComponent chatsubTitle = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + subTitle + "\"}");

        PacketPlayOutTitle titre = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TITLE, chatTitle);
        PacketPlayOutTitle soustitre = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.SUBTITLE, chatsubTitle);

        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(titre);
        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(soustitre);

        sendTime(player, ticks);
    }

    private static void sendTime(Player player, int ticks) {

        PacketPlayOutTitle p = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TIMES, null, 20, ticks, 20);
        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(p);

    }

    public static void sendActionBar(Player player, String message) {
        IChatBaseComponent actionBar = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + message + "\"}");
        PacketPlayOutChat ab = new PacketPlayOutChat(actionBar, (byte) 2);

        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(ab);

    }

}
