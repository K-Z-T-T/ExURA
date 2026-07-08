package io.github.kongzhongtitian.ExURA;

import net.minecraft.core.BlockPos;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ExURAMenu {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, ExURA.MODID);

    public static final RegistryObject<MenuType<ResonatorMenu>> RESONATOR_MENU =
            MENUS.register("resonator_menu", () -> IForgeMenuType.create(ResonatorMenu::new));

    public static final RegistryObject<MenuType<FurnaceGeneratorMenu>> FURNACE_GENERATOR_MENU =
            MENUS.register("furnace_generator_menu", () -> IForgeMenuType.create(FurnaceGeneratorMenu::new));

    public static final RegistryObject<MenuType<TransporterNodeMenu>> TRANSPORTER_NODE_MENU =
            MENUS.register("transporter_node_menu", () -> IForgeMenuType.create((windowId, playerInv, extraData) -> {
                // 从同步数据包中读取方块坐标
                BlockPos pos = extraData.readBlockPos();
                // 创建 ContainerLevelAccess
                ContainerLevelAccess access = ContainerLevelAccess.create(playerInv.player.level(), pos);

                // 从目标方块实体中获取 IItemHandler 能力
                BlockEntity blockEntity = playerInv.player.level().getBlockEntity(pos);
                IItemHandler itemHandler = blockEntity != null
                        ? blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER)
                        .orElseThrow(() -> new IllegalStateException("Expected item handler capability"))
                        : null;  // 安全起见可以进一步处理 null 情况

                return new TransporterNodeMenu(windowId, playerInv, itemHandler, access);
            }));

    public static final RegistryObject<MenuType<FrostyGeneratorMenu>> FROSTY_GENERATOR_MENU =
            MENUS.register("frosty_generator_menu", () -> IForgeMenuType.create(FrostyGeneratorMenu::new));

    public static final RegistryObject<MenuType<DeathGeneratorMenu>> DEATH_GENERATOR_MENU =
            MENUS.register("death_generator_menu", () -> IForgeMenuType.create(DeathGeneratorMenu::new));

    public static final RegistryObject<MenuType<EnderGeneratorMenu>> ENDER_GENERATOR_MENU =
            MENUS.register("ender_generator_menu", () -> IForgeMenuType.create(EnderGeneratorMenu::new));

    public static final RegistryObject<MenuType<ExplosiveGeneratorMenu>> EXPLOSIVE_GENERATOR_MENU =
            MENUS.register("explosive_generator_menu", () -> IForgeMenuType.create(ExplosiveGeneratorMenu::new));

    public static final RegistryObject<MenuType<HalitosisGeneratorMenu>> HALITOSIS_GENERATOR_MENU =
            MENUS.register("halitosis_generator_menu", () -> IForgeMenuType.create(HalitosisGeneratorMenu::new));

    public static final RegistryObject<MenuType<NetherstarGeneratorMenu>> NETHERSTAR_GENERATOR_MENU =
            MENUS.register("netherstar_generator_menu", () -> IForgeMenuType.create(NetherstarGeneratorMenu::new));

    public static final RegistryObject<MenuType<OverclockedGeneratorMenu>> OVERCLOCKED_GENERATOR_MENU =
            MENUS.register("overclocked_generator_menu", () -> IForgeMenuType.create(OverclockedGeneratorMenu::new));

    public static final RegistryObject<MenuType<PinkGeneratorMenu>> PINK_GENERATOR_MENU =
            MENUS.register("pink_generator_menu", () -> IForgeMenuType.create(PinkGeneratorMenu::new));

    public static final RegistryObject<MenuType<SurvivalGeneratorMenu>> SURVIVAL_GENERATOR_MENU =
            MENUS.register("survival_generator_menu", () -> IForgeMenuType.create(SurvivalGeneratorMenu::new));
}
