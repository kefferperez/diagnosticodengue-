package com.example.prueba5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BienvenidaEspecialistaGestor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida_especialista_gestor);
        final Button ListarPaciente=findViewById(R.id.btnListarPacientes);

        ListarPaciente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ListadePacientes=new Intent(BienvenidaEspecialistaGestor.this,ListarPaciente.class);
                BienvenidaEspecialistaGestor.this.startActivity(ListadePacientes);
            }
        });
    }
}
