package com.example.apptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Welcome1 extends AppCompatActivity {
    private ImageView welcome1img ;
    private Button next ;
    private TextView text1 ;
    private TextView text2 ;
    private Button skip ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome1);

        welcome1img = findViewById(R.id.imageView4);
        next = findViewById(R.id.button5);
        text1 = findViewById(R.id.textView10);
        text2 = findViewById(R.id.textView11);
        skip = findViewById(R.id.button4);




        View.OnClickListener e = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent i = new Intent(getApplicationContext(), Welcome2.class);
                startActivity(i);

            }
        };
        next.setOnClickListener(e);
        View.OnClickListener a = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);

            }
        };
        skip.setOnClickListener(a);
    }
}