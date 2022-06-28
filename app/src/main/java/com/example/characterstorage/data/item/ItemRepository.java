package com.example.characterstorage.data.item;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.characterstorage.model.item.Armor;
import com.example.characterstorage.model.item.Item;
import com.example.characterstorage.model.item.Weapon;
import com.example.characterstorage.util.CharacterRoomDatabase;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class ItemRepository {

    private ItemDAO itemDAO;
    private WeaponDAO weaponDAO;
    private ArmorDAO armorDAO;

    private LiveData<List<Item>> allItems;
    private LiveData<List<Weapon>> allWeapons;
    private LiveData<List<Armor>> allArmor;

    private long itemId = 0;

    public ItemRepository(Application application){
        CharacterRoomDatabase db = CharacterRoomDatabase.getDatabase(application);
        itemDAO = db.itemDAO();
        weaponDAO = db.weaponDAO();
        armorDAO = db.armorDAO();

        allItems = itemDAO.getAllItems();
        allWeapons = weaponDAO.getAllWeapons();
        allArmor = armorDAO.getAllArmor();
    }

    public LiveData<List<Item>> getAllItems(){ return allItems; }

    public LiveData<List<Weapon>> getAllWeapons() { return allWeapons; }

    public LiveData<List<Armor>> getAllArmor() { return allArmor; }

    public LiveData<Item> getItem(int id){ return itemDAO.getItem(id); }

    public LiveData<Weapon> getWeapon(int id){ return weaponDAO.getWeapon(id); }

    public LiveData<Armor> getArmor(int id){ return armorDAO.getArmor(id); }

    public long insert(Item item){

        Future<Long> id = CharacterRoomDatabase.databaseWriter.submit(()->{
            if( item instanceof Weapon){
                itemId = weaponDAO.insert((Weapon)item);
            } else if(item instanceof Armor){
                itemId = armorDAO.insert((Armor)item);
            } else {
                itemId = itemDAO.insert(item);
            }

        }, itemId);
        try {
            id.get();
            return itemId;
        } catch (InterruptedException | ExecutionException e) {
            return 0;
        }
    }

    public void update(Item item) {
        CharacterRoomDatabase.databaseWriter.execute(() -> {
            if (item instanceof Weapon) {
                weaponDAO.update((Weapon) item);
            } else if (item instanceof Armor) {
                armorDAO.update((Armor) item);
            } else {
                itemDAO.update(item);
            }
        }); }

    public void delete(Item item) {
        CharacterRoomDatabase.databaseWriter.execute(() -> {
            if( item instanceof Weapon){
                weaponDAO.delete((Weapon)item);
            } else if(item instanceof Armor){
                armorDAO.delete((Armor)item);
            } else {
                itemDAO.delete(item);
            }
        });
    }
    
}
