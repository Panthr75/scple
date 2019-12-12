package com.fluffydoggomods.scplockdownextras.tabs;

import com.fluffydoggomods.scplockdownextras.init.ModBlocks;
import com.fluffydoggomods.scplockdownextras.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ScpLeTabSCPS extends CreativeTabs
{
	public ScpLeTabSCPS()
	{
		super("scpletabscps");
	}
	
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.SCP500);
	}
}
