package com.garbage.mvpdemo.base.java;

import com.garbage.mvpdemo.base.java.JavaBaseContract.*;

import java.lang.ref.WeakReference;

public abstract class JavaBasePresenter<M extends JavaIModel, V extends JavaIView>
        implements JavaIPresenter<M,V>{
    private M model;
    private WeakReference<V> viewReference; //弱引用防止内存泄露

    @Override
    public void registerModel(M model) {
        this.model = model;
    }

    @Override
    public void registerView(V view) {
        viewReference = new WeakReference<V>(view);
    }

    public V getView(){
        return viewReference.get() == null? null:viewReference.get();
    }

    public M getModel(){
        return model;
    }
}
