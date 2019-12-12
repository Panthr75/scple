package com.fluffydoggomods.scplockdownextras.util;

import com.fluffydoggomods.scplockdownextras.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SCPLECreativeTab extends CreativeTabs 
{
	public SCPLECreativeTab(String par2Str) {
		super(par2Str);
	}
	
	public ItemStack createIcon() {
		return new ItemStack(Item.getItemFromBlock(ModBlocks.HARD_METAL_WALL_A));
	}

	@Override
	public ItemStack getTabIconItem() {
		return null;
	}
}
