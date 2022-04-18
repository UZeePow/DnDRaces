package net.uzeepow.dndraces.items;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.uzeepow.dndraces.gui.RacesDisplayScreen;
import net.uzeepow.dndraces.gui.RacesGui;

public class Dice extends Item {

    public Dice() {
        super(new Item.Settings().maxCount(1).group(ItemGroup.MISC));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        //ItemStack stack = user.getStackInHand(hand);
        if(world.isClient) {
            MinecraftClient.getInstance().setScreen(new RacesDisplayScreen(new RacesGui()));
        }
        if(!user.isCreative()) {
            //stack.decrement(1);
        }
        return super.use(world, user, hand);
    }
}
