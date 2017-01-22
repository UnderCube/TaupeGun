package fr.undercube.taupegun;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by UnderCube on 22/01/2017.
 */
public class TaupeGun extends JavaPlugin implements Listener{

    public static TaupeGun instance;

    @Override
    public void onEnable() {
        System.out.println("TaupeGun > on");
        super.onEnable();
        instance = this;
          }

    @Override
    public void onDisable() {
        System.out.println("TaupeGun > off");
        super.onDisable();
    }
}

