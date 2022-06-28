package com.example.characterstorage.model.characterClass;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.characterstorage.model.feature.Feature;
import com.example.characterstorage.model.item.Item;
@Entity(tableName="classTable")
public class BaseClass {

    @PrimaryKey(autoGenerate = true)
    int baseClassId;
    String name;
    String hitDie;
    String proficiencies;
    int spellSlotId;

    public BaseClass(){}

    public BaseClass(String name, String hitDie, String proficiencies, int spellSlotId) {
        this.name = name;
        this.hitDie = hitDie;
        this.proficiencies = proficiencies;
        this.spellSlotId = spellSlotId;
    }

    public BaseClass(int baseClassId, String name, String hitDie, String proficiencies, int spellSlotId) {
        this.baseClassId = baseClassId;
        this.name = name;
        this.hitDie = hitDie;
        this.proficiencies = proficiencies;
        this.spellSlotId = spellSlotId;
    }

    public int getBaseClassId() {
        return baseClassId;
    }

    public void setBaseClassId(int baseClassId) {
        this.baseClassId = baseClassId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHitDie() {
        return hitDie;
    }

    public void setHitDie(String hitDie) {
        this.hitDie = hitDie;
    }

    public String getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(String proficiencies) {
        this.proficiencies = proficiencies;
    }

    public int getSpellSlotId() {
        return spellSlotId;
    }

    public void setSpellSlotId(int spellSlotId) {
        this.spellSlotId = spellSlotId;
    }
}
