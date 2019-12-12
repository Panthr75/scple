package com.fluffydoggomods.scplockdownextras;

import java.util.List;

import com.fluffydoggomods.scplockdownextras.util.Reference;
import com.google.common.collect.Lists;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.ForgeHooks;
import scala.Console;

public class CommandSCPLE extends CommandBase 
{
	private final List<String> aliases = Lists.newArrayList(Reference.MOD_ID, "scple", "scplextras", "scplockdownextras", "scplockdowne", "securecontainprotectlockdownextras");
	public final List<String> commands = Lists.newArrayList(
		"version", 
		"discord", 
		"commands"
	);
	public final List<String> commandDescriptions = Lists.newArrayList(
		"Gets the current version of the Mod", 
		"The public discord server", 
		"Lists current commands"
	);
	
	@Override
	public String getName() 
	{
		return "scple";
	}

	@Override
	public String getUsage(ICommandSender sender) 
	{
		sender.sendMessage(new TextComponentString(TextFormatting.YELLOW + "scple <command>"));
		sender.sendMessage(new TextComponentString(TextFormatting.RED + "Use command 'scple commands' for a list of commands"));
		return "Use command 'scple commands' for a list of commands";
	}
	
	@Override
	public List<String> getAliases() 
	{
		return aliases;
	}

	
	@Override
	public boolean checkPermission(MinecraftServer server, ICommandSender sender) 
	{
		return true;
	}
	
	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException 
	{
		if (args.length < 1) {
			getUsage(sender); //no arguments
			return;
		}
		
		String scplecmd = args[0];
		sender.sendMessage(new TextComponentString(TextFormatting.BOLD + args[0]));
		if (scplecmd.equals("version")) 
		{
			if (Reference.VERSION != null) sender.sendMessage(new TextComponentString(TextFormatting.WHITE + "[SCP Lockdown Extras] " + TextFormatting.GOLD + "" + TextFormatting.BOLD + "VERSION: " + TextFormatting.RESET + "" + TextFormatting.UNDERLINE + Reference.VERSION));
			else sender.sendMessage(new TextComponentString(TextFormatting.WHITE + "[SCP Lockdown Extras] " + TextFormatting.RED + TextFormatting.BOLD + "WAS UNABLE TO FIND VERSION"));
		} 
		else if (scplecmd.equals("discord")) sender.sendMessage(new TextComponentString(TextFormatting.WHITE + "[SCP Lockdown Extras] " + TextFormatting.AQUA + TextFormatting.BOLD + "LINK: " + TextFormatting.RESET + TextFormatting.AQUA).appendSibling(ForgeHooks.newChatWithLinks("https://discord.gg/ajkqZhK/")));
		else if (scplecmd.equals("commands")) {
			sender.sendMessage(new TextComponentString(TextFormatting.WHITE + "[SCP Lockdown Extras] Commands:"));
			for (int i = 0; i < commands.size(); i++) sender.sendMessage(new TextComponentString(TextFormatting.BOLD + commands.get(i) + TextFormatting.RESET + TextFormatting.WHITE + " - " + commandDescriptions.get(i)));
		} 
		else sender.sendMessage(new TextComponentString(TextFormatting.RED + scplecmd + " does not exist. Try 'scple commands' for a list of commands"));
	}
}
