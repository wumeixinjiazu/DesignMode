package com.example.lib.eight;

import com.example.lib.LogUtil;
import com.example.lib.eight.factory.SimpleFactory;
import com.example.lib.eight.factory.UndergraduateFactory;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/7 0007]
 * @function[功能简介 第八章 工厂模式 学习雷锋去帮助老人 ]
 **/
public class Eight {
    public static void main(String[] args) {

        //工厂模式
        UndergraduateFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeiFeng();
        student.buyRice();
        student.sweep();
        student.wash();

        LogUtil.p("-------------------------");

        //简单工厂模式
        LeiFeng 大学生 = SimpleFactory.createLeiFeng("大学生");
        大学生.wash();
        大学生.sweep();
        大学生.buyRice();

        //区别： 假如现在需要添加一个官员去帮助老人 或者 把大学生换成志愿者(工厂模式只要修改的地方比简单工厂模式少)
        //      1，简单工厂模式的做法:
        //          1.1 在SimpleFactoty switch里面多加一个case
        //          1.2 多创建一个官员类继承LeiFeng

        //      2. 工厂模式的做法
        //          2.1 创建一个官员类工厂（负责生产官员）
        //          2.2 创建一个官员类

        // 结论: 在简单工厂模式中， 违背了开放封闭原则（修改了SimpleFactoty）。
        //       而工厂模式中很明显没有，只是在原有的基础上进行扩展。不过会造成类的增加


    }
}
