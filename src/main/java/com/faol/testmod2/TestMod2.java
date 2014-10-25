package com.faol.testmod2;

import com.faol.testmod2.client.handler.KeyInputEventHandler;
import com.faol.testmod2.handler.ConfigurationHandler;
import com.faol.testmod2.init.ModBlocks;
import com.faol.testmod2.init.ModItems;
import com.faol.testmod2.init.Recipes;
import com.faol.testmod2.proxy.IProxy;
import com.faol.testmod2.reference.Reference;
import com.faol.testmod2.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class TestMod2 {

    @Mod.Instance(Reference.MOD_ID)
    public static TestMod2 instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        proxy.registerKeyBinding();
        ModItems.init();
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        Recipes.init();
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("TestInt:"+ConfigurationHandler.testInt);
        LogHelper.info(Reference.VERSION);

    }


}
