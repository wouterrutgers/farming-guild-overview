package com.farmingguildoverview;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

@Slf4j
@PluginDescriptor(
	name = "Farming Guild Overview"
)
public class FarmingGuildOverviewPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private FarmingGuildOverviewConfig config;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private FarmingGuildOverviewOverlay overlay;

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(overlay);
	}

	@Override
	protected void shutDown()
	{
		overlayManager.remove(overlay);
	}

	public boolean isInFarmingGuild() {
		WorldPoint playerLocation = client.getLocalPlayer().getWorldLocation();

		return playerLocation.getRegionID() == 4922;
	}

	public String getCropState(PatchState patchState) {
		return patchState.forVarbitValue(client.getVarbitValue(patchState.getVarbit()));
	}

	@Provides
	FarmingGuildOverviewConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(FarmingGuildOverviewConfig.class);
	}
}
