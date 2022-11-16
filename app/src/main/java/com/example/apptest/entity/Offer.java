package com.example.apptest.entity;

import android.widget.EditText;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Offer")
public class Offer {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "AdTitle")
    private String AdTitle;
    @ColumnInfo(name = "Description")
    private String Desciption;
    @ColumnInfo(name = "Price")
    private String Price;

    public Offer(int id, String AdTitle, String Desciption, String Price) {
        this.id = id;
        this.AdTitle = AdTitle;
        this.Desciption = Desciption;
        this.Price = Price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getAdTitle() {
        return AdTitle;
    }

    public void setAdTitle(String adTitle) {
        AdTitle = adTitle;
    }

    public String getDesciption() {
        return Desciption;
    }

    public void setDesciption(String desciption) {
        Desciption = desciption;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
