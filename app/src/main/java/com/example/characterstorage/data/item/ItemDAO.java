package com.example.characterstorage.data.item;

import java.util.List;
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

@Dao
public abstract interface ItemDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract long insert(Item item);


    @Query("SELECT * FROM itemTable ORDER BY itemId")
    LiveData<List<Item>> getAllItems();

    @Query("SELECT * FROM itemTable WHERE itemId = :id")
    LiveData<Item> getItem(int id);

    @Update
    void update(Item item);

    @Delete
    void delete(Item item);

}
