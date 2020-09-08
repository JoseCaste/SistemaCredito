package com.example.sistemacrediticio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class FirstFragment extends Fragment {

    CardView cardCredito, cardSimulacion;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_first, container, false);
        cardCredito=view.findViewById(R.id.cardCredito);
        cardSimulacion=view.findViewById(R.id.cardSimulacion);


        cardCredito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"hola",Toast.LENGTH_LONG).show();
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_solicitarPrestamo);
            }
        });
        cardSimulacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"hola",Toast.LENGTH_LONG).show();
                //NavHostFragment.findNavController(FirstFragment.this).navigate(R.i);
            }
        });
        return view;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

       /* view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });*/

    }
}
