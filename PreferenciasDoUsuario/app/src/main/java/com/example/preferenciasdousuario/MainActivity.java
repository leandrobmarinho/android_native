package com.example.preferenciasdousuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editNome;
    private TextView textResultado;
    private static final String ARQUIVO_PREFERENCIA = "ArquivoPreferencia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = findViewById(R.id.editNome);
        textResultado = findViewById(R.id.textResultado);

        // Recuperar dados salvos
        SharedPreferences preferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
        if (preferences.contains("nome")){
            String nome = preferences.getString("nome", "usuario não definido");
            textResultado.setText("Olá, " + nome);
        }else{
            textResultado.setText("Usuário não definido!");
        }
    }

    public void botao_enviar(View view){
        SharedPreferences preferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
        SharedPreferences.Editor editor = preferences.edit();

        // Validar o nome
        if (editNome.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "Preencha o nome",
                    Toast.LENGTH_LONG).show();
        }else{
            String nome = editNome.getText().toString();
            editor.putString("nome", nome);
            editor.commit();
            textResultado.setText("Olá, " + nome);
        }
    }
}
