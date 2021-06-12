package net.rasanovum.yimyum.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class SeedBlock extends CropsBlock {
        public SeedBlock() {
            super(AbstractBlock.Properties.create(Material.PLANTS)
                    .sound(SoundType.CROP)
                    .doesNotBlockMovement()
                    .hardnessAndResistance(0)
                    .tickRandomly()
            );
        }
    }
