package com.valixstudios;

import com.valixstudios.listener.LoginListener;
import dev.waterdog.waterdogpe.event.EventPriority;
import dev.waterdog.waterdogpe.event.defaults.PlayerLoginEvent;
import dev.waterdog.waterdogpe.plugin.Plugin;
import lombok.Getter;

public class Queue extends Plugin {

    @Override
    public void onEnable() {
        this.getProxy().getEventManager().subscribe(PlayerLoginEvent.class, new LoginListener(), EventPriority.HIGHEST);
    }

    @Override
    public void onDisable() {

    }
}