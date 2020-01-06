package com.example.designmode.two;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/6 0006]
 * @function[功能简介 现金满减类 满300 -100]
 **/
public class CashReturn extends CashSuper{

    private double moneyCondition;
    private double moneyReturn;

    /**
     * 例如 满300 - 100 moneyCondition = 300 moneyReturn = 100
     *
     * @param moneyCondition 返利的条件
     * @param moneyReturn   返利的金额
     */
    public CashReturn(double moneyCondition, double moneyReturn){
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }
    @Override
    public double acceptCash(double money) {
        if (money > moneyCondition){
            //满足满减条件
            money = money - (money / moneyCondition) * moneyReturn;
        }
        return money;
    }
}
