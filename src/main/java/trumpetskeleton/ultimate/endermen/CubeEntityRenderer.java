package trumpetskeleton.ultimate.endermen;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CubeEntityRenderer extends MobEntityRenderer<CubeEntity, CubeEntityModel> {
    public CubeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new CubeEntityModel(context.getPart(UltEnderClient.MODEL_CUBE_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(CubeEntity entity) {

        return new Identifier("ultender", "textures/entity/cube/cube.png");
    }
}