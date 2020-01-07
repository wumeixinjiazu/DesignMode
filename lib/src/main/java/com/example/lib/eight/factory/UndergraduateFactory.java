package com.example.lib.eight.factory;

import com.example.lib.eight.LeiFeng;
import com.example.lib.eight.Undergraduate;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/7 0007]
 * @function[功能简介 大学生工厂类]
 **/
public class UndergraduateFactory implements IFactory{
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
