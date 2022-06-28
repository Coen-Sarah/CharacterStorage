package com.example.characterstorage.data.stat;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.characterstorage.model.stat.Skill;

import java.util.List;

@Dao
public interface SkillDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract long insert(Skill skill);

    @Query("SELECT * FROM skillTable WHERE characterId = :characterId ORDER BY skillNameId")
    LiveData<List<Skill>> getAllSkills(int characterId);

    @Query("SELECT * FROM skillTable WHERE characterId = :characterId AND skillNameId = :skillNameId")
    LiveData<Skill> getSkill(int characterId, int skillNameId);

    @Update
    void update(Skill Skill);

    @Delete
    void delete(Skill Skill);
    
}
