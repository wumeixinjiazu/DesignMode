package com.example.lib.one;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/6 0006]
 * @function[功能简介 操作运算符工厂类]
 **/
public class OperationFactory {

    public static Operation createOperate(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;

        }
        return operation;
    }
}
