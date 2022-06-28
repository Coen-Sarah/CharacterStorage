package com.example.characterstorage.model.item;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "itemTable")
public class Item {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    int itemId;
    String itemName;
    String description;
    double weight;

    public Item() {
    }

    public Item(int itemId, String itemName, String description, double weight) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.description = description;
        this.weight = weight;
    }

    public Item(String itemName, String description, double weight) {
        this.itemName = itemName;
        this.description = description;
        this.weight = weight;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
