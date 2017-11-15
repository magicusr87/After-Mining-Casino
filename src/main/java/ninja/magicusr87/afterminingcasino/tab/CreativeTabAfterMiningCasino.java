package ninja.magicusr87.afterminingcasino.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabAfterMiningCasino extends CreativeTabs {
    public CreativeTabAfterMiningCasino(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.BOWL;
    }
}
