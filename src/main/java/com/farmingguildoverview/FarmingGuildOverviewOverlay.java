package com.farmingguildoverview;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
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
        panelComponent.getChildren().clear();

        if (!plugin.isInFarmingGuild()) {
            return null;
        }

        List<LineComponent> visibleLines = new ArrayList<>();
        for (PatchState patch : FarmingGuildPatches.patches) {
            String state = plugin.getCropState(patch);

            if (!shouldShowPatch(state)) {
                continue;
            }

            visibleLines.add(
                LineComponent.builder()
                    .left(patch.getName())
                    .right(state)
                    .rightColor(colorFor(state))
                    .build()
            );
        }

        if (visibleLines.isEmpty()) {
            return null;
        }

        panelComponent.getChildren().add(
            TitleComponent.builder()
                .text("Farming Guild overview")
                .color(Color.WHITE)
                .build()
        );

        panelComponent.getChildren().addAll(visibleLines);

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

    private boolean shouldShowPatch(String state) {
        switch (state) {
            case "Empty":
            case "-":
                return config.showEmpty();
            case "Growing":
            case "Completed":
                return config.showGrowingComplete();
            default:
                return true;
        }
    }
}
