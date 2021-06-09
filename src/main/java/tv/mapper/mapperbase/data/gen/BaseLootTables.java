package tv.mapper.mapperbase.data.gen;

import net.minecraft.data.DataGenerator;
import tv.mapper.mapperbase.MapperBase;
import tv.mapper.mapperbase.block.BaseBlocks;
import tv.mapper.mapperbase.item.BaseItems;

public class BaseLootTables extends BaseLootTableProvider
{
    public BaseLootTables(DataGenerator dataGeneratorIn)
    {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables()
    {
        lootTables.put(BaseBlocks.CONCRETE.get(), createStandardTable(MapperBase.MODID, BaseBlocks.CONCRETE.get()));
        lootTables.put(BaseBlocks.CONCRETE_SLAB.get(), createSlabTable(MapperBase.MODID, BaseBlocks.CONCRETE_SLAB.get()));
        lootTables.put(BaseBlocks.CONCRETE_STAIRS.get(), createStandardTable(MapperBase.MODID, BaseBlocks.CONCRETE_STAIRS.get()));
        lootTables.put(BaseBlocks.CONCRETE_WALL.get(), createStandardTable(MapperBase.MODID, BaseBlocks.CONCRETE_WALL.get()));
        lootTables.put(BaseBlocks.CONCRETE_PRESSURE_PLATE.get(), createStandardTable(MapperBase.MODID, BaseBlocks.CONCRETE_PRESSURE_PLATE.get()));
        lootTables.put(BaseBlocks.CONCRETE_FENCE.get(), createStandardTable(MapperBase.MODID, BaseBlocks.CONCRETE_FENCE.get()));

        lootTables.put(BaseBlocks.ASPHALT.get(), createStandardTable(MapperBase.MODID, BaseBlocks.ASPHALT.get()));
        lootTables.put(BaseBlocks.ASPHALT_SLAB.get(), createSlabTable(MapperBase.MODID, BaseBlocks.ASPHALT_SLAB.get()));
        lootTables.put(BaseBlocks.ASPHALT_STAIRS.get(), createStandardTable(MapperBase.MODID, BaseBlocks.ASPHALT_STAIRS.get()));
        lootTables.put(BaseBlocks.ASPHALT_PRESSURE_PLATE.get(), createStandardTable(MapperBase.MODID, BaseBlocks.ASPHALT_PRESSURE_PLATE.get()));

        lootTables.put(BaseBlocks.BITUMEN_BLOCK.get(), createStandardTable(MapperBase.MODID, BaseBlocks.BITUMEN_BLOCK.get()));
        lootTables.put(BaseBlocks.BITUMEN_ORE.get(), createSilkTable(MapperBase.MODID, BaseBlocks.BITUMEN_ORE.get(), BaseItems.RAW_BITUMEN.get(), 2, 6, 2));
    }
}