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

public class MyAdapter8 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<String> arr1;
    ArrayList<ArrayList<item5>> arr2;
    public MyAdapter8(ArrayList<String> arr1, ArrayList<ArrayList<item5>> arr2){
        this.arr1=arr1;
        this.arr2=arr2;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType==0) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout18, parent, false);
            return new VH(view);
        }
        else{
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout19, parent, false);
            return new VH2(view);
        }
    }

    @Override
    public int getItemViewType(int position) {
        if(position==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(getItemViewType(position)==0) {
            VH vh=(VH)holder;
            TextView tvt11 = vh.tvt1.findViewById(R.id.tv1);
            tvt11.setText(arr2.get(0).get(position).data);
            TextView tvt12 = vh.tvt1.findViewById(R.id.tv2);
            tvt12.setText(arr2.get(0).get(position).item);
            TextView tvt21 = vh.tvt2.findViewById(R.id.tv1);
            tvt21.setText(arr2.get(1).get(position).data);
            TextView tvt22 = vh.tvt2.findViewById(R.id.tv2);
            tvt22.setText(arr2.get(1).get(position).item);
            TextView tvt31 = vh.tvt3.findViewById(R.id.tv1);
            tvt31.setText(arr2.get(2).get(position).data);
            TextView tvt32 = vh.tvt3.findViewById(R.id.tv2);
            tvt32.setText(arr2.get(2).get(position).item);
            TextView tvt41 = vh.tvt4.findViewById(R.id.tv1);
            tvt41.setText(arr2.get(3).get(position).data);
            TextView tvt42 = vh.tvt4.findViewById(R.id.tv2);
            tvt42.setText(arr2.get(3).get(position).item);
            TextView tvt51 = vh.tvt5.findViewById(R.id.tv1);
            tvt51.setText(arr2.get(4).get(position).data);
            TextView tvt52 = vh.tvt5.findViewById(R.id.tv2);
            tvt52.setText(arr2.get(4).get(position).item);
                TextView tvt61 = vh.tvt6.findViewById(R.id.tv1);
                tvt61.setText(arr2.get(5).get(position).data);
                TextView tvt62 = vh.tvt6.findViewById(R.id.tv2);
                tvt62.setText(arr2.get(5).get(position).item);
            vh.tvt7.setText(arr1.get(position));
        }
        if(getItemViewType(position)==1){
                VH2 vh2=(VH2)holder;
                TextView tvt11 = vh2.tvt1.findViewById(R.id.tv1);
                tvt11.setText(arr2.get(0).get(position).data);
                TextView tvt12 = vh2.tvt1.findViewById(R.id.tv2);
                tvt12.setText(arr2.get(0).get(position).item);
                TextView tvt21 = vh2.tvt2.findViewById(R.id.tv1);
                tvt21.setText(arr2.get(1).get(position).data);
                TextView tvt22 = vh2.tvt2.findViewById(R.id.tv2);
                tvt22.setText(arr2.get(1).get(position).item);
                TextView tvt31 = vh2.tvt3.findViewById(R.id.tv1);
                tvt31.setText(arr2.get(2).get(position).data);
                TextView tvt32 = vh2.tvt3.findViewById(R.id.tv2);
                tvt32.setText(arr2.get(2).get(position).item);
                TextView tvt41 = vh2.tvt4.findViewById(R.id.tv1);
                tvt41.setText(arr2.get(3).get(position).data);
                TextView tvt42 = vh2.tvt4.findViewById(R.id.tv2);
                tvt42.setText(arr2.get(3).get(position).item);
                TextView tvt51 = vh2.tvt5.findViewById(R.id.tv1);
                tvt51.setText(arr2.get(4).get(position).data);
                TextView tvt52 = vh2.tvt5.findViewById(R.id.tv2);
                tvt52.setText(arr2.get(4).get(position).item);
                vh2.tvt7.setText(arr1.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return arr1.size();
    }
    static class VH extends RecyclerView.ViewHolder{
     View tvt1,tvt2,tvt3,tvt4,tvt5,tvt6;
     TextView tvt7;
        public VH(View itemView) {
            super(itemView);
            tvt1=(View)itemView.findViewById(R.id.tvt1);
            tvt2=(View)itemView.findViewById(R.id.tvt2);
            tvt3=(View)itemView.findViewById(R.id.tvt3);
            tvt4=(View)itemView.findViewById(R.id.tvt4);
            tvt5=(View)itemView.findViewById(R.id.tvt5);
            tvt6=(View)itemView.findViewById(R.id.tvt6);
            tvt7=(TextView)itemView.findViewById(R.id.tvt7);
        }
    }
    static class VH2 extends RecyclerView.ViewHolder{
        View tvt1,tvt2,tvt3,tvt4,tvt5;
        TextView tvt7;
        public VH2(View itemView) {
            super(itemView);
            tvt1=(View)itemView.findViewById(R.id.tvt1);
            tvt2=(View)itemView.findViewById(R.id.tvt2);
            tvt3=(View)itemView.findViewById(R.id.tvt3);
            tvt4=(View)itemView.findViewById(R.id.tvt4);
            tvt5=(View)itemView.findViewById(R.id.tvt5);
            tvt7=(TextView)itemView.findViewById(R.id.tvt7);
        }
    }
}
