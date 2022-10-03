package com.example.apptest;

import static android.widget.Toast.LENGTH_LONG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//1ere Etape: DECLARATION
    private Button next ;
    private EditText malek ;
    private ImageView pass ;
    private TextView signup ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         String a = "";


    //2eme Etape: IDENTIFICATION
        next = findViewById(R.id.button);
        malek = findViewById(R.id.editTextTextPersonName);
        pass = findViewById(R.id.imageView3);
        signup = findViewById(R.id.textView8);


        //recuperer text de l edittext
        a = malek.getText().toString();


        View.OnClickListener l = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //action to do
                //Dans put Extra (tag,valeur)
                Intent i = new Intent(getApplicationContext(), MainActivity2.class).putExtra("aaa",malek.getText().toString());
                startActivity(i);

            }
        };
        next.setOnClickListener(l);

        View.OnClickListener e = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //action to do
                //Dans put Extra (tag,valeur)
                Intent i = new Intent(getApplicationContext(), SignupActivity.class);
                startActivity(i);

            }
        };
        signup.setOnClickListener(e);


        View.OnClickListener p = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), malek.getText().toString(), LENGTH_LONG).show();

            }
        };
        pass.setOnClickListener(p);
    }
}