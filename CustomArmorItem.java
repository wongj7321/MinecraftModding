package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.SoundEvents;

import javax.annotation.Nullable;

public class CustomArmorItem extends ArmorItem {
    //armor material
    private static IArmorMaterial customMaterial = ItemUtils.buildArmorMaterial("gelore", 22, new int[]{10, 10, 10, 10}, 5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0f, 0.3f, "cooled:gelore");

    //properties of the armor
    private static Properties propeties = new Properties().group(ItemGroup.COMBAT);

    //static instance to register the item
    public static Item HELM = new CustomArmorItem(customMaterial, EquipmentSlotType.HEAD, propeties).setRegistryName(BaseMod.MODID, "customhelm");

    //constructor
    public CustomArmorItem(IArmorMaterial material, EquipmentSlotType type, Properties properties) {
        super(material, type, properties);
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        if (slot == EquipmentSlotType.LEGS) {
            return "cooled:textures/models/armor/custom_armor_layer_2.png";
        } else {
            return "cooled:textures/models/armor/custom_armor_layer_1.png";
        }
    }
}
