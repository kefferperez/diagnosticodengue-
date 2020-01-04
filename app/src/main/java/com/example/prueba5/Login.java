package com.example.prueba5;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class Login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText usuarioT =findViewById(R.id.editTextUsuario);
        final EditText contraseñaT=findViewById(R.id.editTextContraseña);
        Button Logearse=findViewById(R.id.buttonIngresar);

        Logearse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String usuario=usuarioT.getText().toString();
                final String contraseña=contraseñaT.getText().toString();
                Response.Listener<String> respuesta =new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonRespuesta= new JSONObject(response);
                            boolean ok=jsonRespuesta.getBoolean("success");
                            int tipousuario=jsonRespuesta.getInt("idTipoUsuario");

                            if (ok==true){
                                if (tipousuario==1){
                                    Intent bienvenidoEspecialista=new Intent(Login.this,BienvenidaEspecialista.class);
                                    Login.this.startActivity(bienvenidoEspecialista);
                                }
                                if(tipousuario==2){
                                    Intent bienvenidoPaciente=new Intent(Login.this,BienvenidaPaciente.class);
                                    Login.this.startActivity(bienvenidoPaciente);
                                }

                            }else
                            {
                                AlertDialog.Builder alerta= new AlertDialog.Builder(Login.this);
                                alerta.setMessage("Fallo en el Login").setNegativeButton("Reintentar",null).create().show();

                            }

                        }catch(JSONException e){
                            e.getMessage();

                        }

                    }
                };
                LoginRequest r =new LoginRequest(usuario,contraseña,respuesta );
                RequestQueue cola= Volley.newRequestQueue(Login.this);
                cola.add(r);

            }
        });
    }

}
