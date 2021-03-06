package com.teamabnormals.upgrade_aquatic.common.blocks;

import com.teamabnormals.upgrade_aquatic.core.registry.UABlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CoralWallFanBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class BlockUACoralWallFan extends CoralWallFanBlock {

	public BlockUACoralWallFan(Block deadState, Properties props) {
		super(deadState, props);
	}
	
	@Override
	public boolean isConduitFrame(BlockState state, IWorldReader world, BlockPos pos, BlockPos conduit) {
		return state.getBlock() == UABlocks.PRISMARINE_CORAL_WALL_FAN.get();
	}

}
