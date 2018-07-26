package com.pablo.ejemplolistas;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class DataListAdapter extends ArrayAdapter<SingleData> {

    public DataListAdapter(Context context, List<SingleData> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        //obtiene los datos de la position
        SingleData data = getItem(position);
        // infla la vista
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.item_layout, parent, false);
        }
        //carga las vistas
        TextView lblTitulo = (TextView)view.findViewById(R.id.lbl_Titulo);
        TextView lblSubTitulo = (TextView)view.findViewById(R.id.lbl_subtitulo);
        //setea datos a la vista
        lblTitulo.setText(data.getTag());
        lblSubTitulo.setText(data.getSubTag());
        //retorna la vista
        return view;
    }
}
