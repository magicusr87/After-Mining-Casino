package ninja.magicusr87.afterminingcasino;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ninja.magicusr87.afterminingcasino.block.ModBlocks;
import ninja.magicusr87.afterminingcasino.item.ModItems;
import ninja.magicusr87.afterminingcasino.proxy.CommonProxy;
import ninja.magicusr87.afterminingcasino.tab.CreativeTabAfterMiningCasino;

@Mod(modid = AfterMiningCasino.MODID, version = AfterMiningCasino.VERSION, name = AfterMiningCasino.NAME)
public class AfterMiningCasino {
    public static final String MODID = "afterminingcasino";
    public static final String VERSION = "0.2.1";
    public static final String NAME = "After Mining Casino";
    @SidedProxy(clientSide = "ninja.magicusr87.afterminingcasino.proxy.ClientProxy", serverSide = "ninja.magicusr87.afterminingcasino.proxy.CommonProxy")
    public static CommonProxy proxy;
    @Mod.Instance
    public static AfterMiningCasino instance;
    public static CreativeTabAfterMiningCasino tabafterminingcasino;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        tabafterminingcasino = new CreativeTabAfterMiningCasino(CreativeTabs.getNextID(), "tab_afterminingcasino");
        ModItems.preInit();
        ModBlocks.preInit();
        proxy.preInit(event);
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.init(event);
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new AfterMiningCasinoEventHandler());
        proxy.postInit(event);
    }
}
