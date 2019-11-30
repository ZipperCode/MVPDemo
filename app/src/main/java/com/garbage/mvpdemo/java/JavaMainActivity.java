package com.garbage.mvpdemo.java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.garbage.mvpdemo.R;
import com.garbage.mvpdemo.base.java.JavaBaseActivity;
import com.garbage.mvpdemo.java.JavaMainContract.*;

public class JavaMainActivity extends JavaBaseActivity<JavaMainIModel,
        JavaMainIView,JavaMainPresenter> implements JavaMainIView{
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_main);
        textView = findViewById(R.id.tv_java);
        presenter.proxyOnClickListener(findViewById(R.id.button));
    }

    @Override
    public JavaMainIModel createModel() {
        return new JavaMainModelImpl();
    }

    @Override
    public JavaMainIView createView() {
        return this;
    }

    @Override
    public JavaMainPresenter createPresenter() {
        return new JavaMainPresenter();
    }

    @Override
    public void setText(String text) {
        textView.setText(text);
    }

    @Override
    public String getText() {
        return textView.getText().toString();
    }
}
