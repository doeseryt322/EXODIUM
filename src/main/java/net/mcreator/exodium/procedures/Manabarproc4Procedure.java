package net.mcreator.exodium.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.exodium.network.ExodiumModVariables;

public class Manabarproc4Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(ExodiumModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ExodiumModVariables.PlayerVariables())).bloodbar >= 40) {
			return true;
		}
		return false;
	}
}
