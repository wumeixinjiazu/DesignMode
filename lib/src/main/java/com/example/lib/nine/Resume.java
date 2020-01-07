package com.example.lib.nine;

import com.example.lib.LogUtil;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/7 0007]
 * @function[功能简介 简历类]
 **/
public class Resume implements Cloneable {

    public String name;
    public int age;
    public WorkExperience workExperience;
    public Resume(){
        workExperience = new WorkExperience();
    }

    public void show(){
        LogUtil.p(name + "-"+age + "-"+workExperience.workTime + "-"+workExperience.company);
    }

    @Override
    protected Object clone()  {
        Resume obj = new Resume();
        obj.workExperience = (WorkExperience) obj.workExperience.clone();
        obj.name = this.name;
        obj.age = this.age;
        return obj;
    }
}
