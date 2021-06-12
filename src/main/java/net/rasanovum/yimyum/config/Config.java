package net.rasanovum.yimyum.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;
import net.rasanovum.yimyum.YimYum;
import java.io.File;

@Mod.EventBusSubscriber
public class Config {
    private static final ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec config;

    static {
        config = builder.build();
    }

    public static void loadConfig(ForgeConfigSpec config, String path) {
        //YimYum.LOGGER.info("loading config: " + path);
        final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
        //YimYum.LOGGER.info("Built config: " + path);
        file.load();
        //YimYum.LOGGER.info("Loaded config: " + path);
        config.setConfig(file);

    }
}
