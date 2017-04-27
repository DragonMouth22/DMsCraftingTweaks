package net.dragonmouth.dmscraftingtweaks.crafting;

import net.dragonmouth.dmscraftingtweaks.handlers.ConfigHandler;
import net.dragonmouth.dmscraftingtweaks.handlers.LogHandler;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class CraftingManager {

	public static void register() {
		
		LogHandler.logHandler.info("Starting to register Crafting Recipes!");
		
		/*
		 * HORSE/ANIMAL CRAFTING RECIPES
		 */
		
		// Horse Armor Recipes
		if (ConfigHandler.horseArmorCraftingRecipesEnabled == true) {

			if (ConfigHandler.horseArmorCraftingUsesSaddle == true) {
				
				LogHandler.logHandler.info("Starting to register Horse Armor Recipes using a saddle!");
				
				GameRegistry.addShapedRecipe(new ItemStack(Items.IRON_HORSE_ARMOR, 1, 0), "  I", "ISI", "ILI", 'I', Items.IRON_INGOT, 'L', Items.LEATHER, 'S', Items.SADDLE);
				GameRegistry.addShapedRecipe(new ItemStack(Items.GOLDEN_HORSE_ARMOR, 1, 0), "  G", "GSG", "GLG", 'G', Items.GOLD_INGOT, 'L', Items.LEATHER, 'S', Items.SADDLE);
				GameRegistry.addShapedRecipe(new ItemStack(Items.DIAMOND_HORSE_ARMOR, 1, 0), "  D", "DSD", "DLD", 'D', Items.DIAMOND, 'L', Items.LEATHER, 'S', Items.SADDLE);
				
				LogHandler.logHandler.info("Finished registering Horse Armor Recipes using a saddle!");
				
			}
			else {
				
				LogHandler.logHandler.info("Starting to register Horse Armor Recipes!");
				
				GameRegistry.addShapedRecipe(new ItemStack(Items.IRON_HORSE_ARMOR, 1, 0), "  I", "IWI", "ILI", 'I', Items.IRON_INGOT, 'L', Items.LEATHER, 'W', Blocks.WOOL);
				GameRegistry.addShapedRecipe(new ItemStack(Items.GOLDEN_HORSE_ARMOR, 1, 0), "  G", "GWG", "GLG", 'G', Items.GOLD_INGOT, 'L', Items.LEATHER, 'W', Blocks.WOOL);
				GameRegistry.addShapedRecipe(new ItemStack(Items.DIAMOND_HORSE_ARMOR, 1, 0), "  D", "DWD", "DLD", 'D', Items.DIAMOND, 'L', Items.LEATHER, 'W', Blocks.WOOL);
			
				LogHandler.logHandler.info("Finished registering Horse Armor Recipes!");
				
			}

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
		
		/*
		 * DRAGON CRAFTING RECIPES
		 */
		
		// Ender Crystal Recipe
		if (ConfigHandler.endCrystalCraftingRecipeEnabled == true) {
			
			if (ConfigHandler.endCrystalCraftingUsesEmeralds == true) {
				
				LogHandler.logHandler.info("Starting to register the Ender Crystal recipe using emeralds!");
				
				GameRegistry.addShapedRecipe(new ItemStack(Items.END_CRYSTAL, 1, 0), "GEG", "ESE", "GEG", 'G', Blocks.GLASS, 'E', Items.EMERALD, 'S', Items.NETHER_STAR);
				
				LogHandler.logHandler.info("Finished registering the Ender Crystal recipe using emeralds!");
				
			}
			if (ConfigHandler.endCrystalCraftingUsesEnderPearls == true) {
				
				LogHandler.logHandler.info("Starting to register the Ender Crystal recipe using ender pearls!");
				
				GameRegistry.addShapedRecipe(new ItemStack(Items.END_CRYSTAL, 1, 0), "GEG", "ESE", "GEG", 'G', Blocks.GLASS, 'E', Items.ENDER_PEARL, 'S', Items.NETHER_STAR);
				
				LogHandler.logHandler.info("Finished registering the Ender Crystal recipe using ender pearls!");
				
			}
			else {
				
				LogHandler.logHandler.info("Starting to register the Ender Crystal recipe!");
				
				GameRegistry.addShapedRecipe(new ItemStack(Items.END_CRYSTAL, 1, 0), "GDG", "DSD", "GDG", 'G', Blocks.GLASS, 'D', Items.DIAMOND, 'S', Items.NETHER_STAR);
				
				LogHandler.logHandler.info("Finished registering the Ender Crystal recipe!");
				
			}
			
		}
		else {
			
			LogHandler.logHandler.info("The Ender Crystal crafting recipe is DISABLED in the config! Moving on!");
			
		}
		
		// Dragon's Breath recipe
		if (ConfigHandler.dragonsBreathCraftingRecipesEnabled == true) {
			
			LogHandler.logHandler.info("Starting to register the Dragon's Breath recipes!");
			
			GameRegistry.addShapedRecipe(new ItemStack(Items.DRAGON_BREATH, 1, 0), " W ", "GEG", "GGG", 'G', Blocks.GLASS, 'W', Blocks.LOG, 'E', Items.END_CRYSTAL);
			GameRegistry.addShapelessRecipe(new ItemStack(Items.DRAGON_BREATH, 1, 0), new ItemStack(Items.GLASS_BOTTLE, 1, 0), new ItemStack(Items.END_CRYSTAL, 1, 0));
			
			LogHandler.logHandler.info("Finished registering the Dragon's Breath recipes!");
			
		}
		else {
			
			LogHandler.logHandler.info("The Dragon's Breath crafting recipes are DISABLED in the config! Moving on!");
			
		}
		
		// Dragon Egg Recipe
		if (ConfigHandler.dragonEggCraftingRecipeEnabled == true) {
			
			if (ConfigHandler.dragonEggCraftingUsesMoreObsidian == true) {
				
				LogHandler.logHandler.info("Starting to register the DragonEgg recipe using more obsidian!");
				
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.DRAGON_EGG, 1, 0), "OOO", "OCO", "OEO", 'O', Blocks.OBSIDIAN, 'C', Items.END_CRYSTAL, 'E', Items.EGG);
				
				LogHandler.logHandler.info("Finished registering the DragonEgg recipe using more obsidian!");
				
			}
			else {
				
				LogHandler.logHandler.info("Starting to register the DragonEgg recipe!");
				
				GameRegistry.addShapedRecipe(new ItemStack(Blocks.DRAGON_EGG, 1, 0), " O ", "OCO", "OEO", 'O', Blocks.OBSIDIAN, 'C', Items.END_CRYSTAL, 'E', Items.EGG);
				
				LogHandler.logHandler.info("Finished registering the DragonEgg recipe!");
				
			}
			
		}
		else {
			
			LogHandler.logHandler.info("The Dragon Egg crafting recipe is DISABLED in the config! Moving on!");
			
		}
		
		// Dragon Egg Duplication Recipe
		if (ConfigHandler.dragonEggDuplicationEnabled == true) {
			
			LogHandler.logHandler.info("Starting to register the DragonEgg Duplication recipe!");
			
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.DRAGON_EGG, 2, 0), new ItemStack(Blocks.DRAGON_EGG, 1, 0));
			
			LogHandler.logHandler.info("Finished registering the DragonEgg Duplication recipe!");
			
		}
		else {
			
			LogHandler.logHandler.info("The Dragon Egg Duplication recipe is DISABLED in the config! Moving on!");
			
		}
		
		/*
		 * RECORD CRAFTING RECIPES
		 */
		
		if (ConfigHandler.recordCraftingRecipesEnabled == true) {
			
			LogHandler.logHandler.info("Starting to register the Record crafting recipes!");
			
			// Shaped Recipe
			GameRegistry.addShapedRecipe(new ItemStack(Items.RECORD_11, 1, 0), "VDV", "VVV", 'V', Items.FLINT, 'D', new ItemStack(Items.DYE, 1, 0));
			GameRegistry.addShapedRecipe(new ItemStack(Items.RECORD_13, 1, 0), "VDV", "VVV", 'V', Items.FLINT, 'D', new ItemStack(Items.DYE, 1, 11));
			GameRegistry.addShapedRecipe(new ItemStack(Items.RECORD_BLOCKS, 1, 0), "VDV", "VVV", 'V', Items.FLINT, 'D', new ItemStack(Items.DYE, 1, 14));
			GameRegistry.addShapedRecipe(new ItemStack(Items.RECORD_CAT, 1, 0), "VDV", "VVV", 'V', Items.FLINT, 'D', new ItemStack(Items.DYE, 1, 10));
			GameRegistry.addShapedRecipe(new ItemStack(Items.RECORD_CHIRP, 1, 0), "VDV", "VVV", 'V', Items.FLINT, 'D', new ItemStack(Items.DYE, 1, 1));
			GameRegistry.addShapedRecipe(new ItemStack(Items.RECORD_FAR, 1, 0), "VDV", "VEV", 'V', Items.FLINT, 'D', new ItemStack(Items.DYE, 1, 10), 'E', new ItemStack(Items.DYE, 1, 11));
			GameRegistry.addShapedRecipe(new ItemStack(Items.RECORD_MALL, 1, 0), "VDV", "VVV", 'V', Items.FLINT, 'D', new ItemStack(Items.DYE, 1, 5));
			GameRegistry.addShapedRecipe(new ItemStack(Items.RECORD_MELLOHI, 1, 0), "VDV", "VVV", 'V', Items.FLINT, 'D', new ItemStack(Items.DYE, 1, 13));
			GameRegistry.addShapedRecipe(new ItemStack(Items.RECORD_STAL, 1, 0), "VDV", "VVV", 'V', Items.FLINT, 'D', new ItemStack(Items.DYE, 1, 8));
			GameRegistry.addShapedRecipe(new ItemStack(Items.RECORD_STRAD, 1, 0), "VDV", "VVV", 'V', Items.FLINT, 'D', new ItemStack(Items.DYE, 1, 15));
			GameRegistry.addShapedRecipe(new ItemStack(Items.RECORD_WAIT, 1, 0), "VDV", "VVV", 'V', Items.FLINT, 'D', new ItemStack(Items.DYE, 1, 12));
			GameRegistry.addShapedRecipe(new ItemStack(Items.RECORD_WARD, 1, 0), "VDV", "VVV", 'V', Items.FLINT, 'D', new ItemStack(Items.DYE, 1, 2));
			
			// Shapeless Recipes
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.RECORD_11, 1, 0), "record", "dyeBlack"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.RECORD_13, 1, 0), "record", "dyeYellow"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.RECORD_BLOCKS, 1, 0), "record", "dyeOrange"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.RECORD_CAT, 1, 0), "record", "dyeLime"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.RECORD_CHIRP, 1, 0), "record", "dyeRed"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.RECORD_FAR, 1, 0), "record", "dyeLime", "dyeYellow"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.RECORD_MALL, 1, 0), "record", "dyePurple"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.RECORD_MELLOHI, 1, 0), "record", "dyeMagenta"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.RECORD_STAL, 1, 0), "record", "dyeGray"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.RECORD_STRAD, 1, 0), "record", "dyeWhite"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.RECORD_WAIT, 1, 0), "record", "dyeLightBlue"));
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.RECORD_WARD, 1, 0), "record", "dyeGreen"));
			
			LogHandler.logHandler.info("Finished registering the Record crafting recipes!");
			
		}
		else {
			
			LogHandler.logHandler.info("The Record crafting recipes are DISABLED in the config! Moving on!");
			
		}
		
		/*
		 * SKULL CRAFTING RECIPES
		 */
		
		if (ConfigHandler.skullSkeletonCraftingRecipeEnabled == true) {
			
			if (ConfigHandler.skullSkeletonCraftingUsesDiamond == true) {
				
				LogHandler.logHandler.info("Started to register the Skeleton Skull crafting recipe using a diamond!");
				
				GameRegistry.addShapedRecipe(new ItemStack(Items.SKULL, 1, 0), "BBB", "BDB", "CCC", 'B', Blocks.BONE_BLOCK, 'D', Items.DIAMOND, 'C', Items.BONE);
				
				LogHandler.logHandler.info("Finished registering the Skeleton Skull crafting recipe using a diamond!");
				
			}
			else {
				
				LogHandler.logHandler.info("Started to register the Skeleton Skull crafting recipe!");
				
				GameRegistry.addShapedRecipe(new ItemStack(Items.SKULL, 1, 0), "BBB", "BSB", "CCC", 'B', Blocks.BONE_BLOCK, 'S', Items.NETHER_STAR, 'C', Items.BONE);
				
				LogHandler.logHandler.info("Finished registering the Skeleton Skull crafting recipe!");
				
			}
			
		}
		else {
			
			LogHandler.logHandler.info("The Skeleton Skull crafting recipe is DISABLED in the config! Moving on!");
			
		}
		
		if (ConfigHandler.skullWitherSkeletonCraftingRecipeEnabled == true) {
			
			LogHandler.logHandler.info("Started to register the Wither Skeleton Skull crafting recipe!");
			
			GameRegistry.addShapedRecipe(new ItemStack(Items.SKULL, 1, 1), "BCB", "CSC", "BCB", 'B', Blocks.COAL_BLOCK, 'C', Items.COAL, 'S', new ItemStack(Items.SKULL, 1, 0));
			
			LogHandler.logHandler.info("Finished registering the Wither Skeleton Skull crafting recipe!");
			
		}
		else {
			
			LogHandler.logHandler.info("The Wither Skeleton Skull crafting recipe is DISABLED in the config! Moving on!");
			
		}
		
		if (ConfigHandler.skullCreeperCraftingRecipeEnabled == true) {
			
			LogHandler.logHandler.info("Started to register the Creeper Skull crafting recipe!");
			
			GameRegistry.addShapedRecipe(new ItemStack(Items.SKULL, 1, 4), "TGT", "GSG", "TGT", 'T', Blocks.TNT, 'G', Items.GUNPOWDER, 'S', new ItemStack(Items.SKULL, 1, 0));
			
			LogHandler.logHandler.info("Finished registering the Creeper Skull crafting recipe!");
			
		}
		else {
			
			LogHandler.logHandler.info("The Creeper Skull crafting recipe is DISABLED in the config! Moving on!");
			
		}
		
		if (ConfigHandler.skullZombieCraftingRecipeEnabled == true) {
			
			LogHandler.logHandler.info("Started to register the Zombie Skull crafting recipe!");
			
			GameRegistry.addShapedRecipe(new ItemStack(Items.SKULL, 1, 2), "FFF", "FSF", "FFF", 'F', Items.ROTTEN_FLESH, 'S', new ItemStack(Items.SKULL, 1, 0));
			
			LogHandler.logHandler.info("Finished registering the Zombie Skull crafting recipe!");
			
		}
		else {
			
			LogHandler.logHandler.info("The Zombie Skull crafting recipe is DISABLED in the config! Moving on!");
			
		}
		
		if (ConfigHandler.skullDragonCraftingRecipeEnabled == true) {
			
			LogHandler.logHandler.info("Started to register the Dragon Skull crafting recipe!");
			
			GameRegistry.addShapedRecipe(new ItemStack(Items.SKULL, 1, 5), "ECE", "CSC", "ECE", 'E', Blocks.DRAGON_EGG, 'C', Items.END_CRYSTAL, 'S', new ItemStack(Items.SKULL, 1, 0));
			
			LogHandler.logHandler.info("Finished registering the Dragon Skull crafting recipe!");
			
		}
		else {
			
			LogHandler.logHandler.info("The Dragon Skull crafting recipe is DISABLED in the config! Moving on!");
			
		}
		
		LogHandler.logHandler.info("Finished registering Crafting Recipes!");
		
	}
	
}
