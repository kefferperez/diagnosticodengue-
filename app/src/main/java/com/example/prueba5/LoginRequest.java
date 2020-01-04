package com.example.prueba5;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;
//metodo para la respuesta de login
public class LoginRequest extends StringRequest {
    //Login persona
    private static final String ruta="https://addordelete.000webhostapp.com/Login.php?";

    private Map<String,String>Parametros;
    public LoginRequest(String Usuario, String Pass,Response.Listener<String> listener){

        super(Request.Method.POST,ruta, listener,null);
        Parametros= new HashMap<>();
        Parametros.put("Usuario",Usuario+"");
        Parametros.put("Pass",Pass+"");
    }

    @Override
    protected Map<String, String> getParams() {
        return Parametros;

    }
}
