package com.faol.testmod2.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static void init(File conifgFile){
        //Create the configuration object from the given configuration
        Configuration configuration=new Configuration(conifgFile);
        boolean configValue=false;
        try{
            //Load the configuration file
            configuration.load();
            //Read in properties form configuration file
            configValue=configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true,"This is an example config value").getBoolean(true);
        }catch(Exception e){
            //Log the exception
        }
        finally{
            //Save the configuration file
            configuration.save();
        }
        System.out.println("Cofiguratin Test "+configValue);
    }
}
