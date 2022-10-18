package com.example.apptest;

import static android.widget.Toast.LENGTH_LONG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//1ere Etape: DECLARATION
    private Button next ;
    private EditText password,username ;
    private ImageView pass ;
    private TextView register ;
    private CheckBox rememberme ;
    private SharedPreferences mPreferences;
    public static final String sharedPrefFile = "tn.esprit.myapplication";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String a = "";


        //2eme Etape: IDENTIFICATION
        next = findViewById(R.id.button);
        password = findViewById(R.id.editTextTextPassword3);
        username = findViewById(R.id.editTextTextPersonName);
        pass = findViewById(R.id.imageView3);
        register = findViewById(R.id.textView8);
        rememberme = findViewById(R.id.checkBox);
        //recuperer text de l edittext
        a = password.getText().toString();
        //instance of sharedpreferences
        mPreferences = getSharedPreferences(sharedPrefFile, MODE_PRIVATE);
        username.setText(mPreferences.getString("login", ""));
        password.setText(mPreferences.getString("password", ""));

        if(mPreferences.contains("login")||mPreferences.contains("pwd")){

            username.setText(mPreferences.getString("login",""));
            password.setText(mPreferences.getString("pwd",""));

        }
        View.OnClickListener p = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), password.getText().toString(), LENGTH_LONG).show();

            }
        };
        pass.setOnClickListener(p);

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
        register.setOnClickListener(e);



        rememberme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((CheckBox) v).isChecked();

                if (checked){
                    SharedPreferences.Editor ed = mPreferences.edit();
                    ed.putString("login", username.getText().toString());
                    ed.putString("pwd", password.getText().toString());
                    ed.apply();

                }

            }
        });



    }
}