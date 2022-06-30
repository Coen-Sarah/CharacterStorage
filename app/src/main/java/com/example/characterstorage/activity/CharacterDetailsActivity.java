package com.example.characterstorage.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.example.characterstorage.R;
import com.example.characterstorage.databinding.ActivityCharacterDetailsBinding;
import com.example.characterstorage.util.CharacterFragment;
import com.example.characterstorage.util.NavigationHelper;
import com.example.characterstorage.util.ViewCharacterAdapter;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class CharacterDetailsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ActivityCharacterDetailsBinding binding;

    public ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_details);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_character_details);

        binding.characterNavView.setNavigationItemSelectedListener(this);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, (DrawerLayout) binding.getRoot(), R.string.nav_open, R.string.nav_close);
        ((DrawerLayout) binding.getRoot()).addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ViewCharacterAdapter adapter = new ViewCharacterAdapter(getSupportFragmentManager(), getLifecycle() );
        binding.characterViewPager.setAdapter(adapter);
        binding.characterViewPager.setCurrentItem(adapter.getCenterPage(), false);

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