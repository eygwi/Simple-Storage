package io.github.sefiraat.simplestorage.items.chests;

import io.github.sefiraat.simplestorage.items.Skulls;
import io.github.sefiraat.simplestorage.items.chests.network.NetworkElement;
import io.github.sefiraat.simplestorage.items.chests.network.NetworkElement.NetworkElementType;
import io.github.sefiraat.simplestorage.utils.Theme;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class GuiItems {

    private GuiItems() {
        throw new IllegalStateException("Utility class");
    }

    public static ItemStack menuBackground() {
        return CustomItemStack.create(
                Material.GRAY_STAINED_GLASS_PANE,
                Theme.PASSIVE + "Simple!",
                ""
        );
    }

    public static ItemStack menuInfo() {
        return CustomItemStack.create(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.GUI_NO1)),
                Theme.GUI_HEAD + "Info",
                "",
                "Page number : 1"
        );
    }

    public static ItemStack menuChestPageBack() {
        return CustomItemStack.create(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.GUI_BACK)),
                Theme.GUI_HEAD + "Back",
                "",
                Theme.CLICK_INFO + "Click to navigate back a page."
        );
    }

    public static ItemStack menuChestPageForward() {
        return CustomItemStack.create(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.GUI_FORWARD)),
                Theme.GUI_HEAD + "Forward",
                "",
                Theme.CLICK_INFO + "Click to navigate forward a page."
        );
    }

    public static ItemStack menuChestDummy() {
        return CustomItemStack.create(
                Material.LIGHT_GRAY_STAINED_GLASS_PANE,
                Theme.PASSIVE + "No item here"
        );
    }

    public static ItemStack menuMasterDummy() {
        return CustomItemStack.create(
                Material.LIGHT_GRAY_STAINED_GLASS_PANE,
                Theme.PASSIVE + "No inventory here"
        );
    }

    public static ItemStack menuClose() {
        return CustomItemStack.create(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.GUI_CLOSE)),
                Theme.GUI_HEAD + "Close"
        );
    }

    public static ItemStack menuRenameCell() {
        return CustomItemStack.create(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.GUI_RENAME_CELL)),
                Theme.GUI_HEAD + "Rename Cell"
        );
    }

    public static ItemStack menuSetMaterial() {
        return CustomItemStack.create(
                PlayerHead.getItemStack(PlayerSkin.fromBase64(Skulls.GUI_SET_ICON)),
                Theme.GUI_HEAD + "Set Icon",
                "",
                Theme.ITEM_TYPEDESC + "Click this with an item on your",
                Theme.ITEM_TYPEDESC + "mouse to set the icon for this inventory"
        );
    }

    public static ItemStack menuCell(NetworkElement ne) {

        ItemStack i = NetworkElement.getItemStack(ne);
        String name;
        String storedName = ne.getDisplayName();
        if (storedName == null) {
            name = ChatColor.WHITE + "Scanned Inventory";
        } else {
            name = storedName;
        }

        if (ne.getType() == NetworkElement.NetworkElementType.INVENTORY_CELL) {
            return menuCellNormal(i, name);
        } else if (
                ne.getType() == NetworkElementType.INFINITY_BARREL ||
                ne.getType() == NetworkElementType.FLUFFY_BARREL
        ) {
            return menuCellBarrel(i, name, ne);
        } else {
            return menuCellError();
        }
    }

    public static ItemStack menuCellNormal(ItemStack i, String name) {
        return CustomItemStack.create(
                i,
                Theme.GUI_HEAD + name,
                "",
                Theme.ITEM_TYPEDESC + "Inventory Type: " + NetworkElement.networkElementTypeName(NetworkElement.NetworkElementType.INVENTORY_CELL),
                "",
                Theme.CLICK_INFO + "Left click: " + ChatColor.WHITE + "Open inventory",
                Theme.CLICK_INFO + "Right click: " + ChatColor.WHITE + "Highlight inventory"
        );
    }

    public static ItemStack menuCellBarrel(ItemStack i, String name, NetworkElement networkElement) {
        String barrelAmount = Theme.ITEM_TYPEDESC + "Content: " + ChatColor.WHITE + networkElement.getBarrelAmount();
        return CustomItemStack.create(
                i,
                Theme.GUI_HEAD + name,
                "",
                Theme.ITEM_TYPEDESC + "Inventory Type: " + NetworkElement.networkElementTypeName(networkElement.getType()),
                "",
                barrelAmount,
                "",
                Theme.CLICK_INFO + "Left click: " + ChatColor.WHITE + "Open inventory",
                Theme.CLICK_INFO + "Right click: " + ChatColor.WHITE + "Highlight inventory"
        );
    }

    public static ItemStack menuCellError() {
        return CustomItemStack.create(
                Material.BARRIER,
                Theme.GUI_HEAD + "Scanned Inventory (Error)",
                "",
                Theme.ITEM_TYPEDESC + "Inventory Type: Unknown/Error",
                "",
                Theme.CLICK_INFO + "Left click: " + ChatColor.WHITE + "Open inventory",
                Theme.CLICK_INFO + "Right click: " + ChatColor.WHITE + "Highlight inventory"
        );
    }


}
