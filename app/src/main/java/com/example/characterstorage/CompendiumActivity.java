package com.example.characterstorage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.characterstorage.databinding.ActivityCompendiumBinding;
import com.example.characterstorage.fragment.compendium.CompendiumClassFragment;
import com.example.characterstorage.fragment.compendium.CompendiumItemFragment;
import com.example.characterstorage.fragment.compendium.CompendiumRaceFragment;
import com.example.characterstorage.fragment.compendium.CompendiumSpellFragment;
import com.example.characterstorage.util.ViewCharacterAdapter;
import com.example.characterstorage.util.ViewCompendiumAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class CompendiumActivity extends AppCompatActivity {

    ActivityCompendiumBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compendium);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_compendium);

        ViewCompendiumAdapter adapter = new ViewCompendiumAdapter(this);
        binding.compendiumViewPager.setAdapter(adapter);

        new TabLayoutMediator(binding.compendiumTabLayout, binding.compendiumViewPager,
                (tab, position) -> {
                    switch(position){
                        case 0:
                            tab.setText("Classes");
                            break;
                        case 1:
                            tab.setText("Races");
                            break;
                        case 2:
                            tab.setText("Spells");
                            break;
                        case 3:
                            tab.setText("Items");
                            break;
                    }
                }).attach();

    }
}