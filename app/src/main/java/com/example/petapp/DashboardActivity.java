package com.example.petapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {

    ArrayList<Pet> listaPet = new ArrayList<Pet>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //Pegando os dados do pai
        String login = (String) getIntent().getSerializableExtra("login");
        Toast.makeText(this, "Bem Vindo: " + login, Toast.LENGTH_SHORT).show();
        setTitle("Dashboard");
    }

    public void cadastroPet(View view) {
        Bundle bundle = new Bundle();// Cria mochila
        bundle.putSerializable("lista_pet", listaPet); // joga a lista dentro da mochila
        Intent intent = new Intent(this,
                CadastroPetActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void listagemPet(View view) {
        // Bundle=Mochila
        Bundle bundle = new Bundle();
        bundle.putSerializable("lista_pet", listaPet);
        Intent intent = new Intent(this,
                ListagemPetActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void removerPet(View view) {
        // Bundle=Mochila
        Bundle bundle = new Bundle();
        bundle.putSerializable("lista_pet", listaPet);
        Intent intent = new Intent(this,
                RemoverPetActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void atualizarPet(View view) {
        // Bundle=Mochila
        Bundle bundle = new Bundle();
        bundle.putSerializable("lista_pet", listaPet);
        Intent intent = new Intent(this,
                AtualizarPetActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}