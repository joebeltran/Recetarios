package com.example.recetario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Nota> notas;
    private ListView lista_notas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notas = new ArrayList<>();
        notas.add(new Nota("Ceviche", "Ingredientes:"));
        notas.add(new Nota("Paella", "Ingredientes:"));
        notas.add(new Nota("Omelette", "Ingredientes:"));


        lista_notas = (ListView) findViewById(R.id.lista_nota);
        lista_notas.setAdapter(new ArrayAdapter<Nota>(
                this,
                android.R.layout.simple_list_item_1,
                notas
                ));
    }
}
