package com.example.administrator.rongzi;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/4/16 0016.
 */

public class MyAdapter5 extends RecyclerView.Adapter<MyAdapter5.VH> {
    ArrayList<ArrayList<item3>> arr3;
    Context context;
    int lies;
    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout10, parent, false);
        return new VH(view2);
    }
    public MyAdapter5(Context context, ArrayList<ArrayList<item3>> arr3,int lies) {
        this.arr3=arr3;
        this.context=context;
        this.lies=lies;
    }
    public void onBindViewHolder(VH holder, int position) {


            holder.tv12.setText(arr3.get(1).get(lies).data1);
            TextView tva3 = holder.view13.findViewById(R.id.tv31);
            tva3.setText(arr3.get(2).get(lies).data1);
            TextView tvb3 = holder.view13.findViewById(R.id.tv32);
            tvb3.setText(arr3.get(2).get(lies).data2);
            holder.tv14.setText(arr3.get(3).get(lies).data1);
            TextView tva5 = holder.view15.findViewById(R.id.tv31);
            tva5.setText(arr3.get(4).get(lies).data1);
            TextView tvb5 = holder.view15.findViewById(R.id.tv32);
            tvb5.setText(arr3.get(4).get(lies).data2);
            if (holder.tv12.getText().equals("不允许")) {
                holder.tv12.setBackgroundColor(Color.argb(54, 255, 0, 0));
                holder.tv12.setTextColor(Color.argb(255, 255, 0, 0));
            }
            if (holder.tv12.getText().equals("允许")) {
                holder.tv12.setBackgroundColor(Color.argb(54, 0, 255, 0));
                holder.tv12.setTextColor(Color.argb(255, 0, 255, 0));
            }
            if (holder.tv12.getText().equals("--")) {
                holder.tv12.setBackgroundColor(Color.argb(54, 156, 166, 177));
                holder.tv12.setTextColor(Color.argb(255, 156, 166, 177));
            }
            if (holder.tv14.getText().equals("不允许")) {
                holder.tv14.setBackgroundColor(Color.argb(54, 255, 0, 0));
                holder.tv14.setTextColor(Color.argb(255, 255, 0, 0));
            }
            if (holder.tv14.getText().equals("允许")) {
                holder.tv14.setBackgroundColor(Color.argb(54, 0, 255, 0));
                holder.tv14.setTextColor(Color.argb(255, 0, 255, 0));
            }
            if (holder.tv14.getText().equals("--")) {
                holder.tv14.setBackgroundColor(Color.argb(54, 156, 166, 177));
                holder.tv14.setTextColor(Color.argb(255, 156, 166, 177));
            }
            tva3.setTextColor(Color.argb(255, 0, 0, 0));
            tva5.setTextColor(Color.argb(255, 0, 0, 0));
        }
    @Override
    public int getItemCount() {
        return 1;
    }
    class VH extends RecyclerView.ViewHolder{
                View view13;
                View view15;
                TextView tv12;
                TextView tv14;
                public VH(View itemView) {
                    super(itemView);

                    tv12 = (TextView) itemView.findViewById(R.id.tv12);
                    view13 = (View) itemView.findViewById(R.id.lay3);
                    tv14 = (TextView) itemView.findViewById(R.id.tv31);
                    view15 = (View) itemView.findViewById(R.id.lay5);
                }
    }
}
