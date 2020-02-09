package com.example.passandodadosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botaoEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoEnviar = findViewById(R.id.buttonEnviar);
    }

    public void passar_dados(View view){
        Intent intent = new Intent(getApplicationContext(),
                SegundaActivity.class);

        // Instanciar o objeto
        Usuario usuario = new Usuario("Pedro", "pedro@gmail.com");

        //Passar dados
        intent.putExtra("nome", "Leandro");
        intent.putExtra("numero", 303220);
        intent.putExtra("objeto", usuario);

        startActivity(intent);
    }
}
