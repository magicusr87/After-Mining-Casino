package ninja.magicusr87.afterminingcasino.item;

import net.minecraft.item.Item;
import ninja.magicusr87.afterminingcasino.AfterMiningCasino;

public class AfterMiningCasinoItem extends Item {
    public AfterMiningCasinoItem(String name) {
        setUnlocalizedName(name);
        setCreativeTab(AfterMiningCasino.tabafterminingcasino);
    }
    /*@Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStack, World worldIn, EntityPlayer player, EnumHand hand){
        if(!worldIn.isRemote){
            player.addChatComponentMessage(new TextComponentString("Right Clicked"));
        }
        else{
            Minecraft.getMinecraft().displayGuiScreen(new GuiTutorial());
        }
        return super.onItemRightClick(itemStackIn, worldIn, player, hand);
    }*/
}