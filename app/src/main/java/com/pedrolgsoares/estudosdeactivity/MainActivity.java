package com.pedrolgsoares.estudosdeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instanciando o botão
        buttonEnviar = findViewById(R.id.buttonEnviar);

        // Outra forma para inserir métodos nos botôes de ações é adicionar um ouvinte
        // ao qual receberá um new referente a uma classe anônima, após deverá criar um nova activity
        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  Para ir de uma activity para outra deve utilizar o método startActivity ao qual
                // Deverar iniciar o objeto Intent
                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                // Realizar a instancia de objetos
                Usuario usuario = new Usuario("OBJETO", "OBJETO@GMAIL.COM");

                // Após deveremos passar dados de uma activity para outra activity, com o putExtra()
                intent.putExtra("nome", "Pedro");
                intent.putExtra("idade", 21);

                // Abaixo a forma de inserir os dados de um objeto com intent
                intent.putExtra("objeto", usuario);

                // E por fim para executar deveremos colocar
                startActivity(intent);
            }
        });
    }
}