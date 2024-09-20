package net.alexm.calcifermod;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(CalciferMod.ID)
public class CalciferMod
{
    public static final String ID = "calcifermod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CalciferMod(IEventBus modEventBus, ModContainer modContainer)
    {

    }
}
