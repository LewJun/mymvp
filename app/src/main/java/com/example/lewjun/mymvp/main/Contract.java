package com.example.lewjun.mymvp.main;

import com.example.lewjun.mymvp.BasePresenter;
import com.example.lewjun.mymvp.BaseView;

public class Contract {
    interface View extends BaseView {
        /**
         * hello
         */
        void hello();
    }

    interface Presenter extends BasePresenter<View> {

    }
}
