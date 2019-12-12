package com.fluffydoggomods.scplockdownextras.items;

import com.fluffydoggomods.scplockdownextras.Main;
import com.fluffydoggomods.scplockdownextras.init.ModItems;
import com.fluffydoggomods.scplockdownextras.scps.SCP500;
import com.fluffydoggomods.scplockdownextras.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class PillBottle extends Item implements IHasModel
{
	public PillBottle() 
	{
		setUnlocalizedName("pill_bottle");
		setRegistryName("pill_bottle");
		setCreativeTab(Main.itemstab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) 
	{
		if (playerIn.isSneaking()) return new ActionResult<ItemStack>(EnumActionResult.FAIL, playerIn.getHeldItem(handIn));
		else 
		{
			// Add a "pill" to the bottle
			Item itemToDel = Item.getByNameOrId("scp:panacea_pills");
			if (itemToDel == null) return new ActionResult<ItemStack>(EnumActionResult.FAIL, playerIn.getHeldItem(handIn));
			
			
			ItemStack stackToDel = new ItemStack(itemToDel);
			if (!playerIn.inventory.hasItemStack(stackToDel)) return new ActionResult<ItemStack>(EnumActionResult.FAIL, playerIn.getHeldItem(handIn));
			
			int slot = playerIn.inventory.getSlotFor(stackToDel);
			ItemStack curStack = playerIn.inventory.getStackInSlot(slot);
			
			curStack.setCount(curStack.getCount() - 1);
			
			ItemStack bottleStack = playerIn.getHeldItem(handIn);
			
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, new ItemStack(ModItems.SCP500, 1, SCP500.maxDamage - 1));
		}
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
