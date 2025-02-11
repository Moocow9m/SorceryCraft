package net.zestyblaze.sorcerycraft.config;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import net.zestyblaze.sorcerycraft.SorceryCraft;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Config(name = SorceryCraft.MODID)
public class SCModConfig implements ConfigData {
	@UsePercentage(min = 0, max = 1)
	public double failureChance = 0.2;

	public static SCModConfig get() {
		return AutoConfig.getConfigHolder(SCModConfig.class).getConfig();
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	public @interface UsePercentage {
		double min();

		double max();
	}
}
