package com.example.characterstorage.model.spell;

import androidx.room.Entity;

//shows used spell slots

@Entity(primaryKeys = {"characterId", "spellSlotId"})
public class CharacterSpellSlotLink {

    int characterId;
    int spellSlotId;
}
