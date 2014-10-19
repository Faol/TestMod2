package com.faol.testmod2.init;

import com.faol.testmod2.item.ItemMapleLeaf;
import com.faol.testmod2.item.ItemTM;
import com.faol.testmod2.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemTM mapleLeaf = new ItemMapleLeaf();

    public static void init(){
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
