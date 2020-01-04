package com.example.prueba5;

//LIBRERIAS A USAR
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//BOTONES PARA HACER USO DEL LAYOUT ACTIVITY MAIN
    Button TengoCuenta;
    Button NoTengoCuenta;

    //CREACION DEL ACTIVITY
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //MUESTRA EL LAYOUT ACTIVITY MAIN
        setContentView(R.layout.activity_main);
        //ENLACE DE LOS BOTONES DEL LAYOUT ACTIVITY MAIN A LA CLASE MAINACTIVITY
        TengoCuenta= (Button) findViewById(R.id.btnLogearse);
        NoTengoCuenta=(Button) findViewById(R.id.btnRegistroDiagnostico);

        //METODO DEL BOTON PARA LOGEARSE
        TengoCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, Login.class);
                startActivity(intent);


            }
        });
        //METODO DEL BOTON PARA MOSTRAR EL REGISTRO
       NoTengoCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, DiagnosticoParaInvitado.class);
                startActivity(intent);}});
    }
}
