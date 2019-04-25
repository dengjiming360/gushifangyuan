package com.example.administrator.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Main6Activity extends AppCompatActivity {
ArrayList<ArrayList<item5>> gushi=new ArrayList<ArrayList<item5>>();
ArrayList<String>title=new ArrayList<String>();
ArrayList<item5>item;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        init();
        RecyclerView rcv=findViewById(R.id.rcv10);
        LinearLayoutManager llm=new LinearLayoutManager(this);
        rcv.setLayoutManager(llm);
        MyAdapter8 myAdapter8=new MyAdapter8(title,gushi);
        rcv.setAdapter(myAdapter8);
    }

    private void init() {
        title.add("行情指标");
        title.add("基金指标");
        for(int i=0;i<6;i++){
            item=new ArrayList<item5>();
            if(i==0){
                item.add(new item5("99.12","最低"));
                item.add(new item5("2.315","单位净值"));
            }
            if(i==1){
                item.add(new item5("99.42","开盘"));
                item.add(new item5("-0.022%","溢价率"));
            }
            if(i==2){
                item.add(new item5("99.78","最高"));
                item.add(new item5("06-21","净值日期"));
            }
            if(i==3){
                item.add(new item5("99.33","昨收"));
                item.add(new item5("6532万份","基金份额"));
            }
            if(i==4){
                item.add(new item5("1.23万","成交量"));
                item.add(new item5("342.45亿","资产净值"));
            }
            if(i==5){
                item.add(new item5("2.42亿","成交额"));
            }
            gushi.add(item);
        }
    }
}
