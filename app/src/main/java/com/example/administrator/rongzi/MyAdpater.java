package com.example.administrator.rongzi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/4/8 0008.
 */

public class MyAdpater extends RecyclerView.Adapter<MyAdpater.VH> {
    ArrayList<name> mylist=new ArrayList<name>();
    @Override

    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout1, parent, false);
            return new VH(view);
    }

public MyAdpater(ArrayList<name> mylist){
        this.mylist=mylist;
}


    public void onBindViewHolder(VH holder, int position) {
        holder.tv1.setText( mylist.get(position).name1);
        holder.tv2.setText( mylist.get(position).name2);
        holder.tv3.setText( mylist.get(position).count);
    }

    @Override
    public int getItemCount() {
        return mylist.size();
    }
    public static class VH extends RecyclerView.ViewHolder{
        TextView tv1;
        TextView tv2;
        TextView tv3;
        ImageButton imgbtn;
        public VH(View itemView) {
            super(itemView);
            tv1=itemView.findViewById(R.id.tv1);
            tv2=itemView.findViewById(R.id.tv2);
            tv3=itemView.findViewById(R.id.tv3);
            imgbtn=itemView.findViewById(R.id.imgbtn);
        }
    }
}
