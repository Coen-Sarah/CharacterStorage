package com.example.characterstorage.data.stat;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.characterstorage.model.stat.Stat;

import java.util.List;

@Dao
public interface StatDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract long insert(Stat stat);

    @Query("SELECT * FROM statTable WHERE characterId = :characterId ORDER BY statNameId")
    LiveData<List<Stat>> getAllStats(int characterId);

    @Query("SELECT * FROM statTable WHERE characterId = :characterId AND statNameId = :statNameId")
    LiveData<Stat> getStat(int characterId, int statNameId);

    @Update
    void update(Stat Stat);

    @Delete
    void delete(Stat Stat);

}
