package com.example.principal;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Temperatura extends AppCompatActivity {

    RadioButton CelsiusIZQ, CelsiusDER, KelvinIZQ, KelvinDER, FahrenheitIZQ, FahrenheitDER, RankineIZQ, RankineDER;
    TextView VERresultado;
    EditText numero1;
    Float Celsius, Kelvin, Fahrenheit, Rankine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        CelsiusIZQ = (RadioButton) findViewById(R.id.CelsiusIZQ);
        CelsiusDER = (RadioButton) findViewById(R.id.CelsiusDER);
        KelvinIZQ = (RadioButton) findViewById(R.id.KelvinIZQ);
        KelvinDER = (RadioButton) findViewById(R.id.KelvinDER);
        FahrenheitIZQ = (RadioButton) findViewById(R.id.FahrenheitIZQ);
        FahrenheitDER = (RadioButton) findViewById(R.id.FahrenheitDER);
        RankineIZQ = (RadioButton) findViewById(R.id.RankineIZQ);
        RankineDER = (RadioButton) findViewById(R.id.RankineDER);

        VERresultado = (TextView) findViewById(R.id.ResultadoTemperatura);


    }

    public void calcular(View view) {

try {
    Float calculo;
    EditText numero1 = findViewById(R.id.numero3);
    calculo = Float.valueOf(numero1.getText() + "");

    //1
    if (CelsiusIZQ.isChecked() && CelsiusDER.isChecked()) {
        Celsius = calculo;
        String resultado = String.valueOf(Celsius);
        VERresultado.setText(resultado);
    }
    //2
    if (CelsiusIZQ.isChecked() && KelvinDER.isChecked()) {
        Kelvin = calculo + 273.15f;
        String resultado = String.valueOf(Kelvin);
        VERresultado.setText(resultado);
    }
    //3
    if (CelsiusIZQ.isChecked() && FahrenheitDER.isChecked()) {
        Fahrenheit = calculo * 9 / 5f + 32f;
        String resultado = String.valueOf(Fahrenheit);
        VERresultado.setText(resultado);
    }
    //4
    if (CelsiusIZQ.isChecked() && RankineDER.isChecked()) {
        Rankine = calculo * 9 / 5f + 491.67f;
        String resultado = String.valueOf(Rankine);
        VERresultado.setText(resultado);
    }

    if (KelvinIZQ.isChecked() && CelsiusDER.isChecked()) {
        Celsius = calculo - 273.15f;
        String resultado = String.valueOf(Celsius);
        VERresultado.setText(resultado);
    }
    if (KelvinIZQ.isChecked() && KelvinDER.isChecked()) {
        Kelvin = calculo;
        String resultado = String.valueOf(Kelvin);
        VERresultado.setText(resultado);
    }
    if (KelvinIZQ.isChecked() && FahrenheitDER.isChecked()) {
        Fahrenheit = (calculo - 273.15f) * 9 / 5f + 32f;
        String resultado = String.valueOf(Fahrenheit);
        VERresultado.setText(resultado);
    }
    if (KelvinIZQ.isChecked() && RankineDER.isChecked()) {
        Rankine = calculo * 1.8f;
        String resultado = String.valueOf(Rankine);
        VERresultado.setText(resultado);
    }
    //1
    if (FahrenheitIZQ.isChecked() && CelsiusDER.isChecked()) {
        Celsius = (calculo - 32f) * 5 / 9f;
        String resultado = String.valueOf(Celsius);
        VERresultado.setText(resultado);
    }
    //2
    if (FahrenheitIZQ.isChecked() && KelvinDER.isChecked()) {
        Kelvin = (calculo - 32f) * 5 / 9f + 273f;
        String resultado = String.valueOf(Kelvin);
        VERresultado.setText(resultado);
    }
    //3
    if (FahrenheitIZQ.isChecked() && FahrenheitDER.isChecked()) {
        Fahrenheit = calculo;
        String resultado = String.valueOf(Fahrenheit);
        VERresultado.setText(resultado);
    }
    //4
    if (FahrenheitIZQ.isChecked() && RankineDER.isChecked()) {
        Rankine = calculo + 459.67f;
        String resultado = String.valueOf(Rankine);
        VERresultado.setText(resultado);
    }
    //1
    if (RankineIZQ.isChecked() && CelsiusDER.isChecked()) {
        Celsius = (calculo - 491.67f) * 5 / 9f;
        String resultado = String.valueOf(Celsius);
        VERresultado.setText(resultado);
    }
    //2
    if (RankineIZQ.isChecked() && KelvinDER.isChecked()) {
        Kelvin = calculo * 5 / 9f;
        String resultado = String.valueOf(Kelvin);
        VERresultado.setText(resultado);
    }
    //3
    if (RankineIZQ.isChecked() && FahrenheitDER.isChecked()) {
        Fahrenheit = calculo - 459.67f;
        String resultado = String.valueOf(Fahrenheit);
        VERresultado.setText(resultado);
    }
    //4
    if (RankineIZQ.isChecked() && RankineDER.isChecked()) {
        Rankine = calculo;
        String resultado = String.valueOf(Rankine);
        VERresultado.setText(resultado);
    }


} catch (NumberFormatException e){
    Toast.makeText(this, "Indica la cantidad arriba", Toast.LENGTH_LONG).show();

}

    }
}
