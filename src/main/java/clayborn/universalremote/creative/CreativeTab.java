package clayborn.universalremote.creative;

import clayborn.universalremote.items.ItemRegistry;
import clayborn.universalremote.items.ItemUniversalRemote;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class CreativeTab extends CreativeTabs {

	public static final CreativeTab INSTANCE = new CreativeTab("universalremotetab");
	
	public CreativeTab(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		// surely there is a better way to do this...
		
		ItemStack stack = new ItemStack(ItemRegistry.Items().UniveralRemote);
		
		NBTTagCompound tag = null;
		
        if(!stack.hasTagCompound()){
        	tag = new NBTTagCompound();
        } else {
        	tag = stack.getTagCompound();
        }
        
        tag.setInteger("energy", ItemUniversalRemote.energyCapacity);
        
        stack.setTagCompound(tag);        
		
		return stack;
	}

}
