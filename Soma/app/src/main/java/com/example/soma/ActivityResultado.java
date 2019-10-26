package com.example.soma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        TextView resultado; // pegar componente para mostrar resultado na Tela
        resultado = findViewById(R.id.resultView);

        Intent intent = getIntent(); // recebe mensagem
        String sum = (String) intent.getSerializableExtra("Soma"); // pega mensagem
        resultado.setText(sum); // mostra resultado na Tela
    }
}
