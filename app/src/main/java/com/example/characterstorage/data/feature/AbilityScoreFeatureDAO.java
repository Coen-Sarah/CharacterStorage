package com.example.characterstorage.data.feature;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.characterstorage.model.feature.AbilityScoreFeature;
import com.example.characterstorage.model.feature.Feature;

import java.util.List;

@Dao
public interface AbilityScoreFeatureDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract long insert(AbilityScoreFeature feature);


    @Query("SELECT * FROM abilityScoreFeatureTable ORDER BY featureId")
    LiveData<List<AbilityScoreFeature>> getAllAbilityScoreFeatures();

    @Query("SELECT * FROM abilityScoreFeatureTable WHERE featureId = :id")
    LiveData<AbilityScoreFeature> getAbilityScoreFeature(int id);

    @Update
    void update(AbilityScoreFeature Feature);

    @Delete
    void delete(AbilityScoreFeature Feature);

}
