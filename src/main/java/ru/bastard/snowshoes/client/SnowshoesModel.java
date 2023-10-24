package ru.bastard.snowshoes.client;

import net.minecraft.resources.ResourceLocation;
import ru.bastard.snowshoes.Mod;
import ru.bastard.snowshoes.items.Snowshoes;
import software.bernie.geckolib.model.GeoModel;

public class SnowshoesModel extends GeoModel<Snowshoes> {

    @Override
    public ResourceLocation getModelResource(Snowshoes animatable) {
        return new ResourceLocation(Mod.MOD_ID, "geo/snowshoes.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Snowshoes animatable) {
        return new ResourceLocation(Mod.MOD_ID, "textures/armor/snowshoes.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Snowshoes animatable) {
        return null;
    }

}
