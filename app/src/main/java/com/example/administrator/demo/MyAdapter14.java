package com.example.administrator.demo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/4/29 0029.
 */

public class MyAdapter14 extends RecyclerView.Adapter<MyAdapter14.VH>{
ArrayList<String>item;

    public void setMyonclick(MyAdapter14.myOnClickListener myonclick) {
        this.myonclick = myonclick;
    }

    public MyAdapter14.myOnClickListener myonclick;
    public interface myOnClickListener{
        public void onClick(View view,int position);
    }
    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.popuplist,parent,false);
        return new VH(view);
    }
    public MyAdapter14(ArrayList<String> item){
        this.item=item;
    }
    public void onBindViewHolder(final VH holder, int position) {
         holder.tv1.setText(item.get(position));
         holder.itemView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 int pos=holder.getLayoutPosition();
                 myonclick.onClick(holder.itemView,pos);
             }
         });
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    static class VH extends RecyclerView.ViewHolder{
        TextView tv1;
        public VH(View itemView) {

            super(itemView);
            tv1=itemView.findViewById(R.id.tv1);
        }
    }
}
