package ru.bastard.snowshoes.client;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import ru.bastard.snowshoes.items.Snowshoes;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SnowshoesRenderer extends GeoArmorRenderer<Snowshoes> {

    public SnowshoesRenderer(SnowshoesModel snowshoesModel) {
        super(snowshoesModel);
    }

    @Override
    public RenderType getRenderType(Snowshoes animatable, ResourceLocation texture, @Nullable MultiBufferSource bufferSource, float partialTick) {
        return RenderType.armorCutoutNoCull(texture);
    }
}
