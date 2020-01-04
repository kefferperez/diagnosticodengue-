package com.example.prueba5;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class ConsultarPacienteRequest extends StringRequest {
    private static final String ruta="https://addordelete.000webhostapp.com/ConsultarPaciente.php?";

    private Map<String,String> Parametros;
    public ConsultarPacienteRequest(String Nombre, String ApellidoPaterno,String ApellidoMaterno, Response.Listener<String> listener){

        super(Request.Method.POST,ruta, listener,null);
        Parametros= new HashMap<>();
        Parametros.put("Nombre",Nombre+"");
        Parametros.put("ApellidoPaterno",ApellidoPaterno+"");
        Parametros.put("ApellidoMaterno",ApellidoMaterno+"");
    }

    @Override
    protected Map<String, String> getParams() {
        return Parametros;

    }
}
