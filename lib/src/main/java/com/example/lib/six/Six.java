package com.example.lib.six;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/7 0007]
 * @function[功能简介 第六章 装饰模式]
 **/
public class Six {
    public static void main(String[] args) {
        //ConcreteConmponent 具体组件类
        Person person = new Person("WengCJ");

        //ConcreteDecorator 具体装饰类
        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();
        Sneakers sneakers = new Sneakers();

        tShirts.Decorate(person);
        bigTrouser.Decorate(tShirts);
        sneakers.Decorate(bigTrouser);

        sneakers.show();
    }
}
