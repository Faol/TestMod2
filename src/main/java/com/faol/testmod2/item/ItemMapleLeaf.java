package com.faol.testmod2.item;


import com.faol.testmod2.creativetab.CreativeTabTM;

public class ItemMapleLeaf extends ItemTM {
    public ItemMapleLeaf(){
        super();
        this.setUnlocalizedName("mapleLeaf");
        this.maxStackSize=64;
        this.setCreativeTab(CreativeTabTM.TM_TAB);
    }
}
