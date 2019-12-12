package com.fluffydoggomods.scplockdownextras.tabs;

import com.fluffydoggomods.scplockdownextras.init.ModBlocks;
import com.fluffydoggomods.scplockdownextras.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ScpLeTabBlocks extends CreativeTabs
{
	public ScpLeTabBlocks()
	{
		super("scpletabblocks");
	}
	
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModBlocks.METAL_PANEL_2);
	}
}
