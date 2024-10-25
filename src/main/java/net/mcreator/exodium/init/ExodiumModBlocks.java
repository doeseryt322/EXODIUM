
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.exodium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.exodium.block.BloodBornBlock;
import net.mcreator.exodium.block.BloodBlock;
import net.mcreator.exodium.ExodiumMod;

public class ExodiumModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ExodiumMod.MODID);
	public static final RegistryObject<Block> BLOOD = REGISTRY.register("blood", () -> new BloodBlock());
	public static final RegistryObject<Block> BLOOD_BORN = REGISTRY.register("blood_born", () -> new BloodBornBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
