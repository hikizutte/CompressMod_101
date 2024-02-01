package com.hikizutte.compressmod.regi;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CompressModTab extends ItemGroup{

	public CompressModTab() {
		super("compressmod");
		// TODO 自動生成されたコンストラクター・スタブ
		
		
	}

	@Override
	public ItemStack makeIcon() {
		
		// TODO 自動生成されたメソッド・スタブ
		ItemStack itemStack = new ItemStack(CompressModBlocks.COMPRESSED_COBBLESTONE);
		
		return itemStack;
	}
	
}
