package com.example.administrator.demo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/4/25 0025.
 */

public class MyAdapter10 extends RecyclerView.Adapter<MyAdapter10.VH8> {
    ArrayList<String>arr;
    ArrayList<Boolean>ischecked=new ArrayList<Boolean>();
    Context context;
    @Override
    public VH8 onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout19,parent,false);
        return new VH8(view);
    }

    @Override
    public void onBindViewHolder(final VH8 holder, final int position) {
          holder.textView.setText(arr.get(position));
          if(position==0) {
              holder.checkBox.setChecked(true);
              ischecked.add(true);
          }
          holder.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
              @Override
              public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                  if(isChecked==true){
                     ischecked.add(true);
                      System.out.println("刘表"+ischecked.size());
                  }
                  if(isChecked==false){
                      ischecked.remove(ischecked.size()-1);
                      System.out.println("刘表"+ischecked.size());
                      if(ischecked.size()==0){
                          ischecked.add(true);
                          LayoutInflater inflater=LayoutInflater.from(context);
                          View toast_view = inflater.inflate(R.layout.toast_layout,null);
                          System.out.println("马超"+toast_view.getHeight());
                          Toast toast=new Toast(context);
                          toast.setGravity(Gravity.TOP | Gravity.FILL_HORIZONTAL, 0, toast_view.getHeight());
                          toast.setView(toast_view);
                          toast.show();
                          holder.checkBox.setChecked(true);
                      }
                  }
              }
          });
    }
    public MyAdapter10(ArrayList<String> arr,Context context){
        this.arr=arr;
        this.context=context;
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
