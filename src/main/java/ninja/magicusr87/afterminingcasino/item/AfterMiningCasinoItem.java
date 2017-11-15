package ninja.magicusr87.afterminingcasino.item;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import ninja.magicusr87.afterminingcasino.AfterMiningCasino;
import ninja.magicusr87.afterminingcasino.client.gui.GuiTutorial;

public class AfterMiningCasinoItem extends Item {
    public AfterMiningCasinoItem(String name) {
        setUnlocalizedName(name);
        setCreativeTab(AfterMiningCasino.tabafterminingcasino);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStack, World worldIn, EntityPlayer player, EnumHand hand){
        if(!worldIn.isRemote){
//            player.addChatComponentMessage(new TextComponentString("Right Clicked"));
        }
        else{
            Minecraft.getMinecraft().displayGuiScreen(new GuiTutorial());
        }
        return super.onItemRightClick(itemStack, worldIn, player, hand);
    }
}