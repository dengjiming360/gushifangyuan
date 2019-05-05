package com.example.administrator.demo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Main5Activity extends AppCompatActivity {
ArrayList<Item4>item4=new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        init();
        RecyclerView recyclerView=findViewById(R.id.rcv9);
        GridLayoutManager grid=new GridLayoutManager(this,3, OrientationHelper.VERTICAL,false);
        recyclerView.setLayoutManager(grid);
        MyAdapter7 myAdapter7=new MyAdapter7(item4);
        recyclerView.setAdapter(myAdapter7);
        recyclerView.addItemDecoration(new MyDecoration(this));
        recyclerView.addItemDecoration(new CustomDecoration(this,CustomDecoration.VERTICAL_LIST,R.drawable.divider,50,CustomDecoration.BOTHV,CustomDecoration.NONEH,0,0,5,5));
    }

    private void init() {
        item4.add(new Item4("涨幅榜","宁波海运","7.21","+10.80%"));
        item4.add(new Item4("跌幅榜","东方园林","7.21","-10.80%"));
        item4.add(new Item4("成交额榜","中兴通讯","40.87亿","+6.62%"));
        item4.add(new Item4("5分钟涨幅榜","曲江文旅","+2.41%","+6.30%"));
        item4.add(new Item4("换手率榜","长城军工","46.56%","-9.98%"));
        item4.add(new Item4("量比榜","中兴通讯","13.12","+6.62%"));
    }
}
