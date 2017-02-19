package de.chrisH.BugMod;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scala.reflect.internal.Mirrors.Roots;

@Mod(modid = "bugmod", name = "BugMod", version = "1.0")
public class BugMod {
	
	@Instance
	public static BugMod instance = new BugMod();
	
	KillerBlock coffeeblock;
	
	@EventHandler   
	public void preInit(FMLPreInitializationEvent e){
		coffeeblock = new KillerBlock(Material.WOOD, "coffee_block", 1.0F, 1.0F, 1.0F, "pickaxe", 0);
	}
	
	
	@EventHandler
	public void init(FMLInitializationEvent e ){
		
		loadBlocks();
		loadCraftingRecipies();
		
		
	}
	
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e){
		
		//oksay
	}
	
	private void loadCraftingRecipies(){
		//Normale Rezept
		GameRegistry.addRecipe(new ItemStack(Items.DIAMOND,8 /**Anzahl der Items die droppen **/ ), new Object[]{
				
				
			"#U#",
			" # ",
			"# #",
		'#', Blocks.DIRT,
		'U', Items.APPLE,
		// Undefiniert == Luft 
			
			
		});
		
		//ENDE
		
		//Formloses Rezept
		//GameRegistry.addShapelessRecipe(new ItemStack(Blocks.DIAMOND_BLOCK),new Object[]{Blocks.DIRT, this.coffeeblock});		
		
		//Schmelzrezept
		GameRegistry.addSmelting(Blocks.DIRT, new ItemStack(Blocks.BEDROCK), 1.0F);
			
		
	}
	
	private void loadBlocks(){
		
		//1. CoffeeBlock
		GameRegistry.register(coffeeblock);
		GameRegistry.register(new ItemBlock(coffeeblock).setRegistryName(coffeeblock.getRegistryName()));
		
		coffeeblock.registerTexture();			
		coffeeblock.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		//2. Next Block
		
		
	}
	
}
