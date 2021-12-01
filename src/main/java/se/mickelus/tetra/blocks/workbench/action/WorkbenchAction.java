package se.mickelus.tetra.blocks.workbench.action;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.ToolType;
import se.mickelus.tetra.blocks.workbench.WorkbenchTile;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.Map;

public interface WorkbenchAction {

    public String getKey();
    public boolean canPerformOn(@Nullable Player player, WorkbenchTile tile, ItemStack itemStack);
    public Collection<ToolType> getRequiredToolTypes(ItemStack itemStack);
    public int getRequiredToolLevel(ItemStack itemStack, ToolType toolType);
    public Map<ToolType, Integer> getRequiredTools(ItemStack itemStack);
    public void perform(Player player, ItemStack itemStack, WorkbenchTile workbench);

    public default boolean allowInWorldInteraction() {
        return false;
    }
}
