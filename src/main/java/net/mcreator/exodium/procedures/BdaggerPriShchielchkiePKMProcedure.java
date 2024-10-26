package net.mcreator.exodium.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.exodium.init.ExodiumModMobEffects;

public class BdaggerPriShchielchkiePKMProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(ExodiumModMobEffects.COOLDOWN.get()))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ExodiumModMobEffects.COOLDOWN.get(), 300, 1));
			entity.setDeltaMovement(new Vec3((8 * entity.getLookAngle().x), (8 * entity.getLookAngle().y), (8 * entity.getLookAngle().z)));
		}
	}
}
