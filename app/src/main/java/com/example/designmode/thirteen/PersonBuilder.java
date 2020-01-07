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
public class PersonBuilder extends View {
    private Paint mPaint = new Paint();


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
        canvas.drawLine(20,20,200,200,mPaint);
        RectF rect = new RectF(200,200,400,400);
        canvas.drawRoundRect(rect,0.5f, 0.5f,mPaint);

    }
}
