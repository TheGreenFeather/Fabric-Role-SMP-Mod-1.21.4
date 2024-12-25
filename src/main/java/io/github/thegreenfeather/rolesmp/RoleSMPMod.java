package io.github.thegreenfeather.rolesmp;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.thegreenfeather.rolesmp.item.ModItems;

public class RoleSMPMod implements ModInitializer {
	
	public static final String MOD_ID = "rolesmp";
	public static final String MOD_NAME = "Role SMP Mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	@Override
	public void onInitialize() {
		
		ModItems.registerModItems();
	}
}