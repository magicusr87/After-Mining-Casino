package ninja.magicusr87.afterminingcasino.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import ninja.magicusr87.afterminingcasino.AfterMiningCasino;

public class AfterMiningCasinoBlock extends Block{
    public AfterMiningCasinoBlock(Material materialIn, String name){
        super(materialIn);
        this.setUnlocalizedName(name);
        this.setCreativeTab(AfterMiningCasino.tabafterminingcasino);
        this.setHardness(5F);
        this.setResistance(2000F);
        this.setSoundType(SoundType.WOOD);
    }

    //@Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (worldIn.isRemote) {
            Minecraft.getMinecraft().displayGuiScreen(new GuiInventory(playerIn));
        } else {
            return false;
        }
        return true;
    }
}