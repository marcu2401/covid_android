package com.example.covid_cilike;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nev=findViewById(R.id.nev);
        EditText szuldat=findViewById(R.id.szuldat);
        EditText taj=findViewById(R.id.taj);
        Button regisztral=findViewById(R.id.regisztral);


        regisztral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,  FeldolgozoActivity.class);
                i.putExtra("nev",nev.getText().toString());
                i.putExtra("szuldat",szuldat.getText().toString());
                i.putExtra("taj", taj.getText().toString());

                startActivity(i);
            }
        });


    }

}