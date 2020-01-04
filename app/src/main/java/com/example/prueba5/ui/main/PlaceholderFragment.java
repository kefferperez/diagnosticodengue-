package com.example.prueba5.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.Nullable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;

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
import com.example.prueba5.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {


    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel pageViewModel;

    public static Fragment newInstance(int index) {
        Fragment fragment = null;
        switch (index)
        {
            case 1:fragment=new DiagnosticoBienvenida(); break;
            case 2:fragment=new Pregunta1(); break;
            case 3:fragment=new Pregunta2(); break;
            case 4:fragment=new Pregunta3(); break;
            case 5:fragment=new Pregunta4(); break;
            case 6:fragment=new Pregunta5(); break;
            case 7:fragment=new Pregunta6(); break;

            case 8:fragment=new Pregunta9(); break;
            case 9:fragment=new Pregunta10(); break;

            case 10:fragment=new Pregunta12(); break;
            case 11:fragment=new Pregunta13(); break;
            case 12:fragment=new Pregunta14(); break;
            case 13:fragment=new Pregunta15(); break;
            case 14:fragment=new Pregunta16(); break;
            case 15:fragment=new Pregunta17(); break;




        }
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_diagnostico_sin_cuenta, container, false);
        final TextView textView = root.findViewById(R.id.section_label);
        pageViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}