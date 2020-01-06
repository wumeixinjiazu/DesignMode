package com.example.lib.one;

import com.example.lib.LogUtil;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/6 0006]
 * @function[功能简介 简单工厂模式的应用]
 **/
public class One {

    public static void main(String[] args) {
        Operation operate = OperationFactory.createOperate("*");
        operate.NumberA = 10;
        operate.NumberB = 10;
        double result = operate.GetResult();
        LogUtil.p(+result);
    }



}
