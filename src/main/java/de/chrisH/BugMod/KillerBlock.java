package de.chrisH.BugMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class KillerBlock extends Block{

	private String unlocalizedName;
	
	public KillerBlock(Material materialIn, String unlocalizedName, float hardness, float resistance, float lightLevel,String tool, int harvestLevel) {
		super(materialIn);
		
		this.unlocalizedName = unlocalizedName;
		
		setUnlocalizedName(unlocalizedName);
		setRegistryName(unlocalizedName);
		setHardness(hardness);
		setResistance(resistance);
		setLightLevel(lightLevel);
		setHarvestLevel(tool, harvestLevel);
		
		
	}

	public void registerTexture(){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(this),0, new ModelResourceLocation(this.getUnlocalizedName().substring(5),"inventory"));
		
		
		System.out.println("###################################");
		System.out.println("###################################");

		System.out.println(unlocalizedName);
		System.out.println("" + this.getUnlocalizedName().substring(5));

		System.out.println("###################################");
		System.out.println("###################################");

	}
	
	 
	
	
}



