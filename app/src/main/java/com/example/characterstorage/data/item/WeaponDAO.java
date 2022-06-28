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
public interface WeaponDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long insert(Weapon item);

    @Query("SELECT * FROM weaponTable ORDER BY itemId")
    LiveData<List<Weapon>> getAllWeapons();

    @Query("SELECT * FROM weaponTable WHERE itemId = :id")
    LiveData<Weapon> getWeapon(int id);

    @Update
    void update(Item item);

    @Delete
    void delete(Item item);

}
