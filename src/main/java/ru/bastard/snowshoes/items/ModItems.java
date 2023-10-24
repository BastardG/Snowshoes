package ru.bastard.snowshoes.items;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.PowderSnowBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ru.bastard.snowshoes.Mod;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Mod.MOD_ID);

    public static final RegistryObject<Item> SNOWSHOES = ITEMS.register("snowshoes",
            () -> new Snowshoes(new Item.Properties().durability(256)));

    public static void register(IEventBus event) {
        ITEMS.register(event);
    }

}
