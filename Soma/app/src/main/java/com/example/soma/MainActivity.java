package com.example.soma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    EditText numero1;
    EditText numero2;
    Button botaoAdicionar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText) findViewById(R.id.edtNumero1);
        numero2 = (EditText) findViewById(R.id.edtNumero2);
        botaoAdicionar = (Button) findViewById(R.id.btSomar);

        botaoAdicionar.setOnClickListener(new AddButtonClickHandler());
    }

    public class AddButtonClickHandler implements OnClickListener{
        public void onClick(View view){
            int num1 = Integer.parseInt(numero1.getText().toString());
            int num2 = Integer.parseInt(numero2.getText().toString());
            Intent explicitIntent = new Intent(MainActivity.this,
                    ActivityResultado.class);
            explicitIntent.putExtra("Soma", num1 + "+" + num2 +
                    "=" + (num1 + num2));
            startActivity(explicitIntent);
        }

    }
}
