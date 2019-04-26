package com.example.administrator.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Main9Activity extends AppCompatActivity {
ArrayList<ArrayList<item6>> item=new ArrayList<ArrayList<item6>>();
ArrayList<String>title=new ArrayList<String>();
ArrayList<item6>myitem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        init();
        RecyclerView rcv14=findViewById(R.id.rcv14);
        LinearLayoutManager llm=new LinearLayoutManager(this);
        rcv14.setLayoutManager(llm);
        MyAdapter11 myAdapter11=new MyAdapter11(title,item,this);
        rcv14.setAdapter(myAdapter11);
    }

    private void init() {
        title.add("涨跌停(46)");
        title.add("5分钟涨跌幅(46)");
        title.add("强势股(46)");
        title.add("涨跌停打开(46)");
        title.add("涨跌幅预警(46)");
        title.add("新高新低(46)");
        myitem=new ArrayList<item6>();
        myitem.add(new item6("贵州茅台","14:00 涨停","34.46","+10.00%"));
        myitem.add(new item6("工商银行","14:00 涨停","7.21","+10.00%"));
        myitem.add(new item6("中能电气","14:00 跌停","7.21","-10.00%"));
        item.add(myitem);
        myitem=new ArrayList<item6>();
        myitem.add(new item6("贵州茅台","1分钟前","34.46","+10.00%"));
        myitem.add(new item6("工商银行","2分钟前","7.21","+10.00%"));
        myitem.add(new item6("中能电气","3分钟前","7.21","-10.00%"));
        item.add(myitem);
        myitem=new ArrayList<item6>();
        myitem.add(new item6("曲江文旅","3天2板","7.21","+10.00%"));
        myitem.add(new item6("曲江文旅","6天4板","7.21","+10.00%"));
        myitem.add(new item6("曲江文旅","5天2板","7.21","+10.00%"));
        item.add(myitem);
        myitem=new ArrayList<item6>();
        myitem.add(new item6("曲江文旅","3天2板","7.21","+10.00%"));
        myitem.add(new item6("曲江文旅","6天4板","7.21","+10.00%"));
        myitem.add(new item6("曲江文旅","5天2板","7.21","-10.00%"));
        item.add(myitem);
        myitem=new ArrayList<item6>();
        myitem.add(new item6("太龙药业","14:00 达到7%","7.21","+10.00%"));
        myitem.add(new item6("亚夏汽车","14:00 达到7%","7.21","+10.00%"));
        myitem.add(new item6("宁波海运","14:00 达到7%","7.21","+10.00%"));
        item.add(myitem);
        myitem=new ArrayList<item6>();
        myitem.add(new item6("宁波海运","5日新高","7.21","+10.00%"));
        myitem.add(new item6("曲江文旅","5日新高","7.21","+10.00%"));
        myitem.add(new item6("太龙药业","5日新低","7.21","-10.00%"));
        item.add(myitem);
    }
}
