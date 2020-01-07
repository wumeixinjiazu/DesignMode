package com.example.lib.seven;

import com.example.lib.LogUtil;


/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/7 0007]
 * @function[功能简介 追求者类]
 **/
public class Pursuit implements IGiveGift{

    private SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    @Override
    public void giveDolls() {
        LogUtil.p(schoolGirl.name+"送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        LogUtil.p(schoolGirl.name+"送你花");

    }

    @Override
    public void giveChocolate() {
        LogUtil.p(schoolGirl.name+"送你巧克力");
    }
}
