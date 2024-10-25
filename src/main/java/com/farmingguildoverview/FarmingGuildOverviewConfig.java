package com.farmingguildoverview;

import java.awt.*;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup("farmingguildoverview")
public interface FarmingGuildOverviewConfig extends Config
{
    @ConfigSection(
        name = "Colors",
        description = "Colors for different crop states",
        position = 0
    )
    String colors = "colors";

    @ConfigItem(
        keyName = "diseased",
        name = "Diseased patches",
        description = "The color for diseased patches",
        section = colors
    )
    default Color diseased()
    {
        return Color.ORANGE;
    }

    @ConfigItem(
        keyName = "dead",
        name = "Dead patches",
        description = "The color for dead patches",
        section = colors
    )
    default Color dead()
    {
        return Color.RED;
    }

    @ConfigItem(
        keyName = "growing",
        name = "Growing patches",
        description = "The color for growing patches",
        section = colors
    )
    default Color growing()
    {
        return new Color(34, 139, 34);
    }

    @ConfigItem(
        keyName = "completed",
        name = "Completed patches",
        description = "The color for completed patches",
        section = colors
    )
    default Color completed()
    {
        return new Color(124, 252, 0);
    }

    @ConfigItem(
        keyName = "checked",
        name = "Checked patches",
        description = "The color for checked patches",
        section = colors
    )
    default Color checked()
    {
        return Color.WHITE;
    }

    @ConfigItem(
        keyName = "empty",
        name = "Empty patches",
        description = "The color for empty patches",
        section = colors
    )
    default Color empty()
    {
        return Color.WHITE;
    }
}
