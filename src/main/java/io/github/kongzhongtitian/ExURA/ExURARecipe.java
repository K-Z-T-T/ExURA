package io.github.kongzhongtitian.ExURA;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ExURARecipe {
    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES =
            DeferredRegister.create(Registries.RECIPE_TYPE, ExURA.MODID);

    public static final Supplier<RecipeType<ResonatorRecipe>>RESONATOR_RECIPE =
            RECIPE_TYPES.register(
                    "resonator_recipe",
                    () -> RecipeType.<ResonatorRecipe>simple(ResourceLocation.fromNamespaceAndPath(ExURA.MODID, "injection_machine_recipe"))
            );
}
