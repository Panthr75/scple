package com.fluffydoggomods.scplockdownextras.blocks;

import com.fluffydoggomods.scplockdownextras.Main;
import com.fluffydoggomods.scplockdownextras.init.ModBlocks;
import com.fluffydoggomods.scplockdownextras.init.ModItems;
import com.fluffydoggomods.scplockdownextras.sounds.SoundList;
import com.fluffydoggomods.scplockdownextras.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBaseNoTab extends Block implements IHasModel {
	public BlockBaseNoTab(String name, Material material, SoundType soundtype)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(3F);
		if (soundtype != null) setSoundType(soundtype);
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
