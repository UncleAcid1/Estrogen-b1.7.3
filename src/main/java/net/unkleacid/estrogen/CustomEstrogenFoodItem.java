package net.unkleacid.estrogen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.template.item.ItemTemplate;
import net.modificationstation.stationapi.api.util.Identifier;

public class CustomEstrogenFoodItem extends FoodItem implements ItemTemplate {

    public CustomEstrogenFoodItem(Identifier id, int healAmount, boolean isWolfFood) {
        this(ItemTemplate.getNextId(), healAmount, isWolfFood);
        ItemTemplate.onConstructor(this, id);
    }

    public CustomEstrogenFoodItem(int numericId, int healAmount, boolean isWolfFood) {
        super(numericId, healAmount, isWolfFood);
    }

    @Override
    public ItemStack use(ItemStack stack, World world, PlayerEntity user) {
        ItemStack out = super.use(stack, world, user);

        if (!world.isRemote) {
            world.playSound(user, "random.eat", 0.5F, 1.0F);
            user.sendMessage("§dSuddenly you feel... different... :3");
        }

        return out;
    }
}
