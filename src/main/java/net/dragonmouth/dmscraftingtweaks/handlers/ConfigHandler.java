package net.dragonmouth.dmscraftingtweaks.handlers;

import java.io.File;

import net.minecraft.init.Items;
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
	
	public static boolean recordCraftingRecipesEnabled;
	
	// Not working properly
	//public static String recordMaterial;
	
	// To work on later
	/*public static boolean recordCraftingUsesCoalBlocks;
	public static boolean recordCraftingUsesCoal;
	public static boolean recordCraftingUsesObsidian;
	public static boolean recordCraftingUsesClay;
	public static boolean recordCraftingUsesWool;
	public static boolean recordCraftingUsesCarpet;*/
	
	public static boolean skullSkeletonCraftingRecipeEnabled;
	public static boolean skullSkeletonCraftingUsesDiamond;
	public static boolean skullWitherSkeletonCraftingRecipeEnabled;
	public static boolean skullCreeperCraftingRecipeEnabled;
	public static boolean skullZombieCraftingRecipeEnabled;
	public static boolean skullDragonCraftingRecipeEnabled;
	
	public static boolean rottenFleshToLeatherSmelting;
	public static boolean boneToBoneMealSmelting;
	public static boolean wheatToBreadSmelting;
	public static boolean slimeballToMagmaCreamSmelting;
	public static boolean enderEyeToEnderPearlSmelting;
	
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
		
		LogHandler.logHandler.info("Creating and registering the Records category for the config!");
		category = "Records";
		config.addCustomCategoryComment(category, "Records");
		
		recordCraftingRecipesEnabled = config.getBoolean("RecordCraftingRecipesEnabled", category, true, "Enable or disable the crafting recipes for records.");
		
		// Not working properly
		//recordMaterial = config.getString("RecordMaterial", category, "Items.FLINT", "Change the material used to craft the record material (e.g. Blocks.COAL_BLOCK, Items.FLINT).");
		
		// To work on later
		/*recordCraftingUsesCoalBlocks = config.getBoolean("RecordCraftingUsesCoalBlocks", category, false, "Instead of flint, use coal blocks for the record crafting recipes.");
		recordCraftingUsesCoal = config.getBoolean("RecordCraftingUsesCoal", category, false, "Instead of flint, use coal for the record crafting recipes.");
		recordCraftingUsesObsidian = config.getBoolean("RecordCraftingUsesObsidian", category, false, "Instead of flint, use obsidian for the record crafting recipes.");
		recordCraftingUsesClay = config.getBoolean("RecordCraftingUsesClay", category, false, "Instead of flint, use obsidian for the record crafting recipes.");
		recordCraftingUsesWool = config.getBoolean("RecordCraftingUsesWool", category, false, "Instead of flint, use black wool for the record crafting recipes.");
		recordCraftingUsesCarpet = config.getBoolean("RecordCraftingUsesCarpet", category, false, "Instead of flint, use black carpet for the record crafting recipes.");*/
		
		LogHandler.logHandler.info("Creating and registering the Skulls category for the config!");
		category = "Skulls";
		config.addCustomCategoryComment(category, "Skulls");
		
		skullSkeletonCraftingRecipeEnabled = config.getBoolean("SkeletonSkullCraftingRecipeEnabled", category, true, "Enable or disable the crafting recipe for the skeleton skull.");
		skullSkeletonCraftingUsesDiamond = config.getBoolean("SkeletonSkullCraftingUsesDiamond", category, false, "Instead of a nether star, a diamond will be used in the skeleton skull crafting recipe.");
		
		skullWitherSkeletonCraftingRecipeEnabled = config.getBoolean("WitherSkeletonSkullCraftingRecipeEnabled", category, true, "Enable or disable the crafting recipe for the wither skeleton skull.");
		
		skullCreeperCraftingRecipeEnabled = config.getBoolean("CreeperSkullCraftingRecipeEnabled", category, true, "Enable or disable the crafting recipe for the creeper head.");
		
		skullZombieCraftingRecipeEnabled = config.getBoolean("ZombieSkullCraftingRecipeEnabled", category, true, "Enable or disable the crafting recipe for the zombie head.");
		
		skullDragonCraftingRecipeEnabled = config.getBoolean("DragonSkullCraftingRecipeEnabled", category, true, "Enable or disable the crafting recipe for the dragon head.");
		
		LogHandler.logHandler.info("Creating and registering the Smelting category for the config!");
		category = "Smelting";
		config.addCustomCategoryComment(category, "Smelting");
		
		rottenFleshToLeatherSmelting = config.getBoolean("RottenFleshToLeatherSmelting", category, true, "Enable or disable the smelting of rotten flesh into leather.");
		
		boneToBoneMealSmelting = config.getBoolean("BoneToBoneMealSmelting", category, true, "Enable or disable the smelting of bones into bone meal.");
		
		wheatToBreadSmelting = config.getBoolean("WheatToBreadSmelting", category, true, "Enable or disable the smelting of 3 wheat into bread.");
		
		slimeballToMagmaCreamSmelting = config.getBoolean("SlimeballToMagmaCreamSmelting", category, true, "Enable or disable the smelting of a slime ball into magma cream.");
		
		enderEyeToEnderPearlSmelting = config.getBoolean("EyeOfEnderToEnderPearlSmelting", category, true, "Enable or disable the smelting of eyes of ender into ender pearls.");
		
		config.save();
		LogHandler.logHandler.info("Saved the config.");
		
	}
	
}
