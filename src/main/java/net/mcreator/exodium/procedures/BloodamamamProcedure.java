package net.mcreator.exodium.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.exodium.network.ExodiumModVariables;

public class BloodamamamProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(ExodiumModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ExodiumModVariables.PlayerVariables())).bloodbar + 10;
			entity.getCapability(ExodiumModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.bloodbar = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
