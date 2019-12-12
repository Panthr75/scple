package com.fluffydoggomods.scplockdownextras.items;

import com.fluffydoggomods.scplockdownextras.Main;
import com.fluffydoggomods.scplockdownextras.init.ModItems;
import com.fluffydoggomods.scplockdownextras.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import scala.Console;

public class GlueBottle extends Item implements IHasModel
{
	public GlueBottle() 
	{
		setUnlocalizedName("glue");
		setRegistryName("glue");
		setCreativeTab(Main.itemstab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

	@Override
    public boolean hasContainerItem(ItemStack itemStack)
    {
		return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
    	return new ItemStack(Items.GLASS_BOTTLE);
    }
}
