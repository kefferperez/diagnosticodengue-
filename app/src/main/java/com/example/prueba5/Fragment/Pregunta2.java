package com.example.prueba5.Fragment;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.prueba5.R;

import static android.content.Context.MODE_PRIVATE;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Pregunta2.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Pregunta2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Pregunta2 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    //variables del sharedprefence para leer y editar
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    View view;
    Activity actividad;


    private OnFragmentInteractionListener mListener;

    public Pregunta2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Pregunta2.
     */
    // TODO: Rename and change types and number of parameters
    public static Pregunta2 newInstance(String param1, String param2) {
        Pregunta2 fragment = new Pregunta2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =inflater.inflate(R.layout.fragment_pregunta2, container, false);


        RadioGroup rg = (RadioGroup) view.findViewById(R.id.resultado);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                prefs= getContext().getSharedPreferences("Config",MODE_PRIVATE);
                int pregunta2dengue = prefs.getInt("pregunta2dengue", 0);
                int pregunta2chikungunya=prefs.getInt("pregunta2chikungunya",0);
                int pregunta2zika=prefs.getInt("pregunta2zika",0);
                Log.i("mivalor", "el valor antes del cambio es:"+pregunta2dengue);
                switch(checkedId){

                        case R.id.radioButtonPresentoEscalofrios:
                            pregunta2dengue = 3;
                            pregunta2chikungunya =3;
                            pregunta2zika=3;
                            editor = prefs.edit();
                            editor.putInt("pregunta2dengue", pregunta2dengue);
                            editor.putInt("pregunta2chikungunya", pregunta2chikungunya);
                            editor.putInt("pregunta2zika", pregunta2zika);
                            editor.apply();
                            Log.i("mivalor", "pregunta2:"+pregunta2dengue);
                        // do operations specific to this selection
                        break;
                    case R.id.radioButtonNoPpresentoEscalofrios:
                        pregunta2dengue = 0;
                        pregunta2chikungunya =0;
                        pregunta2zika=0;
                        editor = prefs.edit();
                        editor.putInt("pregunta2dengue", pregunta2dengue);
                        editor.putInt("pregunta2chikungunya", pregunta2chikungunya);
                        editor.putInt("pregunta2zika", pregunta2zika);
                        editor.apply();
                        Log.i("mivalor", "pregunta2:"+pregunta2dengue);
                        // do operations specific to this selection
                        break;
                }
            }
        });

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


}
