package net.unkleacid.estrogen;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.Item;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.client.texture.atlas.Atlases;
import net.modificationstation.stationapi.api.client.texture.atlas.ExpandableAtlas;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Namespace;
import net.unkleacid.estrogen.CustomEstrogenFoodItem;

@Entrypoint
public class Estrogen {

    public static final Namespace NAMESPACE = Namespace.of("estrogen");

    public static Item ESTROGEN;

    @EventListener
    public void registerItems(ItemRegistryEvent event) {
        ESTROGEN = new CustomEstrogenFoodItem(NAMESPACE.id("estrogen"), 420, false)
                .setTranslationKey(NAMESPACE, "estrogen");
    }

    @EventListener
    public void registerTextures(TextureRegisterEvent event) {
        ExpandableAtlas atlas = Atlases.getGuiItems();
        atlas.addTexture(NAMESPACE.id("estrogen"));
    }
}
