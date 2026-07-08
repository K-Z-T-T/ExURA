package io.github.kongzhongtitian.ExURA;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExURA.MODID)
public class ExURA {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "exura";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public ExURA() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ExURABlocks.BLOCKS.register(modEventBus);
        ExURABlockEntity.BLOCK_ENTITY_TYPES.register(modEventBus);
        ExURAMenu.MENUS.register(modEventBus);
        ExURARecipe.RECIPE_TYPES.register(modEventBus);
        ExURARecipeSerializers.SERIALIZERS.register(modEventBus);
        ExURAItems.ITEMS.register(modEventBus);
        ExURACreativeTab.CREATIVE_TABS.register(modEventBus);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // 检测 Patchouli 模组是否加载
        if (ModList.get().isLoaded("patchouli")) {
            // 动态注册事件监听器到 Forge 事件总线
            MinecraftForge.EVENT_BUS.register(GiveBookOnLogin.class);
        }
    }
}