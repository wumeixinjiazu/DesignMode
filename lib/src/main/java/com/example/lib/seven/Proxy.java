package com.example.lib.seven;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/7 0007]
 * @function[功能简介]
 **/
public class Proxy implements IGiveGift{

    private Pursuit pursuit;

    public Proxy(SchoolGirl schoolGirl){
        pursuit = new Pursuit(schoolGirl);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
