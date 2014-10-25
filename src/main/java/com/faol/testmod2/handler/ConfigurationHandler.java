package com.faol.testmod2.handler;

import com.faol.testmod2.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static Configuration configuration;
    public static boolean testValue=false;
    public static String testValue2="";
    public static int testInt=1;


    public static void init(File configFile){
        //Create the configuration object from the given configuration
       if (configuration==null){
           configuration=new Configuration(configFile);
           loadConfiguration();
        }
    }



    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)){
            loadConfiguration();
        }
    }

    private static void loadConfiguration(){
        testValue=configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example!");
        testValue2=configuration.getString("testValue2",Configuration.CATEGORY_GENERAL,"Hallo","This is a String Test");
        testInt=configuration.getInt("testInteger",Configuration.CATEGORY_GENERAL,5,1,10,"This is an Int Test");
        if(configuration.hasChanged()){
            configuration.save();
        }
    }
}
