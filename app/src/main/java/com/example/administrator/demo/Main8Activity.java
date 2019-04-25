package com.example.administrator.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Main8Activity extends AppCompatActivity {
ArrayList<String>arr=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        init();
        RecyclerView rcv=findViewById(R.id.rcv12);
        LinearLayoutManager llm=new LinearLayoutManager(this);
        rcv.setLayoutManager(llm);
        MyAdapter10 myAdapter10=new MyAdapter10(arr);
        rcv.setAdapter(myAdapter10);
    }

    private void init() {
        arr.add("涨跌停");
        arr.add("5分钟涨跌幅");
        arr.add("强势股");
        arr.add("涨跌停打开");
        arr.add("涨跌幅预警");
        arr.add("新高新低");
    }
}
