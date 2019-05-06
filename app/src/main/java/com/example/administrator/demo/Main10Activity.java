package com.example.administrator.demo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.yuyh.library.BubblePopupWindow;

import java.util.ArrayList;

public class Main10Activity extends AppCompatActivity {
LinearLayout linearLayout;
ArrayList<String> arr=new ArrayList<String>();
ArrayList<chicangzonglan>item;
static int num=-1;
ArrayList<ArrayList<chicangzonglan>>itemlist=new ArrayList<ArrayList<chicangzonglan>>();
ArrayList<ArrayList<chicangzonglan>>copyitemlist=new ArrayList<ArrayList<chicangzonglan>>();
ArrayList<Integer> itemcount=new ArrayList<Integer>();
MyAdapter13 myAdapter13;
static int rowcount=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        statusline();
        initarr();
        initdata();
        cal();
        RecyclerView rcv15 = findViewById(R.id.rcv15);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rcv15.setLayoutManager(llm);
        myAdapter13 = new MyAdapter13(itemlist, this,arr);
        rcv15.setAdapter(myAdapter13);
        myAdapter13.setMyonclick(new MyAdapter13.myOnClickListener() {
            @Override
            public void onClick(View view, int position) {
                ImageButton img = view.findViewById(R.id.imgbtn);
                initpopupwindow(img);
            }
        });
     /*   LinearLayout linearLayout=findViewById(R.id.llm1);
        final Button press=(Button)findViewById(R.id.press);

        press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initpopupwindow(press);
            }
        });
*/

    }

    private int statusline() {
        int statusBarHeight1 = -1;
//获取status_bar_height资源的ID
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            //根据资源ID获取响应的尺寸值
            statusBarHeight1 = getResources().getDimensionPixelSize(resourceId);
        }
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        Rect outRect1 = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(outRect1);
        Rect outRect2 = new Rect();
        getWindow().findViewById(Window.ID_ANDROID_CONTENT).getDrawingRect(outRect2);
        int viewTop = getWindow().findViewById(Window.ID_ANDROID_CONTENT).getTop();
        int titleHeight1 = viewTop - outRect1.top;
        return titleHeight1+statusBarHeight1;
    }

    private void cal() {
        rowcount=1;
        for(int i=0;i<itemlist.size();i++){
            rowcount=rowcount+itemlist.get(i).size();
        }
    }

    public static int getnum(){
        return num;
    }
    public static int getRowcount(){
        return rowcount;
    }
    private void initdata() {
        item=new ArrayList<chicangzonglan>();
        item.add(new gupiao("长安汽车","000625","3139.00","0.91%"));
        item.add(new gupiao("长安汽车","000625","5139.00","1.05%"));
        item.add(new gupiao("长安汽车","000625","6139.00","1.20%"));
        item.add(new gupiao("长安汽车","000625","8564.00","1.81%"));
        item.add(new gupiao("长安汽车","000625","12354.00","1.95%"));
        itemlist.add(item);
        item=new ArrayList<chicangzonglan>();
        item.add(new zhaiquan("16国债19","019547","4000.00","1.31%"));
        item.add(new zhaiquan("15国债28","019528","5000.00","1.45%"));
        itemlist.add(item);
        item=new ArrayList<chicangzonglan>();
        item.add(new huobijijin("建信货币A","530002","4566.00","1.22%"));
        item.add(new huobijijin("信诚货币A","550010","6566.00","1.32%"));
        itemlist.add(item);
        item=new ArrayList<chicangzonglan>();
        item.add(new huobijijin("R-001","131810","12444.00","1.23%"));
        item.add(new huobijijin("R-002","131811","13000.00","1.33%"));
        item.add(new huobijijin("R-003","131800","13680.00","1.56%"));
        item.add(new huobijijin("R-004","131809","15444.00","1.66%"));
        itemlist.add(item);
        copyitemlist.addAll(itemlist);
    }

    public void initarr(){
        arr.add("全部");
        arr.add("股票");
        arr.add("债券");
        arr.add("货币基金");
        arr.add("国债逆回购");
    }
  /*  private  int[] calculatePopWindowPos(final View anchorView, final View contentView) {
        final int windowPos[] = new int[2];
        final int anchorLoc[] = new int[2];
        // 获取锚点View在屏幕上的左上角坐标位置
        anchorView.getLocationOnScreen(anchorLoc);
        final int anchorHeight = anchorView.getHeight();
        // 获取屏幕的高宽
        final int screenHeight = ScreenUtil.getScreenHeight(anchorView.getContext());
        final int screenWidth = ScreenUtil.getScreenWidth(anchorView.getContext());
        contentView.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
        // 计算contentView的高宽
        final int windowHeight = contentView.getMeasuredHeight();
        final int windowWidth = contentView.getMeasuredWidth();
        // 判断需要向上弹出还是向下弹出显示
        final boolean isNeedShowUp = (screenHeight - anchorLoc[1] - anchorHeight < windowHeight);
        if (isNeedShowUp) {
            windowPos[0] = screenWidth - windowWidth;
            windowPos[1] = anchorLoc[1] - windowHeight;
        } else {
            windowPos[0] = screenWidth - windowWidth;
            windowPos[1] = anchorLoc[1] + anchorHeight;
        }
        return windowPos;
    }*/
    private void initpopupwindow(View v) {
        View view = LayoutInflater.from(this).inflate(R.layout.popupwindowlayout1, null, false);
        View view1=myAdapter13.getMap().get(0).imgbtn;
        int x=(int)view1.getX();
        int y=(int)view1.getY();
        int newy=y+statusline();
        view.measure(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        view1.measure(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        int h=view1.getMeasuredHeight();
        int w=view1.getMeasuredWidth();
        int finalx=w+x;
        int finaly=newy+h;
        /*  final BubblePopupWindow popupWindow=new BubblePopupWindow(this);

        popupWindow.setBubbleView(view);
        popupWindow.show(v, Gravity.BOTTOM,0);
        /*popupWindow.setAnimationStyle(R.anim.showpopup);*/
        final BubbleWindow bubbleWindow=new BubbleWindow(this,this.getResources().getColor(R.color.mycolor1));
        bubbleWindow.setBubbleView(view,this.getResources().getColor(R.color.mycolor1));
        /*View windowContentViewRoot = view1;
        int windowPos[] = calculatePopWindowPos(view, windowContentViewRoot);
        int xOff = 0;// 可以自己调整偏移
        windowPos[0] -= xOff;*/
        bubbleWindow.show(v, Gravity.BOTTOM,60,(int)(finalx-triangle.PADDING*1.5)-60,(int)(finaly+triangle.PADDING*1.5));
// windowContentViewRoot是根布局View
        //bubbleWindow.show(view,Gravity.BOTTOM,0);
        RecyclerView rcv16 = (RecyclerView) view.findViewById(R.id.rcv16);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rcv16.setLayoutManager(llm);
        final MyAdapter14 myAdapter14 = new MyAdapter14(arr);
        rcv16.setAdapter(myAdapter14);
        /*popupWindow.setTouchable(true);
        popupWindow.setClippingEnabled(false);
        rcv16.addItemDecoration(new CustomDecoration(this,CustomDecoration.VERTICAL_LIST,R.drawable.divide,40,CustomDecoration.BOTHV,CustomDecoration.NONEH,0,0,1,1));
        popupWindow.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.mycolor1)));
        popupWindow.setTouchInterceptor(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return false;
            }
        });*/
        myAdapter14.setMyonclick(new MyAdapter14.myOnClickListener() {
            @Override
            public void onClick(View view, int position) {
                num = position;
                int begin = 1;
                for (int i = 0; i < position; i++) {
                    begin = begin + copyitemlist.get(i).size();
                    itemcount.add(begin);
                }

                if (position != 0) {
                    if (itemlist.size() == copyitemlist.size()) {
                        for (int i = 0; i < copyitemlist.size(); i++) {
                            myAdapter13.deleteData(0);
                        }
                        myAdapter13.addData(copyitemlist, position - 1);
                    } else {
                        myAdapter13.deleteData(0);
                        myAdapter13.addData(copyitemlist, position - 1);
                    }


                }
                if (position == 0) {
                    if (itemlist.size() == 1) {
                        myAdapter13.deleteData(0);
                        for (int i = 0; i < copyitemlist.size(); i++) {
                            myAdapter13.addData(copyitemlist, i);
                        }
                    }
                }
                TextView tv2 = myAdapter13.getMap().get(0).tv1;
                tv2.setText(arr.get(position));
               bubbleWindow.dismiss();
            }
        });
    }
}
