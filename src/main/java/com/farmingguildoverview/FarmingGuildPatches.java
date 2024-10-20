package com.farmingguildoverview;

import java.util.List;

public class FarmingGuildPatches {
    protected static final List<PatchState> patches;

    static {
        patches = List.of(
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
