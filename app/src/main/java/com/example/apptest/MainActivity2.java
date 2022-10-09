package com.example.apptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {
    private TextView malek ;
    private SharedPreferences mPreferences;
    private Button logout ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        malek = findViewById(R.id.textView2);
        logout= findViewById(R.id.button8);
        String a ;
        Intent iin= getIntent();
        Bundle b = iin.getExtras();

        if(b!=null)
        {
            String j =(String) b.get("aaa");
            malek.setText(j);
        }
        View.OnClickListener l = new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                SharedPreferences.Editor preferencesEditor = mPreferences.edit();
                preferencesEditor.clear();
                preferencesEditor.apply();
                finish();
            }
        };
        logout.setOnClickListener(l);
    }


}