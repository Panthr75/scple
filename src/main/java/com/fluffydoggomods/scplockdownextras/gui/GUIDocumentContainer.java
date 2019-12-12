package com.fluffydoggomods.scplockdownextras.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class GUIDocumentContainer extends Container
{
	public World worldIn;
	public EntityPlayer player;
	
	public GUIDocumentContainer(World world, EntityPlayer playerIn)
	{
		worldIn = world;
		player = playerIn;
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn)
	{
		return true;
	}
	
	@Override
	public void onContainerClosed(EntityPlayer playerIn) 
	{
		super.onContainerClosed(playerIn);
	}
}
