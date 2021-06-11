package tv.mapper.mapperbase.data.gen;

import java.util.function.Consumer;

import net.minecraft.block.Block;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.data.SingleItemRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import tv.mapper.mapperbase.MapperBase;
import tv.mapper.mapperbase.block.BaseBlocks;
import tv.mapper.mapperbase.data.BaseTags;
import tv.mapper.mapperbase.item.BaseItems;

public class BaseRecipes extends RecipeProvider
{
    public BaseRecipes(DataGenerator generatorIn)
    {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer)
    {
        // Concrete blocks
        ShapedRecipeBuilder.shapedRecipe(BaseBlocks.CONCRETE.get(), 4).key('G', Tags.Items.GRAVEL).key('S', Tags.Items.SAND).patternLine("GS").patternLine("SG").addCriterion("has_sand", hasItem(Tags.Items.SAND)).addCriterion("has_gravel", hasItem(Tags.Items.GRAVEL)).build(consumer, MapperBase.MODID + ":concrete_1");
        ShapedRecipeBuilder.shapedRecipe(BaseBlocks.CONCRETE.get(), 4).key('G', Tags.Items.GRAVEL).key('S', Tags.Items.SAND).patternLine("GS").patternLine("SG").addCriterion("has_sand", hasItem(Tags.Items.SAND)).addCriterion("has_gravel", hasItem(Tags.Items.GRAVEL)).build(consumer, MapperBase.MODID + ":concrete_2");
        ShapedRecipeBuilder.shapedRecipe(BaseBlocks.CONCRETE_SLAB.get(), 6).patternLine("iii").key('i', BaseTags.Items.CONCRETE).addCriterion("has_concrete_block", hasItem(BaseTags.Items.CONCRETE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BaseBlocks.CONCRETE.get()).patternLine("i").patternLine("i").key('i', BaseBlocks.CONCRETE_SLAB.get()).addCriterion("has_concrete_slab", hasItem(BaseBlocks.CONCRETE_SLAB.get())).build(consumer, MapperBase.MODID + ":concrete_block_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(BaseBlocks.CONCRETE_STAIRS.get(), 4).key('#', BaseTags.Items.CONCRETE).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion("has_concrete_block", hasItem(BaseTags.Items.CONCRETE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BaseBlocks.CONCRETE_WALL.get(), 6).key('#', BaseTags.Items.CONCRETE).patternLine("###").patternLine("###").addCriterion("has_concrete_block", hasItem(BaseTags.Items.CONCRETE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BaseBlocks.CONCRETE_PRESSURE_PLATE.get()).key('#', BaseTags.Items.CONCRETE).patternLine("##").addCriterion("has_concrete_block", hasItem(BaseTags.Items.CONCRETE)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BaseBlocks.CONCRETE_FENCE.get(), 3).patternLine("isi").patternLine("isi").key('i', BaseTags.Items.CONCRETE).key('s', BaseBlocks.CONCRETE_SLAB.get()).addCriterion("has_concrete", hasItem(BaseTags.Items.CONCRETE)).addCriterion("has_concrete_slab", hasItem(BaseBlocks.CONCRETE_SLAB.get())).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BaseBlocks.CONCRETE_FENCE_GATE.get()).patternLine("sis").patternLine("sis").key('i', BaseTags.Items.CONCRETE).key('s', BaseBlocks.CONCRETE_SLAB.get()).addCriterion("has_concrete", hasItem(BaseTags.Items.CONCRETE)).addCriterion("has_concrete_slab", hasItem(BaseBlocks.CONCRETE_SLAB.get())).build(consumer);
        basicRecipes(consumer, BaseBlocks.CONCRETE.get(), BaseBlocks.CONCRETE_SLAB.get(), BaseBlocks.CONCRETE_STAIRS.get(), BaseBlocks.CONCRETE_WALL.get(), BaseBlocks.CONCRETE_PRESSURE_PLATE.get(), null, BaseBlocks.CONCRETE_FENCE.get(), BaseBlocks.CONCRETE_FENCE_GATE.get());

        // Asphalt
        ShapedRecipeBuilder.shapedRecipe(BaseBlocks.ASPHALT.get(), 4).key('G', Tags.Items.GRAVEL).key('B', BaseTags.ForgeItems.BITUMEN).key('S', Tags.Items.SAND).patternLine("SB").patternLine("BG").addCriterion("has_raw_bitumen", hasItem(BaseTags.ForgeItems.BITUMEN)).setGroup("asphalt").build(consumer, MapperBase.MODID + ":asphalt1");
        ShapedRecipeBuilder.shapedRecipe(BaseBlocks.ASPHALT.get(), 4).key('G', Tags.Items.GRAVEL).key('B', BaseTags.ForgeItems.BITUMEN).key('S', Tags.Items.SAND).patternLine("BS").patternLine("GB").addCriterion("has_raw_bitumen", hasItem(BaseTags.ForgeItems.BITUMEN)).setGroup("asphalt").build(consumer, MapperBase.MODID + ":asphalt2");
        ShapedRecipeBuilder.shapedRecipe(BaseBlocks.ASPHALT.get(), 4).key('G', Tags.Items.GRAVEL).key('B', BaseTags.ForgeItems.BITUMEN).key('S', Tags.Items.SAND).patternLine("GB").patternLine("BS").addCriterion("has_raw_bitumen", hasItem(BaseTags.ForgeItems.BITUMEN)).setGroup("asphalt").build(consumer, MapperBase.MODID + ":asphalt3");
        ShapedRecipeBuilder.shapedRecipe(BaseBlocks.ASPHALT.get(), 4).key('G', Tags.Items.GRAVEL).key('B', BaseTags.ForgeItems.BITUMEN).key('S', Tags.Items.SAND).patternLine("BG").patternLine("SB").addCriterion("has_raw_bitumen", hasItem(BaseTags.ForgeItems.BITUMEN)).setGroup("asphalt").build(consumer, MapperBase.MODID + ":asphalt4");
        ShapedRecipeBuilder.shapedRecipe(BaseBlocks.ASPHALT.get()).patternLine("i").patternLine("i").key('i', BaseBlocks.ASPHALT_SLAB.get()).addCriterion("has_asphalt_slab", hasItem(BaseBlocks.ASPHALT_SLAB.get())).build(consumer, MapperBase.MODID + ":asphalt_block_from_slabs");
        ShapedRecipeBuilder.shapedRecipe(BaseBlocks.ASPHALT_SLAB.get(), 6).patternLine("iii").key('i', BaseTags.Items.ASPHALT).addCriterion("has_asphalt_block", hasItem(BaseTags.Items.ASPHALT)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BaseBlocks.ASPHALT_STAIRS.get(), 4).key('#', BaseTags.Items.ASPHALT).patternLine("#  ").patternLine("## ").patternLine("###").addCriterion("has_asphalt_block", hasItem(BaseTags.Items.ASPHALT)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(BaseBlocks.ASPHALT_PRESSURE_PLATE.get()).key('#', BaseTags.Items.ASPHALT).patternLine("##").addCriterion("has_asphalt_block", hasItem(BaseTags.Items.ASPHALT)).build(consumer);
        basicRecipes(consumer, BaseBlocks.ASPHALT.get(), BaseBlocks.ASPHALT_SLAB.get(), BaseBlocks.ASPHALT_STAIRS.get(), null, BaseBlocks.ASPHALT_PRESSURE_PLATE.get(), null, null, null);

        ShapedRecipeBuilder.shapedRecipe(BaseBlocks.BITUMEN_BLOCK.get()).patternLine("xxx").patternLine("xxx").patternLine("xxx").key('x', BaseTags.ForgeItems.BITUMEN).addCriterion("has_raw_bitumen", hasItem(BaseTags.ForgeItems.BITUMEN)).build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(BaseItems.RAW_BITUMEN.get(), 9).addIngredient(BaseTags.ForgeItems.STORAGE_BLOCKS_BITUMEN).addCriterion("has_bitumen_block", hasItem(BaseTags.ForgeItems.STORAGE_BLOCKS_BITUMEN)).build(consumer, MapperBase.MODID + ":raw_bitumen_from_block");

        // Ore
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(BaseItems.BITUMEN_ORE_ITEM.get()), BaseItems.RAW_BITUMEN.get(), 0.1f, 100).addCriterion("has_bitumen_ore", hasItem(BaseItems.BITUMEN_ORE_ITEM.get())).build(consumer, MapperBase.MODID + ":raw_bitumen_from_blasting");
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(BaseItems.BITUMEN_ORE_ITEM.get()), BaseItems.RAW_BITUMEN.get(), 0.1f, 200).addCriterion("has_bitumen_ore", hasItem(BaseItems.BITUMEN_ORE_ITEM.get())).build(consumer, MapperBase.MODID + ":raw_bitumen_from_smelting");

        // Others
        ShapedRecipeBuilder.shapedRecipe(BaseItems.BITUMINOUS_COAL.get(), 8).patternLine("xxx").patternLine("xyx").patternLine("xxx").key('x', BaseTags.ForgeItems.BITUMEN).key('y', Items.COAL).addCriterion("has_raw_bitumen", hasItem(BaseTags.ForgeItems.BITUMEN)).addCriterion("has_coal", hasItem(Items.COAL)).build(consumer);
    }

    private void basicRecipes(Consumer<IFinishedRecipe> consumer, Block base, Block slab, Block stairs, Block wall, Block pressure, Block button, Block fence, Block fence_gate)
    {
        String base_name = base.getRegistryName().getPath();

        if(slab != null)
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(base), slab, 2).addCriterion("has_" + base_name, hasItem(base)).build(consumer, base_name + "_slab_from_" + base_name + "_stonecutting");
        if(stairs != null)
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(base), stairs).addCriterion("has_" + base_name, hasItem(base)).build(consumer, base_name + "_stairs_from_" + base_name + "_stonecutting");
        if(wall != null)
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(base), wall).addCriterion("has_" + base_name, hasItem(base)).build(consumer, base_name + "_wall_from_" + base_name + "_stonecutting");
        if(pressure != null)
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(base), pressure, 2).addCriterion("has_" + base_name, hasItem(base)).build(consumer, base_name + "_pressure_plate_from_" + base_name + "_stonecutting");
        if(button != null)
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(base), button, 2).addCriterion("has_" + base_name, hasItem(base)).build(consumer, base_name + "_button_plate_from_" + base_name + "_stonecutting");
        if(fence != null)
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(base), fence).addCriterion("has_" + base_name, hasItem(base)).build(consumer, base_name + "_fence_plate_from_" + base_name + "_stonecutting");
        if(fence_gate != null)
            SingleItemRecipeBuilder.stonecuttingRecipe(Ingredient.fromItems(base), fence_gate).addCriterion("has_" + base_name, hasItem(base)).build(consumer, base_name + "_fence_gate_plate_from_" + base_name + "_stonecutting");
    }
}