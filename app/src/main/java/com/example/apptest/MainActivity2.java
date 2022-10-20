package com.example.apptest;
import androidx.annotation.NonNull;
import com.example.apptest.*;
import com.example.apptest.databinding.ActivityMain2Binding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import java.io.*;




public class MainActivity2 extends AppCompatActivity   {

  ActivityMain2Binding binding ;


   BottomNavigationView bottomNavigationView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new demand());

        binding.bottomNavigationView.setOnItemSelectedListener(item ->{
            switch (item.getItemId()){
                case R.id.demand:
                    replaceFragment(new demand());
                    break;
                case R.id.offer:
                    replaceFragment(new offer());
                    break;
                case R.id.settings:
                    replaceFragment(new settings());
            }
            return true;
        });
    }
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flFragment,fragment);
        fragmentTransaction.commit();

    }
}
