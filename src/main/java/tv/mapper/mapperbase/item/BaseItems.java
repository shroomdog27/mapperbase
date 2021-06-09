package tv.mapper.mapperbase.item;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tv.mapper.mapperbase.MapperBase;
import tv.mapper.mapperbase.block.BaseBlocks;

public class BaseItems
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapperBase.MODID);

    public static final RegistryObject<Item> CONCRETE_ITEM = ITEMS.register("concrete", () -> new BlockItem(BaseBlocks.CONCRETE.get(), new Item.Properties().group(BaseGroups.MAPPERBASE)));
    public static final RegistryObject<Item> CONCRETE_STAIRS_ITEM = ITEMS.register("concrete_stairs", () -> new BlockItem(BaseBlocks.CONCRETE_STAIRS.get(), new Item.Properties().group(BaseGroups.MAPPERBASE)));
    public static final RegistryObject<Item> CONCRETE_SLAB_ITEM = ITEMS.register("concrete_slab", () -> new BlockItem(BaseBlocks.CONCRETE_SLAB.get(), new Item.Properties().group(BaseGroups.MAPPERBASE)));
    public static final RegistryObject<Item> CONCRETE_WALL_ITEM = ITEMS.register("concrete_wall", () -> new BlockItem(BaseBlocks.CONCRETE_WALL.get(), new Item.Properties().group(BaseGroups.MAPPERBASE)));
    public static final RegistryObject<Item> CONCRETE_PRESSURE_PLATE_ITEM = ITEMS.register("concrete_pressure_plate",
        () -> new BlockItem(BaseBlocks.CONCRETE_PRESSURE_PLATE.get(), new Item.Properties().group(BaseGroups.MAPPERBASE)));
    public static final RegistryObject<Item> CONCRETE_FENCE_ITEM = ITEMS.register("concrete_fence", () -> new BlockItem(BaseBlocks.CONCRETE_FENCE.get(), new Item.Properties().group(BaseGroups.MAPPERBASE)));
    public static final RegistryObject<Item> CONCRETE_FENCE_GATE_ITEM = ITEMS.register("concrete_fence_gate",
        () -> new BlockItem(BaseBlocks.CONCRETE_FENCE_GATE.get(), new Item.Properties().group(BaseGroups.MAPPERBASE)));

    public static final RegistryObject<Item> RAW_BITUMEN = ITEMS.register("raw_bitumen", () -> new Item(new Item.Properties().group(BaseGroups.MAPPERBASE)));
    public static final RegistryObject<Item> BITUMEN_ORE_ITEM = ITEMS.register("bitumen_ore", () -> new BlockItem(BaseBlocks.BITUMEN_ORE.get(), new Item.Properties().group(BaseGroups.MAPPERBASE)));
    public static final RegistryObject<Item> BITUMEN_ITEM = ITEMS.register("bitumen_block", () -> new BlockItem(BaseBlocks.BITUMEN_BLOCK.get(), new Item.Properties().group(BaseGroups.MAPPERBASE)));
    public static final RegistryObject<Item> BITUMINOUS_COAL = ITEMS.register("bituminous_coal", () -> new FuelItem(new Item.Properties().group(BaseGroups.MAPPERBASE), 250));

    public static final RegistryObject<Item> ASPHALT_ITEM = ITEMS.register("asphalt", () -> new BlockItem(BaseBlocks.ASPHALT.get(), new Item.Properties().group(BaseGroups.MAPPERBASE)));
    public static final RegistryObject<Item> ASPHALT_STAIRS_ITEM = ITEMS.register("asphalt_stairs", () -> new BlockItem(BaseBlocks.ASPHALT_STAIRS.get(), new Item.Properties().group(BaseGroups.MAPPERBASE)));
    public static final RegistryObject<Item> ASPHALT_SLAB_ITEM = ITEMS.register("asphalt_slab", () -> new BlockItem(BaseBlocks.ASPHALT_SLAB.get(), new Item.Properties().group(BaseGroups.MAPPERBASE)));
    public static final RegistryObject<Item> ASPHALT_PRESSURE_PLATE_ITEM = ITEMS.register("asphalt_pressure_plate",
        () -> new BlockItem(BaseBlocks.ASPHALT_PRESSURE_PLATE.get(), new Item.Properties().group(BaseGroups.MAPPERBASE)));

    public static final RegistryObject<Item> BOLT = ITEMS.register("bolt", () -> new Item(new Item.Properties().group(BaseGroups.MAPPERBASE)));

    public static final RegistryObject<FlatterHammerItem> FLATTER_HAMMER = ITEMS.register("flatter_hammer", () -> new FlatterHammerItem(new Item.Properties().group(BaseGroups.MAPPERBASE).maxDamage(128)));

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}