package com.example.characterstorage.model.character;

import androidx.room.Entity;

@Entity(primaryKeys = {"characterId","statNameId"})
public class CharacterSkillLink {

    int characterId;
    int statNameID;

}
