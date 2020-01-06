package com.example.mvpcoolweather.chooseArea;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mvpcoolweather.R;
import com.example.mvpcoolweather.base.BaseFragment;

import java.util.List;

/**
 * @author[wengCJ]
 * @version[创建日期，2019/12/22 0022]
 * @function[功能简介]
 **/
public class ChooseAreaFragment extends BaseFragment implements View.OnClickListener, IChooseAreaContract.IChooseAreaView {

    private static final int LEVEL_PROVINCE = 0;
    private static final int LEVEL_CITY = 1;
    private static final int LEVEL_COUNTY = 2;

    /**
     * 当前选中的级别
     */
    private int currentLevel = LEVEL_PROVINCE;

    private ProgressDialog progressDialog;

    private TextView titleText;

    private Button backButton;

    private ListView listView;

    private ArrayAdapter<String> adapter;
    private ChooseAreaPresenter mPresenter;
    private ProgressDialog mProgressDialog;
    private List<String> dataList;

    @Override
    protected View initLayout(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.choose_area, container, false);
    }

    @Override
    protected void initView() {
        titleText = mRootView.findViewById(R.id.title_text);
        backButton = mRootView.findViewById(R.id.back_button);
        listView = mRootView.findViewById(R.id.list_view);
    }

    /**
     * 初始化数据
     */
    @Override
    protected void initData() {
        mPresenter = new ChooseAreaPresenter(this);
        String address = "http://guolin.tech/api/china";
        mPresenter.handlerData(address, "province");//这里调用ChooseAreaPresenter 处理数据 一开始首先显示省级数据

        listView.setOnItemClickListener(new AdapterView.OnItemCl