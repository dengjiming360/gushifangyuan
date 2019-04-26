package com.example.administrator.demo;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/4/26 0026.
 */

public class MyAdapter11 extends RecyclerView.Adapter<MyAdapter11.VH> {
    ArrayList<String> title;
    ArrayList<ArrayList<item6>> gupiao;
    Context context;
    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout20,parent,false);
        return new VH(view);
    }
    public MyAdapter11(ArrayList<String>title, ArrayList<ArrayList<item6>> gupiao, Context context){
        this.title=title;
        this.gupiao=gupiao;
        this.context=context;
    }
    @Override
    public void onBindViewHolder(VH holder, int position) {
        holder.title1.setText(title.get(position));
        GridLayoutManager manager=new GridLayoutManager(context,3, OrientationHelper.VERTICAL,false);
         holder.rcv13.setLayoutManager(manager);
         MyAdapter12 myAdapter12=new MyAdapter12(gupiao.get(position),context);
         holder.rcv13.setAdapter(myAdapter12);

    }

    @Override
    public int getItemCount() {
        return title.size();
    }
    static class VH extends RecyclerView.ViewHolder{
        RecyclerView rcv13;
        TextView title1;
        public VH(View itemView) {
            super(itemView);
            rcv13=(RecyclerView)itemView.findViewById(R.id.rcv13);
            title1=(TextView)itemView.findViewById(R.id.title);
        }
    }
}
