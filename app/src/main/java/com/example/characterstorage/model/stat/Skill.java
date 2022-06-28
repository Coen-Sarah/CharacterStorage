package com.example.characterstorage.model.stat;


import androidx.room.Entity;

@Entity(tableName = "skillTable", primaryKeys = {"characterId", "skillNameId"})
public class Skill {

    int characterId;
    int skillNameId;
    int statNameId;
    boolean isProficient;
    int additionalBonus;

    public Skill(){}

    public Skill(int skillNameId, int statNameId, boolean isProficient, int additionalBonus) {
        this.skillNameId = skillNameId;
        this.statNameId = statNameId;
        this.isProficient = isProficient;
        this.additionalBonus = additionalBonus;
    }

    public Skill(int characterId, int skillNameId, int statNameId, boolean isProficient, int additionalBonus) {
        this.characterId = characterId;
        this.skillNameId = skillNameId;
        this.statNameId = statNameId;
        this.isProficient = isProficient;
        this.additionalBonus = additionalBonus;
    }

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public int getSkillNameId() {
        return skillNameId;
    }

    public void setSkillNameId(int skillNameId) {
        this.skillNameId = skillNameId;
    }

    public int getStatNameId() {
        return statNameId;
    }

    public void setStatNameId(int statNameId) {
        this.statNameId = statNameId;
    }

    public boolean isProficient() {
        return isProficient;
    }

    public void setProficient(boolean proficient) {
        isProficient = proficient;
    }

    public int getAdditionalBonus() {
        return additionalBonus;
    }

    public void setAdditionalBonus(int additionalBonus) {
        this.additionalBonus = additionalBonus;
    }

}
