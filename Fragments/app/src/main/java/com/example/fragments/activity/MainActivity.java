package com.example.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragments.R;
import com.example.fragments.fragment.ContatosFragment;
import com.example.fragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {
    private ConversasFragment conversasFragment;
    private ContatosFragment contatosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Remover sombra da ActionBar
        getSupportActionBar().setElevation(0);

        conversasFragment = new ConversasFragment();

        // Configurar objeto para o fragmento
        FragmentTransaction transaction = getSupportFragmentManager().
                beginTransaction();
        transaction.replace(R.id.frameConteudo, conversasFragment);
        transaction.commit();
    }

    public void add_contato_fragment(View view){
        contatosFragment = new ContatosFragment();

        FragmentTransaction transaction = getSupportFragmentManager().
                beginTransaction();
        transaction.replace(R.id.frameConteudo, contatosFragment);
        transaction.commit();
    }

    public void add_conversa_fragment(View view){
        FragmentTransaction transaction = getSupportFragmentManager().
                beginTransaction();
        transaction.replace(R.id.frameConteudo, conversasFragment);
        transaction.commit();
    }
}
