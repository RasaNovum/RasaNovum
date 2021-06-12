package net.rasanovum.yimyum.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;


// special class for default meals
public class MealBase extends Item {
    public MealBase() {
        super(new Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(12)
                        .saturation(1.6f)
                        .effect(() -> new EffectInstance(Effects.REGENERATION, 300, 2), 1)
                .build())
        );
    }
}
