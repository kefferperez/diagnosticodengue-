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
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class ConsultarPaciente extends AppCompatActivity {

    Button ConsultarPorNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_paciente);

        final EditText nombrePaciente=findViewById(R.id.editTextNombreDePacienteConsultar);
        final EditText apellidoPaternoPaciente=findViewById(R.id.editTextApellidoPaternoDePacienteConsultar);
        final EditText apellidoMaternoPaciente=findViewById(R.id.editTextApellidoMaternoDePacienteConsultar);
        final EditText documentoPaciente=findViewById(R.id.editTextConsultarPorNumeroDeDocumento);
        ConsultarPorNombre=(Button) findViewById(R.id.buttonConsultarPorNombreDePaciente);
        //Button ConsultarPorDocumento=findViewById(R.id.buttonConsultarPorNumeroDeDocumento);

        ConsultarPorNombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String NombreCompletoPaciente=nombrePaciente.getText().toString();
                final String ApellidoPaternoPaciente=apellidoPaternoPaciente.getText().toString();
                final String ApellidoMaternoPaciente=apellidoMaternoPaciente.getText().toString();
                Response.Listener<String> respuesta =new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonRespuesta= new JSONObject(response);
                            boolean ok=jsonRespuesta.getBoolean("success");

                            String codigoPaciente=jsonRespuesta.getString("Cod_Paciente");
                            String nombrePaciente=jsonRespuesta.getString("Nombre");
                            String apellidoPaternoPaciente=jsonRespuesta.getString("ApellidoPaterno");
                            String apellidoMaternoPaceinte=jsonRespuesta.getString("ApellidoMaterno");
                            int edadPaciente=jsonRespuesta.getInt("Edad");
                            String alturaPaciente=jsonRespuesta.getString("Altura");
                            String pesoPaciente=jsonRespuesta.getString("Peso");
                            String departamentoPaciente=jsonRespuesta.getString("Departamento");
                            String provinciaPaciente=jsonRespuesta.getString("Provincia");
                            String distritoPaciente=jsonRespuesta.getString("Distrito");
                            int celularPaciente=jsonRespuesta.getInt("Celular");
                            String correoElectronicoPaciente=jsonRespuesta.getString("CorreoElectronico");
                            String idresultadodiagnosticoPaciente=jsonRespuesta.getString("idResultadoDiagnostico");

                            if (ok==true){



                                    Intent perfilConsultarCliente=new Intent(ConsultarPaciente.this,PerfilConsultarPaciente.class);


                                perfilConsultarCliente.putExtra("Cod_Paciente",codigoPaciente);
                                perfilConsultarCliente.putExtra("Nombre",nombrePaciente);
                                perfilConsultarCliente.putExtra("ApellidoPaterno",apellidoPaternoPaciente);
                                perfilConsultarCliente.putExtra("ApellidoMaterno",apellidoMaternoPaceinte);
                                perfilConsultarCliente.putExtra("Edad",edadPaciente);
                                perfilConsultarCliente.putExtra("Altura",alturaPaciente);
                                perfilConsultarCliente.putExtra("Peso",pesoPaciente);
                                perfilConsultarCliente.putExtra("Departamento",departamentoPaciente);
                                perfilConsultarCliente.putExtra("Provincia",provinciaPaciente);
                                perfilConsultarCliente.putExtra("Distrito",distritoPaciente);
                                perfilConsultarCliente.putExtra("Celular",celularPaciente);
                                perfilConsultarCliente.putExtra("CorreoElectronico",correoElectronicoPaciente);
                                perfilConsultarCliente.putExtra("idResultadoDiagnostico",idresultadodiagnosticoPaciente);

                                ConsultarPaciente.this.startActivity(perfilConsultarCliente);

                            }else
                            {
                                AlertDialog.Builder alerta= new AlertDialog.Builder(ConsultarPaciente.this);
                                alerta.setMessage("Fallo en la consulta").setNegativeButton("Reintentar",null).create().show();

                            }

                        }catch(JSONException e){
                            e.getMessage();

                        }

                    }
                };
                ConsultarPacienteRequest r =new ConsultarPacienteRequest(NombreCompletoPaciente,ApellidoPaternoPaciente,ApellidoMaternoPaciente,respuesta );
                RequestQueue cola= Volley.newRequestQueue(ConsultarPaciente.this);
                cola.add(r);

            }
        });
    }
}
