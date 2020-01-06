package com.example.prueba5;

import android.print.PageRange;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.security.cert.PKIXParameters;
import java.util.HashMap;
import java.util.Map;

public class RegistroRequest extends StringRequest {

    private static final String ruta="https://addordelete.000webhostapp.com/Insertarcliente.php?";
    private Map<String,String>Parametros;
    public RegistroRequest(String Dni,String Nombre, String ApellidoPaterno,String ApellidoMaterno, int Edad,String Sexo
            ,String Departamento,String Provincia,String Distrito,String Direccion, int Celular,String CorreoElectronico
            ,Response.Listener<String> listener){
        super(Request.Method.POST,ruta, listener,null);
        Parametros= new HashMap<>();
        Parametros.put("Dni",Dni+"");
        Parametros.put("Nombre",Nombre+"");
        Parametros.put("ApellidoPaterno",ApellidoPaterno+"");
        Parametros.put("ApellidoMaterno",ApellidoMaterno+"");
        Parametros.put("Edad",Edad+"");
        Parametros.put("Sexo",Sexo+"");
        Parametros.put("Departamento",Departamento+"");
        Parametros.put("Provincia",Provincia+"");
        Parametros.put("Distrito",Distrito+"");
        Parametros.put("Direccion",Direccion+"");
        Parametros.put("Celular",Celular+"");
        Parametros.put("CorreoElectronico",CorreoElectronico+"");

    }

    @Override
    protected Map<String, String> getParams() {
        return Parametros;

    }
}
