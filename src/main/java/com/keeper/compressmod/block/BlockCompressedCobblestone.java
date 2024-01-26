package com.keeper.compressmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockCompressedCobblestone extends Block{
	
	public BlockCompressedCobblestone() {
		super(Properties
				.of(Material.STONE)
				.strength(5F, 6F)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(2)
				.sound(SoundType.STONE)
				.requiresCorrectToolForDrops()
			);
		
		this.setRegistryName("compressed_cobblestone");
	}
}
