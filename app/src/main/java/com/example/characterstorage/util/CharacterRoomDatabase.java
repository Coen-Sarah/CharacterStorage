package com.example.characterstorage.util;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.characterstorage.data.feature.AbilityScoreFeatureDAO;
import com.example.characterstorage.data.feature.FeatureDAO;
import com.example.characterstorage.data.item.ArmorDAO;
import com.example.characterstorage.data.item.ItemDAO;
import com.example.characterstorage.data.item.WeaponDAO;
import com.example.characterstorage.data.stat.SkillDAO;
import com.example.characterstorage.data.stat.StatDAO;
import com.example.characterstorage.model.feature.AbilityScoreFeature;
import com.example.characterstorage.model.feature.Feature;
import com.example.characterstorage.model.item.Armor;
import com.example.characterstorage.model.item.Item;
import com.example.characterstorage.model.item.Weapon;
import com.example.characterstorage.model.stat.Skill;
import com.example.characterstorage.model.stat.Stat;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {  Item.class,
                        Armor.class,
                        Weapon.class,
                        Feature.class,
                        AbilityScoreFeature.class,
                        Stat.class,
                        Skill.class},
                        version = 1,
                        exportSchema = false)
public abstract class CharacterRoomDatabase extends RoomDatabase {

    public abstract ItemDAO itemDAO();
    public abstract WeaponDAO weaponDAO();
    public abstract ArmorDAO armorDAO();
    public abstract FeatureDAO featureDAO();
    public abstract AbilityScoreFeatureDAO abilityScoreFeatureDAO();
    public abstract StatDAO statDAO();
    public abstract SkillDAO skillDAO();

    public static final int NUMBER_OF_THREADS = 6;
    public static final ExecutorService databaseWriter =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);
    private static volatile CharacterRoomDatabase INSTANCE;

    public static CharacterRoomDatabase getDatabase(final Context context){
        if(INSTANCE == null){
            synchronized (CharacterRoomDatabase.class){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(
                            context.getApplicationContext(),
                            CharacterRoomDatabase.class, "character_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }


}
