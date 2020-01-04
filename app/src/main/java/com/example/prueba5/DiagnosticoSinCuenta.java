package com.example.prueba5;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.prueba5.Fragment.DiagnosticoBienvenida;
import com.example.prueba5.Fragment.Pregunta1;
import com.example.prueba5.Fragment.Pregunta10;
import com.example.prueba5.Fragment.Pregunta12;
import com.example.prueba5.Fragment.Pregunta13;
import com.example.prueba5.Fragment.Pregunta14;
import com.example.prueba5.Fragment.Pregunta15;
import com.example.prueba5.Fragment.Pregunta16;
import com.example.prueba5.Fragment.Pregunta17;
import com.example.prueba5.Fragment.Pregunta2;
import com.example.prueba5.Fragment.Pregunta3;
import com.example.prueba5.Fragment.Pregunta4;
import com.example.prueba5.Fragment.Pregunta5;
import com.example.prueba5.Fragment.Pregunta6;
import com.example.prueba5.Fragment.Pregunta9;
import com.example.prueba5.ui.main.SectionsPagerAdapter;

public class DiagnosticoSinCuenta extends AppCompatActivity implements DiagnosticoBienvenida.OnFragmentInteractionListener,
        Pregunta1.OnFragmentInteractionListener, Pregunta2.OnFragmentInteractionListener, Pregunta3.OnFragmentInteractionListener,
        Pregunta4.OnFragmentInteractionListener, Pregunta5.OnFragmentInteractionListener, Pregunta6.OnFragmentInteractionListener,
        Pregunta9.OnFragmentInteractionListener,
        Pregunta10.OnFragmentInteractionListener,  Pregunta12.OnFragmentInteractionListener,
        Pregunta13.OnFragmentInteractionListener, Pregunta14.OnFragmentInteractionListener, Pregunta15.OnFragmentInteractionListener,
        Pregunta16.OnFragmentInteractionListener, Pregunta17.OnFragmentInteractionListener

{
    int resultado=0;
    TextView texto;
    //RadioButton fiebre=findViewById(R.id.radioButtonPresentoFiebre);
//    RadioButton nofiebre=findViewById(R.id.radioButtonNoPpresentoFiebre);

    //RadioButton escalosfrio=findViewById(R.id.radioButtonPresentoEscalofrios);
   // RadioButton noescalosfrio=findViewById(R.id.radioButtonNoPpresentoEscalofrios);

    //RadioButton cansancio=findViewById(R.id.radioButtonPresentoCansancio);
   // RadioButton nocansacio=findViewById(R.id.radioButtonNoPpresentoCansancio);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostico_sin_cuenta);

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);






        /*escalosfrio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (escalosfrio.isChecked() == true) {
                    resultado = resultado + 3;
                }


            }
        });
        cansancio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cansancio.isChecked() == true) {
                    resultado = resultado + 3;

                }


            }
        });
        Pregunta4 pregunta4=new Pregunta4();
        Bundle bundle=new Bundle();
        bundle.getInt("Resultado",resultado);
        pregunta4.setArguments(bundle);

    }*/
    }
    @Override
    public void onFragmentInteraction(Uri uri) {


    }
}