package com.example.administrator.demo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/4/12 0012.
 */

public class MyAdapter4 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<ArrayList<item3>> arr3;
    int column = -1;
    Context context;
    int screenheight;
    Resources res;
    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }

    int click=-1;
    int leftposition,rightposition;
    public static Map<Integer,MyAdapter4.VH4> getVhmap() {
        return vhmap;
    }

    public  void setVhmap(Map<Integer, MyAdapter4.VH4> vhmap) {
        this.vhmap = vhmap;
    }

    static  Map<Integer,MyAdapter4.VH4> vhmap=new HashMap<>();
    
    public MyAdapter4(Context context, ArrayList<ArrayList<item3>> arr3,int screenheight,Resources res) {
        this.context = context;
        this.arr3 = arr3;
        this.screenheight=screenheight;
        this.res=res;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout10, parent, false);
            view2.getLayoutParams().height = screenheight / 10;
            return new VH4(view2);
    }
    public interface OnTouchListener{
        void onTouch2(View view,int position,MotionEvent mo);
    }
    private MyAdapter4.OnTouchListener mOnTouchListener;
    public void setmOnTouchListener(OnTouchListener mOnTouchListener){
        this.mOnTouchListener=mOnTouchListener;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {


        //  setscroll(vh2,position);
         /*  TextView tva1=vh2.view11.findViewById(R.id.tv31);
            tva1.setText(arr3.get(0).get(position-1).data1);
            TextView tvb1=vh2.view11.findViewById(R.id.tv32);
            tvb1.setText(arr3.get(0).get(position-1).data2);*/

            final VH4 vh2 = (VH4) holder;
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
            vhmap.put(position,vh2);
            if(position!=0) {
                vh2.linear.setBackground(res.getDrawable(R.drawable.pressed));
                vh2.linear.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                     /*   if (event.getAction() == MotionEvent.ACTION_DOWN) {
                            System.out.println("朱元璋");
                            MyAdapter6.getVh3().MyAdapter6.getVh3().getLayoutPosition();
                        }
                        if (event.getAction() == MotionEvent.ACTION_UP) {
                            System.out.println("朱棣");
                        }
                        int pos=vh2.getLayoutPosition();*/
                        int pos=vh2.getLayoutPosition();
                        mOnTouchListener.onTouch2(vh2.itemView,pos,event);
                        return true;
                    }
                });
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

        static class VH4 extends RecyclerView.ViewHolder{
        View view13,view15;
        TextView tv12,tv14;
        LinearLayout linear;
        public VH4(View itemView) {
            super(itemView);
            linear=(LinearLayout)itemView.findViewById(R.id.linear1);
            tv12=(TextView)itemView.findViewById(R.id.tv12);
            view13=(View)itemView.findViewById(R.id.lay3);
            view15=(View)itemView.findViewById(R.id.lay5);
            tv14=(TextView)itemView.findViewById(R.id.tv14);

        }
        }
}
