package com.example.designmode.two;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/6 0006]
 * @function[功能简介 正常计价]
 **/
public class CashNormal extends CashSuper{
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
