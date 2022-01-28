package com.kyonan.newmod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod(modid = SampleMod.MOD_ID, version = SampleMod.MOD_VERSION)
public class SampleMod {
    public static final String MOD_ID = "samplemod";
    public static final String MOD_VERSION = "1.0";

    public static Item Bronze;
    public static Item Bronze_Sword;
    public static Item Bronze_Pickaxe;
    public static Item Bronze_Shovel;
    public static Item Bronze_Axe;
    public static Item Bronze_Hoe;

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {

        Bronze = new Item()
                .setCreativeTab(CreativeTabs.MATERIALS)
                .setUnlocalizedName("bronze")
                .setRegistryName("bronze")
                .setMaxStackSize(64);

        Bronze_Sword = new AddSword(EnumHelper.addToolMaterial("Bronze_Sword", 1, 170, 10, 3, 1))
                .setUnlocalizedName("bronze_sword")
                .setRegistryName("bronze_sword");

        Bronze_Shovel = new AddPickaxe(EnumHelper.addToolMaterial("Bronze_Shovel", 1, 170, 10, 0, 1))
                .setUnlocalizedName("bronze_shovel")
                .setRegistryName("bronze_shovel");

        Bronze_Pickaxe = new AddPickaxe(EnumHelper.addToolMaterial("Bronze_Pickaxe", 35, 170, 10, 0, 1))
                .setUnlocalizedName("bronze_pickaxe")
                .setRegistryName("bronze_pickaxe");


        Bronze_Axe = new AddAxe(EnumHelper.addToolMaterial("Bronze_Axe", 1, 170, 10, 8, 1), 8, -3.2f)
                .setUnlocalizedName("bronze_axe")
                .setRegistryName("bronze_axe");

        Bronze_Hoe = new AddPickaxe(EnumHelper.addToolMaterial("bronze_Hoe", 1, 170, 10, -1, 1))
                .setUnlocalizedName("bronze_hoe")
                .setRegistryName("bronze_hoe");

        ForgeRegistries.ITEMS.register(Bronze);
        ForgeRegistries.ITEMS.register(Bronze_Sword);
        ForgeRegistries.ITEMS.register(Bronze_Pickaxe);
        ForgeRegistries.ITEMS.register(Bronze_Shovel);
        ForgeRegistries.ITEMS.register(Bronze_Axe);
        ForgeRegistries.ITEMS.register(Bronze_Hoe);

        if(event.getSide().isClient()) {
            ModelLoader.setCustomModelResourceLocation(Bronze, 0, new ModelResourceLocation("samplemod:bronze"));
            ModelLoader.setCustomModelResourceLocation(Bronze_Sword, 0, new ModelResourceLocation("samplemod:bronze_sword"));
            ModelLoader.setCustomModelResourceLocation(Bronze_Pickaxe, 0, new ModelResourceLocation("samplemod:bronze_pickaxe"));
            ModelLoader.setCustomModelResourceLocation(Bronze_Shovel, 0, new ModelResourceLocation("samplemod:bronze_shovel"));
            ModelLoader.setCustomModelResourceLocation(Bronze_Axe, 0, new ModelResourceLocation("samplemod:bronze_axe"));
            ModelLoader.setCustomModelResourceLocation(Bronze_Hoe, 0, new ModelResourceLocation("samplemod:bronze_hoe"));
        }
    }

    public static class AddAxe extends ItemAxe {
        protected AddAxe(ToolMaterial material, float attackDamage, float attackSpeed) {
            super(material, attackDamage, attackSpeed);
        }
    }

    public static class AddHoe extends ItemHoe {
        protected AddHoe(ToolMaterial material) {
            super(material);
        }
    }

    public static class AddPickaxe extends ItemPickaxe {
        protected AddPickaxe(ToolMaterial material) {
            super(material);
        }
    }

    public static class AddShovel extends ItemSpade {
        public AddShovel(ToolMaterial material) {
            super(material);
        }
    }

    public static class AddSword extends ItemSword{
        public AddSword(ToolMaterial material) {
            super(material);
        }
    }
}
