package com.example.characterstorage.model.attack;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "attackTable")
public class Attack {

    int characterId;
    @PrimaryKey(autoGenerate = true)
    int attackId;
    int weaponId;
    int weaponNameId;
    boolean hasProficiency;

}
