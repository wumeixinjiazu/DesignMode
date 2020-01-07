package com.example.lib.nine;

import com.example.lib.LogUtil;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/7 0007]
 * @function[功能简介 第九章 原型模式]
 **/
public class Nine {
    public static void main(String[] args) {


        Resume resume = new Resume();
        resume.age = 10;
        resume.name = "张三";
        resume.workExperience.company = "TengXun";
        resume.workExperience.workTime = "2020";

        //复制一个对象
        Resume clone = (Resume) resume.clone();
        clone.age = 100;
        clone.name = "李四";
        clone.workExperience.company = "WeiXin";
        clone.workExperience.workTime = "2019";
        resume.show();
        clone.show();

        //现在上面是修改了clone的 WorkExperience 是没有修改clone
        //注意 如果复制的对象中含有 对象引用。例如 WorkExperience这个类
        //那么 如果不修改clone类的话。只会复制其地址引用。

        //只有修改clone类 才能复制出另一个地址引用
    }
}
