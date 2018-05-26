package com.example.lewjun.mymvp;

public interface BasePresenter<V extends BaseView> {
    void attachView(V view);

    void detachView();

    void start();

    void destroy();
}