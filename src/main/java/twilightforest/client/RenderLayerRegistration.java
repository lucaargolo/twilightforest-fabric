package twilightforest.client;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import twilightforest.block.TFBlocks;

public class RenderLayerRegistration {
	public static void init() {
		RenderType cutoutMipped = RenderType.cutoutMipped();
		RenderType cutout = RenderType.cutout();
		RenderType translucent = RenderType.translucent();
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.oak_leaves, cutoutMipped);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.rainboak_leaves, cutoutMipped);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.canopy_leaves, cutoutMipped);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.mangrove_leaves, cutoutMipped);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.time_leaves, cutoutMipped);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.transformation_leaves, cutoutMipped);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.mining_leaves, cutoutMipped);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.sorting_leaves, cutoutMipped);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.time_door, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.sort_door, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.time_trapdoor, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.sort_trapdoor, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.twilight_portal, translucent);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.auroralized_glass, translucent);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.thorn_rose, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.fiery_block, translucent);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.thorn_leaves, cutoutMipped);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.beanstalk_leaves, cutoutMipped);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.giant_leaves, cutoutMipped);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.experiment_115, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.wispy_cloud, translucent);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.uberous_soil, translucent);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.trollvidr, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.unripe_trollber, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.trollber, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.huge_lilypad, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.huge_waterlily, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.castle_rune_brick_yellow, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.castle_rune_brick_purple, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.castle_rune_brick_pink, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.castle_rune_brick_blue, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.castle_door_yellow, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.castle_door_purple, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.castle_door_pink, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.castle_door_blue, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.green_thorns, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.brown_thorns, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.burnt_thorns, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.twilight_portal_miniature_structure, cutout);
//		RenderTypeLookup.setRenderLayer(TFBlocks.hedge_maze_miniature_structure, cutout);
//		RenderTypeLookup.setRenderLayer(TFBlocks.hollow_hill_miniature_structure, cutout);
//		RenderTypeLookup.setRenderLayer(TFBlocks.quest_grove_miniature_structure, cutout);
//		RenderTypeLookup.setRenderLayer(TFBlocks.mushroom_tower_miniature_structure, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.naga_courtyard_miniature_structure, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.lich_tower_miniature_structure, cutout);
//		RenderTypeLookup.setRenderLayer(TFBlocks.minotaur_labyrinth_miniature_structure, cutout);
//		RenderTypeLookup.setRenderLayer(TFBlocks.hydra_lair_miniature_structure, cutout);
//		RenderTypeLookup.setRenderLayer(TFBlocks.goblin_stronghold_miniature_structure, cutout);
//		RenderTypeLookup.setRenderLayer(TFBlocks.dark_tower_miniature_structure, cutout);
//		RenderTypeLookup.setRenderLayer(TFBlocks.yeti_cave_miniature_structure, cutout);
//		RenderTypeLookup.setRenderLayer(TFBlocks.aurora_palace_miniature_structure, cutout);
//		RenderTypeLookup.setRenderLayer(TFBlocks.troll_cave_cottage_miniature_structure, cutout);
//		RenderTypeLookup.setRenderLayer(TFBlocks.final_castle_miniature_structure, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.trophy_pedestal, translucent);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.stone_twist_thin, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.candelabra, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.fiery_block, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.firefly_jar, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.firefly_spawner, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.cicada_jar, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.moss_patch, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.mayapple, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.clover_patch, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.fiddlehead, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.mushgloom, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.torchberry_plant, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.root_strand, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.fallen_leaves, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.uncrafting_table, translucent);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.encased_smoker, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.encased_fire_jet, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.oak_sapling, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.rainboak_sapling, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.canopy_sapling, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.mangrove_sapling, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.darkwood_sapling, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.hollow_oak_sapling, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.time_sapling, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.transformation_sapling, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.mining_sapling, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.sorting_sapling, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.built_block, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.antibuilt_block, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.reactor_debris, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.force_field_pink, translucent);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.force_field_blue, translucent);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.force_field_green, translucent);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.force_field_purple, translucent);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.force_field_orange, translucent);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.boss_spawner_naga, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.boss_spawner_lich, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.boss_spawner_hydra, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.boss_spawner_ur_ghast, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.boss_spawner_knight_phantom, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.boss_spawner_snow_queen, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.boss_spawner_minoshroom, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.boss_spawner_alpha_yeti, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.boss_spawner_final_boss, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.reappearing_block, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.locked_vanishing_block, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.vanishing_block, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.carminite_builder, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.antibuilder, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.carminite_reactor, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.ghast_trap, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.potted_twilight_oak_sapling, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.potted_canopy_sapling, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.potted_mangrove_sapling, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.potted_darkwood_sapling, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.potted_hollow_oak_sapling, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.potted_rainboak_sapling, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.potted_time_sapling, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.potted_trans_sapling, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.potted_mine_sapling, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.potted_sort_sapling, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.potted_mayapple, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.potted_fiddlehead, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.potted_mushgloom, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.potted_thorn, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.potted_green_thorn, cutout);
		BlockRenderLayerMap.INSTANCE.putBlock(TFBlocks.potted_dead_thorn, cutout);
	}
}
