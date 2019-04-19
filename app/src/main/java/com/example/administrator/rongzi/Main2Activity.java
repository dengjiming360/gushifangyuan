package com.example.administrator.rongzi;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
Button btn1;
ArrayList<item>item1=new ArrayList<item>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
        btn1=findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdialog(item1);
            }
        });
    }
    public void init(){
        item1.add(new item("还款类型","指定合约编号还款"));
        item1.add(new item("合同编号","2020"));
        item1.add(new item("需还款额","16000.00"));
        item1.add(new item("还款金额","16000.00"));
    }
    private void showdialog(ArrayList<item> item2) {
        AlertDialog.Builder alert=new AlertDialog.Builder(Main2Activity.this);
        final View dialogview= LayoutInflater.from(Main2Activity.this).inflate(R.layout.layout5,null);
        alert.setView(dialogview);
        RecyclerView rcv=(RecyclerView)dialogview.findViewById(R.id.rcv2);
        LinearLayoutManager llm=new LinearLayoutManager(this);
        rcv.setLayoutManager(llm);
        MyAdapter2 myAdapter2=new MyAdapter2(item2);
        rcv.setAdapter(myAdapter2);
       rcv.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        alert.show();
    }
}
