package net.aleberrot.paconimod.item;

import net.aleberrot.paconimod.PaconiMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PaconiMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NAIL = ITEMS.register("nail",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STAND_ARROW = ITEMS.register("stand_arrow",
            StandArrow::new);



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
