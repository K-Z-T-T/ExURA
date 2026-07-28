package io.github.kongzhongtitian.ExURA;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ExURA.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ScreenRegister {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(ExURAMenu.RESONATOR_MENU.get(), ResonatorScreen::new);
            MenuScreens.register(ExURAMenu.FURNACE_GENERATOR_MENU.get(), FurnaceGeneratorScreen::new);
            MenuScreens.register(ExURAMenu.FROSTY_GENERATOR_MENU.get(), FrostyGeneratorScreen::new);
            MenuScreens.register(ExURAMenu.DEATH_GENERATOR_MENU.get(), DeathGeneratorScreen::new);
            MenuScreens.register(ExURAMenu.ENDER_GENERATOR_MENU.get(), EnderGeneratorScreen::new);
            MenuScreens.register(ExURAMenu.EXPLOSIVE_GENERATOR_MENU.get(), ExplosiveGeneratorScreen::new);
            MenuScreens.register(ExURAMenu.HALITOSIS_GENERATOR_MENU.get(), HalitosisGeneratorScreen::new);
            MenuScreens.register(ExURAMenu.NETHERSTAR_GENERATOR_MENU.get(), NetherstarGeneratorScreen::new);
            MenuScreens.register(ExURAMenu.OVERCLOCKED_GENERATOR_MENU.get(), OverclockedGeneratorScreen::new);
            MenuScreens.register(ExURAMenu.PINK_GENERATOR_MENU.get(), PinkGeneratorScreen::new);
            MenuScreens.register(ExURAMenu.SURVIVAL_GENERATOR_MENU.get(), SurvivalGeneratorScreen::new);
        });
    }
}