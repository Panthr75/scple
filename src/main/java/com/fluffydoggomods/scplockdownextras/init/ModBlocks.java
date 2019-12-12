package com.fluffydoggomods.scplockdownextras.init;

import java.util.ArrayList;
import java.util.List;

import com.fluffydoggomods.scplockdownextras.blocks.BlockAddition;
import com.fluffydoggomods.scplockdownextras.blocks.BlockBase;
import com.fluffydoggomods.scplockdownextras.blocks.BloodBlock;
import com.fluffydoggomods.scplockdownextras.blocks.ConcreteBlock;
import com.fluffydoggomods.scplockdownextras.blocks.LarryPuddle;
import com.fluffydoggomods.scplockdownextras.blocks.MetalBlock;
import com.fluffydoggomods.scplockdownextras.blocks.MetalPanelTop;
import com.fluffydoggomods.scplockdownextras.blocks.SoundBlock;
import com.fluffydoggomods.scplockdownextras.blocks.WallRotatables;
import com.fluffydoggomods.scplockdownextras.items.ItemBase;
import com.fluffydoggomods.scplockdownextras.util.handlers.SoundsHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.SoundCategory;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	
	public static final Block METAL_FLOOR_A = new MetalBlock("metal_floor_a", Material.IRON);
	public static final Block HARD_METAL_WALL_A = new MetalBlock("hard_metal_wall", Material.IRON);
	public static final Block DARK_CONCRETE = new ConcreteBlock("dark_concrete", Material.ROCK);
	public static final Block SCP_WALLAVENT = new BlockAddition("wallavent");
	public static final Block STAINED_WALL = new ConcreteBlock("wall", Material.ROCK);
	public static final Block STAINED_WALL_A = new ConcreteBlock("stained_wall_a", Material.ROCK);
	public static final Block STAINED_WALL_B = new ConcreteBlock("stained_wall_b", Material.ROCK);
	public static final Block STAINED_WALL_C = new ConcreteBlock("stained_wall_c", Material.ROCK);
	public static final Block STAINED_WALL_D = new ConcreteBlock("stained_wall_d", Material.ROCK);
	public static final Block STAINED_WALL_E = new ConcreteBlock("stained_wall_e", Material.ROCK);
	public static final Block STAINED_WALL_F = null;
	public static final Block SCP500_LOCKER_WALL = new BlockBase("scp500_locker_wall", Material.ROCK);
	public static final Block SCPLOGO = new BlockBase("scplogo", Material.ROCK);
	public static final Block SCP500_LOCKER = null;
	
	// SOUND BLOCKS
	public static final Block SOUNDBLOCK_ALARM = new SoundBlock("soundblock_alarm", Material.ROCK, SoundsHandler.CB_ALARM, SoundCategory.BLOCKS, false);
	public static final Block SOUNDBLOCK_CHECKPOINT = new SoundBlock("soundblock_checkpoint", Material.ROCK, SoundsHandler.CB_CHECKPOINT, SoundCategory.BLOCKS, false);
	public static final Block SOUNDBLOCK_LOCKROOMSIREN = new SoundBlock("soundblock_lockroomsiren", Material.ROCK, SoundsHandler.CB_LOCKROOMSIREN, SoundCategory.BLOCKS, false);
	
	
	public static final Block SOUNDBLOCK_079BROADCAST = new SoundBlock("soundblock_079broadcast", Material.ROCK, SoundsHandler.CB_079BROADCAST, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_079BROADCAST1 = new SoundBlock("soundblock_079broadcast1", Material.ROCK, SoundsHandler.CB_079BROADCAST1, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_079BROADCAST2 = new SoundBlock("soundblock_079broadcast2", Material.ROCK, SoundsHandler.CB_079BROADCAST2, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_079BROADCAST3 = new SoundBlock("soundblock_079broadcast3", Material.ROCK, SoundsHandler.CB_079BROADCAST3, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_079BROADCAST4 = new SoundBlock("soundblock_079broadcast4", Material.ROCK, SoundsHandler.CB_079BROADCAST4, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_079BROADCAST5 = new SoundBlock("soundblock_079broadcast5", Material.ROCK, SoundsHandler.CB_079BROADCAST5, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_079BROADCAST6 = new SoundBlock("soundblock_079broadcast6", Material.ROCK, SoundsHandler.CB_079BROADCAST6, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_079BROADCAST7 = new SoundBlock("soundblock_079broadcast7", Material.ROCK, SoundsHandler.CB_079BROADCAST7, SoundCategory.AMBIENT, true);
	
	public static final Block SOUNDBLOCK_LC_AMBIENCE = new SoundBlock("soundblock_lc_ambience", Material.ROCK, SoundsHandler.CB_LC_AMBIENCE, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_LC_AMBIENCE1 = new SoundBlock("soundblock_lc_ambience1", Material.ROCK, SoundsHandler.CB_LC_AMBIENCE1, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_LC_AMBIENCE2 = new SoundBlock("soundblock_lc_ambience2", Material.ROCK, SoundsHandler.CB_LC_AMBIENCE2, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_LC_AMBIENCE3 = new SoundBlock("soundblock_lc_ambience3", Material.ROCK, SoundsHandler.CB_LC_AMBIENCE3, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_LC_AMBIENCE4 = new SoundBlock("soundblock_lc_ambience4", Material.ROCK, SoundsHandler.CB_LC_AMBIENCE4, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_LC_AMBIENCE5 = new SoundBlock("soundblock_lc_ambience5", Material.ROCK, SoundsHandler.CB_LC_AMBIENCE5, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_LC_AMBIENCE6 = new SoundBlock("soundblock_lc_ambience6", Material.ROCK, SoundsHandler.CB_LC_AMBIENCE6, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_LC_AMBIENCE7 = new SoundBlock("soundblock_lc_ambience7", Material.ROCK, SoundsHandler.CB_LC_AMBIENCE7, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_LC_AMBIENCE8 = new SoundBlock("soundblock_lc_ambience8", Material.ROCK, SoundsHandler.CB_LC_AMBIENCE8, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_LC_AMBIENCE9 = new SoundBlock("soundblock_lc_ambience9", Material.ROCK, SoundsHandler.CB_LC_AMBIENCE9, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_LC_AMBIENCE10 = new SoundBlock("soundblock_lc_ambience10", Material.ROCK, SoundsHandler.CB_LC_AMBIENCE10, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_LC_AMBIENCE11 = new SoundBlock("soundblock_lc_ambience11", Material.ROCK, SoundsHandler.CB_LC_AMBIENCE11, SoundCategory.AMBIENT, true);
	
	public static final Block SOUNDBLOCK_COMMOTION = new SoundBlock("soundblock_commotion", Material.ROCK, SoundsHandler.CB_COMMOTION, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION1 = new SoundBlock("soundblock_commotion1", Material.ROCK, SoundsHandler.CB_COMMOTION_1, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION2 = new SoundBlock("soundblock_commotion2", Material.ROCK, SoundsHandler.CB_COMMOTION_2, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION3 = new SoundBlock("soundblock_commotion3", Material.ROCK, SoundsHandler.CB_COMMOTION_3, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION4 = new SoundBlock("soundblock_commotion4", Material.ROCK, SoundsHandler.CB_COMMOTION_4, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION5 = new SoundBlock("soundblock_commotion5", Material.ROCK, SoundsHandler.CB_COMMOTION_5, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION6 = new SoundBlock("soundblock_commotion6", Material.ROCK, SoundsHandler.CB_COMMOTION_6, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION7 = new SoundBlock("soundblock_commotion7", Material.ROCK, SoundsHandler.CB_COMMOTION_7, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION8 = new SoundBlock("soundblock_commotion8", Material.ROCK, SoundsHandler.CB_COMMOTION_8, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION9 = new SoundBlock("soundblock_commotion9", Material.ROCK, SoundsHandler.CB_COMMOTION_9, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION10 = new SoundBlock("soundblock_commotion10", Material.ROCK, SoundsHandler.CB_COMMOTION_10, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION11 = new SoundBlock("soundblock_commotion11", Material.ROCK, SoundsHandler.CB_COMMOTION_11, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION12 = new SoundBlock("soundblock_commotion12", Material.ROCK, SoundsHandler.CB_COMMOTION_12, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION13 = new SoundBlock("soundblock_commotion13", Material.ROCK, SoundsHandler.CB_COMMOTION_13, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION14 = new SoundBlock("soundblock_commotion14", Material.ROCK, SoundsHandler.CB_COMMOTION_14, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION15 = new SoundBlock("soundblock_commotion15", Material.ROCK, SoundsHandler.CB_COMMOTION_15, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION16 = new SoundBlock("soundblock_commotion16", Material.ROCK, SoundsHandler.CB_COMMOTION_16, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION17 = new SoundBlock("soundblock_commotion17", Material.ROCK, SoundsHandler.CB_COMMOTION_17, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION18 = new SoundBlock("soundblock_commotion18", Material.ROCK, SoundsHandler.CB_COMMOTION_18, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION19 = new SoundBlock("soundblock_commotion19", Material.ROCK, SoundsHandler.CB_COMMOTION_19, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION20 = new SoundBlock("soundblock_commotion20", Material.ROCK, SoundsHandler.CB_COMMOTION_20, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION21 = new SoundBlock("soundblock_commotion21", Material.ROCK, SoundsHandler.CB_COMMOTION_21, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION22 = new SoundBlock("soundblock_commotion22", Material.ROCK, SoundsHandler.CB_COMMOTION_22, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION23 = new SoundBlock("soundblock_commotion23", Material.ROCK, SoundsHandler.CB_COMMOTION_23, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION24 = new SoundBlock("soundblock_commotion24", Material.ROCK, SoundsHandler.CB_COMMOTION_24, SoundCategory.AMBIENT, true);
	public static final Block SOUNDBLOCK_COMMOTION25 = new SoundBlock("soundblock_commotion25", Material.ROCK, SoundsHandler.CB_COMMOTION_25, SoundCategory.AMBIENT, true);
	
	public static final Block SOUNDBLOCK_TESLA_IDLE = new SoundBlock("soundblock_tesla_idle", Material.ROCK, SoundsHandler.CB_TESLA_IDLE, SoundCategory.BLOCKS, false);
	public static final Block SOUNDBLOCK_TESLA_WINDUP = new SoundBlock("soundblock_tesla_windup", Material.ROCK, SoundsHandler.CB_TESLA_WINDUP, SoundCategory.BLOCKS, false);
	public static final Block SOUNDBLOCK_TESLA_POWERUP = new SoundBlock("soundblock_tesla_powerup", Material.ROCK, SoundsHandler.CB_TESLA_POWERUP, SoundCategory.BLOCKS, false);
	public static final Block SOUNDBLOCK_TESLA_SHOCK = new SoundBlock("soundblock_tesla_shock", Material.ROCK, SoundsHandler.CB_TESLA_SHOCK, SoundCategory.BLOCKS, false);
	
	public static final Block WALLA_INDENT_A = new WallRotatables("walla_indent_a", Material.ROCK);
	public static final Block WALLB_INDENT_A = new WallRotatables("wallb_indent_a", Material.ROCK);
	public static final Block WALLB_INDENT_A1 = new WallRotatables("wallb_indent_a1", Material.ROCK);
	public static final Block WALLB_INDENT_A2 = new WallRotatables("wallb_indent_a2", Material.ROCK);
	public static final Block WALLC_INDENT_A = new WallRotatables("wallc_indent_a", Material.ROCK);
	public static final Block WALLC_INDENT_A1 = new WallRotatables("wallc_indent_a1", Material.ROCK);
	public static final Block WALLC_INDENT_A2 = new WallRotatables("wallc_indent_a2", Material.ROCK);
	public static final Block WALLD_INDENT_A = new WallRotatables("walld_indent_a", Material.ROCK);
	public static final Block WALLD_INDENT_A1 = new WallRotatables("walld_indent_a1", Material.ROCK);
	public static final Block WALLD_INDENT_A2 = new WallRotatables("walld_indent_a2", Material.ROCK);
	public static final Block WALLE_INDENT_A = new WallRotatables("walle_indent_a", Material.ROCK);
	public static final Block WALLE_INDENT_A1 = new WallRotatables("walle_indent_a1", Material.ROCK);
	public static final Block WALLE_INDENT_A2 = new WallRotatables("walle_indent_a2", Material.ROCK);
	public static final Block WALLF_INDENT_A = new WallRotatables("wallf_indent_a", Material.ROCK);
	public static final Block WALLF_INDENT_A1 = new WallRotatables("wallf_indent_a1", Material.ROCK);
	public static final Block WALLF_INDENT_A2 = new WallRotatables("wallf_indent_a2", Material.ROCK);
	public static final Block WALLG_INDENT_A = new WallRotatables("wallg_indent_a", Material.ROCK);
	public static final Block WALLG_INDENT_A1 = new WallRotatables("wallg_indent_a1", Material.ROCK);
	public static final Block WALLG_INDENT_A2 = new WallRotatables("wallg_indent_a2", Material.ROCK);
	
	public static final Block WALLA_INDENT_B = new WallRotatables("walla_indent_b", Material.ROCK);
	public static final Block WALLB_INDENT_B = new WallRotatables("wallb_indent_b", Material.ROCK);
	public static final Block WALLB_INDENT_B1 = new WallRotatables("wallb_indent_b1", Material.ROCK);
	public static final Block WALLB_INDENT_B2 = new WallRotatables("wallb_indent_b2", Material.ROCK);
	public static final Block WALLC_INDENT_B = new WallRotatables("wallc_indent_b", Material.ROCK);
	public static final Block WALLC_INDENT_B1 = new WallRotatables("wallc_indent_b1", Material.ROCK);
	public static final Block WALLC_INDENT_B2 = new WallRotatables("wallc_indent_b2", Material.ROCK);
	public static final Block WALLD_INDENT_B = new WallRotatables("walld_indent_b", Material.ROCK);
	public static final Block WALLD_INDENT_B1 = new WallRotatables("walld_indent_b1", Material.ROCK);
	public static final Block WALLD_INDENT_B2 = new WallRotatables("walld_indent_b2", Material.ROCK);
	public static final Block WALLE_INDENT_B = new WallRotatables("walle_indent_b", Material.ROCK);
	public static final Block WALLE_INDENT_B1 = new WallRotatables("walle_indent_b1", Material.ROCK);
	public static final Block WALLE_INDENT_B2 = new WallRotatables("walle_indent_b2", Material.ROCK);
	public static final Block WALLF_INDENT_B = new WallRotatables("wallf_indent_b", Material.ROCK);
	public static final Block WALLF_INDENT_B1 = new WallRotatables("wallf_indent_b1", Material.ROCK);
	public static final Block WALLF_INDENT_B2 = new WallRotatables("wallf_indent_b2", Material.ROCK);
	public static final Block WALLG_INDENT_B = new WallRotatables("wallg_indent_b", Material.ROCK);
	public static final Block WALLG_INDENT_B1 = new WallRotatables("wallg_indent_b1", Material.ROCK);
	public static final Block WALLG_INDENT_B2 = new WallRotatables("wallg_indent_b2", Material.ROCK);
	
	//public static final Block WALL_INDENT_A = new BlockBase("wall_indent_a", Material.ROCK);
	//public static final Block WALL_INDENT_A1 = new BlockBase("wall_indent_a1", Material.ROCK);
	//public static final Block WALL_INDENT_A2 = new BlockBase("wall_indent_a2", Material.ROCK);
	
	public static final Block PUDDLE_106 = new LarryPuddle();
	public static final Block METAL_PANEL_1 = new MetalBlock("mp1", Material.IRON);
	public static final Block METAL_PANEL_2 = new MetalBlock("mp2", Material.IRON);
	public static final Block METAL_PANEL_3 = new MetalBlock("mp3", Material.IRON);
	public static final Block METAL_PANEL_4 = new MetalBlock("mp4", Material.IRON);
	public static final Block LQ_METAL_PANEL_1 = new MetalBlock("lq_mp1", Material.IRON);
	public static final Block LQ_METAL_PANEL_2 = new MetalBlock("lq_mp2", Material.IRON);
	public static final Block LQ_METAL_PANEL_3 = new MetalBlock("lq_mp3", Material.IRON);
	public static final Block LQ_METAL_PANEL_4 = new MetalBlock("lq_mp4", Material.IRON);
	public static final Block METAL_PANEL = new MetalBlock("metal_panel", Material.IRON);
	public static final Block METAL_FLOOR_B = new MetalBlock("metal_floor_b", Material.IRON);
	public static final Block HARD_METAL_WALL_B = new MetalBlock("hard_metal_wall_b", Material.IRON);
	
	public static final Block METAL_FLOOR_TOP = new MetalPanelTop("metal_panel_top");
	
	//Blood blocks
	public static final Block BLOOD = new BloodBlock("scp173_chamber_blood", Material.CLAY);
	
}
