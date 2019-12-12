package com.fluffydoggomods.scplockdownextras.util.handlers;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler 
{
	public static Configuration config;
	public static boolean configExists;
	
	// Config Values
	public static boolean soundblocks;
	
	
	// Methods
	public static void Refresh()
	{
		String category;
		
		category = "features";
		soundblocks = config.getBoolean("soundblocks_enabled", category, true, "Whether Sound Blocks should be enabled (Requires restart if changed)");
	}
}
