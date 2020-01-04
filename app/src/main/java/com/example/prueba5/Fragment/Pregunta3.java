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

import com.example.prueba5.R;

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

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    int cansanciod=0;
    int cansancioc=0;
    int cansancioz=0;
    RadioButton btnTengoC;
    RadioButton btnNotengoC;
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

        btnTengoC=view.findViewById(R.id.radioButtonPresentoCansancio);
        btnNotengoC=view.findViewById(R.id.radioButtonNoPpresentoCansancio);

        btnTengoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnTengoC.isChecked()==true){
                    cansanciod+=3;
                    cansancioc+=3;
                    cansancioz+=3;
                }
            }
        });
        btnNotengoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnNotengoC.isChecked()==true){
                    cansanciod+=0;
                    cansancioc+=0;
                    cansancioz+=0;
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