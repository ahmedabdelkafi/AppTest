package com.example.apptest.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.apptest.DAO.OfferDAO;
import com.example.apptest.entity.Offer;


@Database(entities = {Offer.class}, version = 1)
public abstract class OfferDatabase extends RoomDatabase {
    public abstract OfferDAO getDao();
    public static OfferDatabase INSTANCE;
    public static OfferDatabase getInstance(Context context){
        if  (INSTANCE==null){
            INSTANCE= Room.databaseBuilder(context,OfferDatabase.class,"OfferDatabase")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return INSTANCE;
    }


}
