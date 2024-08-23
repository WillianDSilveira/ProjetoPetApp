package com.example.petapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void logar(View view) {
        // Pegando os compenentes da interface grafica
        EditText login = findViewById(R.id.editTextLogin);
        EditText senha = findViewById(R.id.editTextSenha);

        // Pegando o conteudo da caixa de login
        String conteudoLogin = login.getText().toString();
        String conteudoSenha = senha.getText().toString();

        if(conteudoLogin.isEmpty()){
            Toast.makeText(this, "prencher o campo login", Toast.LENGTH_SHORT).show();
            return;
        }
        if(conteudoSenha.isEmpty()){
            Toast.makeText(this, "prencher o campo senha", Toast.LENGTH_SHORT).show();
            return;
        }

        if(conteudoLogin.equals("admin") && conteudoSenha.equals("123")){
            // Acessar dashboard
        }else{
            Toast.makeText(this, "Usuario ou Senha INVALIDO", Toast.LENGTH_SHORT).show();
            return;
        }


    }
}