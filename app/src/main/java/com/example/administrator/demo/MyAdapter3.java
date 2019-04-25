package com.example.administrator.demo;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/4/10 0010.
 */

public class MyAdapter3 extends RecyclerView.Adapter<MyAdapter3.VH> {
    ArrayList<ArrayList<item>> arr=new ArrayList<ArrayList<item>>();
    public MyAdapter3(ArrayList<ArrayList<item>> arr){
        this.arr=arr;
    }
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout7, parent, false);
        return new VH(view);
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        TextView tv1=(TextView)holder.v1.findViewById(R.id.tvw1);
        tv1.setText(arr.get(0).get(position).itemname);
        TextView tv2=(TextView)holder.v1.findViewById(R.id.tvw2);
        tv2.setText(arr.get(0).get(position).account);
        TextView tv3=(TextView)holder.v2.findViewById(R.id.tvw1);
        tv3.setText(arr.get(1).get(position).itemname);
        TextView tv4=(TextView)holder.v2.findViewById(R.id.tvw2);
        tv4.setText(arr.get(1).get(position).account);
        TextView tv5=(TextView)holder.v3.findViewById(R.id.tvw1);
        tv5.setText(arr.get(2).get(position).itemname);
        TextView tv6=(TextView)holder.v3.findViewById(R.id.tvw2);
        tv6.setText(arr.get(2).get(position).account);
        TextView tv7=(TextView)holder.v4.findViewById(R.id.tvw1);
        tv7.setText(arr.get(3).get(position).itemname);
        TextView tv8 = (TextView) holder.v4.findViewById(R.id.tvw2);
        tv8.setText(arr.get(3).get(position).account);
        TextView tv9=(TextView)holder.v5.findViewById(R.id.tvw1);
        tv9.setText(arr.get(4).get(position).itemname);
        TextView tv10=(TextView)holder.v5.findViewById(R.id.tvw2);
        tv10.setText(arr.get(4).get(position).account);
        if(Double.valueOf(tv9.getText().toString())>0) {
            tv9.setTextColor(Color.argb(255, 255, 0, 0));
        }
        if(Double.valueOf(tv9.getText().toString())<0) {
            tv9.setTextColor(Color.argb(255, 0,255,  0));
        }
        if(Double.valueOf(tv9.getText().toString())==0) {
            tv9.setTextColor(Color.argb(255,156, 166, 177));
        }
    }

    @Override
    public int getItemCount() {
        return arr.get(0).size();
    }
    public static class VH extends RecyclerView.ViewHolder{
        View v1;
        View v2;
        View v3;
        View v4;
        View v5;
        public VH(View itemView) {
            super(itemView);
            v1=(View)itemView.findViewById(R.id.lay1);
            v2=(View)itemView.findViewById(R.id.lay2);
            v3=(View)itemView.findViewById(R.id.lay3);
            v4=(View)itemView.findViewById(R.id.lay4);
            v5=(View)itemView.findViewById(R.id.lay5);
        }
    }
}

