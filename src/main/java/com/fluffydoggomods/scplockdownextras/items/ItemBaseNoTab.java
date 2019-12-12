package com.fluffydoggomods.scplockdownextras.items;

import com.fluffydoggomods.scplockdownextras.Main;
import com.fluffydoggomods.scplockdownextras.init.ModItems;
import com.fluffydoggomods.scplockdownextras.tabs.ScpLeTabBlocks;
import com.fluffydoggomods.scplockdownextras.util.IHasModel;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBaseNoTab extends Item implements IHasModel 
{
	public ItemBaseNoTab(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
