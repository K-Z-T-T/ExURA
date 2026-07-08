package io.github.kongzhongtitian.ExURA;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ExURACreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExURA.MODID);

    public static final RegistryObject<CreativeModeTab> EXURA_TAB = CREATIVE_TABS.register("exura_tab", () ->
            CreativeModeTab.builder()
                    .title(Component.translatable("item_group."+ ExURA.MODID+".example"))
                    .icon(() -> new ItemStack(ExURAItems.MAGICAL_APPLE.get()))
                    .displayItems((params, output) -> {
                        ExURAItems.ITEMS.getEntries().forEach(entry -> entry.ifPresent(item -> output.accept(item.getDefaultInstance())));
                        ExURABlocks.BLOCKS.getEntries().forEach(blockEntry -> {
                            blockEntry.ifPresent(block -> {
                                Item item = block.asItem();
                                if (item != Items.AIR) {
                                    output.accept(item);
                                }
                            });
                        });
                    })
                    .build()
    );

    private static void addItemsFromRegistry(CreativeModeTab.Output output,
                                             Iterable<RegistryObject<Item>> registry) {
        for (RegistryObject<Item> entry : registry) {
            entry.ifPresent(item -> output.accept(item.getDefaultInstance()));
        }
    }
}