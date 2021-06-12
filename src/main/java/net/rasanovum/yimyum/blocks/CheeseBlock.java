package net.rasanovum.yimyum.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CheeseBlock extends Block {

    public CheeseBlock() {
        super(Properties.create(Material.WOOD)
            .hardnessAndResistance(2.0f,2.0f)
            .sound(SoundType.SLIME)
        );
    }
}
