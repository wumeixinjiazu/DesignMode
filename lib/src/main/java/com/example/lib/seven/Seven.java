package com.example.lib.seven;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/7 0007]
 * @function[功能简介 第七章 代理模式]
 *
 * 追求者通过代理送礼物给被追求者
 **/
public class Seven {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.name = "林娇娇";

        //通过代理类送东西给林娇娇
        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveChocolate();
        proxy.giveChocolate();
        proxy.giveDolls();
        proxy.giveFlowers();
    }
}
