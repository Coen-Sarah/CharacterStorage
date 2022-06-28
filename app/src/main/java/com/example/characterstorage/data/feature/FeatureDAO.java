package com.example.characterstorage.data.feature;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.characterstorage.model.feature.Feature;

import java.util.List;

@Dao
public interface FeatureDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract long insert(Feature feature);


    @Query("SELECT * FROM featureTable ORDER BY featureId")
    LiveData<List<Feature>> getAllFeatures();

    @Query("SELECT * FROM featureTable WHERE featureId = :id")
    LiveData<Feature> getFeature(int id);

    @Update
    void update(Feature Feature);

    @Delete
    void delete(Feature Feature);
    
}
