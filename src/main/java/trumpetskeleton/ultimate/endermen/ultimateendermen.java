package trumpetskeleton.ultimate.endermen;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class ultimateendermen implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("ultender");
	public static final EntityType<CubeEntity> CUBE = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier("ultimateendermen", "cube"),
			FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CubeEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
	);
	public static final EntityType<EndersentEntity> ENDERSENT = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier("ultimateendermen", "endersent"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, EndersentEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
	);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LOGGER.info("Hello Fabric world!");
		FabricDefaultAttributeRegistry.register(CUBE, CubeEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(ENDERSENT, EndersentEntity.createEndersentAttributes());


	}
}
