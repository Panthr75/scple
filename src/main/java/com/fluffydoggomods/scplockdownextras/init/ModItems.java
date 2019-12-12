package com.fluffydoggomods.scplockdownextras.init;

import java.util.ArrayList;
import java.util.List;

import com.fluffydoggomods.scplockdownextras.Main;
import com.fluffydoggomods.scplockdownextras.items.Document;
import com.fluffydoggomods.scplockdownextras.items.GlueBottle;
import com.fluffydoggomods.scplockdownextras.items.ItemBase;
import com.fluffydoggomods.scplockdownextras.items.ItemBaseNoTab;
import com.fluffydoggomods.scplockdownextras.items.Pill;
import com.fluffydoggomods.scplockdownextras.items.PillBottle;
import com.fluffydoggomods.scplockdownextras.scps.SCP500;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import scala.Int;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static Item GetItem(String name) 
	{
		for (Item item : ITEMS) {
			if (item.getUnlocalizedName() == name) {
				return item;
			}
		}
		return null;
	}
	
	// Items
	public static final Item GLUE = new GlueBottle();
	public static final Item PILL = new Pill(false);
	public static final Item UPGRADED_PILL = new Pill(true);
	public static final Item PILL_BOTTLE = new PillBottle();
	
	// Documents
	public static final Item DOCUMENT = new Document("", -1, true);
	public static final Item DOCUMENT_500 = new Document("500", 0, false);
	//public static final Item DOCUMENT_500_CONTAINMENT_CHAMBER = new Document("500_containmentchamber", "", false);
	//public static final Item DOCUMENT_500_CONTAINMENT_CHAMBER_HALLWAY = new Document("500_containmentchamberhallway", "", false);
	
	// SCPS
	public static final Item SCP500 = new SCP500();
}
