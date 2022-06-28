package com.example.characterstorage.model.spell;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "spellSlotTable")
public class SpellSlotBlock {

    @PrimaryKey(autoGenerate = true)
    int spellSlotId;

    int firstLevel;
    int secondLevel;
    int thirdLevel;
    int fourthLevel;
    int fifthLevel;
    int sixthLevel;
    int seventhLevel;
    int eighthLevel;
    int ninthLevel;

    public SpellSlotBlock(){}

    public SpellSlotBlock(int spellSlotId,
                          int firstLevel, int secondLevel, int thirdLevel,
                          int fourthLevel, int fifthLevel, int sixthLevel,
                          int seventhLevel, int eighthLevel, int ninthLevel) {

        this.spellSlotId = spellSlotId;
        this.firstLevel = firstLevel;
        this.secondLevel = secondLevel;
        this.thirdLevel = thirdLevel;
        this.fourthLevel = fourthLevel;
        this.fifthLevel = fifthLevel;
        this.sixthLevel = sixthLevel;
        this.seventhLevel = seventhLevel;
        this.eighthLevel = eighthLevel;
        this.ninthLevel = ninthLevel;
    }

    public SpellSlotBlock(int firstLevel, int secondLevel, int thirdLevel,
                          int fourthLevel, int fifthLevel, int sixthLevel,
                          int seventhLevel, int eighthLevel, int ninthLevel) {
        this.firstLevel = firstLevel;
        this.secondLevel = secondLevel;
        this.thirdLevel = thirdLevel;
        this.fourthLevel = fourthLevel;
        this.fifthLevel = fifthLevel;
        this.sixthLevel = sixthLevel;
        this.seventhLevel = seventhLevel;
        this.eighthLevel = eighthLevel;
        this.ninthLevel = ninthLevel;
    }

    public int getSpellSlotId() {
        return spellSlotId;
    }

    public void setSpellSlotId(int spellSlotId) {
        this.spellSlotId = spellSlotId;
    }

    public int getFirstLevel() {
        return firstLevel;
    }

    public void setFirstLevel(int firstLevel) {
        this.firstLevel = firstLevel;
    }

    public int getSecondLevel() {
        return secondLevel;
    }

    public void setSecondLevel(int secondLevel) {
        this.secondLevel = secondLevel;
    }

    public int getThirdLevel() {
        return thirdLevel;
    }

    public void setThirdLevel(int thirdLevel) {
        this.thirdLevel = thirdLevel;
    }

    public int getFourthLevel() {
        return fourthLevel;
    }

    public void setFourthLevel(int fourthLevel) {
        this.fourthLevel = fourthLevel;
    }

    public int getFifthLevel() {
        return fifthLevel;
    }

    public void setFifthLevel(int fifthLevel) {
        this.fifthLevel = fifthLevel;
    }

    public int getSixthLevel() {
        return sixthLevel;
    }

    public void setSixthLevel(int sixthLevel) {
        this.sixthLevel = sixthLevel;
    }

    public int getSeventhLevel() {
        return seventhLevel;
    }

    public void setSeventhLevel(int seventhLevel) {
        this.seventhLevel = seventhLevel;
    }

    public int getEighthLevel() {
        return eighthLevel;
    }

    public void setEighthLevel(int eighthLevel) {
        this.eighthLevel = eighthLevel;
    }

    public int getNinthLevel() {
        return ninthLevel;
    }

    public void setNinthLevel(int ninthLevel) {
        this.ninthLevel = ninthLevel;
    }
}
