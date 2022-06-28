package com.example.characterstorage.model.spell;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName="spellTable")
public class Spell {

    @PrimaryKey(autoGenerate = true)
    int spellId;
    String name;
    int level;
    String school;
    String castingType;
    String castingRequirements;
    boolean hasSomaticComponent;
    boolean hasMaterialComponent;
    boolean hasVerbalComponent;
    boolean needsConcentration;
    boolean isARitual;
    String description;

    public Spell(){}

    public Spell(String name, int level,
                 String school, String castingType, String castingRequirements,
                 boolean hasSomaticComponent, boolean hasMaterialComponent, boolean hasVerbalComponent,
                 boolean needsConcentration, boolean isARitual,
                 String description) {
        this.name = name;
        this.level = level;
        this.school = school;
        this.castingType = castingType;
        this.castingRequirements = castingRequirements;
        this.hasSomaticComponent = hasSomaticComponent;
        this.hasMaterialComponent = hasMaterialComponent;
        this.hasVerbalComponent = hasVerbalComponent;
        this.needsConcentration = needsConcentration;
        this.isARitual = isARitual;
        this.description = description;
    }

    public Spell(int spellId, String name, int level,
                 String school, String castingType, String castingRequirements,
                 boolean hasSomaticComponent, boolean hasMaterialComponent, boolean hasVerbalComponent,
                 boolean needsConcentration, boolean isARitual,
                 String description) {
        this.spellId = spellId;
        this.name = name;
        this.level = level;
        this.school = school;
        this.castingType = castingType;
        this.castingRequirements = castingRequirements;
        this.hasSomaticComponent = hasSomaticComponent;
        this.hasMaterialComponent = hasMaterialComponent;
        this.hasVerbalComponent = hasVerbalComponent;
        this.needsConcentration = needsConcentration;
        this.isARitual = isARitual;
        this.description = description;
    }

    public int getSpellId() {
        return spellId;
    }

    public void setSpellId(int spellId) {
        this.spellId = spellId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCastingType() {
        return castingType;
    }

    public void setCastingType(String castingType) {
        this.castingType = castingType;
    }

    public String getCastingRequirements() {
        return castingRequirements;
    }

    public void setCastingRequirements(String castingRequirements) {
        this.castingRequirements = castingRequirements;
    }

    public boolean isHasSomaticComponent() {
        return hasSomaticComponent;
    }

    public void setHasSomaticComponent(boolean hasSomaticComponent) {
        this.hasSomaticComponent = hasSomaticComponent;
    }

    public boolean isHasMaterialComponent() {
        return hasMaterialComponent;
    }

    public void setHasMaterialComponent(boolean hasMaterialComponent) {
        this.hasMaterialComponent = hasMaterialComponent;
    }

    public boolean isHasVerbalComponent() {
        return hasVerbalComponent;
    }

    public void setHasVerbalComponent(boolean hasVerbalComponent) {
        this.hasVerbalComponent = hasVerbalComponent;
    }

    public boolean isNeedsConcentration() {
        return needsConcentration;
    }

    public void setNeedsConcentration(boolean needsConcentration) {
        this.needsConcentration = needsConcentration;
    }

    public boolean isARitual() {
        return isARitual;
    }

    public void setARitual(boolean ARitual) {
        isARitual = ARitual;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
