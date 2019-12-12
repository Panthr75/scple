package com.fluffydoggomods.scplockdownextras.tabs;

import com.fluffydoggomods.scplockdownextras.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ScpLeTabDocuments extends CreativeTabs
{
	public ScpLeTabDocuments()
	{
		super("scpletabdocs");
	}
	
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.DOCUMENT);
	}
}
