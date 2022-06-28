package com.example.characterstorage.model.item;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "allItemTable")
public class AllItemLink {

    @PrimaryKey(autoGenerate = true)
    int allItemId;
    int itemId;
    int itemSource;

    public AllItemLink(){}

    public AllItemLink(int itemId, int itemSource) {
        this.itemId = itemId;
        this.itemSource = itemSource;
    }

    public AllItemLink(int allItemId, int itemId, int itemSource) {
        this.allItemId = allItemId;
        this.itemId = itemId;
        this.itemSource = itemSource;
    }

    public int getAllItemId() {
        return allItemId;
    }

    public void setAllItemId(int allItemId) {
        this.allItemId = allItemId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getItemSource() {
        return itemSource;
    }

    public void setItemSource(int itemSource) {
        this.itemSource = itemSource;
    }
}
