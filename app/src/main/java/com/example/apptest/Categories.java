package com.example.apptest;


import android.os.Bundle;

import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Categories extends AppCompatActivity {
    private ImageView home ;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        home = findViewById(R.id.homecat);





    }
}
