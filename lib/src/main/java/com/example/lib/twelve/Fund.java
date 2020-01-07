package com.example.lib.twelve;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/7 0007]
 * @function[功能简介 基金类]
 **/
public class Fund {

    private final Stock1 stock1;
    private final Stock2 stock2;
    private final NationalDebt nationalDebt;
    private final Realty realty;

    public Fund() {
        stock1 = new Stock1();
        stock2 = new Stock2();
        nationalDebt = new NationalDebt();
        realty = new Realty();
    }

    public void sell() {
        stock1.sell();
        stock2.sell();
        nationalDebt.sell();
        realty.sell();
    }

    public void buy() {
        stock1.buy();
        stock2.buy();
        nationalDebt.buy();
        realty.buy();
    }

}
