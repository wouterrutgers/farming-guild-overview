package com.farmingguildoverview;

import java.awt.*;
import javax.inject.Inject;
import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.TitleComponent;

public class FarmingGuildOverviewOverlay extends OverlayPanel {
    private final FarmingGuildOverviewPlugin plugin;

    private final FarmingGuildOverviewConfig config;

    @Inject
    public FarmingGuildOverviewOverlay(FarmingGuildOverviewPlugin plugin, FarmingGuildOverviewConfig config) {
        super(plugin);
        setPosition(OverlayPosition.TOP_LEFT);

        this.plugin = plugin;
        this.config = config;
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

        for (PatchState patch : FarmingGuildPatches.patches) {
            String state = plugin.getCropState(patch);

            panelComponent.getChildren().add(
                LineComponent.builder()
                    .left(patch.getName())
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
                return config.diseased();
            case "Dead":
                return config.dead();
            case "Growing":
                return config.growing();
            case "Completed":
                return config.completed();
            case "Checked":
                return config.checked();
            default:
                return config.empty();
        }
    }
}
