package com.example.designmode.two;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import com.example.designmode.R;

/**
 * @author[wengCJ]
 * @version[创建日期，2020/1/6 0006]
 * @function[功能简介 商场促销，简单工厂模式和策略模式的应用]
 **/
public class TwoActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etPrice;
    private EditText etNumber;
    private TextView tvBuyRecord;
    private TextView tvTotal;
    private double totalPrice  = 0;
    private Spinner spinnerCalWay;
    private String curCashWay;//当前选中的折扣

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_layout);
        initView();
    }

    private void initView() {
        etPrice = findViewById(R.id.et_price);
        etNumber = findViewById(R.id.et_number);
        tvBuyRecord = findViewById(R.id.tv_buy_record);
        tvTotal = findViewById(R.id.tv_total);
        Button btnReset = findViewById(R.id.btn_reset);
        Button btnConfirm = findViewById(R.id.btn_confirm);
        spinnerCalWay = findViewById(R.id.spinner_cal_way);

        btnReset.setOnClickListener(this);
        btnConfirm.setOnClickListener(this);

        spinnerCalWay.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                curCashWay = getResources().getStringArray(R.array.spinner_cal_way)[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_reset:
                etPrice.setText("");
                etNumber.setText("");
                tvBuyRecord.setText("");
                tvTotal.setText("");
                break;

            case R.id.btn_confirm:
                //商品价格
                double goodPrice = Double.parseDouble(etPrice.getText().toString().trim());
                //商品件数
                int goodNumber = Integer.parseInt(etNumber.getText().toString().trim());

                totalPrice += goodPrice * goodNumber;

                //根据下拉框选取计价模式 下面是策略模式 跟 简单工厂模式的结合
                CashContext cashContext = new CashContext(curCashWay);
                //获取最后收取的金额
                double lastAcceptCash = cashContext.GetResult(totalPrice);

                //下面是简单工厂模式
//                CashSuper cashSuper = CashFactory.createAcceptCash(curCashWay);
//                cashSuper.acceptCash(totalPrice);

                //区别：简单工厂模式：客户端需要认识两个类  而策略模式 客户端只需要认识一个类 耦合降低

                tvBuyRecord.append("单价：" + goodPrice + " 数量：" + goodNumber + " 总价：" + lastAcceptCash + "\n");
                tvTotal.setText("总价为：" + lastAcceptCash);
                break;

        }
    }
}
