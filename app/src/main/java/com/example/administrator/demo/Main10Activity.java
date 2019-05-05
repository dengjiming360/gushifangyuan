package com.example.administrator.demo;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.TextView;

import java.util.ArrayList;

public class Main10Activity extends AppCompatActivity {
LinearLayout linearLayout;
ArrayList<String> arr=new ArrayList<String>();
ArrayList<chicangzonglan>item;
static int num=-1;
ArrayList<ArrayList<chicangzonglan>>itemlist=new ArrayList<ArrayList<chicangzonglan>>();
ArrayList<ArrayList<chicangzonglan>>copyitemlist=new ArrayList<ArrayList<chicangzonglan>>();
ArrayList<Integer> itemcount=new ArrayList<Integer>();
MyAdapter13 myAdapter13;
static int rowcount=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        initarr();
        initdata();
        cal();
        RecyclerView rcv15 = findViewById(R.id.rcv15);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rcv15.setLayoutManager(llm);
        myAdapter13 = new MyAdapter13(itemlist, this,arr);
        rcv15.setAdapter(myAdapter13);
        myAdapter13.setMyonclick(new MyAdapter13.myOnClickListener() {
            @Override
            public void onClick(View view, int position) {
                ImageButton img = view.findViewById(R.id.imgbtn);
                initpopupwindow(img);
            }
        });
     /*   LinearLayout linearLayout=findViewById(R.id.llm1);
        final Button press=(Button)findViewById(R.id.press);

        press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initpopupwindow(press);
            }
        });
*/

    }

    private void cal() {
        rowcount=1;
        for(int i=0;i<itemlist.size();i++){
            rowcount=rowcount+itemlist.get(i).size();
        }
    }

    public static int getnum(){
        return num;
    }
    public static int getRowcount(){
        return rowcount;
    }
    private void initdata() {
        item=new ArrayList<chicangzonglan>();
        item.add(new gupiao("长安汽车","000625","3139.00","0.91%"));
        item.add(new gupiao("长安汽车","000625","5139.00","1.05%"));
        item.add(new gupiao("长安汽车","000625","6139.00","1.20%"));
        item.add(new gupiao("长安汽车","000625","8564.00","1.81%"));
        item.add(new gupiao("长安汽车","000625","12354.00","1.95%"));
        itemlist.add(item);
        item=new ArrayList<chicangzonglan>();
        item.add(new zhaiquan("16国债19","019547","4000.00","1.31%"));
        item.add(new zhaiquan("15国债28","019528","5000.00","1.45%"));
        itemlist.add(item);
        item=new ArrayList<chicangzonglan>();
        item.add(new huobijijin("建信货币A","530002","4566.00","1.22%"));
        item.add(new huobijijin("信诚货币A","550010","6566.00","1.32%"));
        itemlist.add(item);
        item=new ArrayList<chicangzonglan>();
        item.add(new huobijijin("R-001","131810","12444.00","1.23%"));
        item.add(new huobijijin("R-002","131811","13000.00","1.33%"));
        item.add(new huobijijin("R-003","131800","13680.00","1.56%"));
        item.add(new huobijijin("R-004","131809","15444.00","1.66%"));
        itemlist.add(item);
        copyitemlist.addAll(itemlist);
    }

    public void initarr(){
        arr.add("全部");
        arr.add("股票");
        arr.add("债券");
        arr.add("货币基金");
        arr.add("国债逆回购");
    }
    private void initpopupwindow(View v) {
        View view= LayoutInflater.from(this).inflate(R.layout.popupwindowlayout1,null,false);
        final PopupWindow popupWindow=new PopupWindow(view,350,ViewGroup.LayoutParams.WRAP_CONTENT,true);
        popupWindow.setAnimationStyle(R.anim.showpopup);
        popupWindow.setContentView(view);
        RecyclerView rcv16=(RecyclerView)view.findViewById(R.id.rcv16);
        LinearLayoutManager llm=new LinearLayoutManager(this);
        rcv16.setLayoutManager(llm);
        final MyAdapter14 myAdapter14=new MyAdapter14(arr);
        rcv16.setAdapter(myAdapter14);
        popupWindow.setTouchable(true);
        popupWindow.setClippingEnabled(false);
        popupWindow.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.mycolor1)));
        popupWindow.setTouchInterceptor(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return false;
            }
        });
        popupWindow.showAsDropDown(v,50,0);
        myAdapter14.setMyonclick(new MyAdapter14.myOnClickListener() {
            @Override
            public void onClick(View view, int position) {
                num=position;
                int begin=1;
                for(int i=0;i<position;i++){
                   begin=begin+copyitemlist.get(i).size();
                   itemcount.add(begin);
                }

                if(position!=0){
                    if(itemlist.size()==copyitemlist.size()) {
                        for (int i = 0; i < copyitemlist.size(); i++) {
                            myAdapter13.deleteData(0);
                        }
                        myAdapter13.addData(copyitemlist,position-1);
                    }
                    else{
                        myAdapter13.deleteData(0);
                        myAdapter13.addData(copyitemlist,position-1);
                    }


                }
                if(position==0){
                    if(itemlist.size()==1) {
                        myAdapter13.deleteData(0);
                        for(int i=0;i<copyitemlist.size();i++){
                            myAdapter13.addData(copyitemlist,i);
                        }
                    }
                }
                 TextView tv2=myAdapter13.getMap().get(0).tv1;
                 tv2.setText(arr.get(position));
                popupWindow.dismiss();
            }
        });
    }
}
