package com.example.characterstorage.model.characterRace;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.characterstorage.model.feature.Feature;

@Entity(tableName = "subRaceTable")
public class SubRace {

    @PrimaryKey(autoGenerate = true)
    int subRaceId;
    int baseRaceId;
    String name;

    public SubRace(){}

    public SubRace(int subRaceId, int baseRaceId, String name) {
        this.subRaceId = subRaceId;
        this.baseRaceId = baseRaceId;
        this.name = name;
    }

    public SubRace(int baseRaceId, String name) {
        this.baseRaceId = baseRaceId;
        this.name = name;
    }

    public int getSubRaceId() {
        return subRaceId;
    }

    public void setSubRaceId(int subRaceId) {
        this.subRaceId = subRaceId;
    }

    public int getBaseRaceId() {
        return baseRaceId;
    }

    public void setBaseRaceId(int baseRaceId) {
        this.baseRaceId = baseRaceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
