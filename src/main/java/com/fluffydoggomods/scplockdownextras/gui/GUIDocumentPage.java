package com.fluffydoggomods.scplockdownextras.gui;

import org.lwjgl.opengl.GL11;

import com.fluffydoggomods.scplockdownextras.util.Reference;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class GUIDocumentPage
{
	private ResourceLocation textureLocation;
	
	public GUIDocumentPage(String documentName)
	{
		textureLocation = new ResourceLocation(Reference.MOD_ID, "textures/documents/document_" + documentName + ".png");
	}
	
	public GUIDocument getGUI(World worldIn, EntityPlayer playerIn)
	{
		return new GUIDocument(worldIn, playerIn);
	}
	
	
	
	private class GUIDocument extends GuiContainer
	{
		public GUIDocument(World worldIn, EntityPlayer playerIn)
		{
			super(new GUIDocumentContainer(worldIn, playerIn));
			
			xSize = 160;
			ySize = 226;
		}
		
		@Override
		protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) 
		{
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			mc.renderEngine.bindTexture(textureLocation);
			int k = (width - xSize) / 2;
			int l = (height - ySize) / 2;
			drawTexturedModalRect(k, l, 0, 0, xSize, ySize);
			zLevel = 100.0F;
		}
		
		@Override
		public void initGui()
		{
			super.initGui();
			guiLeft = (width - xSize) / 2;
			guiTop = (height - ySize) / 2;
		}
	}
}
