package net.rasanovum.yimyum.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

// special class for a test item, testing effect application to edible items and different property values
public class PoisonApple extends Item {

    public PoisonApple() {
        super(new Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(2)
                        .saturation(1f)
                        .effect(() -> new EffectInstance(Effects.HUNGER, 600, 3), 1)
                        .effect(() -> new EffectInstance(Effects.POISON, 200, 3), 1)
                        .effect(() -> new EffectInstance(Effects.NAUSEA, 300, 0), 1)
                        .setAlwaysEdible()
                .build())
        );
    }
}
