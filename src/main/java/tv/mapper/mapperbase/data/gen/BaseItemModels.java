package tv.mapper.mapperbase.data.gen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BaseItemModels extends ItemModelProvider
{
    public BaseItemModels(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper)
    {
        super(generator, modid, existingFileHelper);
    }

    @Override
    public String getName()
    {
        return "Mapper Base Item Models";
    }

    @Override
    protected void registerModels()
    {
        getBuilder("flatter_hammer").parent(new UncheckedModelFile("item/handheld")).texture("layer0", modLoc("item/flatter_hammer"));

        getBuilder("bolt").parent(new UncheckedModelFile("item/generated")).texture("layer0", modLoc("item/bolt"));


        registerBlockBasics("concrete", true, true, true, true, true, true);
        getBuilder("concrete_fence_gate").parent(new UncheckedModelFile(modid + ":block/concrete_fence_gate"));

        registerBlockBasics("asphalt", true, true, true, false, true, false);

        getBuilder("bitumen_block").parent(new UncheckedModelFile(modid + ":block/bitumen_block"));
        getBuilder("bitumen_ore").parent(new UncheckedModelFile(modid + ":block/bitumen_ore"));
        getBuilder("raw_bitumen").parent(new UncheckedModelFile("item/generated")).texture("layer0", modLoc("item/raw_bitumen"));
        getBuilder("bituminous_coal").parent(new UncheckedModelFile("item/generated")).texture("layer0", modLoc("item/bituminous_coal"));
    }

    protected void registerBlockBasics(String name, boolean block, boolean slab, boolean stairs, boolean wall, boolean pressure, boolean fence)
    {
        if(block)
            getBuilder(name).parent(new UncheckedModelFile(modid + ":block/" + name));
        if(slab)
            getBuilder(name + "_slab").parent(new UncheckedModelFile(modid + ":block/" + name + "_slab"));
        if(stairs)
            getBuilder(name + "_stairs").parent(new UncheckedModelFile(modid + ":block/" + name + "_stairs"));
        if(wall)
            getBuilder(name + "_wall").parent(new UncheckedModelFile(modid + ":block/" + name + "_wall_inventory"));
        if(pressure)
            getBuilder(name + "_pressure_plate").parent(new UncheckedModelFile(modid + ":block/" + name + "_pressure_plate"));
        if(fence)
            getBuilder(name + "_fence").parent(new UncheckedModelFile(modid + ":block/" + name + "_fence_inventory"));
    }
}