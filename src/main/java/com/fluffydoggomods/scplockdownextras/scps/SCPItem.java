package com.fluffydoggomods.scplockdownextras.scps;

import com.fluffydoggomods.scplockdownextras.Main;
import com.fluffydoggomods.scplockdownextras.init.ModItems;
import com.fluffydoggomods.scplockdownextras.util.IHasModel;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SCPItem extends Item implements IHasModel
{
	public SCPItem(String scp, String instance)
	{
		String itemName = "scp" + scp + (instance != null ? "-" + instance : "");
		setUnlocalizedName(itemName);
		setRegistryName(itemName);
		setCreativeTab(Main.scptab);
		setMaxDamage(6);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
