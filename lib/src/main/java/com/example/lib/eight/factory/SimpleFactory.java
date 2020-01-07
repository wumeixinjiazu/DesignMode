package com.example.lib.eight.factory;

import com.example.lib.eight.LeiFeng;
import com.example.lib.eight.Undergraduate;
import com.example.lib.eight.Volunteer;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/7 0007]
 * @function[功能简介 简单工厂模式]
 **/
public class SimpleFactory {

    public static LeiFeng createLeiFeng(String type){
        LeiFeng leiFeng = null;
        switch (type){
            case "大学生":
                leiFeng = new Undergraduate();
                break;
            case "社区志愿者":
                leiFeng = new Volunteer();
                break;
        }
        return leiFeng;
    }
}
