package com.example.prueba5.Fragment;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.prueba5.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Pregunta4.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Pregunta4#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Pregunta4 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private int resultado;
    int sarpullidod=0;
    int sarpullidoc=0;
    int sarpullidoz=0;
    RadioButton btnTengospllido;
    RadioButton btnNotengospllido;
    View view;
    Activity actividad;

    private OnFragmentInteractionListener mListener;

    public Pregunta4() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Pregunta4.
     */
    // TODO: Rename and change types and number of parameters
    public static Pregunta4 newInstance(String param1, String param2) {
        Pregunta4 fragment = new Pregunta4();
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
           resultado=getArguments().getInt("Resultado",0);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =inflater.inflate(R.layout.fragment_pregunta4, container, false);

        btnTengospllido=view.findViewById(R.id.radioButtonPresentoSarpullido);
        btnNotengospllido=view.findViewById(R.id.radioButtonNoPpresentoSarpullido);
        Toast.makeText(getContext(), "el resultado es"+resultado, Toast.LENGTH_SHORT).show();
        btnTengospllido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnTengospllido.isChecked()==true){
                    sarpullidod+=2;
                    sarpullidoc+=3;
                    sarpullidoz+=3;
                }
            }
        });
        btnNotengospllido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnNotengospllido.isChecked()==true){
                    sarpullidod+=0;
                    sarpullidoc+=0;
                    sarpullidoz+=0;
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
