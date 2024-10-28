package net.mcreator.exodium.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.exodium.network.ExodiumModVariables;
import net.mcreator.exodium.init.ExodiumModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SmertoybloodProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(ExodiumModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ExodiumModVariables.PlayerVariables())).bloodbar > 1) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ExodiumModMobEffects.INTERNALBLEEDING.get(), 60, 1));
		}
	}
}
