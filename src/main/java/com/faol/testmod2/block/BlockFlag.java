package com.faol.testmod2.block;


import com.faol.testmod2.creativetab.CreativeTabTM;

public class BlockFlag extends BlockTM {
    public BlockFlag(){
        super();
        this.setBlockName("flag");
        this.setBlockTextureName("flag");
        this.setCreativeTab(CreativeTabTM.TM_TAB);
    }
}
