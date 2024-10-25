
package net.mcreator.exodium.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.exodium.init.ExodiumModParticleTypes;
import net.mcreator.exodium.init.ExodiumModItems;
import net.mcreator.exodium.init.ExodiumModFluids;
import net.mcreator.exodium.init.ExodiumModFluidTypes;
import net.mcreator.exodium.init.ExodiumModBlocks;

public abstract class BloodFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ExodiumModFluidTypes.BLOOD_TYPE.get(), () -> ExodiumModFluids.BLOOD.get(), () -> ExodiumModFluids.FLOWING_BLOOD.get()).explosionResistance(100f)
			.tickRate(4).slopeFindDistance(2).bucket(() -> ExodiumModItems.BLOOD_BUCKET.get()).block(() -> (LiquidBlock) ExodiumModBlocks.BLOOD.get());

	private BloodFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return (SimpleParticleType) (ExodiumModParticleTypes.BLOOD_SPERMA.get());
	}

	public static class Source extends BloodFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends BloodFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
