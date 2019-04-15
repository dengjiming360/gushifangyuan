package com.example.administrator.rongzi;

import android.content.Intent;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<name> uname = new ArrayList<name>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Button btn1 = findViewById(R.id.btn1);
        init();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomizeDialog1(uname);
            }
        });
    }


    public void init() {
            uname.add(new name("直接还款", "可用资金", "42432.02"));
            uname.add(new name("卖券还款", "融资负债", "42432.02"));
            uname.add(new name("直接还券", "持仓市值", "42432.02"));
            uname.add(new name("买券还券", "融资负债", "42432.02"));
        }

    private void showCustomizeDialog1(ArrayList<name> item) {
        BottomSheetDialog bsd = new BottomSheetDialog(MainActivity.this);
        bsd.setContentView(R.layout.layout4);
        RecyclerView rcv = bsd.findViewById(R.id.recycle);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rcv.setLayoutManager(llm);
        MyAdpater myadp = new MyAdpater(item);
        rcv.setAdapter(myadp);
        bsd.show();
    }
}
