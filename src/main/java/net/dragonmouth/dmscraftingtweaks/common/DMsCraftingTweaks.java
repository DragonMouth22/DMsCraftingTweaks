package net.dragonmouth.dmscraftingtweaks.common;

import net.dragonmouth.dmscraftingtweaks.crafting.CraftingManager;
import net.dragonmouth.dmscraftingtweaks.handlers.LogHandler;
import net.dragonmouth.dmscraftingtweaks.proxy.ClientProxy;
import net.dragonmouth.dmscraftingtweaks.proxy.CommonProxy;
import net.dragonmouth.dmscraftingtweaks.proxy.ServerProxy;
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
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	public static ClientProxy clientProxy;
	public static ServerProxy serverProxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		LogHandler.logHandler.info("Pre-Initialization Started!");
		
		// Nothing to Pre-Initialize Yet!
		
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
