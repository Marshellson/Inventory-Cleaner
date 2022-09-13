package com.thearchyhelios.inventorycleaner.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = "inventorycleaner")

public class ItemLoader {
    private static final Item[] items = {
            new Item().setUnlocalizedName("ceshifangkuai").setRegistryName("ceshifangkuai").setCreativeTab(CreativeTabs.MATERIALS)
    };

    public static Item getByName(String name) {
        for (Item item : items) {
            if (item.getUnlocalizedName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        for (Item item : items) {
            event.getRegistry().register(item);
        }
    }
}
