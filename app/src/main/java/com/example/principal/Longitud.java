package com.example.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Longitud extends AppCompatActivity {

    RadioButton QuilometrosIZQ, QuilometrosDER, MillasIZQ, MillasDER, YardasIZQ, YardasDER, PulgadasIZQ, PulgadasDER;
    TextView VERresultado;
    EditText numero1;
    Float Quilometros, Millas, Yardas, Pulgadas;
    Float calculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longitud);


        QuilometrosIZQ = (RadioButton) findViewById(R.id.QuilometrosIZQ);
        QuilometrosDER = (RadioButton) findViewById(R.id.QuilometrosDER);
        MillasIZQ = (RadioButton) findViewById(R.id.MillasIZQ);
        MillasDER = (RadioButton) findViewById(R.id.MillasDER);
        YardasIZQ = (RadioButton) findViewById(R.id.YardasIZQ);
        YardasDER = (RadioButton) findViewById(R.id.YardasDER);
        PulgadasIZQ = (RadioButton) findViewById(R.id.PulgadasIZQ);
        PulgadasDER = (RadioButton) findViewById(R.id.PulgadasDER);



    }
        public void calcular (View view){
            try {

                VERresultado = (TextView) findViewById(R.id.ResultadoLongitud);
            EditText numero1 = findViewById(R.id.numero2);

            calculo = Float.parseFloat(numero1.getText() + "");
            //1
            if (QuilometrosIZQ.isChecked() && QuilometrosDER.isChecked()) {
                Quilometros = calculo;
                String resultado = String.valueOf(Quilometros);
                VERresultado.setText(resultado);
            }
            //2
            if (QuilometrosIZQ.isChecked() && MillasDER.isChecked()) {
                Millas = calculo * 	0.6213712f;
                String resultado = String.valueOf(Millas);
                VERresultado.setText(resultado);
            }
            //3
            if (QuilometrosIZQ.isChecked() && YardasDER.isChecked()) {
                Yardas = calculo * 	1093.613f;
                String resultado = String.valueOf(Yardas);
                VERresultado.setText(resultado);
            }
            //4
            if (QuilometrosIZQ.isChecked() && PulgadasDER.isChecked()) {
                Pulgadas = calculo * 39370.08f;
                String resultado = String.valueOf(Pulgadas);
                VERresultado.setText(resultado);
            }

            if (MillasIZQ.isChecked() && QuilometrosDER.isChecked()) {
                Quilometros = calculo * 1.609344f;
                String resultado = String.valueOf(Quilometros);
                VERresultado.setText(resultado);
            }
            if (MillasIZQ.isChecked() && MillasDER.isChecked()) {
                Millas = calculo;
                String resultado = String.valueOf(Millas);
                VERresultado.setText(resultado);
            }
            if (MillasIZQ.isChecked() && YardasDER.isChecked()) {
                Yardas = calculo * 	1760f;
                String resultado = String.valueOf(Yardas);
                VERresultado.setText(resultado);
            }
            if (MillasIZQ.isChecked() && PulgadasDER.isChecked()) {
                Pulgadas = calculo * 63360f;
                String resultado = String.valueOf(Pulgadas);
                VERresultado.setText(resultado);
            }
            //1
            if (YardasIZQ.isChecked() && QuilometrosDER.isChecked()) {
                Quilometros = calculo * 0.0009144f;
                String resultado = String.valueOf(Quilometros);
                VERresultado.setText(resultado);
            }
            //2
            if (YardasIZQ.isChecked() && MillasDER.isChecked()) {
                Millas = calculo * 	0.0005681818f;
                String resultado = String.valueOf(Millas);
                VERresultado.setText(resultado);
            }
            //3
            if (YardasIZQ.isChecked() && YardasDER.isChecked()) {
                Yardas = calculo;
                String resultado = String.valueOf(Yardas);
                VERresultado.setText(resultado);
            }
            //4
            if (YardasIZQ.isChecked() && PulgadasDER.isChecked()) {
                Pulgadas = calculo * 36f;
                String resultado = String.valueOf(Pulgadas);
                VERresultado.setText(resultado);
            }
            //1
            if (PulgadasIZQ.isChecked() && QuilometrosDER.isChecked()) {
                Quilometros = calculo * 0.0000254f;
                String resultado = String.valueOf(Quilometros);
                VERresultado.setText(resultado);
            }
            //2
            if (PulgadasIZQ.isChecked() && MillasDER.isChecked()) {
                Millas = calculo * 	0.00001578283f;
                String resultado = String.valueOf(Millas);
                VERresultado.setText(resultado);
            }
            //3
            if (PulgadasIZQ.isChecked() && YardasDER.isChecked()) {
                Yardas = calculo * 0.02777778f;
                String resultado = String.valueOf(Yardas);
                VERresultado.setText(resultado);
            }
            //4
            if (PulgadasIZQ.isChecked() && PulgadasDER.isChecked()) {
                Pulgadas = calculo;
                String resultado = String.valueOf(Pulgadas);
                VERresultado.setText(resultado);
            }
            } catch (NumberFormatException e){
                Toast.makeText(this, "Indica la cantidad arriba", Toast.LENGTH_LONG).show();

            }
            }
        }

