package me.sfiguz7.extratools.implementation.tools;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ToolUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import me.sfiguz7.extratools.lists.ETItems;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

public class Hammer extends SimpleSlimefunItem<ToolUseHandler> {

    public Hammer() {
        super(ETItems.extra_tools, ETItems.HAMMER, RecipeType.MAGIC_WORKBENCH,
            new ItemStack[] {new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_INGOT),
                new ItemStack(Material.IRON_INGOT),
                new ItemStack(Material.IRON_INGOT), new ItemStack(Material.STICK), new ItemStack(Material.IRON_INGOT),
                null, new ItemStack(Material.STICK), null});
    }

    @Override
    public ToolUseHandler getItemHandler() {
        return (e, tool, fortune, drops) -> {
            if (Slimefun.getPermissionsService().hasPermission(e.getPlayer(), Hammer.this)) {
                Block block = e.getBlock();
                ItemStack drop = getDrop(block);
                if (drop != null) {
                    block.getWorld().dropItemNaturally(block.getLocation(), drop);
                    e.setDropItems(false);
                }
            }
        };
    }

    public ItemStack getDrop(Block block) {
        return switch (block.getType()) {
            case STONE, GRANITE, DIORITE, ANDESITE, COBBLESTONE,
                 DEEPSLATE, COBBLED_DEEPSLATE, TUFF, CALCITE -> new ItemStack(Material.GRAVEL);
            case GRAVEL, GRASS_BLOCK, DIRT, COARSE_DIRT, PODZOL -> new ItemStack(Material.SAND);
            case IRON_ORE, DEEPSLATE_IRON_ORE -> SlimefunItems.IRON_DUST;
            case GOLD_ORE, DEEPSLATE_GOLD_ORE -> SlimefunItems.GOLD_DUST;
            case COPPER_ORE, DEEPSLATE_COPPER_ORE -> SlimefunItems.COPPER_DUST;
            case NETHERRACK -> new ItemStack(Material.SOUL_SAND);
            default -> null;
        };
    }
}
