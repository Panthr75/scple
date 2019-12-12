package com.fluffydoggomods.scplockdownextras.items;

import com.fluffydoggomods.scplockdownextras.Main;
import com.fluffydoggomods.scplockdownextras.init.ModItems;
import com.fluffydoggomods.scplockdownextras.util.IHasModel;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;

//import alexiy.secure.contain.protect.potions.Anxiety;
//import alexiy.secure.contain.protect.registration.Potions;

public class Pill extends ItemFood implements IHasModel
{
	private boolean isUpgraded;
	public Pill(boolean upgraded) 
	{
		super(2, 0.1F, false);
		String name = !upgraded ? "pill" : "upgraded_pill";
		isUpgraded = upgraded;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.itemstab);
		setMaxStackSize(16);
		
		ModItems.ITEMS.add(this);
	}
	
	private void upgradedPill_dud(EntityLivingBase entityLiving) 
	{
		entityLiving.sendMessage(new TextComponentString(TextFormatting.GRAY + "" + TextFormatting.ITALIC + "You consumed the pill"));
	}
	
	private void upgradedPill_positiveEffect(EntityLivingBase entityLiving) 
	{
		entityLiving.sendMessage(new TextComponentString(TextFormatting.GRAY + "" + TextFormatting.ITALIC + "You consumed the pill and feel stronger"));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.SPEED, 6000, 4));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.HASTE, 6000, 4));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 6000, 4));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 6000, 1));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 6000, 0));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 6000, 2));
	}
	
	private void upgradedPill_negativeEffect(EntityLivingBase entityLiving) 
	{
		entityLiving.sendMessage(new TextComponentString(TextFormatting.GRAY + "" + TextFormatting.ITALIC + "You consumed the pill, but feel terrible"));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 6000, 2));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 6000, 2));
		//entityLiving.addPotionEffect(new PotionEffect(Potions.anxiety , 6000, 4));
		//entityLiving.addPotionEffect(new PotionEffect(Potions.delayedDeathEffect , 600, 4));
	}

	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) 
	{
		String n = stack.getUnlocalizedName().toString();
		
		ItemStack returnItem = stack.copy();
		returnItem.setCount(returnItem.getCount() - 1);
		
		if (!worldIn.isRemote) {
			if (n.equals("item.pill") && !isUpgraded)
			{
				entityLiving.sendMessage(new TextComponentString(TextFormatting.GRAY + "" + TextFormatting.ITALIC + "You consumed the pill and feel better"));
				entityLiving.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 100, 0));
			}
			else if (n.equals("item.upgraded_pill") && isUpgraded)
			{
				int i = Math.round((float)(Math.random() * 5));
				if (i == 0) upgradedPill_dud(entityLiving);
				else if (i == 1) upgradedPill_dud(entityLiving);
				else if (i == 2) upgradedPill_dud(entityLiving);
				else if (i == 3) upgradedPill_positiveEffect(entityLiving);
				else if (i == 4) upgradedPill_negativeEffect(entityLiving);
				else if (i == 5) upgradedPill_negativeEffect(entityLiving);
			}
			else {
				System.out.println("No Name Detected!");
			}
		}
		
		return returnItem;
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
