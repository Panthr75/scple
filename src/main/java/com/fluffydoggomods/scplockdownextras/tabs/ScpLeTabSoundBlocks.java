package com.fluffydoggomods.scplockdownextras.tabs;

import com.fluffydoggomods.scplockdownextras.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ScpLeTabSoundBlocks extends CreativeTabs
{
	public ScpLeTabSoundBlocks()
	{
		super("scpletabsoundblocks");
	}
	
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModBlocks.SCPLOGO);
	}
	
	public boolean hasSearchBar() 
	{
		return true;
	}
}