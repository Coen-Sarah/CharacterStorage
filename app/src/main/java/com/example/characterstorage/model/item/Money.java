package com.example.characterstorage.model.item;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "moneyTable")
public class Money {

    @PrimaryKey(autoGenerate = true)
    int moneyId;
    int characterId;
    int copper;
    int silver;
    int gold;
    int platinum;

    public Money(){}

    public Money(int characterId, int copper, int silver, int gold, int platinum) {
        this.characterId = characterId;
        this.copper = copper;
        this.silver = silver;
        this.gold = gold;
        this.platinum = platinum;
    }

    public Money(int moneyId, int characterId, int copper, int silver, int gold, int platinum) {
        this.moneyId = moneyId;
        this.characterId = characterId;
        this.copper = copper;
        this.silver = silver;
        this.gold = gold;
        this.platinum = platinum;
    }

    public int getMoneyId() {
        return moneyId;
    }

    public void setMoneyId(int moneyId) {
        this.moneyId = moneyId;
    }

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public int getCopper() {
        return copper;
    }

    public void setCopper(int copper) {
        this.copper = copper;
    }

    public int getSilver() {
        return silver;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getPlatinum() {
        return platinum;
    }

    public void setPlatinum(int platinum) {
        this.platinum = platinum;
    }
}
