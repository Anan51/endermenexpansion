package trumpetskeleton.ultimate.endermen;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

import static trumpetskeleton.ultimate.endermen.ultimateendermen.LOGGER;

public class UltEnderClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_CUBE_LAYER = new EntityModelLayer(new Identifier("ultender", "cube"), "main");
    public static final EntityModelLayer MODEL_ENDERSENT_LAYER = new EntityModelLayer(new Identifier("ultender", "endersent"), "main");
    @Override
    public void onInitializeClient() {
        LOGGER.info("=====================");
        EntityRendererRegistry.register(ultimateendermen.CUBE, CubeEntityRenderer::new);
        EntityRendererRegistry.register(ultimateendermen.ENDERSENT, EndersentEntityRenderer::new);


        EntityModelLayerRegistry.registerModelLayer(MODEL_CUBE_LAYER, CubeEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(MODEL_ENDERSENT_LAYER, EndersentModel::getTexturedModelData);
    }

}
