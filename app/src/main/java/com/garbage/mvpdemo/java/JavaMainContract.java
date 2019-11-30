package com.garbage.mvpdemo.java;

import com.garbage.mvpdemo.base.java.JavaBaseContract;

public interface JavaMainContract {
    interface JavaMainIView extends JavaBaseContract.JavaIView {
        void setText(String text); //将数据设置到视图中
        String getText(); //获取视图数据
    }

    interface JavaMainIModel extends JavaBaseContract.JavaIModel{
        String getText(); //获取model数据
    }
}
