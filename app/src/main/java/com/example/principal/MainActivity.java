package com.example.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void cambio1 (View view){
        Intent objI = new Intent(MainActivity.this,Temperatura.class);
        startActivity(objI);
    }
    public void cambio2 (View view){
        Intent objI = new Intent(MainActivity.this,Longitud.class);
        startActivity(objI);
    }
    public void cambio3 (View view){
        Intent objI = new Intent(MainActivity.this,Masa.class);
        startActivity(objI);
    }
}