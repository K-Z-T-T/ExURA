package io.github.kongzhongtitian.ExURA;

import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.SlotItemHandler;

public class EnderGeneratorMenu extends AbstractContainerMenu {
    public final EnderGeneratorBlockEntity blockEntity;
    private final Level level;
    private final ContainerData data;

    public EnderGeneratorMenu(int containerId, Inventory inv, FriendlyByteBuf extraData) {
        super(ExURAMenu.ENDER_GENERATOR_MENU.get(), containerId);
        BlockPos pos = extraData.readBlockPos();
        BlockEntity entity = inv.player.level().getBlockEntity(pos);
        if (!(entity instanceof EnderGeneratorBlockEntity be)) {
            throw new IllegalStateException("Invalid block entity at " + pos);
        }
        this.blockEntity = be;
        this.level = inv.player.level();
        this.data = be.data;

        addPlayerInventory(inv);
        addPlayerHotbar(inv);
        addSlots();
        addDataSlots(data);
    }

    public EnderGeneratorMenu(int containerId, Inventory inv, BlockEntity entity, ContainerData data) {
        super(ExURAMenu.ENDER_GENERATOR_MENU.get(), containerId);
        checkContainerSize(inv, 1);

        this.blockEntity = (EnderGeneratorBlockEntity) entity;
        this.level = inv.player.level();
        this.data = data;

        addPlayerInventory(inv);
        addPlayerHotbar(inv);
        addSlots();

        addDataSlots(data);
    }

    private void addSlots() {
        blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(handler -> {
            // 燃料槽
            this.addSlot(new SlotItemHandler(handler, 0, 80, 35) {
                @Override
                public boolean mayPlace(ItemStack stack) {
                    return EnderGeneratorBlockEntity.isFuel(stack);
                }
            });
        });
    }

    private void addPlayerInventory(Inventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(Inventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }

    // 燃料燃烧进度
    public boolean isBurning() {
        return data.get(0) > 0;
    }

    public int getScaledBurnProgress() {
        int burnTime = data.get(0);
        int maxBurnTime = data.get(2);

        if (maxBurnTime == 0) return 0;
        return burnTime * 13 / maxBurnTime;
    }

    // 能量存储进度
    public int getScaledEnergyProgress() {
        int energy = data.get(1);
        int maxEnergy = data.get(3);

        if (maxEnergy == 0) return 0;
        return energy * 60 / maxEnergy;
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);

        if (slot.hasItem()) {
            ItemStack itemstack1 = slot.getItem();
            itemstack = itemstack1.copy();

            if (index < 1) {
                if (!this.moveItemStackTo(itemstack1, 1, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.moveItemStackTo(itemstack1, 0, 1, false)) {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
        }

        return itemstack;
    }

    @Override
    public boolean stillValid(Player player) {
        return blockEntity.stillValid(player);
    }
}