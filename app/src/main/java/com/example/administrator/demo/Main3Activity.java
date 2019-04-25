package com.example.administrator.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
ArrayList<item>item1;
ArrayList<ArrayList<item>>items=new ArrayList<ArrayList<item>>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        init();
        RecyclerView rcv=(RecyclerView)findViewById(R.id.rcv3);
        LinearLayoutManager llm=new LinearLayoutManager(this);
        rcv.setLayoutManager(llm);
        MyAdapter3 myAdpater3=new MyAdapter3(items);
        rcv.setAdapter(myAdpater3);
        rcv.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }

    public void init(){
        for(int i=0;i<5;i++){
            item1=new ArrayList<item>();
            if(i==0){
                item1.add(new item("贵州茅台","600519.SH"));
                item1.add(new item("平安银行","000001.SZ"));
                item1.add(new item("万科A","000002.SZ"));
            }
            if(i==1){
                item1.add(new item("16051.00","负债金额"));
                item1.add(new item("16000.00","负债金额"));
                item1.add(new item("17900.00","负债金额"));
            }
            if(i==2){
                item1.add(new item("3185","合同编号"));
                item1.add(new item("3185","合同编号"));
                item1.add(new item("3185","合同编号"));
            }
            if(i==3){
                item1.add(new item("2019-03-23","到期日期"));
                item1.add(new item("2019-03-23","到期日期"));
                item1.add(new item("2019-03-23","到期日期"));
            }
            if(i==4){
                item1.add(new item("+2241.32","参考盈亏"));
                item1.add(new item("+2241.32","参考盈亏"));
                item1.add(new item("+2241.32","参考盈亏"));
            }
            items.add(item1);
        }
    }
}
