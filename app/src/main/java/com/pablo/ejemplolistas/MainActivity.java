package com.pablo.ejemplolistas;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn_listView, btn_recyclerView;
    private ListView listView;
    private RecyclerView recyclerView;

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
                break;
            }
        }
    }
}
