package com.example.characterstorage.model.spell;

import androidx.room.Entity;

//shows class spell list

@Entity(primaryKeys = {"classId", "spellId"})
public class ClassSpellLink {

    int classId;
    int spellId;

}
