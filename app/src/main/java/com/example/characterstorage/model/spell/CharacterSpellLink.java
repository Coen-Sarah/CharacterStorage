package com.example.characterstorage.model.spell;

import androidx.room.Entity;

//shows prepared spells

@Entity(primaryKeys = {"characterId", "spellId"})
public class CharacterSpellLink {

    int characterId;
    int spellId;

}
