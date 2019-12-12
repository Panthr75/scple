package com.fluffydoggomods.scplockdownextras;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.lang.reflect.Constructor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;

import com.fluffydoggomods.scplockdownextras.gui.GUIDocumentReader;
import com.fluffydoggomods.scplockdownextras.gui.GUIDocumentSCP500;
import com.fluffydoggomods.scplockdownextras.gui.GUIHandler;
import com.fluffydoggomods.scplockdownextras.init.Mod914Recipes;
import com.fluffydoggomods.scplockdownextras.init.ModItems;
import com.fluffydoggomods.scplockdownextras.init.ModRecipes;
import com.fluffydoggomods.scplockdownextras.proxy.CommonProxy;
import com.fluffydoggomods.scplockdownextras.tabs.ScpLeTabBlocks;
import com.fluffydoggomods.scplockdownextras.tabs.ScpLeTabDocuments;
import com.fluffydoggomods.scplockdownextras.tabs.ScpLeTabItems;
import com.fluffydoggomods.scplockdownextras.tabs.ScpLeTabSCPS;
import com.fluffydoggomods.scplockdownextras.tabs.ScpLeTabSoundBlocks;
import com.fluffydoggomods.scplockdownextras.util.NetworkMessage;
import com.fluffydoggomods.scplockdownextras.util.Reference;
import com.fluffydoggomods.scplockdownextras.util.handlers.ConfigHandler;
import com.fluffydoggomods.scplockdownextras.util.handlers.DocumentHandler;
import com.fluffydoggomods.scplockdownextras.util.handlers.RegistryHandler;

import io.netty.handler.logging.LogLevel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	public static Logger log = LogManager.getLogger(Reference.MOD_ID);
	
	public static final SimpleNetworkWrapper PACKET_HANDLER = NetworkRegistry.INSTANCE.newSimpleChannel("scple");
	
	public static final CreativeTabs scptab = new ScpLeTabSCPS();
	public static final CreativeTabs itemstab = new ScpLeTabItems();
	public static final CreativeTabs blockstab = new ScpLeTabBlocks();
	public static final CreativeTabs documenttab = new ScpLeTabDocuments();
	public static final CreativeTabs soundblocktab = new ScpLeTabSoundBlocks();
	public static final DocumentHandler documenthandler = new DocumentHandler();
	
	private static List<NetworkMessage> messages = new ArrayList<NetworkMessage>();
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	
	// LOGGING UTILS
	public static void info(Object message) 
	{
		log.info(message);
	}
	
	public static void debug(Object message)
	{
		if (Reference.DEBUG == true) 
		{
			log.info("[DEBUG]: " + message);
		}
	}
	
	public static void warn(Object message)
	{
		log.warn(message);
	}
	
	public static void error(Object message)
	{
		log.error(message);
	}
	
	
	public static void registerMessage(int guiID, Side side)
	{
		Constructor gui = GUIHandler.getGUI(guiID, false);
		debug("Gui class: " + gui.getDeclaringClass().getName());
		
		if (gui != null) 
		{
			debug("Gui was not null!");
			messages.add(new NetworkMessage(gui.getDeclaringClass(), side));
		}
	}
	
	// EVENTS
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		//documenthandler.Init();
		
		//## CONFIG
		File configFile = event.getSuggestedConfigurationFile();
		ConfigHandler.configExists = configFile.exists();
		ConfigHandler.config = new Configuration(configFile);
		ConfigHandler.config.load();
		ConfigHandler.Refresh();
		
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GUIHandler());
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		//RegistryHandler.initRegistries();
		ModRecipes.init();
		int messageID = 0;
		for (NetworkMessage message : messages)
		{
			debug("Added a network message");
			PACKET_HANDLER.registerMessage(message.messageHandler, message.messageType, messageID, message.side);
			messageID++;
		}
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		Mod914Recipes.Init();
		//documenthandler.PostInit();
	}
	
	@EventHandler
	public static void worldLoad(PlayerLoggedInEvent event) 
	{
		RegistryHandler.worldLoad(event);
	}
	
	@EventHandler
	public static void serverInit(FMLServerStartingEvent event) 
	{
		event.registerServerCommand(new CommandSCPLE());
	}
}
