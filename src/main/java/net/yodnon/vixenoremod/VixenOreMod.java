package net.yodnon.vixenoremod;

import net.fabricmc.api.ModInitializer;
import net.yodnon.vixenoremod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VixenOreMod implements ModInitializer {
	public static final  String MOD_ID = "vixenoremod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		ModItems.registerModItems();
	}
}
