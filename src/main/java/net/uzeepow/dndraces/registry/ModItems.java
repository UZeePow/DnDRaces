package net.uzeepow.dndraces.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.uzeepow.dndraces.DnDRaces;
import net.uzeepow.dndraces.items.Dice;

public class ModItems {

    public static final Item DICE = new Dice();

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DnDRaces.MOD_ID, name), item);
    }

    public static void register() {
        DnDRaces.LOGGER.info("Registering Mod Items for " + DnDRaces.MOD_ID);
        Registry.register(Registry.ITEM, new Identifier(DnDRaces.MOD_ID, "dice"), DICE);
    }
}
