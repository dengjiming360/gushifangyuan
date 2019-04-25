package com.example.administrator.demo;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/4/22 0022.
 */

public class MyAdapter7 extends RecyclerView.Adapter<MyAdapter7.VH> {
    ArrayList<Item4> item4;
    public MyAdapter7(ArrayList<Item4> item4){
        this.item4=item4;
    }
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.ganggutong,parent,false);
        return new VH(view);
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        holder.title.setText(item4.get(position).title);
        holder.name.setText(item4.get(position).name);
        holder.item.setText(item4.get(position).data);
        holder.zhangdie.setText(item4.get(position).zhangdie);
        String zhangdiefu=item4.get(position).zhangdie;
        if(Double.valueOf(zhangdiefu.substring(0,zhangdiefu.length()-1))>0){
            holder.zhangdie.setTextColor(Color.argb(255,249,82,82));
            holder.name.setTextColor(Color.argb(255,249,82,82));
            if(position==0||position==1){
                holder.item.setTextColor(Color.argb(255,249,82,82));
            }
        }
        if(Double.valueOf(zhangdiefu.substring(0,zhangdiefu.length()-1))<0){
            holder.zhangdie.setTextColor(Color.argb(255,28,200,140));
            holder.name.setTextColor(Color.argb(255,28,200,140));
            if(position==0||position==1){
                holder.item.setTextColor(Color.argb(255,28,200,140));
            }
        }
        if(Double.valueOf(zhangdiefu.substring(0,zhangdiefu.length()-1))==0){
            holder.zhangdie.setTextColor(Color.argb(255,94,128,167));
            holder.name.setTextColor(Color.argb(255,94,128,167));
            if(position==0||position==1){
                holder.item.setTextColor(Color.argb(255,94,128,167));
            }
        }
    }

    @Override
    public int getItemCount() {
        return item4.size();
    }
    static class VH extends RecyclerView.ViewHolder{
        TextView title,name,zhangdie,item;
        public VH(View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.tv1);
            name=itemView.findViewById(R.id.tv2);
            zhangdie=itemView.findViewById(R.id.tv4);
            item=itemView.findViewById(R.id.tv3);
        }
    }
}
