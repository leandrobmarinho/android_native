package com.example.recicleview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.recicleview.ClickListener;
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
        recyclerView.addOnItemTouchListener(
            new ClickListener(getApplicationContext(),
                    recyclerView,
                    new ClickListener.OnItemClickListener() {
                        @Override
                        public void onItemClick(View view, int position) {
                            Filme filme = listaFilmes.get(position);

                            Toast.makeText(getApplicationContext(),
                                    "Item pressionado " + filme.getTituloFilme(),
                                    Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onLongItemClick(View view, int position) {
                            Filme filme = listaFilmes.get(position);

                            Toast.makeText(getApplicationContext(),
                                    "Click longo " + filme.getTituloFilme(),
                                    Toast.LENGTH_LONG).show();
                        }

                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                        }
                    }
            )
        );
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
