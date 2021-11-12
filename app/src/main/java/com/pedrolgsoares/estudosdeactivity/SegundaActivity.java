package com.pedrolgsoares.estudosdeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    private TextView textViewNome, textViewIdade, textViewObjeto, textViewEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textViewNome = findViewById(R.id.textViewNome);
        textViewIdade = findViewById(R.id.textViewIdade);
        textViewObjeto = findViewById(R.id.textViewObjeto);
        textViewEmail = findViewById(R.id.textViewEmail);

        // Recuperar os dados enviados com Bundle, de uma activity a outra
        Bundle dados = getIntent().getExtras();
        String nome = dados.getString("nome");
        int idade = dados.getInt("idade");

        // Recuperar os dados do objeto
        Usuario usuario = (Usuario) dados.getSerializable("objeto");

        // Configurar os valores recuperados
        textViewNome.setText(nome);
        textViewIdade.setText(String.valueOf(idade));

        // Configurar os dados do objeto
        textViewObjeto.setText(usuario.getNomeObjeto());
        textViewEmail.setText(usuario.getEmailDoObjeto());


    }
}