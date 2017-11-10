package ninja.magicusr87.afterminingcasino.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ninja.magicusr87.afterminingcasino.AfterMiningCasino;

public class ModItems {
//    public static Item playersCard;
    public static Item betChip1;
    public static Item betChip5;
    public static Item betChip25;
    public static Item betChip100;
    public static Item betChip500;
    public static Item betChip1k;
    public static Item winTicket1;
    public static Item winTicket5;
    public static Item winTicket25;
    public static Item winTicket100;
    public static Item winTicket500;
    public static Item winTicket1k;
    public static void preInit(){
//        playersCard = new AfterMiningCasinoItem("playersCard");
        betChip1 = new AfterMiningCasinoItem("betChip1");
        betChip5 = new AfterMiningCasinoItem("betChip5");
        betChip25 = new AfterMiningCasinoItem("betChip25");
        betChip100 = new AfterMiningCasinoItem("betChip100");
        betChip500 = new AfterMiningCasinoItem("betChip500");
        betChip1k = new AfterMiningCasinoItem("betChip1k");
        winTicket1 = new AfterMiningCasinoItem("winTicket1");
        winTicket5 = new AfterMiningCasinoItem("winTicket5");
        winTicket25 = new AfterMiningCasinoItem("winTicket25");
        winTicket100 = new AfterMiningCasinoItem("winTicket100");
        winTicket500 = new AfterMiningCasinoItem("winTicket500");
        winTicket1k = new AfterMiningCasinoItem("winTicket1k");
        registerItems();
    }
    public static void registerItems(){
//        GameRegistry.register(playersCard, new ResourceLocation(AfterMiningCasino.MODID, "playersCard"));
        GameRegistry.register(betChip1, new ResourceLocation(AfterMiningCasino.MODID, "betChip1"));
        GameRegistry.register(betChip5, new ResourceLocation(AfterMiningCasino.MODID, "betChip5"));
        GameRegistry.register(betChip25, new ResourceLocation(AfterMiningCasino.MODID, "betChip25"));
        GameRegistry.register(betChip100, new ResourceLocation(AfterMiningCasino.MODID, "betChip100"));
        GameRegistry.register(betChip500, new ResourceLocation(AfterMiningCasino.MODID, "betChip500"));
        GameRegistry.register(betChip1k, new ResourceLocation(AfterMiningCasino.MODID, "betChip1k"));
        GameRegistry.register(winTicket1, new ResourceLocation(AfterMiningCasino.MODID, "winTicket1"));
        GameRegistry.register(winTicket5, new ResourceLocation(AfterMiningCasino.MODID, "winTicket5"));
        GameRegistry.register(winTicket25, new ResourceLocation(AfterMiningCasino.MODID, "winTicket25"));
        GameRegistry.register(winTicket100, new ResourceLocation(AfterMiningCasino.MODID, "winTicket100"));
        GameRegistry.register(winTicket500, new ResourceLocation(AfterMiningCasino.MODID, "winTicket500"));
        GameRegistry.register(winTicket1k, new ResourceLocation(AfterMiningCasino.MODID, "winTicket1k"));
    }
    public static void registerRenders(){
//        registerRender(playersCard);
        registerRender(betChip1);
        registerRender(betChip5);
        registerRender(betChip25);
        registerRender(betChip100);
        registerRender(betChip500);
        registerRender(betChip1k);
        registerRender(winTicket1);
        registerRender(winTicket5);
        registerRender(winTicket25);
        registerRender(winTicket100);
        registerRender(winTicket500);
        registerRender(winTicket1k);
    }
    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(AfterMiningCasino.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
