package com.faol.testmod2.creativetab;


import com.faol.testmod2.init.ModItems;
import com.faol.testmod2.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTM {
    public static final CreativeTabs TM_TAB=new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.mapleLeaf;
        }
    };

}