package io.github.sefiraat.simplestorage.items.materials;

import io.github.sefiraat.simplestorage.SimpleStorage;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.NamespacedKey;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public final class GemAngelite extends AbstractGem {

    private final NamespacedKey key;

    public GemAngelite(SimpleStorage plugin, ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super("Angelite Crystal", category, item, recipeType, recipe, 5);
        this.key = new NamespacedKey(SimpleStorage.inst(), "angelite_crystal");
        register();
        register(plugin);
    }

    @Override
    public int getDefaultSupply(@Nonnull World.Environment environment, @Nonnull Biome biome) {
        switch (environment) {
            case NORMAL:
                String biomeKey = biome.getKey().getKey();
                switch (biomeKey) {
                    case "snowy_beach":
                    case "snowy_taiga":
                    case "snowy_plains":
                    case "cold_ocean":
                    case "deep_cold_ocean":
                        return 25;
                    case "ice_spikes":
                    case "frozen_ocean":
                    case "frozen_river":
                    case "deep_frozen_ocean":
                    case "frozen_peaks":
                    case "jagged_peaks":
                        return 40;
                    default:
                        return 5;
                }
            case NETHER:
                return 0;
            default:
                return 15;
        }
    }

    @Nonnull
    @Override
    public NamespacedKey getKey() {
        return key;
    }

}