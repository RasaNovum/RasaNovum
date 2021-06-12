package net.rasanovum.yimyum.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;


// special class for Sushi's hunger and saturation values.
public class SushiMeal extends Item {

    public SushiMeal() {
        super(new Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(10)
                        .saturation(12.8f)
                .build())
        );
    }
}
