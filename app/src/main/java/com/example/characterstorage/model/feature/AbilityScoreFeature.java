package com.example.characterstorage.model.feature;

import androidx.room.Entity;

@Entity (tableName = "abilityScoreFeatureTable")
public class AbilityScoreFeature extends Feature{

    String ability;
    int bonus;

    public AbilityScoreFeature() {
    }

    public AbilityScoreFeature(String name, String description, String source, String ability, int bonus) {
        super(name, description, source);
        this.ability = ability;
        this.bonus = bonus;
    }

    public AbilityScoreFeature(int featureId, String name, String description, String source, String ability, int bonus) {
        super(featureId, name, description, source);
        this.ability = ability;
        this.bonus = bonus;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
