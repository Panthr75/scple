package com.fluffydoggomods.scplockdownextras.gui;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.fluffydoggomods.scplockdownextras.Main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GUIHandler implements IGuiHandler
{	
	private static int pagesStart = 1;
	
	public static Constructor getGUI(int ID, boolean isServer) 
	{
		Class type = null;
		if (ID == 0) {
			if (isServer)
				type = GUIDocumentContainer.class;
			else
				type = GUIDocumentSCP500.class;
		}
		
		if (type != null) 
		{
			try 
			{
				return type.getConstructor(World.class, EntityPlayer.class);
			} 
			catch (NoSuchMethodException e) 
			{
				Main.error("GUI for class " + type.getName() + " is invalid!");
			} 
			catch (SecurityException e) 
			{
				Main.error("GUI for class " + type.getName() + " is not accessable!");
			}
		}
		return null;
	}
	
	private static Object getPageGUI(int ID, World worldIn, EntityPlayer playerIn, boolean isServer)
	{
		ID = ID - pagesStart;
		if (ID > -1)
		{
			if (isServer)
				return new GUIDocumentContainer(worldIn, playerIn);
			else 
			{
				if (ID == 0)
					return DocumentList.SCP_500.getGUI(worldIn, playerIn);
				else
					return null;
			}
		}
		else
			return null;
	}
	
	private Object getGUIElement(int ID, World world, EntityPlayer player, boolean isServer)
	{
		Constructor gui = getGUI(ID, isServer);
		if (gui != null)
			try {
				return gui.newInstance(world, player);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//return new GUIDocumentContainer(world, player);
		return null;
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if (ID < pagesStart)
			return getGUIElement(ID, world, player, true);
		else
			return getPageGUI(ID, world, player, true);
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if (ID < pagesStart)
			return getGUIElement(ID, world, player, false);
		else
			return getPageGUI(ID, world, player, false);
		//if (ID == 0)
		//	return new GUIDocumentSCP500(world, player);
		//return null;
	}
}