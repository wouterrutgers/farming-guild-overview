package com.farmingguildoverview;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class FarmingGuildOverviewPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(FarmingGuildOverviewPlugin.class);
		RuneLite.main(args);
	}
}