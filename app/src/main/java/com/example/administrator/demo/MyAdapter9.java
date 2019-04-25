package com.example.administrator.demo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/4/25 0025.
 */

public class MyAdapter9 extends RecyclerView.Adapter<MyAdapter9.VH7> {
    ArrayList<item5> arr9;
    @Override
    public VH7 onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout17,parent,false);
        return new VH7(view);
    }
    public MyAdapter9(ArrayList<item5> arr9){
        this.arr9=arr9;
    }
    @Override
    public void onBindViewHolder(VH7 holder, int position) {
        holder.tv1.setText(arr9.get(position).data);
        holder.tv2.setText(arr9.get(position).item);
    }

    @Override
    public int getItemCount() {
        return arr9.size();
    }
    static class VH7 extends RecyclerView.ViewHolder{
    TextView tv1,tv2;
        public VH7(View itemView) {
            super(itemView);
            tv1=(TextView)itemView.findViewById(R.id.tv1);
            tv2=(TextView)itemView.findViewById(R.id.tv2);
        }
    }
}
