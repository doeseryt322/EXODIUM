
package net.mcreator.exodium.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.exodium.procedures.InternalbleedingKazhdyiTikVoVriemiaEffiektaProcedure;

public class InternalbleedingMobEffect extends MobEffect {
	public InternalbleedingMobEffect() {
		super(MobEffectCategory.HARMFUL, -8912896);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		InternalbleedingKazhdyiTikVoVriemiaEffiektaProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
