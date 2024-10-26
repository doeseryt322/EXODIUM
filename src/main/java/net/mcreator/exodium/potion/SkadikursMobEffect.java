
package net.mcreator.exodium.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.exodium.procedures.SkadikursPriIstiechieniiEffiektaProcedure;

public class SkadikursMobEffect extends MobEffect {
	public SkadikursMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16711681);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		SkadikursPriIstiechieniiEffiektaProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
