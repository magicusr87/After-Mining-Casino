package ninja.magicusr87.afterminingcasino.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ninja.magicusr87.afterminingcasino.AfterMiningCasino;

public class ModItems {
    public static Item playersCard;
    public static Item betChip1;
    public static Item betChip5;
    public static Item betChip10;
    public static Item betChip25;
    public static Item betChip50;
    public static Item betChip100;
    public static Item betChip500;
    public static Item betChip1k;
    public static Item winTicket1;
    public static Item winTicket5;
    public static Item winTicket10;
    public static Item winTicket25;
    public static Item winTicket50;
    public static Item winTicket100;
    public static Item winTicket500;
    public static Item winTicket1k;
    public static void preInit(){
        playersCard = new Item().setUnlocalizedName("betChip1").setCreativeTab(AfterMiningCasino.tabafterminingcasino);
        betChip1 = new Item().setUnlocalizedName("betChip1").setCreativeTab(AfterMiningCasino.tabafterminingcasino);
        betChip5 = new Item().setUnlocalizedName("betChip5").setCreativeTab(AfterMiningCasino.tabafterminingcasino);
        betChip10 = new Item().setUnlocalizedName("betChip10").setCreativeTab(AfterMiningCasino.tabafterminingcasino);
        betChip25 = new Item().setUnlocalizedName("betChip25").setCreativeTab(AfterMiningCasino.tabafterminingcasino);
        betChip50 = new Item().setUnlocalizedName("betChip50").setCreativeTab(AfterMiningCasino.tabafterminingcasino);
        betChip100 = new Item().setUnlocalizedName("betChip100").setCreativeTab(AfterMiningCasino.tabafterminingcasino);
        betChip500 = new Item().setUnlocalizedName("betChip500").setCreativeTab(AfterMiningCasino.tabafterminingcasino);
        betChip1k = new Item().setUnlocalizedName("betChip1k").setCreativeTab(AfterMiningCasino.tabafterminingcasino);
        winTicket1 = new Item().setUnlocalizedName("winTicket1").setCreativeTab(AfterMiningCasino.tabafterminingcasino);
        winTicket5 = new Item().setUnlocalizedName("winTicket5").setCreativeTab(AfterMiningCasino.tabafterminingcasino);
        winTicket10 = new Item().setUnlocalizedName("winTicket10").setCreativeTab(AfterMiningCasino.tabafterminingcasino);
        winTicket25 = new Item().setUnlocalizedName("winTicket25").setCreativeTab(AfterMiningCasino.tabafterminingcasino);
        winTicket50 = new Item().setUnlocalizedName("winTicket50").setCreativeTab(AfterMiningCasino.tabafterminingcasino);
        winTicket100 = new Item().setUnlocalizedName("winTicket100").setCreativeTab(AfterMiningCasino.tabafterminingcasino);
        winTicket500 = new Item().setUnlocalizedName("winTicket500").setCreativeTab(AfterMiningCasino.tabafterminingcasino);
        winTicket1k = new Item().setUnlocalizedName("winTicket1k").setCreativeTab(AfterMiningCasino.tabafterminingcasino);
        registerItems();
    }
    public static void registerItems(){
        GameRegistry.register(playersCard, new ResourceLocation(AfterMiningCasino.MODID, "playersCard"));
        GameRegistry.register(betChip1, new ResourceLocation(AfterMiningCasino.MODID, "betChip1"));
        GameRegistry.register(betChip5, new ResourceLocation(AfterMiningCasino.MODID, "betChip5"));
        GameRegistry.register(betChip10, new ResourceLocation(AfterMiningCasino.MODID, "betChip10"));
        GameRegistry.register(betChip25, new ResourceLocation(AfterMiningCasino.MODID, "betChip25"));
        GameRegistry.register(betChip50, new ResourceLocation(AfterMiningCasino.MODID, "betChip50"));
        GameRegistry.register(betChip100, new ResourceLocation(AfterMiningCasino.MODID, "betChip100"));
        GameRegistry.register(betChip500, new ResourceLocation(AfterMiningCasino.MODID, "betChip500"));
        GameRegistry.register(betChip1k, new ResourceLocation(AfterMiningCasino.MODID, "betChip1k"));
        GameRegistry.register(winTicket1, new ResourceLocation(AfterMiningCasino.MODID, "winTicket1"));
        GameRegistry.register(winTicket5, new ResourceLocation(AfterMiningCasino.MODID, "winTicket5"));
        GameRegistry.register(winTicket10, new ResourceLocation(AfterMiningCasino.MODID, "winTicket10"));
        GameRegistry.register(winTicket25, new ResourceLocation(AfterMiningCasino.MODID, "winTicket25"));
        GameRegistry.register(winTicket50, new ResourceLocation(AfterMiningCasino.MODID, "winTicket50"));
        GameRegistry.register(winTicket100, new ResourceLocation(AfterMiningCasino.MODID, "winTicket100"));
        GameRegistry.register(winTicket500, new ResourceLocation(AfterMiningCasino.MODID, "winTicket500"));
        GameRegistry.register(winTicket1k, new ResourceLocation(AfterMiningCasino.MODID, "winTicket1k"));
    }
    public static void registerRenders(){
        registerRender(betChip1);
    }
    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(AfterMiningCasino.MODID + ":" + item.getUnlocalizedName().substring(5)));
    }
}
