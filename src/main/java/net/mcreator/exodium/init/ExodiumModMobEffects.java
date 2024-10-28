
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.exodium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.exodium.potion.SkadikursMobEffect;
import net.mcreator.exodium.potion.InternalbleedingMobEffect;
import net.mcreator.exodium.potion.CooldownMobEffect;
import net.mcreator.exodium.ExodiumMod;

public class ExodiumModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ExodiumMod.MODID);
	public static final RegistryObject<MobEffect> SKADIKURS = REGISTRY.register("skadikurs", () -> new SkadikursMobEffect());
	public static final RegistryObject<MobEffect> COOLDOWN = REGISTRY.register("cooldown", () -> new CooldownMobEffect());
	public static final RegistryObject<MobEffect> INTERNALBLEEDING = REGISTRY.register("internalbleeding", () -> new InternalbleedingMobEffect());
}
