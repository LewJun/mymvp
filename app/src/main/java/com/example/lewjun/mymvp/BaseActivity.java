package com.example.lewjun.mymvp;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author LewJun
 */
public abstract class BaseActivity<V extends BaseView, P extends BasePresenter<V>>
        extends AppCompatActivity implements BaseView {
    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutResId());
        mPresenter = initPresenter();
        mPresenter.attachView((V) this);

        mPresenter.start();
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
    }

    /**
     * 初始化Presenter
     *
     * @return Presenter
     */
    protected abstract P initPresenter();

    /**
     * 得到页面布局id
     *
     * @return 页面布局id
     */
    protected abstract int getLayoutResId();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
            mPresenter.destroy();
        }
    }

    @Override
    public Context getContext() {
        return this;
    }

}
