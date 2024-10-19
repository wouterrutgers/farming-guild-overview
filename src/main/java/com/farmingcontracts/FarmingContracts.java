package com.farmingcontracts;

import java.util.List;
import java.util.Map;
import net.runelite.api.Varbits;

public class FarmingContracts {
    protected static final List<PatchState> contracts;

    static {
        contracts = List.of(
            PatchState.REDWOOD,
            PatchState.FRUIT_TREE,
            PatchState.CELASTRUS,
            PatchState.TREE,
            PatchState.HERB,
            PatchState.CACTUS,
            PatchState.ALLOTMENT_NORTH,
            PatchState.ALLOTMENT_SOUTH,
            PatchState.BUSH,
            PatchState.FLOWER
        );
    }
}
