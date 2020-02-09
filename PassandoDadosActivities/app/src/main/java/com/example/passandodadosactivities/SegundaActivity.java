package com.example.passandodadosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    private TextView textViewNome;
    private TextView textViewNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textViewNome = findViewById(R.id.txtNome);
        textViewNum = findViewById(R.id.txtNum);

        // Recupera os dados enviados
        Bundle dados = getIntent().getExtras();
        String nome = dados.getString("nome");
        int num = dados.getInt("numero");
        Usuario usuario = (Usuario) dados.getSerializable("objeto");

        // Setar os valores recuperados
        textViewNome.setText(usuario.getNome());
        textViewNum.setText(String.valueOf(num));
    }
}
