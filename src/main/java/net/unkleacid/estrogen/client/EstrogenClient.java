package net.unkleacid.estrogen.client;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.client.texture.atlas.Atlases;
import net.modificationstation.stationapi.api.client.texture.atlas.ExpandableAtlas;
import net.unkleacid.estrogen.Estrogen;

public class EstrogenClient {

    @EventListener
    public void registerTextures(TextureRegisterEvent event) {
        ExpandableAtlas atlas = Atlases.getGuiItems();
        atlas.addTexture(Estrogen.NAMESPACE.id("estrogen"));
    }
}
