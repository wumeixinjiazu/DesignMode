package com.example.designmode.two;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/7 0007]
 * @function[功能简介 现金类的策略模式和简单工厂模式的结合]
 **/
public class CashContext {

    public CashSuper cashSuper;

    public CashContext(String type) {
        switch (type){
            case "正常计价":
                cashSuper = new CashNormal();
                break;
            case "打八折":
                cashSuper = new CashRebate(0.8);
                break;
            case "满300送100":
                cashSuper = new CashReturn(300,100);
                break;
            default:
                break;
        }
    }

    public double GetResult(double money) {
        return cashSuper.acceptCash(money);
    }

}
