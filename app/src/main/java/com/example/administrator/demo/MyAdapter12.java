package com.example.administrator.demo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/4/26 0026.
 */

public class MyAdapter12 extends RecyclerView.Adapter<MyAdapter12.VH>{
ArrayList<item6> arr;
Context context;
    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout21,parent,false);
        return new VH(view);
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        holder.tev1.setText(arr.get(position).name);
        holder.tev2.setText(arr.get(position).title);
        holder.tev3.setText(arr.get(position).price);
        holder.tev4.setText(arr.get(position).zhangdiefu);
        if(Double.valueOf(arr.get(position).zhangdiefu.substring(0,arr.get(position).zhangdiefu.length()-1))>0){
            holder.tev3.setTextColor(context.getResources().getColor(R.color.zhang));
            holder.tev4.setTextColor(context.getResources().getColor(R.color.zhang));
        }
        if(Double.valueOf(arr.get(position).zhangdiefu.substring(0,arr.get(position).zhangdiefu.length()-1))<0){
            holder.tev3.setTextColor(context.getResources().getColor(R.color.die));
            holder.tev4.setTextColor(context.getResources().getColor(R.color.die));
        }
        if(Double.valueOf(arr.get(position).zhangdiefu.substring(0,arr.get(position).zhangdiefu.length()-1))==0){
            holder.tev3.setTextColor(context.getResources().getColor(R.color.gray));
            holder.tev4.setTextColor(context.getResources().getColor(R.color.gray));
        }
    }
    public MyAdapter12(ArrayList<item6> arr, Context context){
        this.arr=arr;
        this.context=context;
    }
    @Override
    public int getItemCount() {
        return arr.size();
    }

    static class VH extends RecyclerView.ViewHolder{
        TextView tev1,tev2,tev3,tev4;
        public VH(View itemView) {
            super(itemView);
            tev1=(TextView)itemView.findViewById(R.id.tev1);
            tev2=(TextView)itemView.findViewById(R.id.tev2);
            tev3=(TextView)itemView.findViewById(R.id.tev3);
            tev4=(TextView)itemView.findViewById(R.id.tev4);
        }
    }
}
