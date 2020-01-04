package com.example.prueba5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PerfilConsultarPaciente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_consultar_paciente);

        final TextView nombrep=(TextView)findViewById(R.id.textViewNombrePaciente);
        final TextView apellidopap=(TextView) findViewById(R.id.textViewAPpaciente);
        final TextView apellidomap=(TextView) findViewById(R.id.textViewAMpaciente);
        final TextView edadP=(TextView) findViewById(R.id.textViewEdadPaciente);
        final TextView alturap=(TextView) findViewById(R.id.textViewAlturaPaciente);
        final TextView pesop=(TextView) findViewById(R.id.textViewPesoPaciente);
        final TextView departamentop=(TextView) findViewById(R.id.textViewDepartamentoPaciente);
        final TextView provinciap=(TextView) findViewById(R.id.textViewProvinciaPaciente);
        final TextView distritop=(TextView) findViewById(R.id.textViewDistritoPaciente);
        final TextView celularp=(TextView) findViewById(R.id.textViewCelularPaciente);
        final TextView cep=(TextView) findViewById(R.id.textViewCEpaciente);

        Intent i =this.getIntent();
        String nombre=i.getStringExtra("Nombre");
        String apellidop=i.getStringExtra("ApellidoPaterno");
        String apellidom=i.getStringExtra("ApellidoMaterno");
        int edad=i.getIntExtra("Edad",-1);
        String altura=i.getStringExtra("Altura");
        String peso=i.getStringExtra("Peso");
        String departamento=i.getStringExtra("Departamento");
        String provincia=i.getStringExtra("Provincia");
        String distrito=i.getStringExtra("Distrito");
        int celular=i.getIntExtra("Celular",-1);
        String correoelec=i.getStringExtra("CorreoElectronico");

        nombrep.setText(nombre);
        apellidopap.setText(apellidop);
        apellidomap.setText(apellidom);
        edadP.setText(" "+edad);
        alturap.setText(altura);
        pesop.setText(peso);
        departamentop.setText(departamento);
        provinciap.setText(provincia);
        distritop.setText(distrito);
        celularp.setText(""+celular);
        cep.setText(correoelec);

    }
}
