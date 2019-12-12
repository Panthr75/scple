package com.fluffydoggomods.scplockdownextras.util;

import com.fluffydoggomods.scplockdownextras.Main;

import net.minecraftforge.fml.relauncher.Side;

public class NetworkMessage 
{
	public Class messageHandler = null;
	public Class messageType = null;
	public Side side;
	public NetworkMessage(Class mainClass, Side side)
	{
		for (Class subclass : mainClass.getClasses())
		{
			String name = subclass.getName();
			name = name.substring(name.lastIndexOf('$') + 1);
			Main.debug("Name: " + name);
			
			if (name.equals("GUIButtonPress"))
			{
				Main.debug("Found type");
				messageType = subclass;
			}
			else if (name.equals("GUIButtonPressHandler"))
			{
				Main.debug("Found handler");
				messageHandler = subclass;
			}
		}
		this.side = side;
	}
}
