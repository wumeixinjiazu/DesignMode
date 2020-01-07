package com.example.lib.six;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/7 0007]
 * @function[功能简介 服装类]
 **/
public class Finery extends Person {

    private Person component;

    /**
     * 打扮
     *
     * @param component
     */
    public void Decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
