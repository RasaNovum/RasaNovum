package net.rasanovum.yimyum.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.Builder;

public class QuarkCheck {

    public static ForgeConfigSpec.BooleanValue quark_check;

    public static void init(ForgeConfigSpec.Builder server) {
        server.comment("Quark Check Config");

        quark_check = server
                .comment("Check if Quark is installed alongside YimYum or not")
                .define("QuarkCheck.quark_check", false);

    }

}
