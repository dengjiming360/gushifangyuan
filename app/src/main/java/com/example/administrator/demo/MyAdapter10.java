package com.example.administrator.demo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/4/25 0025.
 */

public class MyAdapter10 extends RecyclerView.Adapter<MyAdapter10.VH8> {
    ArrayList<String>arr;
    @Override
    public VH8 onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout19,parent,false);
        return new VH8(view);
    }

    @Override
    public void onBindViewHolder(VH8 holder, int position) {
          holder.textView.setText(arr.get(position));
    }
    public MyAdapter10(ArrayList<String> arr){
        this.arr=arr;
    }
    @Override
    public int getItemCount() {
        return arr.size();
    }
    class VH8 extends RecyclerView.ViewHolder{
      TextView textView;
      CheckBox checkBox;
        public VH8(View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textview);
            checkBox=itemView.findViewById(R.id.checkbox);
        }
    }
}
