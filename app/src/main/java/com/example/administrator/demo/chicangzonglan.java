package com.example.administrator.demo;

/**
 * Created by Administrator on 2019/4/30 0030.
 */

public class chicangzonglan {
    String name;
    String daima;
    String yingkui;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDaima() {
        return daima;
    }

    public void setDaima(String daima) {
        this.daima = daima;
    }

    public String getYingkui() {
        return yingkui;
    }

    public void setYingkui(String yingkui) {
        this.yingkui = yingkui;
    }

    public String getShizhi() {
        return shizhi;
    }

    public void setShizhi(String shizhi) {
        this.shizhi = shizhi;
    }

    String shizhi;
    public chicangzonglan(String name, String daima, String shizhi, String yingkui) {
        this.name = name;
        this.daima = daima;
        this.yingkui = yingkui;
        this.shizhi = shizhi;
    }


}
