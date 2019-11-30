package com.garbage.mvpdemo.base.java;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.garbage.mvpdemo.base.java.JavaBaseContract.*;
public abstract class JavaBaseActivity<M extends JavaIModel, V extends JavaIView, P extends JavaIPresenter>
        extends AppCompatActivity implements JavaIBaseMVP<M,V,P> {
    protected P presenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
        if(presenter != null){
            presenter.registerModel(createModel());
            presenter.registerView(createView());
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(presenter != null){
            presenter.onDestroy();
        }
    }
}
