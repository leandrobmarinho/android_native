package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Postagem> postagens = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        // Define layout
        LinearLayoutManager layoutManager = new
                LinearLayoutManager(getApplicationContext());
//        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
//        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);

        recyclerView.setLayoutManager(layoutManager);

        // Define adapter
        prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerView.setAdapter(adapter);
    }

    public void prepararPostagens(){
        Postagem p = new Postagem("Leandro Marinho",
                "#tbt", R.drawable.imagem1);
        postagens.add(p);

        p = new Postagem("Leandro Marinho",
                "#tbt", R.drawable.imagem2);
        postagens.add(p);
    }
}
