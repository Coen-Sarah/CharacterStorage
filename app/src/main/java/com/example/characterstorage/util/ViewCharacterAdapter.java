package com.example.characterstorage.util;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.characterstorage.util.CharacterFragment;
// TODO cite: https://github.com/extmkv/CircularViewPager
public class ViewCharacterAdapter extends FragmentStateAdapter {
    public ViewCharacterAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        try {
            fragment = (Fragment) CharacterFragment.values()[position % (CharacterFragment.values().length)]
                            .fragmentClass.newInstance();
        } catch (IllegalAccessException e) {
            fragment = null;
            e.printStackTrace();
        } catch (InstantiationException e) {
            fragment = null;
            e.printStackTrace();
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position % (CharacterFragment.values().length));
    }

    public int getCenterPage(){
        return (Integer.MAX_VALUE / 2) + 3;
    }
}
