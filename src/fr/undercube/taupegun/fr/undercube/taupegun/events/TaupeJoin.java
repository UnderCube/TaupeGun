package fr.undercube.taupegun.fr.undercube.taupegun.events;

import fr.undercube.taupegun.fr.undercube.taupegun.utils.Title;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.ArrayList;

/**
 * Created by UnderCube on 22/01/2017.
 */
public class TaupeJoin implements Listener{


    public static ArrayList<Player> playerList = new ArrayList();

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        Title.sendTitle(p, "salut", null, 70);
        p.sendMessage("rre");
        if (playerList.contains(p)) {
            playerList.remove(p);
            playerList.add(p);
        } else if (!playerList.contains(p)) {
            playerList.add(p);
        }

    }
}
