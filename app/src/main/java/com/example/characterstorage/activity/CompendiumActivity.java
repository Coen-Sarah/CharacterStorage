package com.example.characterstorage.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import com.example.characterstorage.R;
import com.example.characterstorage.databinding.ActivityCompendiumBinding;
import com.example.characterstorage.fragment.compendium.CompendiumClassFragment;
import com.example.characterstorage.fragment.compendium.CompendiumItemFragment;
import com.example.characterstorage.fragment.compendium.CompendiumRaceFragment;
import com.example.characterstorage.fragment.compendium.CompendiumSpellFragment;
import com.example.characterstorage.util.NavigationHelper;
import com.example.characterstorage.util.ViewCharacterAdapter;
import com.example.characterstorage.util.ViewCompendiumAdapter;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class CompendiumActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ActivityCompendiumBinding binding;

    public ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compendium);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_compendium);

        binding.compendiumNavView.setNavigationItemSelectedListener(this);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, (DrawerLayout) binding.getRoot(), R.string.nav_open, R.string.nav_close);
        ((DrawerLayout) binding.getRoot()).addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        switch (item.getItemId()) {

            case R.id.menuItemCharacterList:
                NavigationHelper.toAllCharacters(this);
                break;
            case R.id.menuItemCompendium:
                NavigationHelper.toCompendium(this);
                break;
            case R.id.menuItemLogout:
                NavigationHelper.toLogout(this);
                break;
        }
        //close navigation drawer
        ((DrawerLayout)binding.getRoot()).closeDrawer(GravityCompat.START);
        return true;
    }
}