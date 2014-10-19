package com.faol.testmod2.init;


import com.faol.testmod2.block.BlockFlag;
import com.faol.testmod2.block.BlockTM;
import com.faol.testmod2.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockTM flag=new BlockFlag();
    public static void init(){
        GameRegistry.registerBlock(flag, "flag");
    }
}
