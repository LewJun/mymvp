package com.example.lewjun.mymvp.main;

import com.example.lewjun.mymvp.BaseActivity;
import com.example.lewjun.mymvp.R;

/**
 * @author LewJun
 */
public class MainActivity extends BaseActivity<Contract.View, Presenter> implements Contract.View {

    @Override
    protected Presenter initPresenter() {
        return new Presenter();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }
}
