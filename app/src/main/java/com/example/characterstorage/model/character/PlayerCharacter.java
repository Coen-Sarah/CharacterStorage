package com.example.characterstorage.model.character;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.characterstorage.model.item.Item;
import com.example.characterstorage.model.stat.Skill;

import java.util.ArrayList;
import java.util.HashMap;

@Entity( tableName = "characterTable")
public class PlayerCharacter {

    @PrimaryKey (autoGenerate = true)
    int characterId;

    String name;
    String campaign;
    String alignment;
    int level;
    int proficiencyBonus;
    int experiencePoints;

    int backgroundId;
    int baseRaceId;
    int subRaceId;
    int baseClassId;
    int subClassId;

    int height;
    int weight;
    int age;

    int speed;
    int armorClass;

    int maxHP;
    int currentHP;
    int tempHP;

    int usedHitDice;

    int deathSaveSuccessCount;
    int deathSaveFailureCount;

    int spellSlotId;
    int moneyId;

    String playerBiography;
    String playerNotes;

    public PlayerCharacter(){}

    public PlayerCharacter(String name, String campaign, String alignment,
                           int level, int proficiencyBonus, int experiencePoints,
                           int backgroundId, int baseRaceId, int subRaceId, int baseClassId, int subClassId,
                           int height, int weight, int age,
                           int speed, int armorClass,
                           int maxHP, int currentHP, int tempHP, int usedHitDice,
                           int deathSaveSuccessCount, int deathSaveFailureCount,
                           int spellSlotId, int moneyId,
                           String playerBiography, String playerNotes) {
        this.name = name;
        this.campaign = campaign;
        this.alignment = alignment;
        this.level = level;
        this.proficiencyBonus = proficiencyBonus;
        this.experiencePoints = experiencePoints;
        this.backgroundId = backgroundId;
        this.baseRaceId = baseRaceId;
        this.subRaceId = subRaceId;
        this.baseClassId = baseClassId;
        this.subClassId = subClassId;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.speed = speed;
        this.armorClass = armorClass;
        this.maxHP = maxHP;
        this.currentHP = currentHP;
        this.tempHP = tempHP;
        this.usedHitDice = usedHitDice;
        this.deathSaveSuccessCount = deathSaveSuccessCount;
        this.deathSaveFailureCount = deathSaveFailureCount;
        this.spellSlotId = spellSlotId;
        this.moneyId = moneyId;
        this.playerBiography = playerBiography;
        this.playerNotes = playerNotes;
    }

    public PlayerCharacter(int characterId, String name, String campaign, String alignment,
                           int level, int proficiencyBonus, int experiencePoints,
                           int backgroundId, int baseRaceId, int subRaceId, int baseClassId, int subClassId,
                           int height, int weight, int age,
                           int speed, int armorClass,
                           int maxHP, int currentHP, int tempHP, int usedHitDice,
                           int deathSaveSuccessCount, int deathSaveFailureCount,
                           int spellSlotId, int moneyId,
                           String playerBiography, String playerNotes) {
        this.characterId = characterId;
        this.name = name;
        this.campaign = campaign;
        this.alignment = alignment;
        this.level = level;
        this.proficiencyBonus = proficiencyBonus;
        this.experiencePoints = experiencePoints;
        this.backgroundId = backgroundId;
        this.baseRaceId = baseRaceId;
        this.subRaceId = subRaceId;
        this.baseClassId = baseClassId;
        this.subClassId = subClassId;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.speed = speed;
        this.armorClass = armorClass;
        this.maxHP = maxHP;
        this.currentHP = currentHP;
        this.tempHP = tempHP;
        this.usedHitDice = usedHitDice;
        this.deathSaveSuccessCount = deathSaveSuccessCount;
        this.deathSaveFailureCount = deathSaveFailureCount;
        this.spellSlotId = spellSlotId;
        this.moneyId = moneyId;
        this.playerBiography = playerBiography;
        this.playerNotes = playerNotes;
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

    public String getCampaign() {
        return campaign;
    }

    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public int getBackgroundId() {
        return backgroundId;
    }

    public void setBackgroundId(int backgroundId) {
        this.backgroundId = backgroundId;
    }

    public int getBaseRaceId() {
        return baseRaceId;
    }

    public void setBaseRaceId(int baseRaceId) {
        this.baseRaceId = baseRaceId;
    }

    public int getSubRaceId() {
        return subRaceId;
    }

    public void setSubRaceId(int subRaceId) {
        this.subRaceId = subRaceId;
    }

    public int getBaseClassId() {
        return baseClassId;
    }

    public void setBaseClassId(int baseClassId) {
        this.baseClassId = baseClassId;
    }

    public int getSubClassId() {
        return subClassId;
    }

    public void setSubClassId(int subClassId) {
        this.subClassId = subClassId;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public int getTempHP() {
        return tempHP;
    }

    public void setTempHP(int tempHP) {
        this.tempHP = tempHP;
    }

    public int getUsedHitDice() {
        return usedHitDice;
    }

    public void setUsedHitDice(int usedHitDice) {
        this.usedHitDice = usedHitDice;
    }

    public int getDeathSaveSuccessCount() {
        return deathSaveSuccessCount;
    }

    public void setDeathSaveSuccessCount(int deathSaveSuccessCount) {
        this.deathSaveSuccessCount = deathSaveSuccessCount;
    }

    public int getDeathSaveFailureCount() {
        return deathSaveFailureCount;
    }

    public void setDeathSaveFailureCount(int deathSaveFailureCount) {
        this.deathSaveFailureCount = deathSaveFailureCount;
    }

    public int getSpellSlotId() {
        return spellSlotId;
    }

    public void setSpellSlotId(int spellSlotId) {
        this.spellSlotId = spellSlotId;
    }

    public int getMoneyId() {
        return moneyId;
    }

    public void setMoneyId(int moneyId) {
        this.moneyId = moneyId;
    }

    public String getPlayerBiography() {
        return playerBiography;
    }

    public void setPlayerBiography(String playerBiography) {
        this.playerBiography = playerBiography;
    }

    public String getPlayerNotes() {
        return playerNotes;
    }

    public void setPlayerNotes(String playerNotes) {
        this.playerNotes = playerNotes;
    }
}
