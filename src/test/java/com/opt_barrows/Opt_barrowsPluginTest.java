package com.opt_barrows;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class Opt_barrowsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(Opt_barrowsPlugin.class);
		RuneLite.main(args);
	}
}