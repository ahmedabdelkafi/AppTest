package com.example.apptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Welcome1 extends AppCompatActivity {
    private ImageView welcome1img ;
    private Button next ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome1);

        welcome1img = findViewById(R.id.imageView4);
        next = findViewById(R.id.button5);



        View.OnClickListener e = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent i = new Intent(getApplicationContext(), SignupActivity.class);
                startActivity(i);

            }
        };
        next.setOnClickListener(e);
    }
}