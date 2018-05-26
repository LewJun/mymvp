package com.example.lewjun.mymvp.main;

import android.util.Log;

import com.example.lewjun.mymvp.BasePresenterImpl;

/**
 * @author LewJun
 */
public class Presenter extends BasePresenterImpl<Contract.View> implements Contract.Presenter {
    private static final String TAG = "Presenter";

    @Override
    public void start() {
        super.start();
        Log.i(TAG, "start: ");
    }
}
