package net.gavrikova.crispy.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.gavrikova.crispy.Crispy;
import net.minecraftforge.registries.RegistryObject;
import net.gavrikova.crispy.Item.ModItems;
import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Crispy.MOD_ID);


    public static <T extends Block> RegistryObject<Item> registryBlockItem (String name, RegistryObject<T> block,CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static <T extends Block>RegistryObject<T> registryBlock (String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturns = BLOCKS.register(name,block);
        registryBlockItem(name,toReturns,tab);
        return toReturns;
    }
    public static final RegistryObject<Block> FOX_BLOCK = registryBlock("fox_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> FALL_BLOCK = registryBlock("dor_block",
            () -> new FallingBlock(BlockBehaviour.Properties.of(Material.SAND)
                    .strength(3f).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> POL_BLOCK = registryBlock("pol_block",
            () -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(1f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> ZANAVES_BLOCK = registryBlock("zanaves_block",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES)
                    .strength(2f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_MISC);

    
    public static void register (IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

    }

