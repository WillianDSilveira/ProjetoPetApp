package com.example.petapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //Pegando os dados do pai
        String login = (String) getIntent().getSerializableExtra("login");
        Toast.makeText(this, "Bem Vindo: " + login, Toast.LENGTH_SHORT).show();
        setTitle("Dashboard");
    }

    public void Cadastro(View view) {
        Intent intent = new Intent(this,CadastroPetActivity.class);
        startActivity(intent);
    }

    public void Listagem(View view) {
        Intent intent = new Intent(this,ListagemPetActivity.class);
        startActivity(intent);
    }
}