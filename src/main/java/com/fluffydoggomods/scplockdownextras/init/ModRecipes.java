package com.fluffydoggomods.scplockdownextras.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	//initialize the recipes
	public static void init() 
	{
		GameRegistry.addSmelting(new ItemStack(Items.DYE, 1, 15), new ItemStack(ModItems.GLUE), 10);
	}
}
