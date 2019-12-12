package com.fluffydoggomods.scplockdownextras.sounds;

import java.util.ArrayList;
import java.util.List;

import com.fluffydoggomods.scplockdownextras.util.handlers.SoundsHandler;

import net.minecraft.block.SoundType;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class SoundList 
{
	public static SoundType METAL_FLOOR_A = new SoundType(1.0F, 1.0F, SoundsHandler.BLOCK_METALFLOORA_BREAK, SoundsHandler.BLOCK_METALFLOORA_PLACE, SoundsHandler.BLOCK_METALFLOORA_STEP, SoundsHandler.BLOCK_METALFLOORA_HIT, SoundsHandler.BLOCK_METALFLOORA_FALL);
	public static SoundType CONCRETE_FLOOR = new SoundType(1.0F, 1.0F, SoundsHandler.BLOCK_CONCRETEFLOOR_BREAK, SoundsHandler.BLOCK_CONCRETEFLOOR_PLACE, SoundsHandler.BLOCK_CONCRETEFLOOR_STEP, SoundsHandler.BLOCK_CONCRETEFLOOR_HIT, SoundsHandler.BLOCK_CONCRETEFLOOR_FALL);
	public static SoundType PUDDLE_106 = new SoundType(1.0F, 1.0F, SoundsHandler.BLOCK_PUDDLE106_BREAK, SoundsHandler.BLOCK_PUDDLE106_STEP, SoundEvents.BLOCK_SLIME_PLACE, SoundEvents.BLOCK_SLIME_HIT, SoundsHandler.BLOCK_PUDDLE106_STEP);
}
