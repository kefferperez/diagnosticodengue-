package com.example.prueba5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ListarPaciente extends AppCompatActivity {

    private static final String URL_players="https://addordelete.000webhostapp.com/CLIENTE.php?";
    List<Paciente> playerList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_paciente);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

       /* adaptador = new MiNuevoAdaptador(this,
                ListaClientes(8));*/


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        playerList = new ArrayList<>();
        loadclientes();

    }
    private void loadclientes() {

        StringRequest stringRequest =new StringRequest(Request.Method.GET, URL_players,
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONArray array = new JSONArray(response);

                            for (int i = 0; i < array.length(); i++) {
                                JSONObject player = array.getJSONObject(i);
                                playerList.add(new Paciente(
                                        player.getString("Dni"),
                                        player.getString("Nombre"),
                                        player.getString("ApellidoPaterno"),
                                        player.getString("ApellidoMaterno")

                                ));

                            }
                            AdaptadorListPacientes adapter = new AdaptadorListPacientes(ListarPaciente.this, playerList);
                            recyclerView.setAdapter(adapter);

                        } catch (JSONException e) {
                            e.printStackTrace();

                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
        Volley.newRequestQueue(this).add(stringRequest);



    }
}
