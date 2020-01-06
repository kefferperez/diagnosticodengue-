package com.example.prueba5;

import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;
//Clase generica
public class DiagnosticoParaInvitado extends AppCompatActivity {
    //Creacion de la activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostico_para_invitado);
        //Enlace a los objetos del activity diagnostico para invitado
        final EditText dnT=findViewById(R.id.edTxtDni);
        final EditText nombreT=findViewById(R.id.edTxtNombre);
        final EditText apellidoPaternoT=findViewById(R.id.edTxtApellidoPaterno);
        final EditText apellidoMaternoT=findViewById(R.id.edTxtApellidoMaterno);
        final EditText edadT=findViewById(R.id.edTxtEdad);
        final EditText sexoT=findViewById(R.id.edTxtSexo);
        final EditText departamentoT=findViewById(R.id.edTxtDepartamento);
        final EditText provinciaT=findViewById(R.id.edTxtProvincia);
        final EditText distritoT=findViewById(R.id.edTxtDistrito);
        final EditText direccionT=findViewById(R.id.edTxtDireccion);
        final EditText celularT=findViewById(R.id.edTxtCelular);
        final EditText correoElectronicoT=findViewById(R.id.edTxtCorreoElectronico);
        Button guardar=findViewById(R.id.btnGuardaryContinuar);
        //Metodo de boton
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Definicion de variables en la clase
                String dni=dnT.getText().toString();
                String nombre=nombreT.getText().toString();
                String apellidoPaterno=apellidoPaternoT.getText().toString();
                String apellidoMaterno=apellidoMaternoT.getText().toString();
                int edad=Integer.parseInt(edadT.getText().toString());
                String sexo=sexoT.getText().toString();
                String departamento=departamentoT.getText().toString();
                String provincia=provinciaT.getText().toString();
                String distrito=distritoT.getText().toString();
                String direccion=direccionT.getText().toString();
                int celular=Integer.parseInt(celularT.getText().toString());
                String correoElectronico=correoElectronicoT.getText().toString();

                Response.Listener<String> respuesta=new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {
                            //Creacion de un objeto Json en este caso response
                            JSONObject jsonRespuesta = new JSONObject(response);
                            //Variable booleana
                            boolean ok=jsonRespuesta.getBoolean("success");

                            if (ok==true){
                               Intent i=new Intent(DiagnosticoParaInvitado.this,DiagnosticoSinCuenta.class);
                               DiagnosticoParaInvitado.this.startActivity(i);
                               //DiagnosticoParaInvitado.this.finish();

                            }else {
                                AlertDialog.Builder alerta= new AlertDialog.Builder(DiagnosticoParaInvitado.this);
                                alerta.setMessage("Fallo en el registro").setNegativeButton("Reintentar",null).create().show();
                            }
                        }catch (JSONException e){
                            e.getMessage();
                        }

                    }
                };

                RegistroRequest r =new RegistroRequest(dni,nombre,apellidoPaterno,apellidoMaterno,edad,sexo,departamento,provincia
                        ,distrito,direccion,celular,correoElectronico,respuesta );
                RequestQueue cola= Volley.newRequestQueue(DiagnosticoParaInvitado.this);
                cola.add(r);
            }
        });
    }

}
