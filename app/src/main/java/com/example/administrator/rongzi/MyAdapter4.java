package com.example.administrator.rongzi;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/4/12 0012.
 */

public class MyAdapter4 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<ArrayList<item3>> arr3;
    int column = -1;
    Context context;
    int screenheight;
    Resources res;
    

    public MyAdapter4(Context context, ArrayList<ArrayList<item3>> arr3,int screenheight,Resources res) {
        this.context = context;
        this.arr3 = arr3;
        this.screenheight=screenheight;
        this.res=res;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType==0) {
            View view2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout10, parent, false);
            view2.getLayoutParams().height = screenheight / 10;
            return new VH4(view2);
        }
        else{
            View view2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout9, parent, false);
            view2.getLayoutParams().height = screenheight / 10;
            return new VH3(view2);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {


        //  setscroll(vh2,position);
         /*  TextView tva1=vh2.view11.findViewById(R.id.tv31);
            tva1.setText(arr3.get(0).get(position-1).data1);
            TextView tvb1=vh2.view11.findViewById(R.id.tv32);
            tvb1.setText(arr3.get(0).get(position-1).data2);*/
         if(getItemViewType(position)==1){
             VH3 vh = (VH3) holder;
             vh.tv12.setText(arr3.get(1).get(position).data1);
             TextView tva3 = vh.view13.findViewById(R.id.tv31);
             tva3.setText(arr3.get(2).get(position).data1);
             TextView tvb3 = vh.view13.findViewById(R.id.tv32);
             tvb3.setText(arr3.get(2).get(position).data2);
             vh.tv14.setText(arr3.get(3).get(position).data1);
             TextView tva5 = vh.view15.findViewById(R.id.tv31);
             tva5.setText(arr3.get(4).get(position).data1);
             TextView tvb5 = vh.view15.findViewById(R.id.tv32);
             tvb5.setText(arr3.get(4).get(position).data2);
             tva3.setTextColor(Color.argb(255, 0, 0, 0));
             tva5.setTextColor(Color.argb(255, 0, 0, 0));
             ImageButton imgleft=vh.imgleft;
             ImageButton imgright=vh.imgright;
             final HorizontalScrollView ho=Main4Activity.getHoscroll();
             ho.setOnScrollChangeListener(new View.OnScrollChangeListener() {
                 @Override
                 public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                     System.out.println("也孙铁木儿"+ho.getScrollX());
                 }
             });
             imgleft.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                    System.out.println(Main4Activity.getScrollX());

                 }
             });
             imgright.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     System.out.println(Main4Activity.getScrollX());
                 }
             });

         }
        if (getItemViewType(position) == 0) {
            VH4 vh2 = (VH4) holder;
            vh2.tv12.setText(arr3.get(1).get(position).data1);
            TextView tva3 = vh2.view13.findViewById(R.id.tv31);
            tva3.setText(arr3.get(2).get(position).data1);
            TextView tvb3 = vh2.view13.findViewById(R.id.tv32);
            tvb3.setText(arr3.get(2).get(position).data2);
            vh2.tv14.setText(arr3.get(3).get(position).data1);
            TextView tva5 = vh2.view15.findViewById(R.id.tv31);
            tva5.setText(arr3.get(4).get(position).data1);
            TextView tvb5 = vh2.view15.findViewById(R.id.tv32);
            tvb5.setText(arr3.get(4).get(position).data2);
            if (vh2.tv12.getText().equals("不允许")) {
                vh2.tv12.setBackgroundColor(Color.argb(24, 249, 82, 82));
                vh2.tv12.setTextColor(Color.argb(255, 249, 82, 82));
            }
            if (vh2.tv12.getText().equals("允许")) {
                vh2.tv12.setBackgroundColor(Color.argb(24, 28, 200, 140));
                vh2.tv12.setTextColor(Color.argb(255, 28, 200, 140));
            }
            if (vh2.tv12.getText().equals("--")) {
                vh2.tv12.setBackgroundColor(Color.argb(24, 156, 166, 177));
                vh2.tv12.setTextColor(Color.argb(255, 156, 166, 177));
            }
            if (vh2.tv14.getText().equals("不允许")) {
                vh2.tv14.setBackgroundColor(Color.argb(24, 249, 82, 82));
                vh2.tv14.setTextColor(Color.argb(255, 249, 82, 82));
            }
            if (vh2.tv14.getText().equals("允许")) {
                vh2.tv14.setBackgroundColor(Color.argb(24, 28, 200, 140));
                vh2.tv14.setTextColor(Color.argb(255, 28, 200, 140));
            }
            if (vh2.tv14.getText().equals("--")) {
                vh2.tv14.setBackgroundColor(Color.argb(24, 156, 166, 177));
                vh2.tv14.setTextColor(Color.argb(255, 156, 166, 177));
            }
            //tva1.setTextColor(Color.argb(255,0,0,0));
            tva3.setTextColor(Color.argb(255, 0, 0, 0));
            tva5.setTextColor(Color.argb(255, 0, 0, 0));
        }
    }
    /*public void setscroll(VH2 vh2,int position){
        MyAdapter5 myAdapter5=new MyAdapter5(context,arr3,position-1);
        LinearLayoutManager llm=new LinearLayoutManager(context);
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        vh2.rcv7.setLayoutManager(llm);
        vh2.rcv7.setAdapter(myAdapter5);
    }*/
    @Override
    public int getItemCount() {
        return arr3.get(1).size();
    }

    @Override
    public int getItemViewType(int position) {
        if(position==0){
            return 1;
        }
        else{
            return 0;
        }
    }

    static class VH3 extends RecyclerView.ViewHolder {
        View view13, view15;
        TextView tv12, tv14;
        static ImageButton imgleft,imgright;
        public VH3(View itemView) {
            super(itemView);
            tv12 = (TextView) itemView.findViewById(R.id.tv12);
            view13 = (View) itemView.findViewById(R.id.lay3);
            view15 = (View) itemView.findViewById(R.id.lay5);
            tv14 = (TextView) itemView.findViewById(R.id.tv14);
            imgleft=(ImageButton)itemView.findViewById(R.id.left);
            imgright=(ImageButton)itemView.findViewById(R.id.right);
        }
    }
    static class VH4 extends RecyclerView.ViewHolder {
        View view13,view15;
        TextView tv12,tv14;
        public VH4(View itemView) {
            super(itemView);
            tv12=(TextView)itemView.findViewById(R.id.tv12);
            view13=(View)itemView.findViewById(R.id.lay3);
            view15=(View)itemView.findViewById(R.id.lay5);
            tv14=(TextView)itemView.findViewById(R.id.tv14);
        }
    }
}
