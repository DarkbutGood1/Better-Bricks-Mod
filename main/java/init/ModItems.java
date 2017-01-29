package init;

import items.ItemPositioncontrolwand;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item positioncontrolwand;
	
	public static void inti(){
		positioncontrolwand = new ItemPositioncontrolwand();
		
	}
	public static void register(){
		GameRegistry.register(positioncontrolwand);
	}
	public static void registerRenders(){
		registerRender(positioncontrolwand);
	}
	private static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
