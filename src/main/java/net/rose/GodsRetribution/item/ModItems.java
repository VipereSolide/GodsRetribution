package net.rose.GodsRetribution.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rose.GodsRetribution.GodsRetribution;

public class ModItems
{
    /**
     * Registry containing every item added by the mod.
     */
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GodsRetribution.MOD_ID);

    /**
     * Registers the item registry on the loading phase of Forge.
     *
     * @param eventBus Forge's event bus used to register the item registry.
     */
    public static void Register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> SCREWS = ITEMS.register("screw",
            () -> new Item(new Item.Properties()));
}