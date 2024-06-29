package com.allthemods.gravitas2.core.mixin;

import dev.latvian.mods.rhino.util.RemapPrefixForJS;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.StructurePiece;
import org.spongepowered.asm.mixin.Mixin;

import java.util.concurrent.atomic.AtomicReference;

@Mixin(StructurePiece.class)
@RemapPrefixForJS("greg_core$")
public class StructurePieceMixin {
    public AtomicReference<ResourceLocation> greg_core$tfcRockId = new AtomicReference<>();
    public AtomicReference<ResourceLocation> greg_core$tfcTreeId = new AtomicReference<>();
}
