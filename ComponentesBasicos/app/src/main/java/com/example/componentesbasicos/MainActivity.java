package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText campoProduto;
    private TextView resultado;
    private CheckBox cbBranco, cbVerde, cbVermelho;
    private List<String> check = new ArrayList();
    private RadioGroup rgEstoque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoProduto = findViewById(R.id.edProduto);
        resultado = findViewById(R.id.txtResultado);

        cbBranco = findViewById(R.id.cbBranco);
        cbVerde = findViewById(R.id.cbVerde);
        cbVermelho = findViewById(R.id.cbVermelho);

        rgEstoque = findViewById(R.id.rgEstoque);
        verificaRadioButton();
    }

    public void verificaCheck(){
        check.clear();
        if (cbBranco.isChecked()){
            check.add(cbBranco.getText().toString());
        }

        resultado.setText(check.toString());
    }

    public void verificaRadioButton(){
        rgEstoque.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rbSim){
                    resultado.setText("Sim");
                }else{
                    resultado.setText("Não");
                }
            }
        });
    }

    public void enviar_texto(View view){
        String nomeProduto = campoProduto.getText().toString();
        resultado.setText(nomeProduto);

        verificaCheck();
    }
}