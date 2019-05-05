package com.example.administrator.demo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/4/29 0029.
 */

public class MyAdapter13 extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    ArrayList<ArrayList<chicangzonglan>>chicangzonglan;
    Context context;
    ArrayList<String>arr;
    public static Map<Integer, VH2> getMap() {
        return map;
    }

    static Map<Integer,VH2> map=new HashMap<Integer, VH2>();
    public void setMyonclick(myOnClickListener myonclick) {
        this.myonclick = myonclick;
    }

    public MyAdapter13.myOnClickListener myonclick;
    public interface myOnClickListener{
        public void onClick(View view,int position);
    }
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType==0){
            View view2=LayoutInflater.from(parent.getContext()).inflate(R.layout.layout0,parent,false);
            return new VH2(view2);
        }
        else{
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gupiaolist, parent, false);
            return new VH(view);
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
        if(getItemViewType(position)==1) {
            VH vh=(VH) holder;
            int l = 1;
            TextView nametitle = vh.list.findViewById(R.id.title1);
            TextView daimatitle = vh.list.findViewById(R.id.title2);
            for (int i = 0; i < chicangzonglan.size(); i++) {
                int k = chicangzonglan.get(i).size();
                for (int j = 0; j < chicangzonglan.get(i).size(); j++) {
                    if (position == l + j) {
                        nametitle.setText(chicangzonglan.get(i).get(j).name);
                        daimatitle.setText(chicangzonglan.get(i).get(j).daima);
                        vh.tv1.setText(chicangzonglan.get(i).get(j).shizhi);
                        vh.tv2.setText(chicangzonglan.get(i).get(j).yingkui);
                        if (Double.valueOf(chicangzonglan.get(i).get(j).yingkui.substring(0, chicangzonglan.get(i).get(j).yingkui.length() - 1)) > 0) {
                            vh.tv2.setBackgroundColor(context.getResources().getColor(R.color.zhang));
                        }
                        if (Double.valueOf(chicangzonglan.get(i).get(j).yingkui.substring(0, chicangzonglan.get(i).get(j).yingkui.length() - 1)) < 0) {
                            vh.tv2.setBackgroundColor(context.getResources().getColor(R.color.die));
                        }
                        if (Double.valueOf(chicangzonglan.get(i).get(j).yingkui.substring(0, chicangzonglan.get(i).get(j).yingkui.length() - 1)) == 0) {
                            vh.tv2.setBackgroundColor(context.getResources().getColor(R.color.lightgray));
                        }
                    }
                }
                l = l + k;
            }
        }
        if(getItemViewType(position)==0){
            final VH2 vh2=(VH2) holder;
            map.put(position,vh2);
            vh2.tv2.setText("市值");
            vh2.tv3.setText("总盈亏");
            vh2.imgbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos=vh2.getLayoutPosition();
                    myonclick.onClick(vh2.itemView,pos);
                }
            });
        }
    }
    public MyAdapter13(ArrayList<ArrayList<chicangzonglan>> chicangzonglan,Context context,ArrayList<String> arr){
        this.chicangzonglan=chicangzonglan;
        this.context=context;
        this.arr=arr;
    }
    public ArrayList<ArrayList<chicangzonglan>> getChicangzonglan(){
        return chicangzonglan;
    }
    @Override
    public int getItemCount() {
        int count=0;
        for(int i=0;i<chicangzonglan.size();i++){
            count=count+chicangzonglan.get(i).size();
        }
        return count+1;
    }
    public void addData(ArrayList<ArrayList<chicangzonglan>> arr,int position){
        chicangzonglan.add(arr.get(position));
        notifyItemInserted(position);
    }
    public void deleteData(int position){
       chicangzonglan.remove(position);
       notifyItemRemoved(position);
       notifyDataSetChanged();
    }

    static class VH extends RecyclerView.ViewHolder{
        View list;
        TextView tv1,tv2;
        public VH(View itemView) {
            super(itemView);
            list=itemView.findViewById(R.id.list);
            tv1=itemView.findViewById(R.id.tv1);
            tv2=itemView.findViewById(R.id.tv2);
        }
    }
    static class VH2 extends RecyclerView.ViewHolder{
        ImageButton imgbtn;
        TextView tv1,tv2,tv3;
        public VH2(View itemView) {
            super(itemView);
            tv3=itemView.findViewById(R.id.tv3);
            tv1=itemView.findViewById(R.id.tv1);
            tv2=itemView.findViewById(R.id.tv2);
            imgbtn=itemView.findViewById(R.id.imgbtn);
        }
    }
}
