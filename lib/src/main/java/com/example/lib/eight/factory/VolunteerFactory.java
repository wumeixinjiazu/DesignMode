package com.example.lib.eight.factory;

import com.example.lib.eight.LeiFeng;
import com.example.lib.eight.Volunteer;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/7 0007]
 * @function[功能简介 社区志愿者工厂类]
 **/
public class VolunteerFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
