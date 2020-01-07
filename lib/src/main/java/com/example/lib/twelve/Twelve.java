package com.example.lib.twelve;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/7 0007]
 * @function[功能简介 第十二章 外观模式 买股票 自己需要了解很多东西  买基金 只要买入卖出就好]
 **/
public class Twelve {
    public static void main(String[] args) {

        //外观模式 统一管理 如果没有基金，那我们就要对每个股票 国债 自己生成实例去管理
        Fund fund = new Fund();
        fund.sell();
        fund.buy();
    }
}
