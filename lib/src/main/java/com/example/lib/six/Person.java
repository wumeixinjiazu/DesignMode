package com.example.lib.six;

import com.example.lib.LogUtil;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/7 0007]
 * @function[功能简介 人]
 **/
public class Person {
    private String name;

    public Person(){

    }

    public Person(String name) {
        this.name = name;

    }

    public void show() {
        LogUtil.p("装饰的" + name);
    }
}
