package com.fluffydoggomods.scplockdownextras.util.handlers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.Locale;

import javax.annotation.ParametersAreNonnullByDefault;

import com.fluffydoggomods.scplockdownextras.Main;
import com.fluffydoggomods.scplockdownextras.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistry;
import net.minecraftforge.registries.ObjectHolderRegistry;

@ObjectHolder(Reference.MOD_ID)
@ParametersAreNonnullByDefault
@SuppressWarnings("null")

public class SoundsHandler 
{
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.FIELD)
	private static @interface SoundName {
	    String value();
	}
	@SoundName("block.metal.fall")
	public static final SoundEvent BLOCK_METALFLOORA_FALL = null;
		
	@SoundName("block.metal.break")
	public static final SoundEvent BLOCK_METALFLOORA_BREAK = null;
		
	@SoundName("block.metal.place")
	public static final SoundEvent BLOCK_METALFLOORA_PLACE = null;
		
	@SoundName("block.metal.step")
	public static final SoundEvent BLOCK_METALFLOORA_HIT = null;
		
	@SoundName("block.metal.step")
	public static final SoundEvent BLOCK_METALFLOORA_STEP = null;
	
	
	@SoundName("block.normal.fall")
	public static final SoundEvent BLOCK_CONCRETEFLOOR_FALL = null;
	
	@SoundName("block.normal.break")
	public static final SoundEvent BLOCK_CONCRETEFLOOR_BREAK = null;
	
	@SoundName("block.normal.place")
	public static final SoundEvent BLOCK_CONCRETEFLOOR_PLACE = null;
	
	@SoundName("block.normal.step")
	public static final SoundEvent BLOCK_CONCRETEFLOOR_HIT = null;
	
	@SoundName("block.normal.step")
	public static final SoundEvent BLOCK_CONCRETEFLOOR_STEP = null;
	
	@SoundName("block.puddle106.step")
	public static final SoundEvent BLOCK_PUDDLE106_STEP = null;
	
	@SoundName("block.puddle106.break")
	public static final SoundEvent BLOCK_PUDDLE106_BREAK = null;
	
	
	//containment breach sounds
	// general
	@SoundName("cb.alarm")
	public static final SoundEvent CB_ALARM = null;

	@SoundName("cb.checkpoint")
	public static final SoundEvent CB_CHECKPOINT = null;
	
	@SoundName("cb.lockroomsiren")
	public static final SoundEvent CB_LOCKROOMSIREN = null;
	
	// tesla
	@SoundName("cb.tesla.idle")
	public static final SoundEvent CB_TESLA_IDLE = null;

	@SoundName("cb.tesla.powerup")
	public static final SoundEvent CB_TESLA_POWERUP = null;
	
	@SoundName("cb.tesla.shock")
	public static final SoundEvent CB_TESLA_SHOCK = null;
	
	@SoundName("cb.tesla.windup")
	public static final SoundEvent CB_TESLA_WINDUP = null;
	
	// broadcasts
	@SoundName("cb.broadcasts079.broadcast")
	public static final SoundEvent CB_079BROADCAST = null;
	
	@SoundName("cb.broadcasts079.broadcast1")
	public static final SoundEvent CB_079BROADCAST1 = null;
	
	@SoundName("cb.broadcasts079.broadcast2")
	public static final SoundEvent CB_079BROADCAST2 = null;
	
	@SoundName("cb.broadcasts079.broadcast3")
	public static final SoundEvent CB_079BROADCAST3 = null;
	
	@SoundName("cb.broadcasts079.broadcast4")
	public static final SoundEvent CB_079BROADCAST4 = null;
	
	@SoundName("cb.broadcasts079.broadcast5")
	public static final SoundEvent CB_079BROADCAST5 = null;
	
	@SoundName("cb.broadcasts079.broadcast6")
	public static final SoundEvent CB_079BROADCAST6 = null;
	
	@SoundName("cb.broadcasts079.broadcast7")
	public static final SoundEvent CB_079BROADCAST7 = null;
	
	// ambiance
	@SoundName("cb.ambient.lc")
	public static final SoundEvent CB_LC_AMBIENCE = null;
	
	@SoundName("cb.ambient.lc.1")
	public static final SoundEvent CB_LC_AMBIENCE1 = null;
	
	@SoundName("cb.ambient.lc.2")
	public static final SoundEvent CB_LC_AMBIENCE2 = null;
	
	@SoundName("cb.ambient.lc.3")
	public static final SoundEvent CB_LC_AMBIENCE3 = null;
	
	@SoundName("cb.ambient.lc.4")
	public static final SoundEvent CB_LC_AMBIENCE4 = null;
	
	@SoundName("cb.ambient.lc.5")
	public static final SoundEvent CB_LC_AMBIENCE5 = null;
	
	@SoundName("cb.ambient.lc.6")
	public static final SoundEvent CB_LC_AMBIENCE6 = null;
	
	@SoundName("cb.ambient.lc.7")
	public static final SoundEvent CB_LC_AMBIENCE7 = null;
	
	@SoundName("cb.ambient.lc.8")
	public static final SoundEvent CB_LC_AMBIENCE8 = null;
	
	@SoundName("cb.ambient.lc.9")
	public static final SoundEvent CB_LC_AMBIENCE9 = null;
	
	@SoundName("cb.ambient.lc.10")
	public static final SoundEvent CB_LC_AMBIENCE10 = null;
	
	@SoundName("cb.ambient.lc.11")
	public static final SoundEvent CB_LC_AMBIENCE11 = null;
	
	// commotion
	@SoundName("cb.commotion")
	public static final SoundEvent CB_COMMOTION = null;
	
	@SoundName("cb.commotion.1")
	public static final SoundEvent CB_COMMOTION_1 = null;
	
	@SoundName("cb.commotion.2")
	public static final SoundEvent CB_COMMOTION_2 = null;
	
	@SoundName("cb.commotion.3")
	public static final SoundEvent CB_COMMOTION_3 = null;
	
	@SoundName("cb.commotion.4")
	public static final SoundEvent CB_COMMOTION_4 = null;
	
	@SoundName("cb.commotion.5")
	public static final SoundEvent CB_COMMOTION_5 = null;
	
	@SoundName("cb.commotion.6")
	public static final SoundEvent CB_COMMOTION_6 = null;
	
	@SoundName("cb.commotion.7")
	public static final SoundEvent CB_COMMOTION_7 = null;
	
	@SoundName("cb.commotion.8")
	public static final SoundEvent CB_COMMOTION_8 = null;
	
	@SoundName("cb.commotion.9")
	public static final SoundEvent CB_COMMOTION_9 = null;
	
	@SoundName("cb.commotion.10")
	public static final SoundEvent CB_COMMOTION_10 = null;
	
	@SoundName("cb.commotion.11")
	public static final SoundEvent CB_COMMOTION_11 = null;
	
	@SoundName("cb.commotion.12")
	public static final SoundEvent CB_COMMOTION_12 = null;
	
	@SoundName("cb.commotion.13")
	public static final SoundEvent CB_COMMOTION_13 = null;
	
	@SoundName("cb.commotion.14")
	public static final SoundEvent CB_COMMOTION_14 = null;
	
	@SoundName("cb.commotion.15")
	public static final SoundEvent CB_COMMOTION_15 = null;
	
	@SoundName("cb.commotion.16")
	public static final SoundEvent CB_COMMOTION_16 = null;
	
	@SoundName("cb.commotion.17")
	public static final SoundEvent CB_COMMOTION_17 = null;
	
	@SoundName("cb.commotion.18")
	public static final SoundEvent CB_COMMOTION_18 = null;
	
	@SoundName("cb.commotion.19")
	public static final SoundEvent CB_COMMOTION_19 = null;
	
	@SoundName("cb.commotion.20")
	public static final SoundEvent CB_COMMOTION_20 = null;
	
	@SoundName("cb.commotion.21")
	public static final SoundEvent CB_COMMOTION_21 = null;
	
	@SoundName("cb.commotion.22")
	public static final SoundEvent CB_COMMOTION_22 = null;
	
	@SoundName("cb.commotion.23")
	public static final SoundEvent CB_COMMOTION_23 = null;
	
	@SoundName("cb.commotion.24")
	public static final SoundEvent CB_COMMOTION_24 = null;
	
	@SoundName("cb.commotion.25")
	public static final SoundEvent CB_COMMOTION_25 = null;
	
	
	//doors
	@SoundName("block.door.normal.open")
	public static final SoundEvent BLOCK_DOORNORMAL_OPEN = null;
	
	@SoundName("block.door.heavy.open")
	public static final SoundEvent BLOCK_DOORHEAVY_OPEN = null;
	
	@SoundName("block.door.normal.close")
	public static final SoundEvent BLOCK_DOORNORMAL_CLOSE = null;
	
	@SoundName("block.door.heavy.close")
	public static final SoundEvent BLOCK_DOORHEAVY_CLOSE = null;
	
	//entities
	
	
	static 
	{
		for (Field f : SoundsHandler.class.getDeclaredFields()) {
			Main.debug("Registering SoundEvent " + f.getName());
			if (f.isAnnotationPresent(SoundName.class)) ForgeRegistries.SOUND_EVENTS.register(new SoundEvent(new ResourceLocation(Reference.MOD_ID, f.getAnnotation(SoundName.class).value())).setRegistryName(f.getName().toLowerCase(Locale.ROOT)));
		}
		
		ObjectHolderRegistry.INSTANCE.applyObjectHolders();
	}
}
