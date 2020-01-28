package com.example.recicleview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.recicleview.R;
import com.example.recicleview.adapter.Adapter;
import com.example.recicleview.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        // Listagem de filmes
        this.criarFilmes();

        // Configurar Adapter
        Adapter adapter = new Adapter(listaFilmes);

        // Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        // evento de click
        recyclerView.addOnItemTouchListener();
    }

    public void criarFilmes(){
        Filme filme = new Filme("Homem Aranha", "Ficção", "2019");
        this.listaFilmes.add(filme);

        filme = new Filme("Filme 2", "Genero 2", "2018");
        this.listaFilmes.add(filme);

        filme = new Filme("Filme 3", "Genero 3", "2020");
        this.listaFilmes.add(filme);
    }
}
