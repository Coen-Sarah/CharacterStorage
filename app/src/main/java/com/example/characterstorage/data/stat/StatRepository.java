package com.example.characterstorage.data.stat;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.characterstorage.model.stat.Skill;
import com.example.characterstorage.model.stat.Stat;
import com.example.characterstorage.util.CharacterRoomDatabase;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class StatRepository {

    private StatDAO statDAO;
    private SkillDAO skillDAO;
    private LiveData<List<Stat>> allStats;
    private LiveData<List<Skill>> allSkills;

    private long statId = 0;
    private long skillId = 0;

    public StatRepository(Application application){
        CharacterRoomDatabase db = CharacterRoomDatabase.getDatabase(application);
        statDAO = db.statDAO();
        skillDAO = db.skillDAO();
    }

    public LiveData<List<Stat>> getAllStats(int characterId){ return statDAO.getAllStats(characterId); }

    public LiveData<List<Skill>> getAllSkills(int characterId){ return skillDAO.getAllSkills(characterId); }

    public LiveData<Stat> getStat(int characterId, int statNameId){ return statDAO.getStat(characterId, statNameId); }

    public LiveData<Skill> getSkill(int characterId, int skillNameId){ return skillDAO.getSkill(characterId, skillNameId); }

    public long insert(Stat stat){

        Future<Long> id = CharacterRoomDatabase.databaseWriter.submit(()->{
            statDAO.insert(stat);
        }, statId);
        try {
            id.get();
            return statId;
        } catch (InterruptedException | ExecutionException e) {
            return 0;
        }
    }

    public long insert(Skill skill){

        Future<Long> id = CharacterRoomDatabase.databaseWriter.submit(()->{
            skillDAO.insert(skill);
        }, skillId);
        try {
            id.get();
            return skillId;
        } catch (InterruptedException | ExecutionException e) {
            return 0;
        }
    }

    public void update(Stat stat) {
        CharacterRoomDatabase.databaseWriter.execute(() -> {
            statDAO.update(stat);
        }); }

    public void update(Skill skill) {
        CharacterRoomDatabase.databaseWriter.execute(() -> {
            skillDAO.update(skill);
        });
    }

    public void delete(Stat stat) {
        CharacterRoomDatabase.databaseWriter.execute(() -> {
            statDAO.delete(stat);
        });
    }

    public void delete(Skill skill) {
        CharacterRoomDatabase.databaseWriter.execute(() -> {
            skillDAO.delete(skill);
        }); }

}

