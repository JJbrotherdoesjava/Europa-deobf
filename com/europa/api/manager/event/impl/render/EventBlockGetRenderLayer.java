/*
 * Decompiled with CFR 0.151.
 */
package com.europa.api.manager.event.impl.render;

import com.europa.api.manager.event.Event;
import net.minecraft.block.Block;
import net.minecraft.util.BlockRenderLayer;

public class EventBlockGetRenderLayer
extends Event {
    public BlockRenderLayer _layer;
    public Block _block;

    public EventBlockGetRenderLayer(Block block) {
        this._block = block;
    }

    public Block getBlock() {
        return this._block;
    }

    /*
     * WARNING - void declaration
     */
    public void setLayer(BlockRenderLayer blockRenderLayer) {
        void layer;
        this._layer = layer;
    }

    public BlockRenderLayer getBlockRenderLayer() {
        return this._layer;
    }
}

