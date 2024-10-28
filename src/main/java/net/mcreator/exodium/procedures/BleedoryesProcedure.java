package net.mcreator.exodium.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.exodium.network.ExodiumModVariables;

public class BleedoryesProcedure {
	public static void execute(LevelAccessor world) {
		ExodiumModVariables.MapVariables.get(world).SVO = 1;
		ExodiumModVariables.MapVariables.get(world).syncData(world);
	}
}
