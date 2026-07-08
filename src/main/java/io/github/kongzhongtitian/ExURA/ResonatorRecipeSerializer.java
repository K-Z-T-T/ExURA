package io.github.kongzhongtitian.ExURA;

public class ResonatorRecipeSerializer extends InputOutputRecipeSerializer<ResonatorRecipe> {
    public static final ResonatorRecipeSerializer INSTANCE = new ResonatorRecipeSerializer();

    public ResonatorRecipeSerializer() {
        super(data -> new ResonatorRecipe(data.inputs, data.outputs, data.id, data.processingTime), 2, 1);
    }

}
