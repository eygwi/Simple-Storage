package io.github.sefiraat.simplestorage.items;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class SimpleStorageRecipes {

    private SimpleStorageRecipes() {
        throw new IllegalStateException("Utility class");
    }

    protected static final ItemStack[] CHROMIUM_DUST = new ItemStack[] {
                SimpleStorageItemStacks.CHUNK_CHROMITE.item(),    null,   null,
                null,                   null,   null,
                null,                   null,   null
    };
    protected static final ItemStack[] BASTNAESITE_DUST = new ItemStack[] {
                SimpleStorageItemStacks.CHUNK_BASTNAESITE.item(),    null,   null,
                null,                   null,   null,
                null,                   null,   null
    };
    protected static final ItemStack[] ANTIMONY_DUST = new ItemStack[] {
                SimpleStorageItemStacks.CHUNK_ANTIMONY.item(),    null,   null,
                null,                   null,   null,
                null,                   null,   null
    };
    protected static final ItemStack[] RHENIUM_DUST = new ItemStack[] {
                SimpleStorageItemStacks.RHENIUM_CHUNK.item(),     null,   null,
                null,                   null,   null,
                null,                   null,   null
    };
    protected static final ItemStack[] CHROMIUM_INGOT = new ItemStack[] {
                SimpleStorageItemStacks.CHROMIUM_DUST.item(), null,      null,
                null,               null,      null,
                null,               null,      null
    };
    protected static final ItemStack[] BASTNAESITE_INGOT = new ItemStack[] {
                SimpleStorageItemStacks.BASTNAESITE_DUST.item(),  null,      null,
                null,                   null,      null,
                null,                   null,      null
    };
    protected static final ItemStack[] ANTIMONY_INGOT = new ItemStack[] {
                SimpleStorageItemStacks.ANTIMONY_DUST.item(),  null,      null,
                null,                   null,      null,
                null,                   null,      null
    };
    protected static final ItemStack[] RHENIUM_INGOT = new ItemStack[] {
                SimpleStorageItemStacks.RHENIUM_DUST.item(),    null,      null,
                null,                 null,      null,
                null,                 null,      null
    };
    protected static final ItemStack[] ELECTRUM_INGOT = new ItemStack[] {
                SlimefunItems.GOLD_6K.item(),  SlimefunItems.SILVER_DUST.item(),  null,
                null,                   null,                       null,
                null,                   null,                       null
    };
    protected static final ItemStack[] CUPRONICKEL_INGOT = new ItemStack[] {
                SlimefunItems.COPPER_INGOT.item(), SlimefunItems.COPPER_DUST.item(), SlimefunItems.NICKEL_INGOT.item(),
                null,                       null,                       null,
                null,                       null,                       null
    };
    protected static final ItemStack[] PEWTER_INGOT = new ItemStack[] {
            SlimefunItems.TIN_INGOT.item(),    SlimefunItems.TIN_DUST.item(), SlimefunItems.SILVER_INGOT.item(),
            SlimefunItems.SILVER_DUST.item(),  null,                   null,
            null,                       null,                   null
    };
    protected static final ItemStack[] NICKEL_SUPERALLOY_INGOT = new ItemStack[] {
            SimpleStorageItemStacks.RHENIUM_INGOT.item(),  SlimefunItems.NICKEL_INGOT.item(), SlimefunItems.COBALT_INGOT.item(),
            SlimefunItems.COPPER_INGOT.item(),             SlimefunItems.IRON_DUST.item(),    null,
            null,                                   null,                       null
    };
    protected static final ItemStack[] ZAMAK_1 = new ItemStack[] {
                SlimefunItems.ZINC_INGOT.item(),   SlimefunItems.ALUMINUM_DUST.item(),    SlimefunItems.COPPER_DUST.item(),
                null,                       null,                           null,
                null,                       null,                           null
    };
    protected static final ItemStack[] ZAMAK_2 = new ItemStack[] {
                SimpleStorageItemStacks.ZAMAK_1.item(), SlimefunItems.COPPER_DUST.item(),  null,
                null,         null,                       null,
                null,         null,                       null
    };
    protected static final ItemStack[] ZAMAK_3 = new ItemStack[] {
                SimpleStorageItemStacks.ZAMAK_2.item(), SlimefunItems.MAGNESIUM_INGOT.item(),  SlimefunItems.MAGNESIUM_DUST.item(),
                null,                               null,                           null,
                null,                               null,                           null
    };
    protected static final ItemStack[] NISIL = new ItemStack[] {
                SlimefunItems.NICKEL_INGOT.item(), SlimefunItems.SILICON.item(),      new ItemStack(Material.SAND),
                null,                       null,                       null,
                null,                       null,                       null
    };
    protected static final ItemStack[] NICROSIL = new ItemStack[] {
                SlimefunItems.NICKEL_INGOT.item(), SlimefunItems.SILICON.item(),      SimpleStorageItemStacks.CHROMIUM_INGOT.item(),
                null,                       null,                       null,
                null,                       null,                       null
    };
    protected static final ItemStack[] CUPRONICKEL_REINFORCED = new ItemStack[] {
                SimpleStorageItemStacks.CUPRONICKEL_INGOT.item(), SimpleStorageItemStacks.BASTNAESITE_INGOT.item(), null,
                null,              null,                   null,
                null,              null,                   null
    };
    protected static final ItemStack[] PEWTER_REINFORCED = new ItemStack[] {
                SimpleStorageItemStacks.PEWTER_INGOT.item(),   SimpleStorageItemStacks.ANTIMONY_INGOT.item(), null,
                null,           null,                null,
                null,           null,                null
    };
    protected static final ItemStack[] ELECTRUM_PLATE = new ItemStack[] {
                SimpleStorageItemStacks.DIE_BASIC.item(),    new SlimefunItemStack(SimpleStorageItemStacks.ELECTRUM_INGOT, 4).item(),   null,
                null,              null,                                              null,
                null,              null,                                              null
    };
    protected static final ItemStack[] CUPRONICKEL_PLATE = new ItemStack[] {
                SimpleStorageItemStacks.DIE_REINFORCED.item(), new SlimefunItemStack(SimpleStorageItemStacks.CUPRONICKEL_REINFORCED, 4).item(), null,
                null,                null,                                                          null,
                null,                null,                                                          null
    };
    protected static final ItemStack[] PEWTER_PLATE = new ItemStack[] {
                SimpleStorageItemStacks.DIE_ADVANCED.item(),   new SlimefunItemStack(SimpleStorageItemStacks.PEWTER_REINFORCED, 4).item(), null,
                null,                null,                                             null,
                null,                null,                                             null
    };
    protected static final ItemStack[] NICKEL_SUPERALLOY_PLATE = new ItemStack[] {
                SimpleStorageItemStacks.DIE_ADVANCED.item(),   new SlimefunItemStack(SimpleStorageItemStacks.NICKEL_SUPER_INGOT, 4).item(), null,
                null,                null,                                             null,
                null,                null,                                             null
    };
    protected static final ItemStack[] COMBINED_PLATE = new ItemStack[] {
                SimpleStorageItemStacks.PEWTER_PLATE.item(),   SimpleStorageItemStacks.NICKEL_SUPERALLOY_PLATE.item(), null,
                null,                null,                                             null,
                null,                null,                                             null
    };
    protected static final ItemStack[] DIE_BASIC = new ItemStack[] {
            SimpleStorageItemStacks.ZAMAK_1.item(),   null,   null,
            null,           null,   null,
            null,           null,   null
    };
    protected static final ItemStack[] DIE_REINFORCED = new ItemStack[] {
            SimpleStorageItemStacks.ZAMAK_2.item(),   null,   null,
            null,           null,   null,
            null,           null,   null
    };
    protected static final ItemStack[] DIE_ADVANCED = new ItemStack[] {
            SimpleStorageItemStacks.ZAMAK_3.item(),   null,   null,
            null,           null,   null,
            null,           null,   null
    };
    protected static final ItemStack[] THERMOCOUPLE = new ItemStack[] {
                SimpleStorageItemStacks.NISIL.item(),    SimpleStorageItemStacks.NICROSIL.item(), null,
                null,           null,           null,
                null,           null,           null
    };
    protected static final ItemStack[] CHEST_CORE_BASIC = new ItemStack[] {
            SimpleStorageItemStacks.ELECTRUM_PLATE.item(), SimpleStorageItemStacks.ELECTRUM_PLATE.item(), SimpleStorageItemStacks.ELECTRUM_PLATE.item(),
            SimpleStorageItemStacks.ELECTRUM_PLATE.item(), SimpleStorageItemStacks.ANGELITE.item(),   SimpleStorageItemStacks.ELECTRUM_PLATE.item(),
            SimpleStorageItemStacks.ELECTRUM_PLATE.item(), SimpleStorageItemStacks.THERMOCOUPLE.item(),  SimpleStorageItemStacks.ELECTRUM_PLATE.item()
    };
    protected static final ItemStack[] CHEST_CORE_REINFORCED = new ItemStack[] {
            SimpleStorageItemStacks.CUPRONICKEL_PLATE.item(), SimpleStorageItemStacks.CUPRONICKEL_PLATE.item(), SimpleStorageItemStacks.CUPRONICKEL_PLATE.item(),
            SimpleStorageItemStacks.CUPRONICKEL_PLATE.item(), SimpleStorageItemStacks.PROUSTITE.item(),     SimpleStorageItemStacks.CUPRONICKEL_PLATE.item(),
            SimpleStorageItemStacks.CUPRONICKEL_PLATE.item(), SimpleStorageItemStacks.THERMOCOUPLE.item(),     SimpleStorageItemStacks.CUPRONICKEL_PLATE.item()
    };
    protected static final ItemStack[] CHEST_CORE_ADVANCED = new ItemStack[] {
            SimpleStorageItemStacks.PEWTER_PLATE.item(), SimpleStorageItemStacks.PEWTER_PLATE.item(), SimpleStorageItemStacks.PEWTER_PLATE.item(),
            SimpleStorageItemStacks.PEWTER_PLATE.item(), SimpleStorageItemStacks.SHORTITE.item(), SimpleStorageItemStacks.PEWTER_PLATE.item(),
            SimpleStorageItemStacks.PEWTER_PLATE.item(), SimpleStorageItemStacks.THERMOCOUPLE.item(), SimpleStorageItemStacks.PEWTER_PLATE.item()
    };
    protected static final ItemStack[] COMMUNICATION_BLOCK = new ItemStack[] {
            SimpleStorageItemStacks.ELECTRUM_PLATE.item(),    SlimefunItems.GOLD_24K_BLOCK.item(),     SimpleStorageItemStacks.ELECTRUM_PLATE.item(),
            SlimefunItems.GOLD_24K.item(), SimpleStorageItemStacks.CHEST_CORE_BASIC.item(),             SlimefunItems.GOLD_24K.item(),
            SimpleStorageItemStacks.ELECTRUM_PLATE.item(),    new ItemStack(Material.REPEATER), SimpleStorageItemStacks.ELECTRUM_PLATE.item()
    };
    protected static final ItemStack[] DISPLAY_PANEL = new ItemStack[] {
            SimpleStorageItemStacks.CLEARQUARTZ.item(),   SimpleStorageItemStacks.CLEARQUARTZ.item(),                  SimpleStorageItemStacks.CLEARQUARTZ.item(),
            SimpleStorageItemStacks.PEWTER_PLATE.item(), new ItemStack(Material.REPEATER), SimpleStorageItemStacks.PEWTER_PLATE.item(),
            SimpleStorageItemStacks.PEWTER_PLATE.item(), SlimefunItems.BLISTERING_INGOT_3.item(), SimpleStorageItemStacks.PEWTER_PLATE.item()
    };
    protected static final ItemStack[] DIE_PRESS = new ItemStack[] {
            SimpleStorageItemStacks.ZAMAK_1.item(), new ItemStack(Material.PISTON), SimpleStorageItemStacks.ZAMAK_1.item(),
            SimpleStorageItemStacks.ZAMAK_1.item(), null,                           SimpleStorageItemStacks.ZAMAK_1.item(),
            SimpleStorageItemStacks.ZAMAK_2.item(), new ItemStack(Material.PISTON), SimpleStorageItemStacks.ZAMAK_2.item()
    };
    protected static final ItemStack[] METAL_PRESS_BASIC = new ItemStack[] {
            SimpleStorageItemStacks.ZAMAK_3.item(), new ItemStack(Material.STICKY_PISTON), SimpleStorageItemStacks.ZAMAK_3.item(),
            SimpleStorageItemStacks.ZAMAK_3.item(), SimpleStorageItemStacks.DIE_BASIC.item(),                        SimpleStorageItemStacks.ZAMAK_3.item(),
            SimpleStorageItemStacks.ZAMAK_3.item(), new ItemStack(Material.STICKY_PISTON), SimpleStorageItemStacks.ZAMAK_3.item()
    };
    protected static final ItemStack[] ENDERATOR = new ItemStack[] {
            SimpleStorageItemStacks.PEWTER_REINFORCED.item(),      new ItemStack(Material.END_CRYSTAL), SimpleStorageItemStacks.PEWTER_REINFORCED.item(),
            SimpleStorageItemStacks.CUPRONICKEL_REINFORCED.item(), null,                                SimpleStorageItemStacks.CUPRONICKEL_REINFORCED.item(),
            SimpleStorageItemStacks.CUPRONICKEL_REINFORCED.item(), SimpleStorageItemStacks.SHORTITE.item(),                   SimpleStorageItemStacks.CUPRONICKEL_REINFORCED.item()
    };
    protected static final ItemStack[] CHEST_IRON = new ItemStack[] {
            new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.IRON_BLOCK),     new ItemStack(Material.IRON_BLOCK),
            new ItemStack(Material.IRON_BLOCK), SimpleStorageItemStacks.CHEST_CORE_BASIC.item(),                   new ItemStack(Material.IRON_BLOCK),
            new ItemStack(Material.IRON_BLOCK), SlimefunItems.REINFORCED_ALLOY_INGOT.item(),   new ItemStack(Material.IRON_BLOCK)
    };
    protected static final ItemStack[] CHEST_GOLD = new ItemStack[] {
            SlimefunItems.GOLD_24K_BLOCK.item(), SimpleStorageItemStacks.CHEST_IRON.item(),                  SlimefunItems.GOLD_24K_BLOCK.item(),
            SlimefunItems.GOLD_24K_BLOCK.item(), SimpleStorageItemStacks.CHEST_CORE_REINFORCED.item(),        SlimefunItems.GOLD_24K_BLOCK.item(),
            SlimefunItems.GOLD_24K_BLOCK.item(), SlimefunItems.BLISTERING_INGOT_3.item(),   SlimefunItems.GOLD_24K_BLOCK.item()
    };
    protected static final ItemStack[] CHEST_DIAMOND = new ItemStack[] {
            new ItemStack(Material.DIAMOND_BLOCK), SimpleStorageItemStacks.CHEST_GOLD.item(),                new ItemStack(Material.DIAMOND_BLOCK),
            new ItemStack(Material.DIAMOND_BLOCK), SimpleStorageItemStacks.CHEST_CORE_ADVANCED.item(),        new ItemStack(Material.DIAMOND_BLOCK),
            new ItemStack(Material.DIAMOND_BLOCK), SlimefunItems.BOOSTED_URANIUM.item(),  new ItemStack(Material.DIAMOND_BLOCK)
    };
    protected static final ItemStack[] INVENTORY_CELL = new ItemStack[] {
            SimpleStorageItemStacks.CHEST_DIAMOND.item(), new ItemStack(Material.ENDER_PEARL, 16), null,
            null,               null,                                           null,
            null,               null,                                           null,
    };
    protected static final ItemStack[] CHEST_MASTER = new ItemStack[] {
            SimpleStorageItemStacks.COMBINED_PLATE.item(), SimpleStorageItemStacks.DISPLAY_PANEL.item(),        SimpleStorageItemStacks.COMBINED_PLATE.item(),
            SimpleStorageItemStacks.COMBINED_PLATE.item(), SimpleStorageItemStacks.CHEST_DIAMOND.item(),        SimpleStorageItemStacks.COMBINED_PLATE.item(),
            SimpleStorageItemStacks.COMBINED_PLATE.item(), SimpleStorageItemStacks.COMMUNICATION_BLOCK.item(),  SimpleStorageItemStacks.COMBINED_PLATE.item()
    };
    protected static final ItemStack[] AUGMENT_BARREL = new ItemStack[] {
            new ItemStack(Material.OAK_PLANKS), SimpleStorageItemStacks.COMBINED_PLATE.item(),         new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS), SimpleStorageItemStacks.PROUSTITE.item(),              new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS), SimpleStorageItemStacks.COMMUNICATION_BLOCK.item(),    new ItemStack(Material.OAK_PLANKS)
    };
}
