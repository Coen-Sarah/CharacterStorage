package com.example.characterstorage.util;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import androidx.core.content.ContextCompat;

import com.example.characterstorage.activity.CharacterDetailsActivity;
import com.example.characterstorage.activity.CompendiumActivity;
import com.example.characterstorage.activity.LoginActivity;

public class NavigationHelper {

    public static void toLogout(Context context) {
        //TODO implement logout functionality
        Intent intent = new Intent(context, LoginActivity.class);
        ContextCompat.startActivity(context,intent, null);
    }

    public static void toCompendium(Context context) {
        Intent intent = new Intent(context, CompendiumActivity.class);
        ContextCompat.startActivity(context,intent, null);
    }

    public static void toAllCharacters(Context context) {
        //TODO add AllCharactersActivity
        Intent intent = new Intent(context, CharacterDetailsActivity.class);
        ContextCompat.startActivity(context,intent, null);
    }

}
