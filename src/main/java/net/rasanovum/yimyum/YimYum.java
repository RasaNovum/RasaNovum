package net.rasanovum.yimyum;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.rasanovum.yimyum.config.Config;
import net.rasanovum.yimyum.util.RegistryHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("yimyum")
public class YimYum
{
    // directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "yimyum";

    public YimYum() {

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.config);

        // register setup and doClientStuff
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        Config.loadConfig(Config.config, FMLPaths.CONFIGDIR.get().resolve("yimyum.toml").toString());

        // register ourselves for server and other game events
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) { }
        }