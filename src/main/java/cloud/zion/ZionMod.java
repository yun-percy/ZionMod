package cloud.zion;

import cloud.zion.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author ustc_zzzz
 */
@Mod(modid = ZionMod.MODID, name = ZionMod.MODNAME, version = ZionMod.VERSION, acceptedMinecraftVersions = "1.8.9")
public class ZionMod
{
    public static final String MODID = "zion";
    public static final String MODNAME = "Zion Mods";
    public static final String VERSION = "1.0.2";

    @Instance(ZionMod.MODID)
    public static ZionMod instance;
    @SidedProxy(clientSide = "cloud.zion.client.ClientProxy",
            serverSide = "cloud.zion.common.CommonProxy")
    public static CommonProxy proxy;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
