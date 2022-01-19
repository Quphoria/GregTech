package gregtech.api.fluids.fluidType;

import net.minecraftforge.fluids.Fluid;

import javax.annotation.Nonnull;

public class FluidTypePlasma extends FluidType {

    public FluidTypePlasma(@Nonnull String name, @Nonnull String prefix, @Nonnull String suffix, @Nonnull String localization) {
        super(name, prefix, suffix, localization);
    }

    @Override
    protected void setFluidProperties(@Nonnull Fluid fluid) {
        fluid.setGaseous(true);
        fluid.setDensity(55536);
        fluid.setViscosity(10);
        fluid.setLuminosity(15);
    }
}
