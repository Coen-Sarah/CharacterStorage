package com.example.characterstorage.model.characterRace;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.characterstorage.model.feature.Feature;

@Entity(tableName = "raceTable")
public class BaseRace {

    @PrimaryKey(autoGenerate = true)
    int baseRaceId;
    String name;
    String size;
    int baseSpeed;

    public BaseRace(){}

    public BaseRace(String name, String size, int baseSpeed) {
        this.name = name;
        this.size = size;
        this.baseSpeed = baseSpeed;
    }

    public BaseRace(int baseRaceId, String name, String size, int baseSpeed) {
        this.baseRaceId = baseRaceId;
        this.name = name;
        this.size = size;
        this.baseSpeed = baseSpeed;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getBaseSpeed() {
        return baseSpeed;
    }

    public void setBaseSpeed(int baseSpeed) {
        this.baseSpeed = baseSpeed;
    }
}
