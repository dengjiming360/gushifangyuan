package com.example.administrator.rongzi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/4/12 0012.
 */

public class MyAdapter4{} /*extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
   /* ArrayList<item2> arrayList1=new ArrayList<item2>();
    ArrayList<item2> arrayList2=new ArrayList<item2>();
    public MyAdapter4(ArrayList<item2> arrayList1, ArrayList<item2> arrayList2){
             this.arrayList1=arrayList1;
             this.arrayList2=arrayList2;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType==0) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout9, parent, false);
            return new VH(view);
        }
        if(viewType!=0){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout10, parent, false);
            return new VH2(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof VH){

        }
        if(holder instanceof  VH2){

        }
    }


    @Override
    public int getItemCount() {
        return 2;
    }
    public int getItemViewType(int position) {
        return position < 2 ? position:2;
    }
    public static class VH extends RecyclerView.ViewHolder{
     TextView tv1;
     TextView tv2;
     TextView tv3;
     TextView tv4;
     TextView tv5;
        public VH(View itemView) {
            super(itemView);
            tv1=(TextView)itemView.findViewById(R.id.tv1);
        }
    }
    public static class VH2 extends RecyclerView.ViewHolder{
        CheckBox checkBox;
        public VH2(View itemView) {
            super(itemView);
            checkBox=(CheckBox)itemView.findViewById(R.id.check);
        }
    }*/
//}
