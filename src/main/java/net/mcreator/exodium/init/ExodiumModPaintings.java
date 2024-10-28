
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.exodium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.exodium.ExodiumMod;

public class ExodiumModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, ExodiumMod.MODID);
	public static final RegistryObject<PaintingVariant> ZXC = REGISTRY.register("zxc", () -> new PaintingVariant(32, 32));
}
