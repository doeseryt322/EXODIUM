package net.mcreator.exodium.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.exodium.network.ExodiumModVariables;

public class IstoshenieyesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 0;
			entity.getCapability(ExodiumModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.istoshenie = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
