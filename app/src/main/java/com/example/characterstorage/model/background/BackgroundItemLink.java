package com.example.characterstorage.model.background;

import androidx.room.Entity;

@Entity(primaryKeys = {"backgroundId", "itemId"})
public class BackgroundItemLink {

    int backgroundId;
    int itemId;

}
