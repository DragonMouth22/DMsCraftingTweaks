package net.dragonmouth.dmscraftingtweaks.crafting;

import net.dragonmouth.dmscraftingtweaks.handlers.ConfigHandler;
import net.dragonmouth.dmscraftingtweaks.handlers.LogHandler;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingManager {

	public static void register() {
		
		LogHandler.logHandler.info("Starting to register Crafting Recipes!");
		
		// Horse Armor Recipes
		if (ConfigHandler.horseArmorCraftingRecipesEnabled == true) {
			LogHandler.logHandler.info("Starting to register Horse Armor Recipes!");
			if (ConfigHandler.horseArmorCraftingUsesSaddle == true) {
				
				GameRegistry.addShapedRecipe(new ItemStack(Items.IRON_HORSE_ARMOR, 1, 0), "  I", "ISI", "ILI", 'I', Items.IRON_INGOT, 'L', Items.LEATHER, 'S', Items.SADDLE);
				GameRegistry.addShapedRecipe(new ItemStack(Items.GOLDEN_HORSE_ARMOR, 1, 0), "  G", "GSG", "GLG", 'G', Items.GOLD_INGOT, 'L', Items.LEATHER, 'S', Items.SADDLE);
				GameRegistry.addShapedRecipe(new ItemStack(Items.DIAMOND_HORSE_ARMOR, 1, 0), "  D", "DSD", "DLD", 'D', Items.DIAMOND, 'L', Items.LEATHER, 'S', Items.SADDLE);
				
			}
			else {
				
				GameRegistry.addShapedRecipe(new ItemStack(Items.IRON_HORSE_ARMOR, 1, 0), "  I", "IWI", "ILI", 'I', Items.IRON_INGOT, 'L', Items.LEATHER, 'W', Blocks.WOOL);
				GameRegistry.addShapedRecipe(new ItemStack(Items.GOLDEN_HORSE_ARMOR, 1, 0), "  G", "GWG", "GLG", 'G', Items.GOLD_INGOT, 'L', Items.LEATHER, 'W', Blocks.WOOL);
				GameRegistry.addShapedRecipe(new ItemStack(Items.DIAMOND_HORSE_ARMOR, 1, 0), "  D", "DWD", "DLD", 'D', Items.DIAMOND, 'L', Items.LEATHER, 'W', Blocks.WOOL);
			
			}
			LogHandler.logHandler.info("Finished registering Horse Armor Recipes!");
		}
		else {
			
			LogHandler.logHandler.info("Horse Armor Crafting Recipes are DISABLED in the config! Moving on!");
			
		}
		
		// Saddle Recipe
		if (ConfigHandler.saddleCraftingRecipeEnabled == true) {
			
			LogHandler.logHandler.info("Started to register the Saddle recipe!");
			
			GameRegistry.addShapedRecipe(new ItemStack(Items.SADDLE, 1, 0), "LCL", "LWL", "I I", 'L', Items.LEATHER, 'C', Blocks.CARPET, 'W', Blocks.WOOL, 'I', Items.IRON_INGOT);
			
			LogHandler.logHandler.info("Finished registering the Saddle recipe!");
			
		}
		else {
			
			LogHandler.logHandler.info("Saddle Crafting Recipes are DISABLED in the config! Moving on!");
			
		}
		
		// Carrot on a Stick Recipe
		if (ConfigHandler.alternateCarrotOnAStickCrafting == true) {
			
			LogHandler.logHandler.info("Started to register the Alternate Carrot on a Stick recipe!");
			
			GameRegistry.addShapedRecipe(new ItemStack(Items.CARROT_ON_A_STICK, 1, 0), "  S", " ST", "S C", 'S', Items.STICK, 'C', Items.CARROT, 'T', Items.STRING);
			
			LogHandler.logHandler.info("Finished registering the Alternate Carrot on a Stick recipe!");
			
		}
		else {
			
			LogHandler.logHandler.info("Alternate Carrot on a Stick recipe is DISABLED in the config! Moving on!");
			
		}
		
		// Nametag Recipe
		if (ConfigHandler.nametagCraftingRecipeEnabled == true) {
			
			LogHandler.logHandler.info("Started to register the Nametag recipe!");
			
			GameRegistry.addShapedRecipe(new ItemStack(Items.NAME_TAG, 1, 0), "  S", " P ", "P  ", 'S', Items.STRING, 'P', Items.PAPER);
			
			LogHandler.logHandler.info("Finished registering the Nametag recipe!");
			
		}
		else {
			
			LogHandler.logHandler.info("Nametag Crafting Recipe is DISABLED in the config! Moving on!");
			
		}
		
		LogHandler.logHandler.info("Finished registering Crafting Recipes!");
		
	}
	
}
