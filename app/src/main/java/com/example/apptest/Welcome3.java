package com.example.apptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Welcome3 extends AppCompatActivity {

    private ImageView welcome3img ;
    private Button explore ;
    private TextView text1 ;
    private TextView text2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome3);

        welcome3img = findViewById(R.id.imageView6);
        explore = findViewById(R.id.button6);
        text1 = findViewById(R.id.textView16);
        text2 = findViewById(R.id.textView17);

        View.OnClickListener e = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);

            }
        };
        explore.setOnClickListener(e);
    }
}