package com.example.administrator.demo;

import android.drm.DrmStore;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {
ArrayList<ArrayList<item3>> arr2=new ArrayList<ArrayList<item3>>();
ArrayList<item3>arr3;
public static HorizontalScrollView hoscroll;
public static int scrollX;
View viewgr,viewgr2;
float x1,x2,y1,y2;
public static LinearLayoutManager llm1,llm2;
int pos=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        DisplayMetrics outMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(outMetrics);
        final int widthPixels = outMetrics.widthPixels;
        final int heightPixels = outMetrics.heightPixels;
        initarr2();
        final RecyclerView rcv2=(RecyclerView)findViewById(R.id.rcv8);
        final LinearLayoutManager llm2=new LinearLayoutManager(this);
        rcv2.setLayoutManager(llm2);
        llm2.setOrientation(LinearLayoutManager.VERTICAL);
        final MyAdapter6 myAdpater6=new MyAdapter6(this,arr2,heightPixels,getResources());
        rcv2.setAdapter(myAdpater6);
        rcv2.addItemDecoration(new CustomDecoration(this,CustomDecoration.VERTICAL_LIST,R.drawable.divide,40,CustomDecoration.LEFT,CustomDecoration.NONEH,0,0,1,1));
        final RecyclerView rcv=findViewById(R.id.rcv4);
        final LinearLayoutManager llm=new LinearLayoutManager(this);
        rcv.setLayoutManager(llm);
        llm1=llm;
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        final MyAdapter4 myAdpater4=new MyAdapter4(this,arr2,heightPixels,getResources());
        rcv.setAdapter(myAdpater4);
        rcv.addItemDecoration(new CustomDecoration(this,CustomDecoration.VERTICAL_LIST,R.drawable.divide,40,CustomDecoration.RIGHT,CustomDecoration.NONEH,0,0,1,1));
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
        rcv.setHasFixedSize(true);
        rcv.setNestedScrollingEnabled(false);
        System.out.println(rcv.getChildCount());
     /*  myAdpater4.setOnItemClickListener(new MyAdapter4.OnItemClickListener() {



            public void onItemClick(View view, int position) {

                 if(position!=0) {
                     System.out.println(llm2.findViewByPosition(position).findViewById(R.id.linear2));
                 }
            }
        });
        myAdpater6.setOnItemClickListener(new MyAdapter6.OnItemClickLitener() {
            @Override
            public void onItemClick(View view, int position) {
                System.out.println("忽必烈"+view.isPressed());
                if(position!=0) {
                    viewgr2 = llm.findViewByPosition(position);
                    LinearLayout llt1 = viewgr2.findViewById(R.id.linear1);
                    llt1.performClick();
                }

            }
        });*/
        myAdpater4.setmOnTouchListener(new MyAdapter4.OnTouchListener() {
            @Override
            public void onTouch2(View view, int position, MotionEvent mo) {

                   if(mo.getAction()==MotionEvent.ACTION_DOWN){
                       pos=position;
                       MyAdapter6.getVhmap().get(position).linear2.setBackgroundColor(Color.RED);
                       view.setBackgroundColor(Color.RED);
                   }
                   if(mo.getAction()==MotionEvent.ACTION_MOVE){

                   }
                   if(mo.getAction()==MotionEvent.ACTION_UP){
                       MyAdapter6.getVhmap().get(position).linear2.setBackgroundColor(Color.TRANSPARENT);
                       view.setBackgroundColor(Color.TRANSPARENT);
                   }
                }
        });

        myAdpater6.setmOnTouchListener(new MyAdapter6.OnTouchListener(){
            public void onTouch2(View view, int position, MotionEvent mo) {
                if(mo.getAction()==MotionEvent.ACTION_DOWN){
                    pos=position;
                    MyAdapter4.getVhmap().get(position).linear.setBackgroundColor(Color.RED);
                    view.setBackgroundColor(Color.RED);
                }
                if(mo.getAction()==MotionEvent.ACTION_UP){
                    MyAdapter4.getVhmap().get(position).linear.setBackgroundColor(Color.TRANSPARENT);
                    view.setBackgroundColor(Color.TRANSPARENT);
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

                }
                if(scrollX>0&&scrollX<rcv.getWidth()-v.getWidth()){
                     setScrollX(scrollX);

                }
                if(scrollX==rcv.getWidth()-v.getWidth()){
                     setScrollX(scrollX);

                }
            }
        });
        horizontalScrollView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_UP){
                    MyAdapter6.getVhmap().get(pos).linear2.setBackgroundColor(Color.TRANSPARENT);
                    MyAdapter4.getVhmap().get(pos).linear.setBackgroundColor(Color.TRANSPARENT);
                    for(int i=1;i<MyAdapter4.getVhmap().size();i++) {
                        MyAdapter4.getVhmap().get(i).linear.setBackgroundColor(Color.TRANSPARENT);
                    }
                    for(int i=1;i<MyAdapter6.getVhmap().size();i++){
                        MyAdapter6.getVhmap().get(i).linear2.setBackgroundColor(Color.TRANSPARENT);
                    }
                }
                return false;
            }

        });
        rcv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_UP){
                    for(int i=1;i<MyAdapter4.getVhmap().size();i++) {
                        MyAdapter4.getVhmap().get(i).linear.setBackgroundColor(Color.TRANSPARENT);
                    }
                    for(int i=1;i<MyAdapter6.getVhmap().size();i++){
                        MyAdapter6.getVhmap().get(i).linear2.setBackgroundColor(Color.TRANSPARENT);
                    }
                }
                return false;
            }
        });
        rcv2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_UP){
                    for(int i=1;i<MyAdapter4.getVhmap().size();i++) {
                        MyAdapter4.getVhmap().get(i).linear.setBackgroundColor(Color.TRANSPARENT);
                    }
                    for(int i=1;i<MyAdapter6.getVhmap().size();i++){
                        MyAdapter6.getVhmap().get(i).linear2.setBackgroundColor(Color.TRANSPARENT);
                    }
                }
                return false;
            }
        });

}

/*Handler mHandler=new Handler(){
        public void handleMessage(Message msg){
            if(msg.what==1){

            }
        }
    };*/

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
