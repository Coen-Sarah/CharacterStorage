package com.example.characterstorage.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.characterstorage.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void login(View view) {

        //TODO implement loggin verification + login directs to all character page
        Intent intent = new Intent(LoginActivity.this, CharacterDetailsActivity.class);
        startActivity(intent);

    }
}