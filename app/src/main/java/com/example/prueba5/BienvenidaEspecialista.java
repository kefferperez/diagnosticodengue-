package com.example.prueba5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BienvenidaEspecialista extends AppCompatActivity {

    Button ConsultarPaciente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida_especialista);

        ConsultarPaciente=(Button)findViewById(R.id.buttonConsultarPaciente);
        ConsultarPaciente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BienvenidaEspecialista.this,ConsultarPaciente.class);
                startActivity(intent);
            }
        })
        ;
    }


}
