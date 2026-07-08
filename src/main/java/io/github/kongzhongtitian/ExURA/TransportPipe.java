package io.github.kongzhongtitian.ExURA;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TransportPipe extends Block {
    public TransportPipe() {
        super(BlockBehaviour.Properties.of()
                .strength(1.0F)
                .sound(SoundType.GLASS)
                .noOcclusion()
                .dynamicShape());
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext ctx) {
        // 中心柱体
        return Shapes.box(0.375, 0.375, 0.375, 0.625, 0.625, 0.625);
    }
}