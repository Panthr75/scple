package com.fluffydoggomods.scplockdownextras.gui;

import org.lwjgl.opengl.GL11;

import com.fluffydoggomods.scplockdownextras.Main;
import com.fluffydoggomods.scplockdownextras.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.gen.structure.template.ITemplateProcessor;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class GUIDocumentSCP500 extends GuiContainer
{
	public int lookX;
	public int lookY;
	public int lookZ;
	public World world;
	public EntityPlayer player;
	public static ResourceLocation textureLocation = new ResourceLocation(Reference.MOD_ID, "textures/gui/documents/documentpopup.png");
	public static ResourceLocation containmentChamber = new ResourceLocation(Reference.MOD_ID, "structures/scp 500 containment chamber");
	
	public GUIDocumentSCP500(World worldIn, EntityPlayer playerIn)
	{
		super(new GUIDocumentContainer(worldIn, playerIn));
		world = worldIn;
		Vec3d look = playerIn.getLookVec();
		lookX = (int) Math.round(look.x);
		lookY = (int) Math.round(look.y);
		lookZ = (int) Math.round(look.z);
		
		xSize = 176;
		ySize = 125;
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2) 
	{
		fontRenderer.drawString("SCP 500", 70, 9, -16777216);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) 
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(textureLocation);
		int k = (width - xSize) / 2;
		int l = (height - ySize) / 2;
		this.drawTexturedModalRect(k, l, 0, 0, xSize, ySize);
		zLevel = 100.0F;
	}
	
	@Override
	protected void actionPerformed(GuiButton button) 
	{
		Main.info("Running action performed...");
		Main.PACKET_HANDLER.sendToServer(new GUIButtonPress(button.id));
	}

	
	@Override
	public void initGui()
	{
		super.initGui();
		guiLeft = (width - 176) / 2;
		guiTop = (height - 125) / 2;
		buttonList.clear();
		buttonList.add(new GuiButton(0, guiLeft + 7, guiTop + 99, 162, 20, "Read Document"));
		buttonList.add(new GuiButton(1, guiLeft + 7, guiTop + 45, 162, 20, "Spawn Containment Chamber"));
		buttonList.add(new GuiButton(2, guiLeft + 7, guiTop + 72, 162, 20, "Spawn Hallway"));
	}
	
	public static class GUIButtonPressHandler implements IMessageHandler<GUIButtonPress, IMessage>
	{
		@Override
		public IMessage onMessage(GUIButtonPress message, MessageContext context)
		{
			EntityPlayerMP entity = context.getServerHandler().player;
			entity.getServerWorld().addScheduledTask(() -> 
			{
				World world = entity.world;
				int buttonID = message.buttonID;
				
				if (buttonID == 0)
				{
					//TODO: Read Document
					Main.info("Reading document");
					entity.openGui(Main.instance, 1, world, (int) entity.posX, (int) entity.posY, (int) entity.posZ);
				}
				else if (buttonID == 1)
				{
					//TODO: Spawn Containment Chamber
					if (entity.isSneaking()) 
					{
						entity.sendMessage(new TextComponentString(TextFormatting.YELLOW + "This feature has not been implemented yet..."));
					}
					else
					{
						Main.info("Adding structure to world");
						ResourceLocation loc = new ResourceLocation("scple:structures/scp_500_containment_chamber");
						TemplateManager manager = ((WorldServer) world).getStructureTemplateManager();
						Main.info("Read template bool: " + manager.readTemplate(loc));
						Template chamberTemplate = manager.get(world.getMinecraftServer(), loc);
						//ITemplateProcessor a = new ITemplateProcessor();
						int rotation = (int) Math.round(entity.cameraYaw / 4);
						Rotation structureRotation = Rotation.NONE;
						if (rotation == 1)
						{
							structureRotation = Rotation.CLOCKWISE_90;
						}
						else if (rotation == 2)
						{
							structureRotation = Rotation.CLOCKWISE_180;
						}
						else if (rotation == 3)
						{
							structureRotation = Rotation.COUNTERCLOCKWISE_90;
						}
						else if (rotation == 4)
						{
							structureRotation = Rotation.NONE;
						}
						BlockPos spawnTo = new BlockPos((int) entity.posX, (int) entity.posY, (int) entity.posZ);
						IBlockState state = world.getBlockState(spawnTo);
						Main.info("Rotation: " + structureRotation);
						Main.info("POS: (" + entity.posX + ", " + entity.posY + ", " + entity.posZ + ")");
						Main.info("SPAWN POS: (" + spawnTo.getX() + ", " + spawnTo.getY() + ", " + spawnTo.getZ() + ")");
						Main.info("CHAMBER: " + loc.getResourcePath());
						Main.info("Template null: " + chamberTemplate == null);
						Main.info("Template author: " /*+ chamberTemplate.getAuthor()*/);
						chamberTemplate.addBlocksToWorld((WorldServer) world, spawnTo, new PlacementSettings()
								.setIgnoreStructureBlock(false)
								.setIgnoreEntities(false)
								.setReplacedBlock(null)
								.setMirror(Mirror.NONE)
								.setRotation(structureRotation)
								.setChunk(null));
					}
				}
				else if (buttonID == 2)
				{
					//TODO: Spawn Hallway
					Main.info("Adding hallway to world");
				}
			});
			return null;
		}
	}
	
	public static class GUIButtonPress implements IMessage
	{
		int buttonID;
		
		public GUIButtonPress() {}
		
		public GUIButtonPress(int buttonID) 
		{
			this.buttonID = buttonID;
		}

		@Override
		public void toBytes(io.netty.buffer.ByteBuf buf) 
		{
			buf.writeInt(buttonID);
		}

		@Override
		public void fromBytes(io.netty.buffer.ByteBuf buf) 
		{
			buttonID = buf.readInt();
		}

	}
}
