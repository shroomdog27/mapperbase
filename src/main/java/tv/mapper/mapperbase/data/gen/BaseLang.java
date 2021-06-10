package tv.mapper.mapperbase.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import tv.mapper.mapperbase.block.BaseBlocks;
import tv.mapper.mapperbase.item.BaseItems;

public class BaseLang extends LanguageProvider
{
    private String lang;

    public BaseLang(DataGenerator generator, String modid, String lang)
    {
        super(generator, modid, lang);
        this.lang = lang;
    }

    @Override
    protected void addTranslations()
    {
        switch(lang)
        {
            default:
            case "en_us":
                add(BaseBlocks.STEEL_BLOCK.get(), "Steel Block");
                add(BaseBlocks.STEEL_SLAB.get(), "Steel Slab");
                add(BaseBlocks.STEEL_STAIRS.get(), "Steel Stairs");
                add(BaseBlocks.STEEL_WALL.get(), "Steel Wall");
                add(BaseBlocks.STEEL_PRESSURE_PLATE.get(), "Steel Pressure Plate");
                add(BaseBlocks.STEEL_FENCE.get(), "Steel Fence");
                add(BaseBlocks.STEEL_FENCE_GATE.get(), "Steel Fence Gate");
                
                add(BaseBlocks.CONCRETE.get(), "Concrete");
                add(BaseBlocks.CONCRETE_SLAB.get(), "Concrete Slab");
                add(BaseBlocks.CONCRETE_STAIRS.get(), "Concrete Stairs");
                add(BaseBlocks.CONCRETE_WALL.get(), "Concrete Wall");
                add(BaseBlocks.CONCRETE_PRESSURE_PLATE.get(), "Concrete Pressure Plate");
                add(BaseBlocks.CONCRETE_FENCE.get(), "Concrete Fence");
                add(BaseBlocks.CONCRETE_FENCE_GATE.get(), "Concrete Fence Gate");

                add(BaseBlocks.ASPHALT.get(), "Asphalt");
                add(BaseBlocks.ASPHALT_SLAB.get(), "Asphalt Slab");
                add(BaseBlocks.ASPHALT_STAIRS.get(), "Asphalt Stairs");
                add(BaseBlocks.ASPHALT_PRESSURE_PLATE.get(), "Asphalt Pressure Plate");

                add(BaseItems.RAW_BITUMEN.get(), "Raw Bitumen");
                add(BaseBlocks.BITUMEN_ORE.get(), "Bitumen Ore");
                add(BaseBlocks.BITUMEN_BLOCK.get(), "Block of Bitumen");
                add(BaseItems.BITUMINOUS_COAL.get(), "Bituminous Coal");

                add(BaseItems.BOLT.get(), "Bolt");
                add(BaseItems.FLATTER_HAMMER.get(), "Flatter Hammer");

                add("itemGroup.mapperbase_group", "Mapper Base");
                break;
            case "fr_fr":
                add(BaseBlocks.STEEL_BLOCK.get(), "Bloc d'acier");
                add(BaseBlocks.STEEL_SLAB.get(), "Dalle en acier");
                add(BaseBlocks.STEEL_STAIRS.get(), "Escalier en acier");
                add(BaseBlocks.STEEL_WALL.get(), "Muret en acier");
                add(BaseBlocks.STEEL_PRESSURE_PLATE.get(), "Plaque de pression en acier");
                add(BaseBlocks.STEEL_FENCE.get(), "Barri�re en acier");
                add(BaseBlocks.STEEL_FENCE_GATE.get(), "Portillon en acier");
                
                add(BaseBlocks.CONCRETE.get(), "Bloc de béton");
                add(BaseBlocks.CONCRETE_SLAB.get(), "Dalle en béton");
                add(BaseBlocks.CONCRETE_STAIRS.get(), "Escalier en béton");
                add(BaseBlocks.CONCRETE_WALL.get(), "Muret en béton");
                add(BaseBlocks.CONCRETE_PRESSURE_PLATE.get(), "Plaque de pression en béton");
                add(BaseBlocks.CONCRETE_FENCE.get(), "Barrière en béton");
                add(BaseBlocks.CONCRETE_FENCE_GATE.get(), "Portillon en béton");

                add(BaseBlocks.ASPHALT.get(), "Asphalte");
                add(BaseBlocks.ASPHALT_SLAB.get(), "Dalle d'asphalte");
                add(BaseBlocks.ASPHALT_STAIRS.get(), "Escalier d'asphalte");
                add(BaseBlocks.ASPHALT_PRESSURE_PLATE.get(), "Plaque de pression d'asphalte");

                add(BaseItems.RAW_BITUMEN.get(), "Bitume brut");
                add(BaseBlocks.BITUMEN_ORE.get(), "Minerai de bitume");
                add(BaseBlocks.BITUMEN_BLOCK.get(), "Bloc de bitume");
                add(BaseItems.BITUMINOUS_COAL.get(), "Charbon bitumineux");

                add(BaseItems.BOLT.get(), "Boulon");
                add(BaseItems.FLATTER_HAMMER.get(), "Masse");

                add("itemGroup.mapperbase_group", "Mapper Base");
                break;
        }
    }
}