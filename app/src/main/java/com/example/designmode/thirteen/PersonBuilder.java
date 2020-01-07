package com.example.designmode.thirteen;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/7 0007]
 * @function[功能简介]
 **/
public abstract class PersonBuilder extends View {

    protected Paint mPaint = new Paint();

    //绘制一个人所需要的方法 头 身子 左右手 左右脚
//    protected abstract void buildHead();
//    protected abstract void buildBody();
//    protected abstract void buildArmLeft();
//    protected abstract void buildArmRight();
//    protected abstract void buildLegLeft();
//    protected abstract void buildLegRight();


    public PersonBuilder(Context context) {
        super(context);
        init();
    }

    public PersonBuilder(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();

    }

    public PersonBuilder(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();

    }

    private void init() {
        mPaint.setColor(Color.RED);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        canvas.drawCircle(200f,200f,200,mPaint);
    }
}
