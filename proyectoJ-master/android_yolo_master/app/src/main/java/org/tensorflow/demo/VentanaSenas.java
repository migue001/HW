package org.tensorflow.demo;


import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.tensorflow.demo.Clases.VariablesYDatos;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class VentanaSenas extends Fragment {
    RecyclerView recyclerView;
    public static ArrayList<SenasAdap> lista;
    public static int img;
    public static String text,texto="";
    TextToSpeech textToSpeech;
    int result;

    public VentanaSenas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_ventana_senas, container, false);
        recyclerView=view.findViewById(R.id.sennas);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        lista=new ArrayList<>();
        Senas senas=new Senas(lista);
        recyclerView.setAdapter(senas);
        senas.setOnClickListener2(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto+=lista.get(recyclerView.getChildAdapterPosition(v)).getText()+" ";
                Main2Activity.textView.setText(""+texto);

            }
        });
        llenarRecycler();
        return view;
    }
    public static void llenarRecycler() {
        if(Main2Activity.tema.equalsIgnoreCase("Comunes")) {
            for (int i = 0; i < VariablesYDatos.imgcomun.length; i++) {
                lista.add(new SenasAdap(VariablesYDatos.imgcomun[i], "" + VariablesYDatos.textocomun[i]));
            }
        }
        if(Main2Activity.tema.equalsIgnoreCase("Casa")){
            for (int i = 0; i < VariablesYDatos.imagcasa.length; i++) {
                lista.add(new SenasAdap(VariablesYDatos.imagcasa[i], "" + VariablesYDatos.txtcasa[i]));
            }
        }
        if(Main2Activity.tema.equalsIgnoreCase("Escuela")){
            for (int i = 0; i < VariablesYDatos.imgescuela.length; i++) {
                lista.add(new SenasAdap(VariablesYDatos.imgescuela[i], "" + VariablesYDatos.txtescuela[i]));
            }
        }
        if(Main2Activity.tema.equalsIgnoreCase("Hospital")){
            for (int i = 0; i < VariablesYDatos.imgHospital.length; i++) {
                lista.add(new SenasAdap(VariablesYDatos.imgHospital[i], "" + VariablesYDatos.txtHospital[i]));
            }
        }
        if(Main2Activity.tema.equalsIgnoreCase("Dias")){
            for (int i = 0; i < VariablesYDatos.imgdias.length; i++) {
                lista.add(new SenasAdap(VariablesYDatos.imgdias[i], "" + VariablesYDatos.textdias[i]));
            }
        }
        if(Main2Activity.tema.equalsIgnoreCase("Modales")){
            for (int i = 0; i < VariablesYDatos.imgmodales.length; i++) {
                lista.add(new SenasAdap(VariablesYDatos.imgmodales[i], "" + VariablesYDatos.txtmodales[i]));
            }
        }
        if(Main2Activity.tema.equalsIgnoreCase("Expresiones")){
            for (int i = 0; i < VariablesYDatos.imgexpresi.length; i++) {
                lista.add(new SenasAdap(VariablesYDatos.imgexpresi[i], "" + VariablesYDatos.txtexpresi[i]));
            }
        }
        if(Main2Activity.tema.equalsIgnoreCase("Animales")){
            for (int i = 0; i < VariablesYDatos.imganimales.length; i++) {
                lista.add(new SenasAdap(VariablesYDatos.imganimales[i], "" + VariablesYDatos.txtanimales[i]));
            }
        }
        if(Main2Activity.tema.equalsIgnoreCase("Objetos")){
            for (int i = 0; i < VariablesYDatos.imgobjetos.length; i++) {
                lista.add(new SenasAdap(VariablesYDatos.imgobjetos[i], "" + VariablesYDatos.txtobjetos[i]));
            }

        }
    }
}
