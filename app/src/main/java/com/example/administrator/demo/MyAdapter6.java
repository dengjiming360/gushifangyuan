package com.example.administrator.demo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/4/16 0016.
 */

public class MyAdapter6 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    static ArrayList<ArrayList<item3>> arr3;
    Context context;
    int screenheight;
    Resources res;
    public interface OnTouchListener{
        void onTouch2(View view,int position,MotionEvent mo);
    }
    private MyAdapter6.OnTouchListener mOnTouchListener;
    public void setmOnTouchListener(MyAdapter6.OnTouchListener mOnTouchListener){
        this.mOnTouchListener=mOnTouchListener;
    }
    public static  Map<Integer,VH> getVhmap() {
        return vhmap;
    }

    public  void setVhmap(Map<Integer, VH> vhmap) {
        this.vhmap = vhmap;
    }

    static  Map<Integer,VH> vhmap=new HashMap<>();
    public static VH getVh3() {
        return vh3;
    }

    public static void setVh3(VH vh3) {
        MyAdapter6.vh3 = vh3;
    }

    static VH vh3;

    public static LinearLayout getLinear2() {
        return linear2;
    }

    public void setLinear2(LinearLayout linear2) {
        this.linear2 = linear2;
    }

    static LinearLayout linear2;
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType==0) {
            View view2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout14, parent, false);
            view2.getLayoutParams().height  = screenheight/10;;
            return new VH(view2);
        }
        else{
            View view2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout16, parent, false);
            view2.getLayoutParams().height  = screenheight/10;;
            return new VH2(view2);
        }
    }
    public  int getItemViewType(int position){
        if(position==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public  void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        if(getItemViewType(position)==0){
            final VH vh=(VH)holder;
            //vh.linear2.setBackground(res.getDrawable(R.drawable.pressed));
            TextView tva = vh.view45.findViewById(R.id.tv31);
            TextView tvb = vh.view45.findViewById(R.id.tv32);
            tva.setText(arr3.get(0).get(position).data1);
            tvb.setText(arr3.get(0).get(position).data2);
            tva.setTextColor(Color.argb(255,9,16,24));
            vh.linear2.setBackground(res.getDrawable(R.drawable.pressed));
            vhmap.put(position,vh);
            if(position!=0) {
                vh.linear2.setBackground(res.getDrawable(R.drawable.pressed));
                vh.linear2.setOnTouchListener(new View.OnTouchListener() {
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
                        int pos = vh.getLayoutPosition();

                        mOnTouchListener.onTouch2(vh.itemView, pos, event);

                        return true;
                    }
                });
            }
        }
        if(getItemViewType(position)==1){
            final VH2 vh2=(VH2)holder;
            TextView tv46=vh2.tv46;
            tv46.setText(arr3.get(0).get(0).data1);
            tv46.setHeight(99);

            }
                    //.findViewByPosition(position).findViewById(R.id.linear1).setOnTouchListener(new View.OnTouchListener() {
             //   @Override
                /*public boolean onTouch(View v, MotionEvent event) {
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        System.out.println("李世民");
                    }
                    if (event.getAction() == MotionEvent.ACTION_UP) {
                        System.out.println("李隆基");
                    }
                    return false;
                }
            });*/
    }

    public MyAdapter6(Context context, ArrayList<ArrayList<item3>> arr3,int screenheight,Resources res) {
        this.arr3=arr3;
        this.context=context;
        this.screenheight=screenheight;
        this.res=res;
    }
    @Override
    public int getItemCount() {
        return arr3.get(0).size();
    }
   static  class VH extends RecyclerView.ViewHolder{
        View view45;
     LinearLayout linear2;
        public VH(View itemView) {
            super(itemView);
            view45 = (View) itemView.findViewById(R.id.tv45);
            linear2=(LinearLayout)itemView.findViewById(R.id.linear2);
        }
    }
    static class VH2 extends RecyclerView.ViewHolder{
        static TextView tv46;
        public VH2(View itemView) {
            super(itemView);
            tv46 = (TextView) itemView.findViewById(R.id.tv46);
        }
    }
}

