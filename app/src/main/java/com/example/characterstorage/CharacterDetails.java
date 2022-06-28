package com.example.characterstorage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;

import com.example.characterstorage.databinding.ActivityCharacterDetailsBinding;
import com.example.characterstorage.util.CharacterFragment;
import com.example.characterstorage.util.ViewCharacterAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class CharacterDetails extends AppCompatActivity {

    ActivityCharacterDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_details);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_character_details);

        ViewCharacterAdapter adapter = new ViewCharacterAdapter(getSupportFragmentManager(), getLifecycle() );
        binding.characterViewPager.setAdapter(adapter);
        binding.characterViewPager.setCurrentItem(adapter.getCenterPage(), false);

    }
}