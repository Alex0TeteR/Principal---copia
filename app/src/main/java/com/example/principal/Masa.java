package com.example.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Masa extends AppCompatActivity {

    RadioButton KilosIZQ, KilosDER, OnzasIZQ, OnzasDER, LibrasIZQ, LibrasDER, StoneIZQ, StoneDER;
    TextView VERresultado;
    EditText numero1;
    Float kilos, onzas, stone, libras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masa);

        KilosIZQ = (RadioButton) findViewById(R.id.KilogramosIZQ);
        KilosDER = (RadioButton) findViewById(R.id.KilogramosDER);
        OnzasIZQ = (RadioButton) findViewById(R.id.OnzasIZQ);
        OnzasDER = (RadioButton) findViewById(R.id.OnzasDER);
        LibrasIZQ = (RadioButton) findViewById(R.id.LibrasIZQ);
        LibrasDER = (RadioButton) findViewById(R.id.LibrasDER);
        StoneIZQ = (RadioButton) findViewById(R.id.StoneIZQ);
        StoneDER = (RadioButton) findViewById(R.id.StoneDER);

        VERresultado = (TextView) findViewById(R.id.ResultadoMasa);
    }

    public void calcular(View view) {
    try {
        Float calculo;
        EditText numero1 = findViewById(R.id.numero);
        calculo = Float.valueOf(numero1.getText() + "");
        //1
        if ( KilosIZQ.isChecked() &&  KilosDER.isChecked()) {
            kilos = calculo;
            String resultado = String.valueOf(kilos);
            VERresultado.setText(resultado);
        }
        //2
        if ( KilosIZQ.isChecked() && OnzasDER.isChecked()) {
            onzas = calculo * 35.27396f;
            String resultado = String.valueOf(onzas);
            VERresultado.setText(resultado);
        }
        //3
        if ( KilosIZQ.isChecked() && StoneDER.isChecked()) {
            stone = calculo * 0.157473f;
            String resultado = String.valueOf(stone);
            VERresultado.setText(resultado);
        }
        //4
        if ( KilosIZQ.isChecked() && LibrasDER.isChecked()) {
            libras = calculo * 2.20462262f;
            String resultado = String.valueOf(libras);
            VERresultado.setText(resultado);
        }
        //
        if (OnzasIZQ.isChecked() &&  KilosDER.isChecked()) {
            kilos = calculo * 0.02833f;
            String resultado = String.valueOf(kilos);
            VERresultado.setText(resultado);
        }
        //2
        if (OnzasIZQ.isChecked() && OnzasDER.isChecked()) {
            onzas = calculo;
            String resultado = String.valueOf(onzas);
            VERresultado.setText(resultado);
        }
        //3
        if (OnzasIZQ.isChecked() && StoneDER.isChecked()) {
            stone = calculo / 244f;
            String resultado = String.valueOf(stone);
            VERresultado.setText(resultado);
        }
        //4
        if (OnzasIZQ.isChecked() && LibrasDER.isChecked()) {
            libras = calculo * 0.0625f;
            String resultado = String.valueOf(libras);
            VERresultado.setText(resultado);
        }
        //
        if (StoneIZQ.isChecked() &&  KilosDER.isChecked()) {
            kilos = calculo * 6.35029318f;
            String resultado = String.valueOf(kilos);
            VERresultado.setText(resultado);
        }
        //2
        if (StoneIZQ.isChecked() && OnzasDER.isChecked()) {
            onzas = calculo * 224f;
            String resultado = String.valueOf(onzas);
            VERresultado.setText(resultado);
        }
        //3
        if (StoneIZQ.isChecked() && StoneDER.isChecked()) {
            stone = calculo;
            String resultado = String.valueOf(stone);
            VERresultado.setText(resultado);
        }
        //4
        if (StoneIZQ.isChecked() && LibrasDER.isChecked()) {
            libras = calculo * 14;
            String resultado = String.valueOf(libras);
            VERresultado.setText(resultado);
        }
        //
        if (LibrasIZQ.isChecked() &&  KilosDER.isChecked()) {
            kilos = calculo * 0.45359237f;
            String resultado = String.valueOf(kilos);
            VERresultado.setText(resultado);
        }
        //2
        if (LibrasIZQ.isChecked() && OnzasDER.isChecked()) {
            onzas = calculo * 16f;
            String resultado = String.valueOf(onzas);
            VERresultado.setText(resultado);
        }
        //3
        if (LibrasIZQ.isChecked() && StoneDER.isChecked()) {
            stone = calculo * 0.07142857f;
            String resultado = String.valueOf(stone);
            VERresultado.setText(resultado);
        }
        //4
        if (LibrasIZQ.isChecked() && LibrasDER.isChecked()) {
            libras = calculo;
            String resultado = String.valueOf(libras);
            VERresultado.setText(resultado);
        }

    } catch (NumberFormatException e){
        Toast.makeText(this, "Indica la cantidad arriba", Toast.LENGTH_LONG).show();

    }

    }
}




