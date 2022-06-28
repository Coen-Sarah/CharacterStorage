package com.example.characterstorage.util;

import com.example.characterstorage.fragment.character.CharacterAbilitiesFragment;
import com.example.characterstorage.fragment.character.CharacterCombatFragment;
import com.example.characterstorage.fragment.character.CharacterInventoryFragment;
import com.example.characterstorage.fragment.character.CharacterKnowledgeFragment;
import com.example.characterstorage.fragment.character.CharacterMagicFragment;
import com.example.characterstorage.fragment.character.CharacterOverviewFragment;

public enum CharacterFragment{
    OVERVIEW("Overview", CharacterOverviewFragment.class),
    COMBAT("Combat", CharacterCombatFragment.class),
    KNOWLEDGE("Knowledge", CharacterKnowledgeFragment.class),
    ABILITIES("Abilities", CharacterAbilitiesFragment.class),
    INVENTORY("Inventory", CharacterInventoryFragment.class),
    MAGIC("Spellbook",  CharacterMagicFragment.class);

    public final String title;
    public final Class fragmentClass;

    CharacterFragment(String title, Class fragmentClass){
        this.title = title;
        this.fragmentClass = fragmentClass;
    }
}
