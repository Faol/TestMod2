package com.faol.testmod2.client.handler;

import com.faol.testmod2.client.settings.Keybindings;
import com.faol.testmod2.reference.Key;
import com.faol.testmod2.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler {
    private static Key getPressedKeybinding(){
        if (Keybindings.charge.isPressed()){
            return Key.CHARGE;
        }
        else if(Keybindings.release.isPressed()){
            return Key.RELEASE;
        }
        return Key.UNKNOW;
    }
    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event){
        LogHelper.info(getPressedKeybinding());
    }
}
