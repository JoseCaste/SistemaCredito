package com.example.sistemacrediticio;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginFragment extends Fragment {


    Button btnRegistrar,btnIniciarSesion;
    EditText user,pass;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_login, container, false);

        btnIniciarSesion=view.findViewById(R.id.btnIniciarSesion);
        btnRegistrar=view.findViewById(R.id.btnRegistrar);

        user=view.findViewById(R.id.txtUsuario);
        pass=view.findViewById(R.id.txtPass);
        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Toast.makeText(v.getContext(),"Holasas",Toast.LENGTH_LONG).show();
                    NavHostFragment.findNavController(LoginFragment.this).navigate(R.id.action_loginFragment_to_FirstFragment);
            }
        });
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Holasas",Toast.LENGTH_LONG).show();
                NavHostFragment.findNavController(LoginFragment.this).navigate(R.id.action_loginFragment_to_crearUsuarioFragment);
            }
        });
        return view;
    }
}
