package net.gavrikova.crispy.Item;

import net.gavrikova.crispy.Crispy;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Crispy.MOD_ID);
    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);


    }



    public static final RegistryObject<Item> BIRD = ITEMS.register("bird",
            () -> new Item(new Item.Properties()
                    .food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.5f).build()).tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> PIZZA = ITEMS.register("pizza",
            () -> new Item(new Item.Properties()
                    .food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.5f).build()).tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> COLA = ITEMS.register("cola",
            () -> new Item(new Item.Properties()
                    .food((new FoodProperties.Builder()).nutrition(6).saturationMod(0.5f).build()).tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> PAINTING = ITEMS.register("painting",
            () -> new Item(new Item.Properties()
                    .food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.5f).build()).tab(CreativeModeTab.TAB_MISC)));



}
