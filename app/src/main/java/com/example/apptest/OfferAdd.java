package com.example.apptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.apptest.DAO.OfferDAO;

import com.example.apptest.database.OfferDatabase;
import com.example.apptest.entity.Offer;

public class OfferAdd extends AppCompatActivity {
     private EditText AdTitle, Description, Price ;
     private Button Add ;
    private OfferDatabase offerDatabase;
    private OfferDAO offerDAO;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer_add);
        offerDAO=offerDatabase.getDao();

        offerDatabase=OfferDatabase.getInstance(this);

        AdTitle =findViewById(R.id.editTextTextPersonName3);
        Description =findViewById(R.id.editTextTextPersonName4);
        Price =findViewById(R.id.editTextTextPersonName5);
        Add =findViewById(R.id.button10);
        View.OnClickListener l = new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String editTextTextPersonName3=AdTitle.getText().toString();
                String editTextTextPersonName4=Description.getText().toString();
                String editTextTextPersonName5=Price.getText().toString();

                Offer offer=new Offer(0,editTextTextPersonName3,editTextTextPersonName4,editTextTextPersonName5);
                offerDAO.insert(offer);
                AdTitle.setText("");
                Description.setText("");
                Price.setText("");


            }
        };
        Add.setOnClickListener(l);



    }
}