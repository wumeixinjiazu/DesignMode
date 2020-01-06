package com.example.designmode.two;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/6 0006]
 * @function[功能简介 现金打折类]
 **/
public class CashRebate extends CashSuper{

    private double moneyRebate = 1.00;//默认打一折

    public CashRebate(double moneyRebate){
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
