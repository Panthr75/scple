package com.fluffydoggomods.scplockdownextras.scps;

import com.fluffydoggomods.scplockdownextras.Main;
import com.fluffydoggomods.scplockdownextras.scps.SCPItem;
import com.fluffydoggomods.scplockdownextras.init.ModItems;
import com.fluffydoggomods.scplockdownextras.util.IHasModel;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class SCP500 extends SCPItem
{
	public static int maxDamage = 5;
	
	public SCP500()
	{
		super("500", null);
		setMaxDamage(maxDamage);
		setMaxStackSize(1);
	}

	@Override
    public boolean hasContainerItem(ItemStack itemStack)
    {
		return true;
    }
	
	@Override
	public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack)
	{
		if (entityLiving.isSneaking()) 
		{
			if (stack.getItemDamage() <= 0) return false;
			
			//if (entityLiving.getArmorInventoryList())
			
			entityLiving.setHeldItem(entityLiving.getActiveHand(), new ItemStack(stack.getItem(), 1, stack.getItemDamage() - 1));
			
			return false;
		}
		else return false;
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) 
	{
		if (playerIn.isSneaking())
		{
			// Remove a "pill" from the bottle
			Item itemToAdd = Item.getByNameOrId("scp:panacea_pills");
			if (itemToAdd == null) return new ActionResult<ItemStack>(EnumActionResult.FAIL, playerIn.getHeldItem(handIn));
			
			if (!playerIn.addItemStackToInventory(new ItemStack(itemToAdd))) return new ActionResult<ItemStack>(EnumActionResult.FAIL, playerIn.getHeldItem(handIn));
			
			ItemStack itemResult = damageItem(playerIn.getHeldItem(handIn));
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemResult);
		}
		else 
		{
			// Add a "pill" to the bottle
			Item itemToDel = Item.getByNameOrId("scp:panacea_pills");
			if (itemToDel == null || playerIn.getHeldItem(handIn).getItemDamage() <= 0) return new ActionResult<ItemStack>(EnumActionResult.FAIL, playerIn.getHeldItem(handIn));
			
			
			ItemStack stackToDel = new ItemStack(itemToDel);
			if (!playerIn.inventory.hasItemStack(stackToDel)) return new ActionResult<ItemStack>(EnumActionResult.FAIL, playerIn.getHeldItem(handIn));
			
			int slot = playerIn.inventory.getSlotFor(stackToDel);
			ItemStack curStack = playerIn.inventory.getStackInSlot(slot);
			
			curStack.setCount(curStack.getCount() - 1);
			
			ItemStack bottleStack = playerIn.getHeldItem(handIn);
			
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, new ItemStack(bottleStack.getItem(), 1, bottleStack.getItemDamage() - 1));
		}
	}
	
	private ItemStack damageItem(ItemStack itemStack)
	{
		ItemStack returnItem = new ItemStack(itemStack.getItem(), 1, itemStack.getItemDamage() + 1);
    	
    	if (itemStack.getItemDamage() >= maxDamage - 1) return new ItemStack(ModItems.PILL_BOTTLE);
    	else return returnItem;
	}

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
    	return damageItem(itemStack);
    }
}
