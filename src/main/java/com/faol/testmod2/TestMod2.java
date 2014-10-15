package com.faol.testmod2;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="TestMod2", name="Test Mod 2 ", version="1.7.10-1.0")
public class TestMod2 {

   @Mod.Instance("TestMod2")
   public static TestMod2 instance;
   @Mod.EventHandler
   public void preInit(FMLPreInitializationEvent event) {

   }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }


}
