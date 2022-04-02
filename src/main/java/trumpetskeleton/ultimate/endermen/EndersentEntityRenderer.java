package trumpetskeleton.ultimate.endermen;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class EndersentEntityRenderer  extends MobEntityRenderer<EndersentEntity, EndersentModel> {
    public EndersentEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new EndersentModel(context.getPart(UltEnderClient.MODEL_ENDERSENT_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(EndersentEntity entity) {
        return new Identifier("ultender", "textures/entity/endersent/endersent.png");
    }
}
