package com.faol.testmod2.proxy;


import com.faol.testmod2.client.settings.Keybindings;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy{
    @Override
    public void registerKeyBinding() {
        ClientRegistry.registerKeyBinding(Keybindings.charge);
        ClientRegistry.registerKeyBinding(Keybindings.release);
    }
}
