package net.rasanovum.yimyum.items;


import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

// special class for default food items: raw crops ie. lettuce, tomatoes
public class FoodBase extends Item {
    public FoodBase() {
        super(new Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(3)
                        .saturation(1.1f)
                        .build())
        );
    }
}
