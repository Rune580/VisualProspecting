package com.sinthoras.visualprospecting.database;

import com.sinthoras.visualprospecting.Utils;
import com.sinthoras.visualprospecting.database.veintypes.VeinType;

public class OreVeinPosition {
    public final int chunkX;
    public final int chunkZ;
    public final VeinType veinType;

    public OreVeinPosition(int chunkX, int chunkZ, VeinType veinType) {
        this.chunkX = chunkX;
        this.chunkZ = chunkZ;
        this.veinType = veinType;
    }

    public int getBlockX() {
        return Utils.coordChunkToBlock(chunkX) + 8;
    }

    public int getBlockZ() {
        return Utils.coordChunkToBlock(chunkZ) + 8;
    }
}
