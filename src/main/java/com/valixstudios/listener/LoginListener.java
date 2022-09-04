package com.valixstudios.listener;

import dev.waterdog.waterdogpe.event.defaults.PlayerLoginEvent;

import java.util.function.Consumer;

public class LoginListener implements Consumer<PlayerLoginEvent> {

    @Override
    public void accept(PlayerLoginEvent playerLoginEvent) {
        playerLoginEvent.setCancelReason("§cHi, hier kommst du nicht drauf!");
        playerLoginEvent.setCancelled(true);
    }
}
