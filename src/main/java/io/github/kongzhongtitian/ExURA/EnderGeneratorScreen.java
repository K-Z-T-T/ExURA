package io.github.kongzhongtitian.ExURA;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class EnderGeneratorScreen extends AbstractContainerScreen<EnderGeneratorMenu> {
    private static final ResourceLocation TEXTURE =
            ResourceLocation.fromNamespaceAndPath(ExURA.MODID, "textures/screen/jhj.png");

    public EnderGeneratorScreen(EnderGeneratorMenu menu, Inventory inv, Component title) {
        super(menu, inv, title);
        this.imageWidth = 176;
        this.imageHeight = 166;
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float partialTick, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);

        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        guiGraphics.blit(TEXTURE, x, y, 0, 0, imageWidth, imageHeight);

        // 渲染燃烧进度条
        if (menu.isBurning()) {
            int burnProgress = menu.getScaledBurnProgress();
            guiGraphics.blit(TEXTURE, x + 81, y + 37 + 13 - burnProgress,
                    176, 13 - burnProgress, 14, burnProgress + 1);
        }

        // 渲染能量条
        int energyProgress = menu.getScaledEnergyProgress();
        guiGraphics.blit(TEXTURE, x + 152, y + 14 + 60 - energyProgress,
                176, 14, 16, energyProgress + 1);
    }

    @Override
    protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
        guiGraphics.drawString(this.font, this.title,
                this.titleLabelX, this.titleLabelY, 0x404040, false);
        guiGraphics.drawString(this.font, this.playerInventoryTitle,
                this.inventoryLabelX, this.inventoryLabelY, 0x404040, false);

        // 显示能量信息
        int energy = menu.blockEntity.getEnergyStored();
        int maxEnergy = menu.blockEntity.getMaxEnergyStored();
        String energyText = String.format("%d / %d FE", energy, maxEnergy);
        guiGraphics.drawString(this.font, energyText,
                150 - this.font.width(energyText) / 2, 78, 0x404040, false);

        // 显示燃烧时间信息
        if (menu.isBurning()) {
            int burnTime = menu.blockEntity.getBurnTime();
            int burnTimeSeconds = burnTime / 20;
            String burnText = String.format("%ds", burnTimeSeconds);
            guiGraphics.drawString(this.font, burnText,
                    86 - this.font.width(burnText) / 2, 58, 0x404040, false);
        }
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
        this.renderBackground(guiGraphics);
        super.render(guiGraphics, mouseX, mouseY, partialTick);
        this.renderTooltip(guiGraphics, mouseX, mouseY);

        // 能量条悬停提示
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        if (mouseX >= x + 152 && mouseX <= x + 168 &&
                mouseY >= y + 14 && mouseY <= y + 74) {
            int energy = menu.blockEntity.getEnergyStored();
            int maxEnergy = menu.blockEntity.getMaxEnergyStored();
            guiGraphics.renderTooltip(this.font,
                    Component.literal(String.format("%d / %d FE", energy, maxEnergy)),
                    mouseX, mouseY);
        }
    }
}