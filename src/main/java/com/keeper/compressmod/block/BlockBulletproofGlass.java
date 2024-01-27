package com.keeper.compressmod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockBulletproofGlass extends GlassBlock{
	
	public BlockBulletproofGlass() {
		super(AbstractBlock.Properties
				.of(Material.GLASS)
				.strength(3.5F, 20F)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(2)
				.sound(SoundType.GLASS)
				.requiresCorrectToolForDrops()
				.noOcclusion()

			);
		
		this.setRegistryName("bulletproof_glass");
	}
}
