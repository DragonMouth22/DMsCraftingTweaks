package net.jusanov.jusanovscraftingtweaks.common;

import java.io.File;

import net.jusanov.jusanovscraftingtweaks.crafting.CraftingManager;
import net.jusanov.jusanovscraftingtweaks.handlers.ConfigHandler;
import net.jusanov.jusanovscraftingtweaks.handlers.LogHandler;
import net.jusanov.jusanovscraftingtweaks.proxy.ClientProxy;
import net.jusanov.jusanovscraftingtweaks.proxy.CommonProxy;
import net.jusanov.jusanovscraftingtweaks.proxy.ServerProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class DMsCraftingTweaks {

	@Instance
	public static DMsCraftingTweaks instance;
	
	// Creates a variable for the config directory
	public static File configDir;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	public static ClientProxy clientProxy;
	public static ServerProxy serverProxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		LogHandler.logHandler.info("Pre-Initialization Started!");
		
		// Setup the config file and information for it.
		configDir = new File(event.getModConfigurationDirectory() + "/" + "DragonMouthsMods" + "/" + Reference.MODID);
		configDir.mkdirs();
		ConfigHandler.init(new File(configDir.getPath(), Reference.MODID + ".cfg"));
		
		LogHandler.logHandler.info("Pre-Initialization Complete!");
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		LogHandler.logHandler.info("Initialization Started!");
		
		proxy.init();
		
		CraftingManager.register();
		
		LogHandler.logHandler.info("Initialization Complete!");
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		LogHandler.logHandler.info("Post-Initialization Started!");
		
		// Nothing to Post-Initialize Yet!
		
		LogHandler.logHandler.info("Post-Initialization Complete!");
		
	}
	
}
