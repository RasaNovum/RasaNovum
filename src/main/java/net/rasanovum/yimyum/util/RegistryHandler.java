package net.rasanovum.yimyum.util;


import net.minecraft.block.Block;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.rasanovum.yimyum.YimYum;
import net.rasanovum.yimyum.blocks.BlockItemBase;
import net.rasanovum.yimyum.blocks.CheeseBlock;
import net.rasanovum.yimyum.blocks.FoodStorage;
import net.rasanovum.yimyum.blocks.SeedBlock;
import net.rasanovum.yimyum.items.*;
import net.rasanovum.yimyum.config.Config;
import net.rasanovum.yimyum.config.QuarkCheck;
import org.apache.logging.log4j.ThreadContext;


import java.io.File;

public class RegistryHandler {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, YimYum.MOD_ID);
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, YimYum.MOD_ID);

    public static void init() {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // items

      //base foods
    public static final RegistryObject<FoodBase> LETTUCE = ITEMS.register("lettuce", FoodBase::new);
    public static final RegistryObject<FoodBase> TOMATO = ITEMS.register("tomato", FoodBase::new);
    public static final RegistryObject<FoodBase> CHEESE_SLICE = ITEMS.register("slice_of_cheese", FoodBase::new);
    public static final RegistryObject<FoodBase> RICE = ITEMS.register("rice", FoodBase::new);



      //meals
    public static final RegistryObject<SushiMeal> RAW_SALMON_SUSHI = ITEMS.register("raw_salmon_sushi", SushiMeal::new);
    public static final RegistryObject<SushiMeal> RAW_COD_SUSHI = ITEMS.register("raw_cod_sushi", SushiMeal::new);
    public static final RegistryObject<SushiMeal> COOKED_COD_SUSHI = ITEMS.register("cooked_cod_sushi", SushiMeal::new);
    public static final RegistryObject<SushiMeal> COOKED_SALMON_SUSHI = ITEMS.register("cooked_salmon_sushi", SushiMeal::new);
    public static final RegistryObject<SushiMeal> TROPICAL_SUSHI = ITEMS.register("tropical_sushi", SushiMeal::new);

    public static final RegistryObject<MealBase> MUTTON_PILAF = ITEMS.register("mutton_pilaf", MealBase::new); // mutton + rice + carrot
    public static final RegistryObject<MealBase> CHICKEN_RICE_BOWL = ITEMS.register("chicken_rice_bowl", MealBase::new); //chicken + rice + tomato -> "Chicken Machboos"

    /*

    TODO





        public static final RegistryObject<SaladMeal> mutton salad (mutton lettuce tomato)
        public static final RegistryObject<SaladMeal> chicken salad (chicken lettuce tomato)

     */

      //other
    public static final RegistryObject<PoisonApple> POISON_APPLE = ITEMS.register("poison_apple", PoisonApple::new);

    // blocks

        // seed blocks
    public static final RegistryObject<Block> RICE_SEED_BLOCK = BLOCKS.register("rice_seed_block", SeedBlock::new);
    public static final RegistryObject<Block> LETTUCE_SEED_BLOCK = BLOCKS.register("lettuce_seed_block", SeedBlock::new);
    public static final RegistryObject<Block> TOMATO_SEED_BLOCK = BLOCKS.register("tomato_seed_block", SeedBlock::new);

        // block items
    public static final RegistryObject<Item> TOMATO_SEED_BLOCK_ITEM = ITEMS.register("tomato_seed_block", () -> new BlockItemBase(TOMATO_SEED_BLOCK.get()));
    public static final RegistryObject<Item> LETTUCE_SEED_BLOCK_ITEM = ITEMS.register("lettuce_seed_block", () -> new BlockItemBase(LETTUCE_SEED_BLOCK.get()));
    public static final RegistryObject<Item> RICE_SEED_BLOCK_ITEM = ITEMS.register("rice_seed_block", () -> new BlockItemBase(RICE_SEED_BLOCK.get()));


        // crates and such
    public static final RegistryObject<Block> BLOCK_OF_CHEESE = BLOCKS.register("cheese_block", CheeseBlock::new);



    /*

    TODO

    boolean checkQuarkBool = QuarkCheck.quark_check.get();



   public class CrateRegistry<checkQuarkBool> {
        if (checkQuarkBool = true) {
        public static void main(String[] args) {
            // check for quark mod file in .minecraft/mods directory
            File quark = new File("/Users/USERNAME/Appdata/Roaming/.minecraft/mods/Quark-r2.4-312.jar");
            boolean exists = quark.exists();
            if (quark.exists() && quark.isFile()) {
                System.out.println("quark is installed, additional crates will not be registered.");
                final RegistryObject<Block> RICE_CRATE = BLOCKS.register("rice_crate", FoodStorage::new);
                final RegistryObject<Block> TOMATO_CRATE = BLOCKS.register("tomato_crate", FoodStorage::new);
                final RegistryObject<Block> LETTUCE_CRATE = BLOCKS.register("lettuce_crate", FoodStorage::new);

            } else {
                System.out.println("Quark is NOT installed, will add additional crates.");
                final RegistryObject<Block> RICE_CRATE = BLOCKS.register("rice_crate", FoodStorage::new);
                final RegistryObject<Block> TOMATO_CRATE = BLOCKS.register("tomato_crate", FoodStorage::new);
                final RegistryObject<Block> LETTUCE_CRATE = BLOCKS.register("lettuce_crate", FoodStorage::new);
                final RegistryObject<Block>
            }
        }
    }

     */

}