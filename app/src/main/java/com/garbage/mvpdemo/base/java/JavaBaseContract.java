package com.garbage.mvpdemo.base.java;

public interface JavaBaseContract {
    interface JavaIView{
    }

    interface JavaIModel{
    }

    interface JavaIPresenter<M extends JavaIModel,V extends JavaIView>{
        void registerModel(M model);
        void registerView(V view);
        void onDestroy();
    }
}
