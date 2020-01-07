package com.example.lib.seven.qiuhun;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/7 0007]
 * @function[功能简介 代理人 - 小六]
 **/
public class XiaoLiuProxy implements ISubject {

    private LvXiuCai lvXiuCai;

    public XiaoLiuProxy(Person person) {
        if (lvXiuCai == null){
            lvXiuCai = new LvXiuCai(person);
        }
    }

    @Override
    public void qiuHun() {
        lvXiuCai.qiuHun();
    }
}
