package com.example.lib.six;

import com.example.lib.LogUtil;


/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/7 0007]
 * @function[功能简介 具体服饰类 ]
 **/
public class TShirts extends Finery {

    @Override
    public void show() {
        LogUtil.p("大T桖");
        super.show();

    }

}

class BigTrouser extends Finery {
    @Override
    public void show() {
        LogUtil.p("垮裤");
        super.show();

    }
}

class Sneakers extends Finery {
    @Override
    public void show() {
        LogUtil.p("破球鞋");
        super.show();
    }
}
