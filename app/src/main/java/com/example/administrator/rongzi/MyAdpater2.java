package com.example.administrator.rongzi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/4/10 0010.
 */

public class MyAdpater2 extends RecyclerView.Adapter<MyAdpater2.VH> {
    ArrayList<item>item1=new ArrayList<item>();
    public MyAdpater2(ArrayList<item> item1){
        this.item1=item1;
    }
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout6, parent, false);
                return new VH(view);
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
           holder.tv1.setText(item1.get(position).itemname);
           holder.tv2.setText(item1.get(position).account);
    }

    @Override
    public int getItemCount() {
        return item1.size();
    }
    public static class VH extends RecyclerView.ViewHolder{
        TextView tv1;
        TextView tv2;
        public VH(View itemView) {
            super(itemView);
            tv1=(TextView)itemView.findViewById(R.id.tv1);
            tv2=(TextView)itemView.findViewById(R.id.tv2);
        }
    }
}
