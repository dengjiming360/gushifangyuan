package com.example.administrator.demo;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/4/25 0025.
 */

public class MyAdapter8 extends RecyclerView.Adapter<MyAdapter8.VH6> {
    ArrayList<String> arr1;
    ArrayList<ArrayList<item5>> arr2;
    Context context;
    public MyAdapter8(ArrayList<String> arr1, ArrayList<ArrayList<item5>> arr2,Context context){
        this.arr1=arr1;
        this.arr2=arr2;
        this.context=context;
    }
    @Override
    public VH6 onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout18, parent, false);
            return new VH6(view);
    }

    /*@Override
    public int getItemViewType(int position) {
        if(position==0){
            return 0;
        }
        else{
            return 1;
        }
    }*/


    public void onBindViewHolder(VH6 holder, int position) {
        holder.tvt7.setText(arr1.get(position));
        GridLayoutManager grid=new GridLayoutManager(context,3, OrientationHelper.VERTICAL,false);
        holder.rcv11.setLayoutManager(grid);
        System.out.println("泰定"+arr2.get(position).size());
        MyAdapter9 myAdapter9=new MyAdapter9(arr2.get(position));
        holder.rcv11.setAdapter(myAdapter9);
    }

    @Override
    public int getItemCount() {
        return arr1.size();
    }
     static class VH6 extends RecyclerView.ViewHolder{
         RecyclerView rcv11;
         TextView tvt7;
         public VH6(View itemView) {
             super(itemView);
             rcv11=(RecyclerView)itemView.findViewById(R.id.rcv11);
             tvt7=(TextView)itemView.findViewById(R.id.tvt7);
         }
     }
}
