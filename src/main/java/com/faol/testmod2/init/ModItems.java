package com.faol.testmod2.init;

import com.faol.testmod2.item.ItemMapleLeaf;
import com.faol.testmod2.item.ItemTM;
import cpw.mods.fml.common.registry.GameRegistry;


public class ModItems {
    public static final ItemTM mapleLeaf = new ItemMapleLeaf();

    public static void init(){
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
