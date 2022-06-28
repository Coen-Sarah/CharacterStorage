package com.example.characterstorage.model.stat;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "statNameTable")
public class StatName {

    @PrimaryKey(autoGenerate = false)
    int statNameId;
    String statName;

    public StatName() {
    }

    public StatName(int statNameId, String statName) {
        this.statNameId = statNameId;
        this.statName = statName;
    }

    public int getStatNameId() {
        return statNameId;
    }

    public void setStatNameId(int statNameId) {
        this.statNameId = statNameId;
    }

    public String getStatName() {
        return statName;
    }

    public void setStatName(String statName) {
        this.statName = statName;
    }
}
