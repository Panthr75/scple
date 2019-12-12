package com.fluffydoggomods.scplockdownextras.gui;

import javax.annotation.ParametersAreNonnullByDefault;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

@ParametersAreNonnullByDefault
public class GUIDocumentReader extends GuiContainer
{
	
	public GUIDocumentReader(Container inventorySlotsIn) 
	{
		super(inventorySlotsIn);
		
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) 
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		
		int i = width - xSize >> 1;
		int j = height - ySize >> 1;
		
		String texture = "scple:gui/document/reader.png";
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(texture));
		
		drawTexturedModalRect(i, j, 0, 0, xSize, ySize);
	}
}
