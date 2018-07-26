package com.pablo.ejemplolistas;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn_listView, btn_recyclerView;
    private ListView listView;
    private RecyclerView recyclerView;

    private ArrayList<SingleData> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =(ListView)findViewById(R.id.list_view);
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);

        btn_listView = (Button)findViewById(R.id.btn_list);
        btn_recyclerView = (Button)findViewById(R.id.btn_recycler);

        btn_listView.setOnClickListener(this);
        btn_recyclerView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_list:{
                if(recyclerView.getVisibility() == View.VISIBLE) {
                    recyclerView.setVisibility(View.GONE);
                    btn_recyclerView.setBackgroundResource(android.R.drawable.btn_default);
                    btn_recyclerView.setTextColor(Color.BLACK);
                }
                listView.setVisibility(View.VISIBLE);
                btn_listView.setBackgroundColor(Color.BLACK);
                btn_listView.setTextColor(Color.WHITE);

                activarListView();
                break;
            }
            case R.id.btn_recycler:{
                if(listView.getVisibility() == View.VISIBLE) {
                    listView.setVisibility(View.GONE);
                    btn_listView.setBackgroundResource(android.R.drawable.btn_default);
                    btn_listView.setTextColor(Color.BLACK);
                }
                recyclerView.setVisibility(View.VISIBLE);
                btn_recyclerView.setBackgroundColor(Color.BLACK);
                btn_recyclerView.setTextColor(Color.WHITE);

                activarRecyclerView();
                break;
            }
        }
    }

    private void activarRecyclerView() {
        setLista();
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); //setea layout al recycler
        DataRecyclerAdapter adapter = new DataRecyclerAdapter(lista);
        recyclerView.setAdapter(adapter);
    }

    private void activarListView() {
        setLista();
        ArrayAdapter<SingleData> adapter = new DataListAdapter(this, lista);
        listView.setAdapter(adapter);
    }

    private void setLista(){
        lista = new ArrayList<>();
        lista.add(new SingleData(1, "nombre", "seudo 1"));
        lista.add(new SingleData(2, "nombre", "seudo 2"));
        lista.add(new SingleData(3, "nombre", "seudo 3"));
        lista.add(new SingleData(4, "nombre", "seudo 4"));
        lista.add(new SingleData(5, "nombre", "seudo 5"));
        lista.add(new SingleData(6, "nombre", "seudo 6"));
        lista.add(new SingleData(7, "nombre", "seudo 7"));
        lista.add(new SingleData(8, "nombre", "seudo 8"));
        lista.add(new SingleData(9, "nombre", "seudo 9"));
        lista.add(new SingleData(10, "nombre", "seudo 10"));
        lista.add(new SingleData(11, "nombre", "seudo 11"));
        lista.add(new SingleData(12, "nombre", "seudo 12"));
        lista.add(new SingleData(13, "nombre", "seudo 13"));
        lista.add(new SingleData(14, "nombre", "seudo 14"));
    }
}
