package rtg.world.biome.realistic.biomesoplenty;

import rtg.api.biome.BiomeConfig;
import rtg.world.gen.surface.biomesoplenty.SurfaceBOPAlps;
import rtg.world.gen.terrain.biomesoplenty.TerrainBOPAlps;
import biomesoplenty.api.biome.BOPBiomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class RealisticBiomeBOPAlps extends RealisticBiomeBOPBase
{	
	public static BiomeGenBase bopBiome = BOPBiomes.alps.get();
	
	public static Block topBlock = bopBiome.topBlock.getBlock();
	public static Block fillerBlock = bopBiome.fillerBlock.getBlock();
	
	public RealisticBiomeBOPAlps(BiomeConfig config)
	{
		super(config, 
			bopBiome, BiomeGenBase.frozenRiver,
			new TerrainBOPAlps(),
			new SurfaceBOPAlps(config, topBlock, fillerBlock, false, null, 0.45f)
		);
		this.generatesEmeralds = true;
	}
}
