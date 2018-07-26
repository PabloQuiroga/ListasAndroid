package com.pablo.ejemplolistas;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class DataRecyclerAdapter extends RecyclerView.Adapter<DataRecyclerAdapter.ViewHolder> {
    private List<SingleData> listado;

    public DataRecyclerAdapter(List<SingleData> listado) {
        this.listado = listado;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public int getItemCount() {
        return listado.size();
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String name = listado.get(position).getTag();
        String id = String.valueOf(listado.get(position).getOrderTag());
        String sub = listado.get(position).getSubTag();

        holder.nombre.setText(id+" "+name);
        holder.subtitulo.setText(sub);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nombre;
        private TextView subtitulo;

        public ViewHolder(View v) {
            super(v);
            nombre = (TextView)v.findViewById(R.id.lbl_Titulo);
            subtitulo = (TextView)v.findViewById(R.id.lbl_subtitulo);
        }
    }
}
