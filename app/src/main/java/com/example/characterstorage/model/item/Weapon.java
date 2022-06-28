package com.example.characterstorage.model.item;


import androidx.room.Entity;

@Entity (tableName = "weaponTable")
public class Weapon extends Item{

    String damage;
    String weaponType;
    String damageType;
    String range;

    public Weapon() {
    }

    public Weapon(int itemId, String itemName, String description, double weight, String damage, String weaponType, String damageType, String range) {
        super(itemId, itemName, description, weight);
        this.damage = damage;
        this.weaponType = weaponType;
        this.damageType = damageType;
        this.range = range;
    }

    public Weapon(String itemName, String description, double weight, String damage, String weaponType, String damageType, String range) {
        super(itemName, description, weight);
        this.damage = damage;
        this.weaponType = weaponType;
        this.damageType = damageType;
        this.range = range;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }
}
