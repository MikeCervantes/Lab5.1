package com.example.kid_d_000.lab51;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetallesActivity extends AppCompatActivity {
    TextView txtNombre,txtFabricante,txtVersion,txtMaxRange,txtMinDelay,txtPower;
    String nombre,fabricante,version,maxRange,minDelay,power;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        txtNombre=findViewById(R.id.nombre);
        txtFabricante=findViewById(R.id.fabricante);
        txtVersion=findViewById(R.id.version);
        txtMaxRange=findViewById(R.id.maxRange);
        txtMinDelay=findViewById(R.id.minDelay);
        txtPower=findViewById(R.id.power);

        nombre=getIntent().getStringExtra("nombre");
        fabricante=getIntent().getStringExtra("fabricante");
        version=getIntent().getStringExtra("version");
        maxRange=getIntent().getStringExtra("maxRange");
        minDelay=getIntent().getStringExtra("minDelay");
        power=getIntent().getStringExtra("power");

        txtNombre.setText("NOMBRE DEL SENSOR: "+nombre);
        txtFabricante.setText("FABRICANTE: "+fabricante);
        txtVersion.setText("VERSIÓN: "+version);
        txtMaxRange.setText("RANGO MÁXIMO: "+maxRange);
        txtMinDelay.setText("RETRASO MÍNIMO: "+minDelay);
        txtPower.setText("PODER: "+power);
    }
}
