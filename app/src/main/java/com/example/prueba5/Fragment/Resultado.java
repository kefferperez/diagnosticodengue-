package com.example.prueba5.Fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.prueba5.R;

import java.text.DecimalFormat;

import static android.content.Context.MODE_PRIVATE;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Resultado.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Resultado#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Resultado extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    View view;
    private OnFragmentInteractionListener mListener;
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;
    public Resultado() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Resultado.
     */
    // TODO: Rename and change types and number of parameters
    public static Resultado newInstance(String param1, String param2) {
        Resultado fragment = new Resultado();
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

                view=inflater.inflate(R.layout.fragment_resultado, container, false);
        Button miresultado =  view.findViewById(R.id.btnresultado);
        final EditText miresultadodengue=view.findViewById(R.id.resultadofinaldengue);
        final EditText miresultadochikungunya=view.findViewById(R.id.resultadofinalchikungunya);
        final EditText miresultadozika=view.findViewById(R.id.resultadofinalzika);
        miresultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs= getContext().getSharedPreferences("Config",MODE_PRIVATE);
                int pregunta1dengue = prefs.getInt("pregunta1dengue", 0);
                int pregunta1chikungunya = prefs.getInt("pregunta1chikungunya", 0);
                int pregunta1zika = prefs.getInt("pregunta1zika", 0);
                int pregunta2dengue = prefs.getInt("pregunta2dengue", 0);
                int pregunta2chikungunya = prefs.getInt("pregunta2chikungunya", 0);
                int pregunta2zika = prefs.getInt("pregunta2zika", 0);
                int pregunta3dengue = prefs.getInt("pregunta3dengue", 0);
                int pregunta3chikungunya = prefs.getInt("pregunta3chikungunya", 0);
                int pregunta3zika = prefs.getInt("pregunta3zika", 0);
                int pregunta4dengue = prefs.getInt("pregunta4dengue", 0);
                int pregunta4chikungunya = prefs.getInt("pregunta4chikungunya", 0);
                int pregunta4zika = prefs.getInt("pregunta4zika", 0);
                int pregunta5dengue = prefs.getInt("pregunta5dengue", 0);
                int pregunta5chikungunya = prefs.getInt("pregunta5chikungunya", 0);
                int pregunta5zika = prefs.getInt("pregunta5zika", 0);
                int pregunta6dengue = prefs.getInt("pregunta6dengue", 0);
                int pregunta6chikungunya = prefs.getInt("pregunta6chikungunya", 0);
                int pregunta6zika = prefs.getInt("pregunta6zika", 0);
                int pregunta9dengue = prefs.getInt("pregunta9dengue", 0);
                int pregunta9chikungunya = prefs.getInt("pregunta9chikungunya", 0);
                int pregunta9zika = prefs.getInt("pregunta9zika", 0);
                int pregunta10dengue = prefs.getInt("pregunta10dengue", 0);
                int pregunta10chikungunya = prefs.getInt("pregunta10chikungunya", 0);
                int pregunta10zika = prefs.getInt("pregunta10zika", 0);
                int pregunta12dengue = prefs.getInt("pregunta12dengue", 0);
                int pregunta12chikungunya = prefs.getInt("pregunta12chikungunya", 0);
                int pregunta12zika = prefs.getInt("pregunta12zika", 0);
                int pregunta13dengue = prefs.getInt("pregunta13dengue", 0);
                int pregunta13chikungunya = prefs.getInt("pregunta13chikungunya", 0);
                int pregunta13zika = prefs.getInt("pregunta13zika", 0);
                int pregunta14dengue = prefs.getInt("pregunta14dengue", 0);
                int pregunta14chikungunya = prefs.getInt("pregunta14chikungunya", 0);
                int pregunta14zika = prefs.getInt("pregunta14zika", 0);
                int pregunta15dengue = prefs.getInt("pregunta15dengue", 0);
                int pregunta15chikungunya = prefs.getInt("pregunta15chikungunya", 0);
                int pregunta15zika = prefs.getInt("pregunta15zika", 0);
                int pregunta16dengue = prefs.getInt("pregunta16dengue", 0);
                int pregunta16chikungunya = prefs.getInt("pregunta16chikungunya", 0);
                int pregunta16zika = prefs.getInt("pregunta16zika", 0);
                int pregunta17dengue = prefs.getInt("pregunta17dengue", 0);
                int pregunta17chikungunya = prefs.getInt("pregunta17chikungunya", 0);
                int pregunta17zika = prefs.getInt("pregunta17zika", 0);

                int sumaresultadodengue=pregunta1dengue+pregunta2dengue+pregunta3dengue+pregunta4dengue+pregunta5dengue+pregunta6dengue
                        +pregunta9dengue+pregunta10dengue+pregunta12dengue+pregunta13dengue+pregunta14dengue+pregunta15dengue+
                        pregunta16dengue+pregunta17dengue;
                int sumaresultadochikungunya=pregunta1chikungunya+pregunta2chikungunya+pregunta3chikungunya+pregunta4chikungunya+pregunta5chikungunya
                        +pregunta6chikungunya+pregunta9chikungunya+pregunta10chikungunya+pregunta12chikungunya
                        +pregunta13chikungunya+pregunta14chikungunya+pregunta15chikungunya+pregunta16chikungunya+pregunta17chikungunya;
                int sumaresultadozika=pregunta1zika+pregunta2zika+pregunta3zika+pregunta4zika+pregunta5zika+pregunta6zika
                        +pregunta9zika+pregunta10zika+pregunta12zika+pregunta13zika+pregunta14zika+pregunta15zika+pregunta16zika+pregunta17zika;

                double resultadodengue=(double)sumaresultadodengue/0.39;
                double resultadochikungunya=(double)sumaresultadochikungunya/0.24;
                double resultadozika=(double)sumaresultadozika/0.22;

                double resultadocondosdecimalesde=Math.round(resultadodengue*100)/100d;
                double resultadocondosdecimaleschi=Math.round(resultadochikungunya*100)/100d;
                double resultadocondosdecimaleszi=Math.round(resultadozika*100)/100d;

                Log.i("mivalor", "el valor de pregunta1 es:"+pregunta1dengue);
                Log.i("mivalor", "el valor de pregunta2 es:"+pregunta2dengue);
                miresultadodengue.setText("Probabilidades de dengue: "+resultadocondosdecimalesde+"%");
                miresultadochikungunya.setText("Probabilidades de chikungunya: "+resultadocondosdecimaleschi+"%");
                miresultadozika.setText("Probabilidades de zika: "+resultadocondosdecimaleszi+"%");

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
