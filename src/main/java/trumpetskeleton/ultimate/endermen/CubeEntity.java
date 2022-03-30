package trumpetskeleton.ultimate.endermen;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class CubeEntity extends PathAwareEntity {
    protected CubeEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createCubeAttributes() {
        return MobEntity.createMobAttributes().add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.23000000417232513D).add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 5.0D).add(EntityAttributes.GENERIC_ARMOR, 2.0D);
    }
}
