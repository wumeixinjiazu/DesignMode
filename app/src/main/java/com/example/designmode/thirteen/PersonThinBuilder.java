package com.example.designmode.thirteen;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/7 0007]
 * @function[功能简介 建造一个瘦的人]
 **/
public class PersonThinBuilder extends PersonBuilder {

    public PersonThinBuilder(Context context) {
        super(context);
    }

    public PersonThinBuilder(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PersonThinBuilder(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


}
