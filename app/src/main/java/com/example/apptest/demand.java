package com.example.apptest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class demand extends Fragment {
    ImageView ajouterimg ;

    public demand() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_demand, container, false);
    }
    private void bindView(View view) {
        ajouterimg = view.findViewById(R.id.imageView);

    }
}