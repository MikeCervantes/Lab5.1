package com.example.kid_d_000.lab51;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SensorManager sensorManager;
    RecyclerView recyclerView;
    ArrayList<Item> listDatos;
    AdapterDatos adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        listDatos=new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setHasFixedSize(true);
        sensorManager = (SensorManager)this.getSystemService(SENSOR_SERVICE);
        List<Sensor> lista = sensorManager.getSensorList(Sensor.TYPE_ALL);
        for(int i=1; i<lista.size(); i++) {
            listDatos.add(new Item(lista.get(i).getName(),
                    lista.get(i).getVendor(),
                    lista.get(i).getVersion()+"",
                    lista.get(i).getMaximumRange()+"",
                    lista.get(i).getMinDelay()+"",
                    lista.get(i).getPower()+""));
        }

        adapter=new AdapterDatos(listDatos,MainActivity.this);
        recyclerView.setAdapter(adapter);
    }
}
