package com.example.characterstorage.data.feature;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.characterstorage.model.feature.AbilityScoreFeature;
import com.example.characterstorage.model.feature.Feature;
import com.example.characterstorage.util.CharacterRoomDatabase;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class FeatureRepository {

    private FeatureDAO featureDAO;
    private AbilityScoreFeatureDAO abilityScoreFeatureDAO;

    private LiveData<List<Feature>> allFeatures;
    private LiveData<List<AbilityScoreFeature>> allAbilityScoreFeatures;

    private long featureId = 0;

    public FeatureRepository(Application application){
        CharacterRoomDatabase db = CharacterRoomDatabase.getDatabase(application);
        featureDAO = db.featureDAO();
        abilityScoreFeatureDAO = db.abilityScoreFeatureDAO();

        allFeatures = featureDAO.getAllFeatures();
        allAbilityScoreFeatures = abilityScoreFeatureDAO.getAllAbilityScoreFeatures();
    }

    public LiveData<List<Feature>> getAllFeatures(){ return allFeatures; }

    public LiveData<List<AbilityScoreFeature>> getAllAbilityScoreFeatures() { return allAbilityScoreFeatures; }


    public LiveData<Feature> getFeature(int id){ return featureDAO.getFeature(id); }

    public LiveData<AbilityScoreFeature> getAbilityScoreFeature(int id){ return abilityScoreFeatureDAO.getAbilityScoreFeature(id); }

    public long insert(Feature feature){

        Future<Long> id = CharacterRoomDatabase.databaseWriter.submit(()->{
            if( feature instanceof AbilityScoreFeature){
                abilityScoreFeatureDAO.insert((AbilityScoreFeature)feature);
            } else {
                featureDAO.insert(feature);
            }

        }, featureId);
        try {
            id.get();
            return featureId;
        } catch (InterruptedException | ExecutionException e) {
            return 0;
        }
    }

    public void update(Feature feature) {
        CharacterRoomDatabase.databaseWriter.execute(() -> {
            if( feature instanceof AbilityScoreFeature){
                abilityScoreFeatureDAO.update((AbilityScoreFeature)feature);
            } else {
                featureDAO.update(feature);
            }
        }); }

    public void delete(Feature feature) {
        CharacterRoomDatabase.databaseWriter.execute(() -> {
            if( feature instanceof AbilityScoreFeature){
                abilityScoreFeatureDAO.delete((AbilityScoreFeature)feature);
            } else {
                featureDAO.delete(feature);
            }
        });
    }
    
}
