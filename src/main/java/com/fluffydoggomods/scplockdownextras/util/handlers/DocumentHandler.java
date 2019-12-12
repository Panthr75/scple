package com.fluffydoggomods.scplockdownextras.util.handlers;

import java.util.ArrayList;
import java.util.List;

import javax.naming.NameNotFoundException;

import com.fluffydoggomods.scplockdownextras.Main;
import com.fluffydoggomods.scplockdownextras.init.ModItems;
import com.fluffydoggomods.scplockdownextras.util.Reference;

//import alexiy.secure.contain.protect.api.*;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;

import java.util.logging.Logger;

public class DocumentHandler
{
	//public final List<Document> DOCUMENTS = new ArrayList<Document>();
	
	//public List<SCPEntry> SCPEntries() {
	//	List<SCPEntry> entries = new ArrayList<SCPEntry>();
	//	for (Document document : DOCUMENTS) 
	//	{
	//		entries.add(document.entry);
	//	}
	//	return entries;
	//}
	
	//public Document RegisterDocument(String number, String structureName, SCPObjectClass objectClass, String itemName, ResourceLocation structureLocation)
	//{
	//	Document doc = new Document();
	//	CheckState(number != null, "A SCP Number is required");
	//	CheckState(structureName != null, "A structure name is required");
	//	CheckState(objectClass != null, "An SCPObjectClass is required");
	//	CheckState(itemName != null, "Document must originate from an item (the document)");
	//	CheckState(structureLocation != null, "A structureLocation is required");
	//	
	//	doc.number = number;
	//	doc.objectClass = objectClass;
	//	doc.structureLocation = structureLocation;
	//	doc.structureName = structureName;
	//	doc.itemName = itemName;
	//	
	//	DOCUMENTS.add(doc);
	//	return doc;
	//}
	
	//public void RegisterDocuments() 
	//{
	//	Main.info("Registering documents...");
	//	int registeredAmount = 0;
	//	/*
	//	for (Document document : DOCUMENTS) {
	//		SCPEntry.Builder builder = new SCPEntry.Builder();
	//		builder.info(document.number, document.structureName, document.objectClass);
	//		builder.structure(document.structureLocation, Rotation.NONE);
	//		document.entry = builder.build();
	//		
	//		Main.debug("Registered " + document.itemName);
	//		registeredAmount++;
	//	}*/
	//	Main.warn("Skipped registration!");
	//	Main.info("Registered " + registeredAmount + " document" + (registeredAmount == 1 ? "" : "s"));
	//}
	
	//public void PostInit() {
	//	Main.debug("Assigning items to documents");
	//	for (Document document : DOCUMENTS) 
	//	{
	//		try
	//		{
	//			document.RegisterItem();
	//		}
	//		catch(NameNotFoundException ex) 
	//		{
	//			Main.warn("Unable to get the item name for document containing " + document.structureName);
	//			document.valid = false;
	//		}
	//	}
	//	Main.debug("Finished assigning items!");
	//}
	
	private static void CheckState(boolean condition, String errorText) throws IllegalStateException 
	{
		if (!condition) throw new IllegalStateException(errorText);
	}
	
	//public static final class Document 
	//{
	//	private String number;
	//	private String structureName;
	//	private SCPObjectClass objectClass;
	//	private Item item;
	//	private boolean valid = true;
	//	private String itemName;
	//	private ResourceLocation structureLocation;
	//	private SCPEntry entry;
	//	
	//	public boolean IsValid() 
	//	{
	//		return valid;
	//	}
	//	
	//	private void RegisterItem() throws NameNotFoundException 
	//	{
	//		Item i = ModItems.GetItem(itemName);
	//		if (i == null) {
	//			throw new NameNotFoundException("Item name not found!");
	//		}
	//		else {
	//			item = i;
	//		}
	//	}
	//	
	//	private Document() 
	//	{
	//		
	//	}
	//	
	//	public SCPEntry GetSCPEntry() 
	//	{
	//		return entry;
	//	}
	//	
	//	public Item GetItem() 
	//	{
	//		return item;
	//	}
	//	
	//	public String GetStructureName()
	//	{
	//		return structureName;
	//	}
	//	
	//	public SCPObjectClass GetObjectClass()
	//	{
	//		return objectClass;
	//	}
	//	
	//	public String GetSCPNumber()
	//	{
	//		return number;
	//	}
	//	
	//	public ResourceLocation GetLocation() 
	//	{
	//		return structureLocation;
	//	}
	//}
	
	//public final Document SCP500 = RegisterDocument("500Bottle", "SCP-500 Containment Chamber", SCPObjectClass.SAFE, "document_500_containmentchamber", new ResourceLocation(Reference.MOD_ID, "structures/scp 500 containment chamber"));
	
	
}
