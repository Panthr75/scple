package com.fluffydoggomods.scplockdownextras.util.handlers;

import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;

public class MovingSoundHandler extends MovingSound
{
	public MovingSoundHandler(SoundEvent soundIn, SoundCategory categoryIn) 
	{
		super(soundIn, categoryIn);
        this.attenuationType = ISound.AttenuationType.NONE;
	}

	@Override
	public void update() 
	{
		
	}

}
