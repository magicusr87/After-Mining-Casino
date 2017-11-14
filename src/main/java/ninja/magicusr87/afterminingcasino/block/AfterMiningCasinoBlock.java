package ninja.magicusr87.afterminingcasino.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
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
}
