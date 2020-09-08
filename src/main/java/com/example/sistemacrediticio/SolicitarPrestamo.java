package com.example.sistemacrediticio;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import static android.app.Activity.RESULT_OK;

public class SolicitarPrestamo extends Fragment{

    static final int REQUEST_IMAGE_CAPTURE_FOTO_TRASERA=1;
    static final int REQUEST_IMAGE_CAPTURE_FOTO_FRONTAL=2;
    //static final int RESULT_OK=-1;
    ImageView imgFotoFrontalTomada,imgFotoTraseraTomada;
    private View view;
    private static final int COD_SELECCIONA=10;
    private static final int COD_FOTO=20;
    Bitmap imgMap;
    ImageView imgFoto;
    Button btnCargarDireccion;
    Spinner spinner;




    public SolicitarPrestamo() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_solicitar_prestamo, container, false);

        view.findViewById(R.id.imgFotoFrontal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getContext(),"img frontal",Toast.LENGTH_LONG).show();
                Intent camara= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if(camara.resolveActivity(getActivity().getPackageManager())!=null){
                    startActivityForResult(camara,REQUEST_IMAGE_CAPTURE_FOTO_FRONTAL);
                }
                tomaFoto();
            }
        });
        imgFotoFrontalTomada=view.findViewById(R.id.imgFotoFrontalTomada);
        imgFotoTraseraTomada=view.findViewById(R.id.imgFotoTraseraTomada);
        spinner=view.findViewById(R.id.spiner);

        //ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getContext(),R.array.lista_fuente_ingreso,R.layout.fragment_solicitar_prestamo);
        /*btnCargarDireccion=view.findViewById(R.id.btnCargarDireccion);
        btnCargarDireccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getContext(),MapsActivity.class);
                startActivity(i);


            }
        });*/
        return view;
    }

    private void tomaFoto() {

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
            if (requestCode ==REQUEST_IMAGE_CAPTURE_FOTO_FRONTAL && resultCode == RESULT_OK) {
                Bundle extras = data.getExtras();
                Bitmap imageBitmap = (Bitmap) extras.get("data");
                imgFotoFrontalTomada.setImageBitmap(imageBitmap);
            }else if (requestCode ==REQUEST_IMAGE_CAPTURE_FOTO_TRASERA && resultCode == RESULT_OK){
                Bundle extras = data.getExtras();
                Bitmap imageBitmap = (Bitmap) extras.get("data");
                imgFotoTraseraTomada.setImageBitmap(imageBitmap);
            }

    }
}
