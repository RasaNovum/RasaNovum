package net.rasanovum.yimyum.items;


import net.minecraft.block.Block;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.ItemGroup;



// special class for seed items and their properties
public class SeedBase extends BlockNamedItem {
    public SeedBase(Block cropBlockIn) {
        super(cropBlockIn, new Properties().group(ItemGroup.MISC));

    }
}
