package com.example.characterstorage.model.background;

import androidx.room.Entity;

@Entity(primaryKeys = {"backgroundId", "featureId"})
public class BackgroundFeatureLink {
    int backgroundId;
    int featureId;
}
