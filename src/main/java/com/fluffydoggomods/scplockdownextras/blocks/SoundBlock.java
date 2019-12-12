package com.fluffydoggomods.scplockdownextras.blocks;

import com.fluffydoggomods.scplockdownextras.Main;
import com.fluffydoggomods.scplockdownextras.init.ModBlocks;
import com.fluffydoggomods.scplockdownextras.init.ModItems;
import com.fluffydoggomods.scplockdownextras.sounds.SoundList;
import com.fluffydoggomods.scplockdownextras.util.IHasModel;
import com.fluffydoggomods.scplockdownextras.util.handlers.MovingSoundHandler;
import com.fluffydoggomods.scplockdownextras.util.handlers.SoundsHandler;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class SoundBlock extends Block implements IHasModel 
{
	public SoundEvent sound;
	public SoundCategory soundCat;
	public boolean playingSound = false;
	private boolean movingSound = false;
	
	public SoundBlock(String name, Material material, SoundEvent soundToPlay, SoundCategory soundCategory, boolean isMovingSound)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(3F);
		setCreativeTab(Main.soundblocktab);
		sound = soundToPlay;
		soundCat = soundCategory;
		movingSound = isMovingSound;
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	@Override
	public boolean getWeakChanges(IBlockAccess world, BlockPos pos)
	{
		return true;
	}
	
	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
	{
		if (!worldIn.isRemote && worldIn.getTileEntity(pos) == null)
        {
			Main.debug("Added a coming soon block");
            //worldIn.addBlockEvent(pos, this, , eventParam);
        }
	}
	
	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
	{
		//Main.debug("playing sound in cat " + soundCat);
		if (!worldIn.isBlockPowered(pos))
		{
			playingSound = false;
		}
		else
		{
			if (playingSound == false) 
			{
				playingSound = true;
				//Main.debug("Playing sound at (" + pos.getX() + ", " + pos.getY() + ", " + pos.getZ() + ")");
				if (movingSound)
				{
					if (!worldIn.isRemote)
					{
						MovingSound s = new MovingSoundHandler(sound, soundCat);
						Minecraft.getMinecraft().getSoundHandler().playSound(s);
					}
					for (EntityPlayer player : worldIn.playerEntities)
					{
						Main.info("Playing " + sound.getSoundName() + " to " + player.getName());
						worldIn.playSound(player, player.getPosition(), sound, soundCat, 1, 1);
					}
				}
				else
					worldIn.playSound(null, pos.getX(), pos.getY(), pos.getZ(), sound, soundCat, 1, 1);
			}
		}
		//else if (worldIn.isRemote)
		//{
		//	if (playingSound == false) 
		//	{
		//		Main.info("Existing");
		//		playingSound = true;
		//		for (EntityPlayer player : worldIn.playerEntities)
		//		{
		//			Main.info("Playing: " + sound.getSoundName());
		//			worldIn.playSound(player, pos.getX(), pos.getY(), pos.getZ(), sound, SoundCategory.MASTER, 1, 1);
		//		}
		//	}		
		//}
	}
	
	@Override
	public boolean canConnectRedstone(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side)
	{
		return true;
	}
}
