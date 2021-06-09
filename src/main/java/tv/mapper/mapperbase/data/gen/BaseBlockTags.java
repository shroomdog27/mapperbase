package tv.mapper.mapperbase.data.gen;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import tv.mapper.mapperbase.MapperBase;
import tv.mapper.mapperbase.block.BaseBlocks;
import tv.mapper.mapperbase.data.BaseTags;

public class BaseBlockTags extends BlockTagsProvider
{
    public BaseBlockTags(DataGenerator generatorIn, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn, MapperBase.MODID, existingFileHelper);
    }

    @Override
    public void registerTags()
    {
        this.getOrCreateBuilder(Tags.Blocks.ORES).addItemEntry(BaseBlocks.BITUMEN_ORE.get());
        this.getOrCreateBuilder(BaseTags.ForgeBlocks.ORES_BITUMEN).addItemEntry(BaseBlocks.BITUMEN_ORE.get());
        this.getOrCreateBuilder(BaseTags.ForgeBlocks.STORAGE_BLOCKS_BITUMEN).addItemEntry(BaseBlocks.BITUMEN_BLOCK.get());
        this.getOrCreateBuilder(BaseTags.Blocks.CONCRETE).addItemEntry(BaseBlocks.CONCRETE.get());
        this.getOrCreateBuilder(BaseTags.Blocks.ASPHALT).addItemEntry(BaseBlocks.ASPHALT.get());
    }
}