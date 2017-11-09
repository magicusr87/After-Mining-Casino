package ninja.magicusr87.afterminingcasino.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ninja.magicusr87.afterminingcasino.item.ModItems;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
    }
    @Override
    public void init(FMLInitializationEvent event) {
        ModItems.registerRenders();
    }
    @Override
    public void postInit(FMLPostInitializationEvent event) {
    }
}
