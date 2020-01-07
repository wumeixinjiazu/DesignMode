package com.example.lib.seven.qiuhun;

import com.example.lib.LogUtil;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/7 0007]
 * @function[功能简介 吕秀才 求婚人]
 **/
public class LvXiuCai implements ISubject {

    private final Person person;

    public LvXiuCai(Person person) {
        this.person = person;
    }

    @Override
    public void qiuHun() {
        LogUtil.p("吕秀才向" + person.name + "求婚");
    }
}
