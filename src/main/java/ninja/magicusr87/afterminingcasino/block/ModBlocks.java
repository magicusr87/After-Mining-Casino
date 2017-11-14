package ninja.magicusr87.afterminingcasino.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ninja.magicusr87.afterminingcasino.AfterMiningCasino;

public class ModBlocks {
    public static Block cashierBlock;
    public static Block playerPointExchangeBlock;
    public static Block winnerExchangeBlock;
    public static Block slotMachineBlock;
    public static void preInit(){
        cashierBlock = new AfterMiningCasinoBlock(Material.WOOD, "cashierBlock");
        playerPointExchangeBlock = new AfterMiningCasinoBlock(Material.WOOD, "playerPointExchangeBlock");
        winnerExchangeBlock = new AfterMiningCasinoBlock(Material.WOOD, "winnerExchangeBlock");
        slotMachineBlock = new AfterMiningCasinoBlock(Material.IRON, "slotMachineBlock");
        registerBlocks();
    }
    public static void registerBlocks(){
        registerBlock(cashierBlock, "cashierBlock");
        registerBlock(playerPointExchangeBlock, "PlayerPointExchangeBlock");
        registerBlock(winnerExchangeBlock, "WinnerExchangeBlock");
        registerBlock(slotMachineBlock, "slotMachineBlock");
    }
    public static void registerBlock(Block block, String name){
        GameRegistry.register(block, new ResourceLocation(AfterMiningCasino.MODID, name));
        GameRegistry.register(new ItemBlock(block), new ResourceLocation(AfterMiningCasino.MODID, name));
    }
    public static void registerRenders(){
        registerRender(cashierBlock);
        registerRender(playerPointExchangeBlock);
        registerRender(winnerExchangeBlock);
        registerRender(slotMachineBlock);
    }
    public static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(AfterMiningCasino.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
