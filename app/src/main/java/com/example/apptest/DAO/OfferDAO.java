package com.example.apptest.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.apptest.entity.Offer;


import java.util.List;

@Dao
public interface OfferDAO {
@Insert
void insert(Offer Offer);
@Update
void update(Offer Offer);
@Query("Delete From Offer where id=:id" )
void delete(int id);
@Query("SELECT * FROM Offer")
    List<Offer> getAllOffer();
}