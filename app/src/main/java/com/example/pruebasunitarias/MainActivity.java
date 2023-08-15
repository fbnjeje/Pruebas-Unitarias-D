package com.example.pruebasunitarias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    operacin instancia = new operacin();
    private TextView mResultado;
    private EditText mNumero1;
    private EditText mNumero2;

    private Button btnSumar, btnRestar,btnMultiplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mResultado = (TextView) findViewById(R.id.tvResultado);
        mNumero1 = (EditText) findViewById(R.id.edNumero1);
        mNumero2 = (EditText) findViewById(R.id.edNumero2);

        btnSumar = (Button) findViewById(R.id.btnSuma);
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int numeroEntero = Integer.parseInt(mNumero1.getText().toString());
                    int numeroEntero1 = Integer.parseInt(mNumero2.getText().toString());

                    int res = numeroEntero1 + numeroEntero;

                    mResultado.setText(String.valueOf(res));
                } catch (NumberFormatException e) {
                    // Manejo de excepción si los valores ingresados no son números válidos
                    e.printStackTrace();
                    mResultado.setText("Error: Ingrese números válidos");
                }
            }
        });

        Button btnRestar = findViewById(R.id.btnResta);
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    //int nuntero = Integer.parseInt(mNumero1.getText().toString());
                    //int numeroEntero1 = Integer.parseInt(mmeroENumero2.getText().toString());
                    String textoIngresado = mNumero1.getText().toString();
                    String textoIngresado2 = mNumero2.getText().toString();

                    //int res = numeroEntero1 - numeroEntero;

                    mResultado.setText(String.valueOf(instancia.rests(textoIngresado,textoIngresado2)));
                } catch (NumberFormatException e) {
                    // Manejo de excepción si los valores ingresados no son números válidos
                    e.printStackTrace();
                    mResultado.setText("Error: Ingrese números válidos");
                }
            }
        });

        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int numeroEntero = Integer.parseInt(mNumero1.getText().toString());
                    int numeroEntero1 = Integer.parseInt(mNumero2.getText().toString());

                    int res = numeroEntero1 * numeroEntero;

                    mResultado.setText(String.valueOf(res));
                } catch (NumberFormatException e) {
                    // Manejo de excepción si los valores ingresados no son números válidos
                    e.printStackTrace();
                    mResultado.setText("Error: Ingrese números válidos");
                }
            }
        });
    }

    private void init() {
    }

    public static class Nombres {
        public String Mark(String mark,String Zuckerberg){
            String resultado = mark +" "+  Zuckerberg;
            return  resultado;
        };

        public String Elon(String Elon,String Musk){
            String resultado = Elon +" "+ Musk;
            return  resultado;
        };
        public String Jim(String Jim,String Carrey){
            String resultado = Jim +" "+ Carrey;
            return  resultado;
        };
    }
}







