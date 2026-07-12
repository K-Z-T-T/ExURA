package io.github.kongzhongtitian.ExURA;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ExURABlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExURA.MODID);

    //深板岩矿石
    private static final BlockBehaviour.Properties METAL_DEEPSLATE_ORE_PROPERTIES =
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .sound(SoundType.METAL)
                    .strength(5.0F, 6.0F)
                    .requiresCorrectToolForDrops();

    public static final RegistryObject<Block> MAGICAL_WOOD = registerBlock("magical_wood",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> COMPRESSED_COBBLESTONE = registerBlock("compressed_cobblestone",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> DOUBLE_COMPRESSED_COBBLESTONE = registerBlock("double_compressed_cobblestone",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> TRIPLE_COMPRESSED_COBBLESTONE = registerBlock("triple_compressed_cobblestone",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> QUADRUPLE_COMPRESSED_COBBLESTONE = registerBlock("quadruple_compressed_cobblestone",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> QUINTUPLE_COMPRESSED_COBBLESTONE = registerBlock("quintuple_compressed_cobblestone",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> SEXTUPLE_COMPRESSED_COBBLESTONE = registerBlock("sextuple_compressed_cobblestone",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> SEPTUPLE_COMPRESSED_COBBLESTONE = registerBlock("septuple_compressed_cobblestone",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> OCTUPLE_COMPRESSED_COBBLESTONE = registerBlock("octuple_compressed_cobblestone",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> COMPRESSED_NETHERRACK = registerBlock("compressed_netherrack",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> DOUBLE_COMPRESSED_NETHERRACK = registerBlock("double_compressed_netherrack",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> TRIPLE_COMPRESSED_NETHERRACK = registerBlock("triple_compressed_netherrack",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> QUADRUPLE_COMPRESSED_NETHERRACK = registerBlock("quadruple_compressed_netherrack",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> QUINTUPLE_COMPRESSED_NETHERRACK = registerBlock("quintuple_compressed_netherrack",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> SEXTUPLE_COMPRESSED_NETHERRACK = registerBlock("sextuple_compressed_netherrack",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> COMPRESSED_SAND = registerBlock("compressed_sand",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> DOUBLE_COMPRESSED_SAND = registerBlock("double_compressed_sand",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> COMPRESSED_GRAVEL = registerBlock("compressed_gravel",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> DOUBLE_COMPRESSED_GRAVEL = registerBlock("double_compressed_gravel",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> COMPRESSED_DIRT = registerBlock("compressed_dirt",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> DOUBLE_COMPRESSED_DIRT = registerBlock("double_compressed_dirt",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> TRIPLE_COMPRESSED_DIRT = registerBlock("triple_compressed_dirt",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> QUADRUPLE_COMPRESSED_DIRT = registerBlock("quadruple_compressed_dirt",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> STONEBURNT = registerBlock("stoneburnt",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> POLISHED_STONE = registerBlock("polished_stone",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> CROSSED_STONE = registerBlock("crossed_stone",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> TRUCHET = registerBlock("truchet",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> BORDER_STONE = registerBlock("border_stone",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> BEDROCK_COBBLESTONE = registerBlock("bedrock_cobblestone",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> BEDROCK_SLABS = registerBlock("bedrock_slabs",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> BEDROCK_BRICKS = registerBlock("bedrock_bricks",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> MACHINE_BLOCK = registerBlock("machine_block",
            () -> new Block(METAL_DEEPSLATE_ORE_PROPERTIES));

    public static final RegistryObject<Block> VOID_HOPPER = registerBlock("void_hopper",
            () -> new VoidHopper(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> WATER_MILL = registerBlock("water_mill",
            () -> new WaterMill(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> RESONATOR = registerBlock("resonator",
            () -> new Resonator(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> FIRE_MILL = registerBlock("fire_mill",
            () -> new FireMill(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> DRAGON_EGG_MILL = registerBlock("dragon_egg_mill",
            () -> new DragonEggMill(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> SOLAR_PANEL = registerBlock("solar_panel",
            () -> new SolarPanel(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> LUNAR_PANEL = registerBlock("lunar_panel",
            () -> new LunarPanel(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> LAVA_MILL = registerBlock("lava_mill",
            () -> new LavaMill(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> FURNACE_GENERATOR = registerBlock("furnace_generator",
            () -> new FurnaceGenerator(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> SURVIVAL_GENERATOR = registerBlock("survival_generator",
            () -> new SurvivalGenerator(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> OVERCLOCKED_GENERATOR = registerBlock("overclocked_generator",
            () -> new OverclockedGenerator(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> DEATH_GENERATOR = registerBlock("death_generator",
            () -> new DeathGenerator(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> EXPLOSIVE_GENERATOR = registerBlock("explosive_generator",
            () -> new ExplosiveGenerator(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> ENDER_GENERATOR = registerBlock("ender_generator",
            () -> new EnderGenerator(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> HALITOSIS_GENERATOR = registerBlock("halitosis_generator",
            () -> new HalitosisGenerator(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> NETHERSTAR_GENERATOR = registerBlock("netherstar_generator",
            () -> new NetherstarGenerator(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> FROSTY_GENERATOR = registerBlock("frosty_generator",
            () -> new FrostyGenerator(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> TRANSPORTER_NODE = registerBlock("transporter_node",
            TransporterNode::new);
    public static final RegistryObject<Block> TRANSPORT_PIPE = registerBlock("transport_pipe",
            TransportPipe::new);

    public static final RegistryObject<Block> PINK_GENERATOR = registerBlock("pink_generator",
            () -> new PinkGenerator(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> AUTO_EXECUTOR = registerBlock("auto_executor",
            () -> new AutoExecutor(BlockBehaviour.Properties.of()));

    public static RegistryObject<Block> registerSimpleBlock(String name, BlockBehaviour.Properties properties) {
        RegistryObject<Block> block = BLOCKS.register(name, () -> new Block(properties));
        ExURAItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }

    public static RegistryObject<Block> registerSimpleBlock(String name, BlockBehaviour.Properties properties, Item.Properties itemProperties) {
        RegistryObject<Block> block = BLOCKS.register(name, () -> new Block(properties));
        ExURAItems.ITEMS.register(name, () -> new BlockItem(block.get(), itemProperties));
        return block;
    }

    public static RegistryObject<Block> registerBlock(String name, Supplier<Block> blockSupplier) {
        RegistryObject<Block> block = BLOCKS.register(name, blockSupplier);
        ExURAItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }
}