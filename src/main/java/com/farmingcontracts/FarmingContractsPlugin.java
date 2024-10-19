package com.farmingcontracts;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

@Slf4j
@PluginDescriptor(
	name = "Farming Contracts"
)
public class FarmingContractsPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private FarmingContractsOverlay overlay;

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
		Player player = client.getLocalPlayer();
		if (player == null) {
			return false;
		}

		WorldPoint location = player.getWorldLocation();
		int x = location.getX();
		int y = location.getY();

		return x >= 1222 && x <= 1277 && y >= 3718 && y <= 3790;
	}

	public String getCropState(PatchState patchState) {
		return patchState.forVarbitValue(client.getVarbitValue(patchState.getVarbit()));
	}
}
