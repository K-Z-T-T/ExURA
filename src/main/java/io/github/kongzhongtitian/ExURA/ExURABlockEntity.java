package io.github.kongzhongtitian.ExURA;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ExURABlockEntity {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, ExURA.MODID);


    public static final RegistryObject<BlockEntityType<WaterMillBlockEntity>> WATER_MILL_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("water_mill_block_entity",
                    () -> BlockEntityType.Builder.of(WaterMillBlockEntity::new, ExURABlocks.WATER_MILL.get()).build(null));

    public static final RegistryObject<BlockEntityType<ResonatorBlockEntity>> RESONATOR_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("resonator_block_entity",
                    () -> BlockEntityType.Builder.of(ResonatorBlockEntity::new, ExURABlocks.RESONATOR.get()).build(null));

    public static final RegistryObject<BlockEntityType<FireMillBlockEntity>> FIRE_MILL_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("fire_mill_block_entity",
                    () -> BlockEntityType.Builder.of(FireMillBlockEntity::new, ExURABlocks.FIRE_MILL.get()).build(null));

    public static final RegistryObject<BlockEntityType<DragonEggMillBlockEntity>> DRAGON_EGG_MILL_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("dragon_egg_mill_block_entity",
                    () -> BlockEntityType.Builder.of(DragonEggMillBlockEntity::new, ExURABlocks.DRAGON_EGG_MILL.get()).build(null));

    public static final RegistryObject<BlockEntityType<SolarPanelBlockEntity>> SOLAR_PANEL_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("solar_panel_block_entity",
                    () -> BlockEntityType.Builder.of(SolarPanelBlockEntity::new, ExURABlocks.SOLAR_PANEL.get()).build(null));

    public static final RegistryObject<BlockEntityType<LunarPanelBlockEntity>> LUNAR_PANEL_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("lunar_panel_block_entity",
                    () -> BlockEntityType.Builder.of(LunarPanelBlockEntity::new, ExURABlocks.LUNAR_PANEL.get()).build(null));

    public static final RegistryObject<BlockEntityType<LavaMillBlockEntity>> LAVA_MILL_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("lava_mill_block_entity",
                    () -> BlockEntityType.Builder.of(LavaMillBlockEntity::new, ExURABlocks.LAVA_MILL.get()).build(null));

    public static final RegistryObject<BlockEntityType<FurnaceGeneratorBlockEntity>> FURNACE_GENERATOR_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("furnace_generator_block_entity",
                    () -> BlockEntityType.Builder.of(
                            FurnaceGeneratorBlockEntity::new,
                            ExURABlocks.FURNACE_GENERATOR.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<SurvivalGeneratorBlockEntity>> SURVIVAL_GENERATOR_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("survival_generator_block_entity",
                    () -> BlockEntityType.Builder.of(
                            SurvivalGeneratorBlockEntity::new,
                            ExURABlocks.SURVIVAL_GENERATOR.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<OverclockedGeneratorBlockEntity>> OVERCLOCKED_GENERATOR_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("overclocked_generator_block_entity",
                    () -> BlockEntityType.Builder.of(
                            OverclockedGeneratorBlockEntity::new,
                            ExURABlocks.OVERCLOCKED_GENERATOR.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<DeathGeneratorBlockEntity>> DEATH_GENERATOR_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("death_generator_block_entity",
                    () -> BlockEntityType.Builder.of(
                            DeathGeneratorBlockEntity::new,
                            ExURABlocks.DEATH_GENERATOR.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<ExplosiveGeneratorBlockEntity>> EXPLOSIVE_GENERATOR_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("explosive_generator_block_entity",
                    () -> BlockEntityType.Builder.of(
                            ExplosiveGeneratorBlockEntity::new,
                            ExURABlocks.EXPLOSIVE_GENERATOR.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<EnderGeneratorBlockEntity>> ENDER_GENERATOR_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("ender_generator_block_entity",
                    () -> BlockEntityType.Builder.of(
                            EnderGeneratorBlockEntity::new,
                            ExURABlocks.ENDER_GENERATOR.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<HalitosisGeneratorBlockEntity>> HALITOSIS_GENERATOR_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("halitosis_generator_block_entity",
                    () -> BlockEntityType.Builder.of(
                            HalitosisGeneratorBlockEntity::new,
                            ExURABlocks.HALITOSIS_GENERATOR.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<NetherstarGeneratorBlockEntity>> NETHERSTAR_GENERATOR_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("netherstar_generator_block_entity",
                    () -> BlockEntityType.Builder.of(
                            NetherstarGeneratorBlockEntity::new,
                            ExURABlocks.NETHERSTAR_GENERATOR.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<FrostyGeneratorBlockEntity>> FROSTY_GENERATOR_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("frosty_generator_block_entity",
                    () -> BlockEntityType.Builder.of(
                            FrostyGeneratorBlockEntity::new,
                            ExURABlocks.FROSTY_GENERATOR.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<PinkGeneratorBlockEntity>> PINK_GENERATOR_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("pink_generator_block_entity",
                    () -> BlockEntityType.Builder.of(
                            PinkGeneratorBlockEntity::new,
                            ExURABlocks.PINK_GENERATOR.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<AutoExecutorBlockEntity>> AUTO_EXECUTOR_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("auto_executor_block_entity",
                    () -> BlockEntityType.Builder.of(
                            AutoExecutorBlockEntity::new,
                            ExURABlocks.AUTO_EXECUTOR.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<StoneDrumBlockEntity>> STONE_DRUM_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("stone_drum_block_entity",
                    () -> BlockEntityType.Builder.of(
                            StoneDrumBlockEntity::new,
                            ExURABlocks.STONE_DRUM.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<IronDrumBlockEntity>> IRON_DRUM_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("iron_drum_block_entity",
                    () -> BlockEntityType.Builder.of(
                            IronDrumBlockEntity::new,
                            ExURABlocks.IRON_DRUM.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<ReinforcedLargeDrumBlockEntity>> REINFORCED_LARGE_DRUM_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("reinforced_large_drum_block_entity",
                    () -> BlockEntityType.Builder.of(
                            ReinforcedLargeDrumBlockEntity::new,
                            ExURABlocks.REINFORCED_LARGE_DRUM.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<DemonicallyGargantuanDrumBlockEntity>> DEMONICALLY_GARGANTUAN_DRUM_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("demonically_gargantuan_drum_block_entity",
                    () -> BlockEntityType.Builder.of(
                            DemonicallyGargantuanDrumBlockEntity::new,
                            ExURABlocks.DEMONICALLY_GARGANTUAN_DRUM.get()
                    ).build(null));
}