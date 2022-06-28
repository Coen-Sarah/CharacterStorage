package com.example.characterstorage.model.item;

import androidx.room.Entity;

@Entity(tableName = "armorTable")
public class Armor extends Item {

    int acBonus;
    int strengthRequirement;
    String armorType;

    public Armor() {
    }

    public Armor(int itemId, String itemName, String description, float weight, int acBonus, int strengthRequirement, String armorType) {
        super(itemId, itemName, description, weight);
        this.acBonus = acBonus;
        this.strengthRequirement = strengthRequirement;
        this.armorType = armorType;
    }

    public Armor(String itemName, String description, float weight, int acBonus, int strengthRequirement, String armorType) {
        super(itemName, description, weight);
        this.acBonus = acBonus;
        this.strengthRequirement = strengthRequirement;
        this.armorType = armorType;
    }

    public int getAcBonus() {
        return acBonus;
    }

    public void setAcBonus(int acBonus) {
        this.acBonus = acBonus;
    }

    public int getStrengthRequirement() {
        return strengthRequirement;
    }

    public void setStrengthRequirement(int strengthRequirement) {
        this.strengthRequirement = strengthRequirement;
    }

    public String getArmorType() {
        return armorType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }
}
