package com.example.covid_cilike;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class FeldolgozoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feldolgozo_acttivity);

        EditText kiir = findViewById(R.id.kiir);
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            kiir.setText(extras.getString("nev")+" "+extras.getString("szuldat")+" ");
        }


    }
}