package com.example.administrator.rongzi;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/4/16 0016.
 */

public class MyAdapter6 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<ArrayList<item3>> arr3;
    Context context;
    int screenheight;
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
    public int getItemViewType(int position){
        if(position==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(getItemViewType(position)==0){
            VH vh=(VH)holder;
            TextView tva = vh.view45.findViewById(R.id.tv31);
            TextView tvb = vh.view45.findViewById(R.id.tv32);
            tva.setText(arr3.get(0).get(position).data1);
            tvb.setText(arr3.get(0).get(position).data2);
            tva.setTextColor(Color.argb(255,9,16,24));
        }
        if(getItemViewType(position)==1){
            VH2 vh2=(VH2)holder;
            TextView tv46=vh2.tv46;
            tv46.setText(arr3.get(0).get(0).data1);
            tv46.setHeight(99);
        }
    }

    public MyAdapter6(Context context, ArrayList<ArrayList<item3>> arr3,int screenheight) {
        this.arr3=arr3;
        this.context=context;
        this.screenheight=screenheight;
    }
    @Override
    public int getItemCount() {
        return arr3.get(0).size();
    }
    static class VH extends RecyclerView.ViewHolder{
      static View view45;
        public VH(View itemView) {
            super(itemView);
            view45 = (View) itemView.findViewById(R.id.tv45);
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

