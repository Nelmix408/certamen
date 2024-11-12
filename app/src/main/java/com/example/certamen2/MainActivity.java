package com.example.certamen2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sexo;
    EditText Peso, Estatura, Resultado;
    Button CalcularIMC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Peso = findViewById(R.id.lblPeso);
        Estatura = findViewById(R.id.lblEstatura);
        Resultado = findViewById(R.id.lblResultado);

    }

    public void CalcularPeso(View view){
        Double peso = Double.valueOf(Peso.getText().toString());
        String estatura = Estatura.getText().toString();
        Double EstaturaM = Double.parseDouble(estatura)/100.0;
        Double IMC = peso /(EstaturaM*EstaturaM);
        if (){

        }
    }
}