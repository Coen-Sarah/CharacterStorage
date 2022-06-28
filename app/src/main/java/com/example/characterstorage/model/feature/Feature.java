package com.example.characterstorage.model.feature;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "featureTable")
public class Feature {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    int featureId;
    String name;
    String description;
    String source;

    public Feature() {
    }

    public Feature(String name, String description, String source) {
        this.name = name;
        this.description = description;
        this.source = source;
    }

    public Feature(int featureId, String name, String description, String source) {
        this.featureId = featureId;
        this.name = name;
        this.description = description;
        this.source = source;
    }

    public int getFeatureId() {
        return featureId;
    }

    public void setFeatureId(int featureId) {
        this.featureId = featureId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
