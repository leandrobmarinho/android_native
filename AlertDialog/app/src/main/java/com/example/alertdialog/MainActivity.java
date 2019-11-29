package com.example.alertdialog;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private ProgressBar progressBarCarregando;
//    private int progresso = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);
        progressBarCarregando = findViewById(R.id.progressBarCarregando);
        progressBarCarregando.setVisibility(View.GONE);

    }

    public void abrirAlerta(View view){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Título");
        dialog.setMessage("Mensagem");

        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Sim foi pressionado",
                        Toast.LENGTH_SHORT).show();
            }
        });
        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Não foi pressionado",
                        Toast.LENGTH_SHORT).show();
            }
        });

        dialog.create();
        dialog.show();
    }


    public void carregarProgressoBar(View view){
        progressBarCarregando.setVisibility(View.VISIBLE);

        new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i <= 100; i++){

                    final int progresso = i;
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setProgress(progresso);
                            if (progresso == 100){
                                progressBarCarregando.setVisibility(View.GONE);
                            }
                        }
                    });

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).start();
    }
}
