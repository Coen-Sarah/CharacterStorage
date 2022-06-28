package com.example.characterstorage.util;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.characterstorage.fragment.compendium.CompendiumClassFragment;
import com.example.characterstorage.fragment.compendium.CompendiumItemFragment;
import com.example.characterstorage.fragment.compendium.CompendiumRaceFragment;
import com.example.characterstorage.fragment.compendium.CompendiumSpellFragment;

public class ViewCompendiumAdapter extends FragmentStateAdapter {
    public ViewCompendiumAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position){

            case 0:
                return new CompendiumClassFragment();
            case 1:
                return new CompendiumRaceFragment();
            case 2:
                return new CompendiumSpellFragment();
            case 3:
                return new CompendiumItemFragment();
            default:
                return null;

        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
