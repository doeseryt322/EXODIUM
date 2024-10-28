package net.mcreator.exodium.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.exodium.network.ExodiumModVariables;

public class BleedornoProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		ExodiumModVariables.MapVariables.get(world).SVO = 0;
		ExodiumModVariables.MapVariables.get(world).syncData(world);
		{
			double _setval = (entity.getCapability(ExodiumModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ExodiumModVariables.PlayerVariables())).bloodbar + 0.05;
			entity.getCapability(ExodiumModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.bloodbar = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
