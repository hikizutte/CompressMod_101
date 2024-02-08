package com.hikizutte.compressmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockCompressedDiamondBlock extends Block {

	public BlockCompressedDiamondBlock() {
		super(Properties
				.of(Material.METAL)
				.strength(6F, 7F)
				.harvestTool(ToolType.PICKAXE)
				.harvestLevel(2)
				.sound(SoundType.METAL)
				//.requiresCorrectToolForDrops()
			);
		
		this.setRegistryName("compressed_diamond_block");
	}
}
