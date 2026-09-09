package me.sfiguz7.extratools;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import me.sfiguz7.extratools.implementation.machines.CobblestoneGenerator;
import me.sfiguz7.extratools.implementation.machines.ConcreteFactory;
import me.sfiguz7.extratools.implementation.machines.ElectricComposter;
import me.sfiguz7.extratools.implementation.machines.GoldTransmuter;
import me.sfiguz7.extratools.implementation.machines.Pulverizer;
import me.sfiguz7.extratools.implementation.machines.Vaporizer;
import me.sfiguz7.extratools.implementation.tools.Hammer;
import me.sfiguz7.extratools.lists.ETItems;
import org.bstats.bukkit.Metrics;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;

public class ExtraTools extends JavaPlugin implements SlimefunAddon {

    private static ExtraTools instance;
    private int researchId = 4100;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();

        new Metrics(this, 6945);

        new Hammer().register(this);
        new Research(new NamespacedKey(this, "hammer"), ++researchId, "Hammer", 3)
            .addItems(ETItems.HAMMER).register();

        new GoldTransmuter().register(this);
        new Research(new NamespacedKey(this, "gold_transmuter"), ++researchId, "Gold Transmuter", 12)
            .addItems(ETItems.GOLD_TRANSMUTER).register();

        new ElectricComposter(ElectricComposter.Tier.ONE) {
            @Override
            public int getEnergyConsumption() {
                return 9;
            }

            @Override
            public int getSpeed() {
                return 1;
            }
        }.register(this);
        new Research(new NamespacedKey(this, "electric_composter"), ++researchId, "Electric Composter", 18)
            .addItems(ETItems.ELECTRIC_COMPOSTER).register();

        new ElectricComposter(ElectricComposter.Tier.TWO) {
            @Override
            public int getEnergyConsumption() {
                return 25;
            }

            @Override
            public int getSpeed() {
                return 4;
            }
        }.register(this);
        new Research(new NamespacedKey(this, "electric_composter_2"), ++researchId, "Electric Composter II", 18)
            .addItems(ETItems.ELECTRIC_COMPOSTER_2).register();

        new CobblestoneGenerator().register(this);
        new Research(new NamespacedKey(this, "cobblestone_generator"), ++researchId, "Cobblestone Generator", 40)
            .addItems(ETItems.COBBLESTONE_GENERATOR).register();

        new Vaporizer().register(this);
        new Research(new NamespacedKey(this, "vaporizer"), ++researchId, "Vaporizer", 18)
            .addItems(ETItems.VAPORIZER).register();

        new ConcreteFactory().register(this);
        new Research(new NamespacedKey(this, "concrete_factory"), ++researchId, "Concrete Factory", 12)
            .addItems(ETItems.CONCRETE_FACTORY).register();

        new Pulverizer().register(this);
        new Research(new NamespacedKey(this, "pulverizer"), ++researchId, "Pulverizer", 18)
            .addItems(ETItems.PULVERIZER).register();
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/wickidcow/SF_ExtraTools/issues";
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    public static ExtraTools getInstance() {
        return instance;
    }
}
