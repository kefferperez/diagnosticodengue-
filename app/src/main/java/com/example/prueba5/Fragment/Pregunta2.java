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
import android.widget.TextView;

import com.example.prueba5.R;

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

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    int escalosfriod=0;
    int escalosfrioc=0;
    int escalosfrioz=0;
    RadioButton btnTengoE;
    RadioButton btnNotengoE;
    View view;
    Activity actividad;

    TextView texto,texto1,texto2,texto3,texto4,texto5,texto6;

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

        btnTengoE=view.findViewById(R.id.radioButtonPresentoEscalofrios);
        btnNotengoE=view.findViewById(R.id.radioButtonNoPpresentoEscalofrios);
        texto=view.findViewById(R.id.dengue2);

        btnTengoE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnTengoE.isChecked()==true){
                    escalosfriod+=3;
                    escalosfrioc+=3;
                    escalosfrioz+=3;

                    texto=(TextView)getActivity().findViewById(R.id.dengue3);
                    texto1=(TextView)getActivity().findViewById(R.id.chin3);
                    texto2=(TextView)getActivity().findViewById(R.id.zik3);

                    texto3=(TextView)getActivity().findViewById(R.id.dengue2);

                }
            }
        });
        btnNotengoE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnNotengoE.isChecked()==true){
                    escalosfriod+=0;
                    escalosfrioc+=0;
                    escalosfrioz+=0;

                    texto=(TextView)getActivity().findViewById(R.id.dengue3);
                    texto1=(TextView)getActivity().findViewById(R.id.chin3);
                    texto2=(TextView)getActivity().findViewById(R.id.zik3);

                    texto.setText(""+escalosfriod);
                    texto1.setText(""+escalosfrioc);
                    texto2.setText(""+escalosfrioz);
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
