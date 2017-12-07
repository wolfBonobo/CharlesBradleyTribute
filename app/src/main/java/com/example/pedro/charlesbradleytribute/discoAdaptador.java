package com.example.pedro.charlesbradleytribute;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pedro on 01/11/2017.
 */

class discoAdaptador extends BaseAdapter {

    Context contexto; //contexto de la aplicacion
    ArrayList<Disco> listaDiscos;

    public discoAdaptador(Context contexto, ArrayList<Disco> discos) {

        this.contexto = contexto;
        this.listaDiscos = discos;
    }

    @Override
    public int getCount() {
        return listaDiscos.size(); //devuelve numero de elementos
    }

    @Override
    public Disco getItem(int i) {
        return listaDiscos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return listaDiscos.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View vista=view;
        LayoutInflater inflate = LayoutInflater.from(contexto);
        vista=inflate.inflate(R.layout.layout_adaptatador, null); //Consigo referenciar a la vista especifica dl listview

        ImageView fotoPortada=vista.findViewById(R.id.imgv);
        TextView titulo=vista.findViewById(R.id.tvNombreDisco);
        TextView anno=vista.findViewById(R.id.tvAnno);

        fotoPortada.setImageResource(listaDiscos.get(i).getPortada());
        titulo.setText(listaDiscos.get(i).getNombreDisco().toString());
        anno.setText(listaDiscos.get(i).getAño().toString());

        return vista;

    }
}
