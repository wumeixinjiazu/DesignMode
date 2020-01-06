package com.example.designmode.two;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/6 0006]
 * @function[功能简介]
 **/
public class CashFactory {

    public static CashSuper createAcceptCash(String type){
        CashSuper cashSuper = null;
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
        }
        return cashSuper;
    }
}
