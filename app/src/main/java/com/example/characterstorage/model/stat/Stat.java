package com.example.characterstorage.model.stat;

import androidx.room.Entity;

@Entity (tableName = "statTable", primaryKeys = {"characterId", "statNameId"})
public class Stat {

    int characterId;
    int statNameId;
    int baseStat;
    int modifier;
    boolean isProficient;
    int bonus;

    public Stat() {
    }

    public Stat(int statNameId, int baseStat, boolean isProficient, int bonus) {
        this.statNameId = statNameId;
        this.baseStat = baseStat;
        this.isProficient = isProficient;
        this.bonus = bonus;
        setModifier();
    }

    public Stat(int characterId, int statNameId, int baseStat, boolean isProficient, int bonus) {
        this.characterId = characterId;
        this.statNameId = statNameId;
        this.baseStat = baseStat;
        this.isProficient = isProficient;
        this.bonus = bonus;
        setModifier();
    }

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    public int getStatNameId() {
        return statNameId;
    }

    public void setStatNameId(int statNameId) {
        this.statNameId = statNameId;
    }

    public int getBaseStat() {
        return baseStat;
    }

    public void setBaseStat(int baseStat) {
        this.baseStat = baseStat;
        setModifier();
    }

    public int getModifier() {
        return modifier;
    }

    public void setModifier() {
        this.modifier = (baseStat - 10) / 2;
    }

    public boolean isProficient() {
        return isProficient;
    }

    public void setProficient(boolean proficient) {
        isProficient = proficient;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getStatTotal(){
        return (baseStat + bonus);
    }
}
