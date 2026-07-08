package io.github.kongzhongtitian.ExURA;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ExURARecipeSerializers {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ExURA.MODID);

    public static final RegistryObject<RecipeSerializer<ResonatorRecipe>> RESONATOR_MACHINE_SERIALIZER =
            SERIALIZERS.register("resonator", () -> ResonatorRecipeSerializer.INSTANCE);
}
