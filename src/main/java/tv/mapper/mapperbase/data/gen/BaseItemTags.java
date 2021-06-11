package tv.mapper.mapperbase.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.mapperbase.MapperBase;
import tv.mapper.mapperbase.data.BaseTags;
import tv.mapper.mapperbase.item.BaseItems;

public class BaseItemTags extends ItemTagsProvider
{
    public BaseItemTags(DataGenerator generatorIn, BaseBlockTags blockTagProvider, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn, blockTagProvider, MapperBase.MODID, existingFileHelper);
    }

    @Override
    public void registerTags()
    {
        copy(BlockTags.STAIRS, ItemTags.STAIRS);
        copy(BlockTags.SLABS, ItemTags.SLABS);
        copy(BlockTags.WALLS, ItemTags.WALLS);
        copy(BlockTags.FENCES, ItemTags.FENCES);
        copy(Tags.Blocks.FENCES, Tags.Items.FENCES);
        copy(BaseTags.ForgeBlocks.FENCES_STEEL, BaseTags.ForgeItems.FENCES_STEEL);
        copy(Tags.Blocks.FENCE_GATES, Tags.Items.FENCE_GATES);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        copy(BaseTags.ForgeBlocks.ORES_BITUMEN, BaseTags.ForgeItems.ORES_BITUMEN);
        copy(BaseTags.ForgeBlocks.STORAGE_BLOCKS_STEEL, BaseTags.ForgeItems.STORAGE_BLOCKS_STEEL);
        copy(BaseTags.ForgeBlocks.STORAGE_BLOCKS_BITUMEN, BaseTags.ForgeItems.STORAGE_BLOCKS_BITUMEN);
        copy(BaseTags.ForgeBlocks.PRESSURE_PLATES, BaseTags.ForgeItems.PRESSURE_PLATES);
        copy(BaseTags.Blocks.CONCRETE, BaseTags.Items.CONCRETE);
        copy(BaseTags.Blocks.ASPHALT, BaseTags.Items.ASPHALT);

        getOrCreateBuilder(ItemTags.COALS).add(BaseItems.BITUMINOUS_COAL.get());

        getOrCreateBuilder(BaseTags.ForgeItems.BITUMEN).add(BaseItems.RAW_BITUMEN.get());
    }
}