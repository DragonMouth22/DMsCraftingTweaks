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
	
	public static boolean endCrystalCraftingRecipeEnabled;
	public static boolean endCrystalCraftingUsesEmeralds;
	public static boolean endCrystalCraftingUsesEnderPearls;
	public static boolean dragonsBreathCraftingRecipesEnabled;
	public static boolean dragonEggCraftingRecipeEnabled;
	public static boolean dragonEggCraftingUsesMoreObsidian;
	public static boolean dragonEggDuplicationEnabled;
	
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
		
		alternateCarrotOnAStickCrafting = config.getBoolean("AlternateCarrotOnAStickCrafting", category, true, "Allows a carrot on a stick to also be crafted by using a carrot in the fishing rod recipe. NOTE: DOES NOT REPLACE THE OLD RECIPE!");
		
		nametagCraftingRecipeEnabled = config.getBoolean("NametagCraftingRecipeEnabled", category, true, "Enable or disable the crafting recipes for name tags.");
		
		LogHandler.logHandler.info("Creating and registering the Dragon category for the config!");
		category = "Dragon";
		config.addCustomCategoryComment(category, "Dragon");
		endCrystalCraftingRecipeEnabled = config.getBoolean("EndCrystalCraftingRecipeEnabled", category, true, "Enable or disable the crafting recipe for the End Crystals.");
		endCrystalCraftingUsesEmeralds = config.getBoolean("EndCrystalCraftingUsesEmeralds", category, false, "Instead of diamonds, the End Crystal crafting recipe will use emeralds.");
		endCrystalCraftingUsesEnderPearls = config.getBoolean("EndCrystalCraftingUsesEnderPearls", category, true, "Instead of diamonds, the End Crystal crafting recipe will use ender pearls.");
		
		dragonsBreathCraftingRecipesEnabled = config.getBoolean("DragonsBreathCraftingRecipesEnabled", category, true, "Enable or disable the crafting recipes for the Dragon's Breath.");
		
		dragonEggCraftingRecipeEnabled = config.getBoolean("DragonEggCraftingRecipeEnabled", category, true, "Enable or disable the crafting recipe for the Dragon Egg");
		dragonEggCraftingUsesMoreObsidian = config.getBoolean("DragonEggCraftingUsesMoreObsidian", category, true, "Instead of 5 obsidian, 7 obsidian will be used in the Dragon Egg crafting recipe.");
		dragonEggDuplicationEnabled = config.getBoolean("DragonEggDuplicationEnabled", category, false, "Enable or disable a crafting recipe that allows the Dragon Egg to be duplicated.");
		
		config.save();
		LogHandler.logHandler.info("Saved the config.");
		
	}
	
}
