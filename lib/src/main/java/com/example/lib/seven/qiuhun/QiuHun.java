package com.example.lib.seven.qiuhun;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/7 0007]
 * @function[功能简介 求婚代理]
 **/
public class QiuHun {

    public static void main(String[] args) {

        //创建郭芙蓉
        Person guoFuRong = new Person();
        guoFuRong.name = "郭芙蓉";

        //创建代理人小六
        XiaoLiuProxy proxy = new XiaoLiuProxy(guoFuRong);
        proxy.qiuHun();
    }
}
