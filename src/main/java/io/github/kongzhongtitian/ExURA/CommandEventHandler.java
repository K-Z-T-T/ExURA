// CommandEventHandler.java
package io.github.kongzhongtitian.ExURA;

import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ExURA.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CommandEventHandler {

    @SubscribeEvent
    public static void onRegisterCommands(RegisterCommandsEvent event) {
        // 注册所有指令
        ExURACommand.register(event.getDispatcher());
    }
}