package com.example.myoptimizationmod.mixin;

import net.minecraft.server.world.ServerChunkManager;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ServerChunkManager.class)
public class ChunkLoadingMixin {
    // Оптимизация загрузки чанков
}
