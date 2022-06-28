package com.example.characterstorage.model.character;

import androidx.room.Entity;

@Entity(primaryKeys = {"characterId", "itemId"})
public class CharacterItemLink {

    int characterId;
    int itemId;

}
