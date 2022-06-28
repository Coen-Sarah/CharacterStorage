package com.example.characterstorage.data.item;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.characterstorage.model.item.Armor;
import com.example.characterstorage.model.item.Item;
import com.example.characterstorage.model.item.Weapon;

import java.util.List;

@Dao
public interface ArmorDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long insert(Armor armor);

    @Query("SELECT * FROM armorTable ORDER BY itemId")
    LiveData<List<Armor>> getAllArmor();

    @Query("SELECT * FROM armorTable WHERE itemId = :id")
    LiveData<Armor> getArmor(int id);

    @Update
    void update(Item item);

    @Delete
    void delete(Item item);

}
