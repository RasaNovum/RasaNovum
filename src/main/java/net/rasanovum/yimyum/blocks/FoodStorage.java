package net.rasanovum.yimyum.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class FoodStorage extends Block {

    public FoodStorage() {
        super(Block.Properties.create(Material.WOOD)
            .hardnessAndResistance(2.0f, 2.0f)
            .sound(SoundType.WOOD)
        );
    }
}
