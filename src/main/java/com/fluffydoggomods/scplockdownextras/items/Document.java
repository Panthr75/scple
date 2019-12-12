package com.fluffydoggomods.scplockdownextras.items;

import com.fluffydoggomods.scplockdownextras.Main;
import com.fluffydoggomods.scplockdownextras.init.ModItems;
import com.fluffydoggomods.scplockdownextras.util.IHasModel;
import com.fluffydoggomods.scplockdownextras.util.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraftforge.fml.relauncher.Side;
import scala.Console;

public class Document extends Item implements IHasModel
{
	public int documentID = -1;
	
	public Document(String name, int documentid, boolean isBase) 
	{
		String itemName = "document_" + name;
		if (isBase) itemName = "document";
		setUnlocalizedName(itemName);
		setRegistryName(itemName);
		//StructureName = structureName;
		//StructureLocation = new ResourceLocation(Reference.MOD_ID, "structures/" + StructureName);
		
		if (!isBase) 
		{
			setCreativeTab(Main.documenttab);
			documentID = documentid;
			Main.registerMessage(0, Side.SERVER);
		}
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) 
	{
		ItemStack item = playerIn.getHeldItem(handIn);
		
		if (documentID == -1) 
		{
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, item);
		}
		else
		{
			playerIn.openGui(Main.instance, documentID, worldIn, handIn.ordinal(), 0, 0);
			
			//if (playerIn.isSneaking()) {
			//	Main.debug("SNEAK ACTION");
			//	//playerIn.openGui(Main.instance, 1, worldIn, handIn.ordinal(), 0, 0);
			//	//SCPEntry.
			//}
			//else {
			//	playerIn.sendMessage(new TextComponentString(TextFormatting.YELLOW + "This feature has not been implemented yet..."));
			//	//TODO: Implement Structure Generator: https://www.youtube.com/watch?v=cq1wNwuGxu4
			//	//if (!playerIn.isCreative()) {
			//	//	item.setCount(item.getCount() - 1);
			//	//}
			//}
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
		}
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
