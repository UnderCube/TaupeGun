package fr.undercube.taupegun.fr.undercube.taupegun.events;

import fr.undercube.taupegun.TaupeGun;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;


/**
 * Created by UnderCube on 22/01/2017.
 */
public class EventsManager {

    public TaupeGun taupegun;

    public EventsManager(TaupeGun taupegun) {
        this.taupegun = taupegun;
    }

    public void registerEvents(){
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new TaupeJoin(), taupegun);

    }

}
