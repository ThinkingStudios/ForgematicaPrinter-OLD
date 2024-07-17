package org.thinkingstudio.forgematica.printer;

import me.aleksilassila.litematica.printer.LitematicaMixinMod;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLLoader;

@Mod(value = ForgematicaPrinter.MOD_ID, dist = Dist.CLIENT)
public class ForgematicaPrinter {
    public static final String MOD_ID = "forgematica_printer";

    public ForgematicaPrinter() {
        if (FMLLoader.getDist().isClient()) {
            LitematicaMixinMod.onInitialize();
        }
    }
}
