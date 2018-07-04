package twilightforest.world;

import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerSmooth;
import net.minecraft.world.gen.layer.GenLayerVoronoiZoom;
import net.minecraft.world.gen.layer.GenLayerZoom;
import twilightforest.biomes.TFBiomes;
import twilightforest.world.layer.GenLayerTFBiomeStabilize;
import twilightforest.world.layer.GenLayerTFBiomes;
import twilightforest.world.layer.GenLayerTFCompanionBiomes;
import twilightforest.world.layer.GenLayerTFKeyBiomes;
import twilightforest.world.layer.GenLayerTFRiverMix;
import twilightforest.world.layer.GenLayerTFStream;
import twilightforest.world.layer.GenLayerTFThornBorder;

import java.util.Arrays;

public class TFBiomeProvider extends BiomeProvider {

	private final TFBiomeCache mapCache;

	public TFBiomeProvider(World world) {
		getBiomesToSpawnIn().clear();
		getBiomesToSpawnIn().add(TFBiomes.twilightForest);
		getBiomesToSpawnIn().add(TFBiomes.denseTwilightForest);
		getBiomesToSpawnIn().add(TFBiomes.clearing);
		getBiomesToSpawnIn().add(TFBiomes.tfSwamp);
		getBiomesToSpawnIn().add(TFBiomes.mushrooms);

		makeLayers(world.getSeed());
		mapCache = new TFBiomeCache(this, 512, true);
	}

	private void makeLayers(long seed) {
		GenLayer biomes = new GenLayerTFBiomes(1L);
		biomes = new GenLayerTFKeyBiomes(1000L, biomes);
		biomes = new GenLayerTFCompanionBiomes(1000L, biomes);

		biomes = new GenLayerZoom(1000L, biomes);
		biomes = new GenLayerZoom(1001, biomes);

		biomes = new GenLayerTFBiomeStabilize(700L, biomes);

		biomes = new GenLayerTFThornBorder(500L, biomes);

		biomes = new GenLayerZoom(1002, biomes);
		biomes = new GenLayerZoom(1003, biomes);
		biomes = new GenLayerZoom(1004, biomes);
		biomes = new GenLayerZoom(1005, biomes);

		GenLayer riverLayer = new GenLayerTFStream(1L, biomes);
		riverLayer = new GenLayerSmooth(7000L, riverLayer);
		biomes = new GenLayerTFRiverMix(100L, biomes, riverLayer);

		// do "voronoi" zoom
		GenLayer genlayervoronoizoom = new GenLayerVoronoiZoom(10L, biomes);

		biomes.initWorldGenSeed(seed);
		genlayervoronoizoom.initWorldGenSeed(seed);

		genBiomes = biomes;
		biomeIndexLayer = genlayervoronoizoom;
	}

	@Override
	public Biome[] getBiomesForGeneration(Biome[] biomes, int x, int z, int width, int height) {
		return getBiomesForGeneration(biomes, x, z, width, height, true);
	}

	public Biome[] getBiomesForGeneration(Biome[] biomes, int x, int z, int width, int height, boolean useCache) {
		// for grid-centred magic maps, get from map cache
		if (useCache && mapCache.isGridAligned(x, z, width, height)) {
			Biome[] cached = mapCache.getBiomes(x, z);
			return Arrays.copyOf(cached, cached.length);
		}
		return super.getBiomesForGeneration(biomes, x, z, width, height);
	}

	@Override
	public void cleanupCache() {
		mapCache.cleanup();
		super.cleanupCache();
	}
}
