package com.garbage.mvpdemo.java;

import android.content.Context;
import android.view.View;

import com.garbage.mvpdemo.base.java.JavaBasePresenter;
public class JavaMainPresenter extends JavaBasePresenter<JavaMainContract.JavaMainIModel,JavaMainContract.JavaMainIView> {

    private Context context;

    public void setContext(Context context) {
        this.context = context;
    }
    private boolean validate(){
        return getView() != null && getModel() != null;
    }

    public void proxyOnClickListener(View view){
        //获取model中数据设置到view中
        if(validate()){
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getView().setText(getModel().getText()); //在presenter中将model数据传递到view中显示
                }
            });

        }
    }
    @Override
    public void onDestroy() {
        //可以在这里做资源释放等等
    }
}
