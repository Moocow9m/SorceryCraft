package net.zestyblaze.sorcerycraft.util;

import net.minecraft.resources.ResourceLocation;

import java.util.Map;

public interface SpellPlayerEntity {
	Map<ResourceLocation, Integer> getDiscoveredSpells();

	void setDiscoveredSpells(Map<ResourceLocation, Integer> spells);
}
