package com.example.characterstorage.model.background;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.characterstorage.model.feature.Feature;
import com.example.characterstorage.model.item.Item;

@Entity(tableName = "backgroundTable")
public class Background {

    @PrimaryKey(autoGenerate = true)
    int backgroundId;
    int characterId;
    String name;
    String traits;
    String ideal;
    String bond;
    String flaw;
    String proficiencies;
    String languages;

    public Background(){}

    public Background(int characterId, String name,
                      String traits, String ideal, String bond, String flaw,
                      String proficiencies, String languages) {
        this.characterId = characterId;
        this.name = name;
        this.traits = traits;
        this.ideal = ideal;
        this.bond = bond;
        this.flaw = flaw;
        this.proficiencies = proficiencies;
        this.languages = languages;
    }

    public Background(int backgroundId, int characterId, String name,
                      String traits, String ideal, String bond, String flaw,
                      String proficiencies, String languages) {
        this.backgroundId = backgroundId;
        this.characterId = characterId;
        this.name = name;
        this.traits = traits;
        this.ideal = ideal;
        this.bond = bond;
        this.flaw = flaw;
        this.proficiencies = proficiencies;
        this.languages = languages;
    }

    public int getBackgroundId() {
        return backgroundId;
    }

    public void setBackgroundId(int backgroundId) {
        this.backgroundId = backgroundId;
    }

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTraits() {
        return traits;
    }

    public void setTraits(String traits) {
        this.traits = traits;
    }

    public String getIdeal() {
        return ideal;
    }

    public void setIdeal(String ideal) {
        this.ideal = ideal;
    }

    public String getBond() {
        return bond;
    }

    public void setBond(String bond) {
        this.bond = bond;
    }

    public String getFlaw() {
        return flaw;
    }

    public void setFlaw(String flaw) {
        this.flaw = flaw;
    }

    public String getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(String proficiencies) {
        this.proficiencies = proficiencies;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

}
