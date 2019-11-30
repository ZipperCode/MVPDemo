package com.garbage.mvpdemo.java;

public class JavaMainModelImpl implements JavaMainContract.JavaMainIModel {

    @Override
    public String getText() {
        return "Model 层返回的数据";
    }
}
