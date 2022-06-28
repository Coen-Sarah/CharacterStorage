package com.example.characterstorage.model.characterClass;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.characterstorage.model.feature.Feature;

@Entity(tableName = "subClassTable")
public class SubClass {

    @PrimaryKey(autoGenerate = true)
    int subClassId;
    int baseClassId;
    int spellSlotId;

    public SubClass(){}

    public SubClass(int baseClassId, int spellSlotId) {
        this.baseClassId = baseClassId;
        this.spellSlotId = spellSlotId;
    }

    public SubClass(int subClassId, int baseClassId, int spellSlotId) {
        this.subClassId = subClassId;
        this.baseClassId = baseClassId;
        this.spellSlotId = spellSlotId;
    }

    public int getSubClassId() {
        return subClassId;
    }

    public void setSubClassId(int subClassId) {
        this.subClassId = subClassId;
    }

    public int getBaseClassId() {
        return baseClassId;
    }

    public void setBaseClassId(int baseClassId) {
        this.baseClassId = baseClassId;
    }

    public int getSpellSlotId() {
        return spellSlotId;
    }

    public void setSpellSlotId(int spellSlotId) {
        this.spellSlotId = spellSlotId;
    }
}
