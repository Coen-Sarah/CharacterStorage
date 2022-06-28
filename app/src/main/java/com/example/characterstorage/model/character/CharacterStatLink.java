package com.example.characterstorage.model.character;

import androidx.room.Entity;

@Entity(primaryKeys = {"characterId","statNameId"})
public class CharacterStatLink {

    int characterID;
    int statNameId;

}
