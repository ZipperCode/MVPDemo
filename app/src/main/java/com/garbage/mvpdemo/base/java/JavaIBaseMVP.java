package com.garbage.mvpdemo.base.java;

import com.garbage.mvpdemo.base.java.JavaBaseContract.*;
public interface JavaIBaseMVP<M extends JavaIModel,V extends JavaIView,P extends JavaIPresenter> {
    M createModel();
    V createView();
    P createPresenter();
}
