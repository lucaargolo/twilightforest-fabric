package twilightforest.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

import twilightforest.extensions.IBlockMethods;
import twilightforest.item.TFItems;

import java.util.Random;

public class UberousSoilBlock extends Block implements BonemealableBlock, IBlockMethods {
	protected UberousSoilBlock(Properties props) {
		super(props);
	}

	@Override
	public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable) {
		if (direction != Direction.UP)
			return false;
		IPlantable.PlantType plantType = plantable.getPlantType(world, pos.relative(direction));
		return plantType == IPlantable.PlantType.CROP || plantType == IPlantable.PlantType.PLAINS || plantType == IPlantable.PlantType.CAVE;
	}

	@Override
	public void neighborChanged(BlockState state, Level world, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
		BlockState above = world.getBlockState(pos.above());
		Material aboveMaterial = above.getMaterial();

		if (aboveMaterial.isSolid()) {
			world.setBlockAndUpdate(pos, Blocks.DIRT.defaultBlockState());
		}

		// todo should probably use IGrowable and loop until it can't grow anymore
		if (above.getBlock() instanceof IPlantable) {
			IPlantable plant = (IPlantable) above.getBlock();
			// revert to farmland or grass
			if (plant.getPlantType(world, pos.above()) == IPlantable.PlantType.CROP) {
				world.setBlockAndUpdate(pos, Blocks.FARMLAND.defaultBlockState().setValue(FarmBlock.MOISTURE, 2));
			} else if (plant.getPlantType(world, pos.above()) == IPlantable.PlantType.PLAINS) {
				world.setBlockAndUpdate(pos, Blocks.GRASS_BLOCK.defaultBlockState());
			} else {
				world.setBlockAndUpdate(pos, Blocks.DIRT.defaultBlockState());
			}
			// apply bonemeal
			BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), world, pos.above());
			BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), world, pos.above());
			BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), world, pos.above());
			BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), world, pos.above());
			// green sparkles
			world.levelEvent(2005, pos.above(), 0);
		}
	}

	@Override
	public void animateTick(BlockState state, Level level, BlockPos pos, Random rand) {
		if(level.isClientSide && rand.nextInt(5) == 0) {
			for(Player player : level.players()) {
				if (player.getMainHandItem().getItem().equals(TFItems.magic_beans) || player.getOffhandItem().getItem().equals(TFItems.magic_beans)) {
					for (int i = 0; i < 2; i++) {
						level.addParticle(ParticleTypes.HAPPY_VILLAGER, pos.getX() + rand.nextDouble(), pos.getY() + 1.25D, pos.getZ() + rand.nextDouble(), 0.0D, 0.0D, 0.0D);
					}
					break;
				}
			}
		}
	}

	@Override
	public boolean isValidBonemealTarget(BlockGetter world, BlockPos pos, BlockState state, boolean isClient) {
		return true;
	}

	@Override
	public boolean isBonemealSuccess(Level world, Random rand, BlockPos pos, BlockState state) {
		return true;
	}

	@Override
	public void performBonemeal(ServerLevel world, Random rand, BlockPos pos, BlockState state) {
		pos = pos.relative(Direction.Plane.HORIZONTAL.getRandomDirection(rand));

		Block blockAt = world.getBlockState(pos).getBlock();
		if (world.isEmptyBlock(pos.above()) && (blockAt == Blocks.DIRT || blockAt == Blocks.GRASS_BLOCK || blockAt == Blocks.FARMLAND)) {
			world.setBlockAndUpdate(pos, this.defaultBlockState());
		}
	}
}
