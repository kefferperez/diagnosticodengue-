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

import com.example.prueba5.R;

import static android.content.Context.MODE_PRIVATE;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Pregunta3.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Pregunta3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Pregunta3 extends Fragment {

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

    public Pregunta3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Pregunta3.
     */
    // TODO: Rename and change types and number of parameters
    public static Pregunta3 newInstance(String param1, String param2) {
        Pregunta3 fragment = new Pregunta3();
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
        view =inflater.inflate(R.layout.fragment_pregunta3, container, false);

        RadioGroup rg = (RadioGroup) view.findViewById(R.id.resultado);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                prefs= getContext().getSharedPreferences("Config",MODE_PRIVATE);
                int pregunta3dengue = prefs.getInt("pregunta3dengue", 0);
                int pregunta3chikungunya=prefs.getInt("pregunta3chikungunya",0);
                int pregunta3zika=prefs.getInt("pregunta3zika",0);
                Log.i("mivalor", "el valor antes del cambio es:"+pregunta3dengue);
                switch(checkedId){

                    case R.id.radioButtonPresentoCansancio:
                        pregunta3dengue = 3;
                        pregunta3chikungunya =3;
                        pregunta3zika=3;
                        editor = prefs.edit();
                        editor.putInt("pregunta3dengue", pregunta3dengue);
                        editor.putInt("pregunta3chikungunya", pregunta3chikungunya);
                        editor.putInt("pregunta3zika", pregunta3zika);
                        editor.apply();
                        Log.i("mivalor", "pregunta3:"+pregunta3dengue);
                        // do operations specific to this selection
                        break;
                    case R.id.radioButtonNoPpresentoCansancio:
                        pregunta3dengue = 0;
                        pregunta3chikungunya =0;
                        pregunta3zika=0;
                        editor = prefs.edit();
                        editor.putInt("pregunta3dengue", pregunta3dengue);
                        editor.putInt("pregunta3chikungunya", pregunta3chikungunya);
                        editor.putInt("pregunta3zika", pregunta3zika);
                        editor.apply();
                        Log.i("mivalor", "pregunta2:"+pregunta3dengue);
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
