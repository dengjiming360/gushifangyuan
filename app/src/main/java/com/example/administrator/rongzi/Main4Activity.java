package com.example.administrator.rongzi;

import android.graphics.Color;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {
ArrayList<ArrayList<item3>> arr2=new ArrayList<ArrayList<item3>>();
ArrayList<item3>arr3;
TextView tvt9;
public static int scrollX;
public static HorizontalScrollView hoscroll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        DisplayMetrics outMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(outMetrics);
        final int widthPixels = outMetrics.widthPixels;
        int heightPixels = outMetrics.heightPixels;
        initarr2();
        final RecyclerView rcv2=(RecyclerView)findViewById(R.id.rcv8);
        LinearLayoutManager llm2=new LinearLayoutManager(this);
        rcv2.setLayoutManager(llm2);
        llm2.setOrientation(LinearLayoutManager.VERTICAL);
        MyAdapter6 myAdpater6=new MyAdapter6(this,arr2,heightPixels);
        rcv2.setAdapter(myAdpater6);
        rcv2.addItemDecoration(new CustomDecoration2(this,CustomDecoration2.VERTICAL_LIST,R.drawable.divide,40));
        final RecyclerView rcv=findViewById(R.id.rcv4);
        LinearLayoutManager llm=new LinearLayoutManager(this);
        rcv.setLayoutManager(llm);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        MyAdapter4 myAdpater4=new MyAdapter4(this,arr2,heightPixels,getResources());
        rcv.setAdapter(myAdpater4);
        rcv.addItemDecoration(new CustomDecoration(this,CustomDecoration.VERTICAL_LIST,R.drawable.divide,40));
        rcv2.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (RecyclerView.SCROLL_STATE_IDLE != recyclerView.getScrollState()) {
                    rcv.scrollBy(dx, dy);
                }
            }
        });
        rcv.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (RecyclerView.SCROLL_STATE_IDLE != recyclerView.getScrollState()) {
                    rcv2.scrollBy(dx, dy);
                }
            }
        });
        final HorizontalScrollView horizontalScrollView=findViewById(R.id.hoscroll);
        setHoscroll(horizontalScrollView);
        horizontalScrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                if(scrollX==0){
                     setScrollX(0);
                     MyAdapter4.VH3.imgleft.setX(scrollX+20);
                }
                if(scrollX>0&&scrollX<rcv.getWidth()-v.getWidth()){
                     setScrollX(scrollX);
                     MyAdapter4.VH3.imgleft.setX(scrollX+20);
                }
                if(scrollX==rcv.getWidth()-v.getWidth()){
                     setScrollX(scrollX);
                     MyAdapter4.VH3.imgleft.setX(scrollX+20);
                }
            }
        });

}
public static int getScrollX(){
        return scrollX;
}
public void setScrollX(int scrollX){
    this.scrollX=scrollX;
}
public static HorizontalScrollView getHoscroll(){
    return hoscroll;
}
public void setHoscroll(HorizontalScrollView hoscroll){
    this.hoscroll=hoscroll;
}
    private void initarr2() {
       for(int i=0;i<5;i++) {
          arr3=new ArrayList<item3>();
          if(i==0){
              arr3.add(new item3("股票名称"));
              arr3.add(new item3("贵州茅台","600519.SH"));
              arr3.add(new item3("万科A","000002.SZ"));
              arr3.add(new item3("平安银行","000001.SZ"));
              arr3.add(new item3("贵州茅台","600519.SH"));
              arr3.add(new item3("万科A","000002.SZ"));
              arr3.add(new item3("平安银行","000001.SZ"));
              arr3.add(new item3("贵州茅台","600519.SH"));
              arr3.add(new item3("万科A","000002.SZ"));
              arr3.add(new item3("平安银行","000001.SZ"));
          }
          if(i==1){
              arr3.add(new item3("允许融资"));
              arr3.add(new item3("允许"));
              arr3.add(new item3("不允许"));
              arr3.add(new item3("允许"));
              arr3.add(new item3("允许"));
              arr3.add(new item3("不允许"));
              arr3.add(new item3("允许"));
              arr3.add(new item3("允许"));
              arr3.add(new item3("不允许"));
              arr3.add(new item3("允许"));
          }
          if(i==2){
              arr3.add(new item3("折算率","保证金比例"));
              arr3.add(new item3("0.70","100%"));
              arr3.add(new item3("0.70","100%"));
              arr3.add(new item3("0.70","100%"));
              arr3.add(new item3("0.70","100%"));
              arr3.add(new item3("0.70","100%"));
              arr3.add(new item3("0.70","100%"));
              arr3.add(new item3("0.70","100%"));
              arr3.add(new item3("0.70","100%"));
              arr3.add(new item3("0.70","100%"));
          }
          if(i==3){
              arr3.add(new item3("允许融券"));
              arr3.add(new item3("允许"));
              arr3.add(new item3("不允许"));
              arr3.add(new item3("允许"));
              arr3.add(new item3("允许"));
              arr3.add(new item3("不允许"));
              arr3.add(new item3("允许"));
              arr3.add(new item3("允许"));
              arr3.add(new item3("不允许"));
              arr3.add(new item3("允许"));
          }
          if(i==4){
              arr3.add(new item3("可融券数量","保证金比例"));
              arr3.add(new item3("充足","100%"));
              arr3.add(new item3("充足","100%"));
              arr3.add(new item3("0","100%"));
              arr3.add(new item3("充足","100%"));
              arr3.add(new item3("充足","100%"));
              arr3.add(new item3("0","100%"));
              arr3.add(new item3("充足","100%"));
              arr3.add(new item3("充足","100%"));
              arr3.add(new item3("0","100%"));
          }
          arr2.add(arr3);
        }
    }
}
