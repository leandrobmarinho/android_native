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

        numero1 = findViewById(R.id.edtNumero1);
        numero2 = findViewById(R.id.edtNumero2);
        botaoAdicionar = findViewById(R.id.btSomar);

//        botaoAdicionar.setOnClickListener(new AddButtonClickHandler());
    }

    public void somar(View view){
        int num1 = Integer.parseInt(numero1.getText().toString());
        int num2 = Integer.parseInt(numero2.getText().toString());

        Intent explicitIntent = new Intent(getApplicationContext(),
                ActivityResultado.class);

        explicitIntent.putExtra("Soma", Integer.toString(num1 + num2));

        startActivity(explicitIntent);
    }

//    public class AddButtonClickHandler implements OnClickListener{
//        public void onClick(View view){
//            int num1 = Integer.parseInt(numero1.getText().toString());
//            int num2 = Integer.parseInt(numero2.getText().toString());
//
//            Intent explicitIntent = new Intent(MainActivity.this,
//                    ActivityResultado.class);
//
//            explicitIntent.putExtra("Soma", (num1 + num2));
//
//            startActivity(explicitIntent);
//        }
//
//    }
}
