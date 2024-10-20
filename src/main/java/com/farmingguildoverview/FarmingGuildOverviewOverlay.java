package com.farmingguildoverview;

import java.awt.*;
import javax.inject.Inject;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

public class FarmingGuildOverviewOverlay extends OverlayPanel {
    private final FarmingGuildOverviewPlugin plugin;

    @Inject
    public FarmingGuildOverviewOverlay(FarmingGuildOverviewPlugin plugin) {
        super(plugin);
        setPosition(OverlayPosition.TOP_LEFT);

        this.plugin = plugin;
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        if (!plugin.isInFarmingGuild()) {
            return null;
        }

        panelComponent.getChildren().add(
            TitleComponent.builder()
                .text("Farming Guild Overview")
                .color(Color.WHITE)
                .build()
        );

        for (PatchState contract : FarmingGuildPatches.patches) {
            String state = plugin.getCropState(contract);

            panelComponent.getChildren().add(
                LineComponent.builder()
                    .left(contract.getName())
                    .right(state)
                    .rightColor(colorFor(state))
                    .build()
            );
        }

        panelComponent.setPreferredSize(new Dimension(180, 0));

        return super.render(graphics);
    }

    private Color colorFor(String color) {
        switch (color) {
            case "Diseased":
                return Color.ORANGE;
            case "Dead":
                return Color.RED;
            case "Growing":
                return new Color(34, 139, 34);
            case "Completed":
                return new Color(124, 252, 0);
            default:
                return Color.WHITE;
        }
    }
}
