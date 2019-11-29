package com.example.componentesdeinterface2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleEstado;
    private Switch switchEstado;
    private CheckBox checkEstado;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleEstado = findViewById(R.id.toggleEstado);
        switchEstado = findViewById(R.id.switchEstado);
        checkEstado = findViewById(R.id.checkEstado);
        textResultado = findViewById(R.id.textResultado);
    }

    public void enviar(View view){
        if (switchEstado.isChecked()){
            textResultado.setText("switchEstado Ligado");
        }else{
            textResultado.setText("switchEstado Desligado");
        }

        // TODO: fazer com toggleEstado e checkEstado
    }

    public void enviar_msg(View view){
        Toast.makeText(getApplicationContext(), "Botão pressionado",
                Toast.LENGTH_LONG).show();
    }

}
