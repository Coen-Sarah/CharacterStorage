package com.example.characterstorage.model.stat;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "skillNameTable")
public class SkillName {

    @PrimaryKey(autoGenerate = false)
    int skillNameId;
    String skillName;

    public SkillName() {
    }

    public SkillName(int skillNameId, String skillName) {
        this.skillNameId = skillNameId;
        this.skillName = skillName;
    }

    public int getSkillNameId() {
        return skillNameId;
    }

    public void setSkillNameId(int skillNameId) {
        this.skillNameId = skillNameId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
}

