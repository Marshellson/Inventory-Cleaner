package com.thearchyhelios.inventorycleaner;

import com.thearchyhelios.inventorycleaner.common.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = InventoryCleaner.MODID,
        name = InventoryCleaner.NAME,
        version = InventoryCleaner.VERSION,
        acceptedMinecraftVersions = "1.12.2")

public class InventoryCleaner {
    public static final String MODID = "inventorycleaner";
    public static final String NAME = "Inventory Cleaner";
    public static final String VERSION = "1.0";
    @SidedProxy(clientSide = "com.thearchyhelios.inventorycleaner.client.ClientProxy",
            serverSide = "com.thearchyhelios.inventorycleaner.common.CommonProxy")

    public static CommonProxy proxy;

    @Mod.Instance(InventoryCleaner.MODID)
    public static InventoryCleaner instance;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

}

