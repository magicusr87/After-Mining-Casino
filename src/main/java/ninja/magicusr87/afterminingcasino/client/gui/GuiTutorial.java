package ninja.magicusr87.afterminingcasino.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import ninja.magicusr87.afterminingcasino.AfterMiningCasino;
import java.io.IOException;

public class GuiTutorial extends GuiScreen{
//    GUI Texture needs to be 256px X 256px
    final ResourceLocation texture = new ResourceLocation(AfterMiningCasino.MODID, "textures/gui/cashierGUI.png");
    int guiWidth = 256;
    int guiHeight = 256;

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();
        Minecraft.getMinecraft().renderEngine.bindTexture(texture);
        int centerX = (width / 2) - (guiWidth / 2);
        int cneterY = (height / 2) - (guiHeight / 2);
        drawTexturedModalRect(0, 0, 0, 0, guiWidth, guiHeight);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    public void initGui() {

        super.initGui();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        super.actionPerformed(button);
    }

    @Override
    protected void keyTyped(char typedChar, int keyCode) throws IOException {
        super.keyTyped(typedChar, keyCode);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

}
