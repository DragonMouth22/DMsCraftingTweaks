package net.dragonmouth.dmscraftingtweaks.handlers;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {

	public static Configuration config;
	
	// Create the variables for the config settings
	public static boolean horseArmorCraftingRecipesEnabled;
	public static boolean horseArmorCraftingUsesSaddle;
	public static boolean saddleCraftingRecipeEnabled;
	public static boolean alternateCarrotOnAStickCrafting;
	public static boolean nametagCraftingRecipeEnabled;
	
	public static void init(File file) {
		
		LogHandler.logHandler.info("Beginning config initialization!");
		
		config = new Configuration(file);
		syncConfig();
		
		LogHandler.logHandler.info("Config initialization complete!");
		
	}
	
	public static void syncConfig() {
		
		String category;
		
		LogHandler.logHandler.info("Creating and registering the Horse/Animals category for the config!");
		category = "Horses/Animals";
		config.addCustomCategoryComment(category, "Horses/Animals");
		horseArmorCraftingRecipesEnabled = config.getBoolean("EnableHorseArmorCraftingRecipes", category, true, "Enable or disable the crafting recipes for horse armor.");
		horseArmorCraftingUsesSaddle = config.getBoolean("HorseArmorCraftingUsesSaddle", category, false, "Instead of wool, the horse armor crafting recipes will use a saddle.");
		
		saddleCraftingRecipeEnabled = config.getBoolean("EnableSaddleCraftingRecipe", category, true, "Enable or disable the crafting recipes for saddles.");
		
		alternateCarrotOnAStickCrafting = config.getBoolean("AlternateCarrotOnAStickCrafting", category, true, "Allows a carrot on a stick to also be crafted by using a carrot and a fishing rod. NOTE: DOES NOT REPLACE THE OLD RECIPE!");
		
		nametagCraftingRecipeEnabled = config.getBoolean("NametagCraftingRecipeEnabled", category, true, "Enable or disable the crafting recipes for name tags.");
		
		config.save();
		LogHandler.logHandler.info("Saved the config.");
		
	}
	
}
