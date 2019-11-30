package com.garbage.mvpdemo.kotlin

import android.content.Context
import android.view.View
import com.garbage.mvpdemo.base.kotlin.KotlinBasePresenter
import com.garbage.mvpdemo.kotlin.KotlinMainContract.KotlinMainIModel
import com.garbage.mvpdemo.kotlin.KotlinMainContract.KotlinMainIView

class KotlinMainPresenter : KotlinBasePresenter<KotlinMainIModel, KotlinMainIView>() {
    private var context: Context? = null

    fun setContext(context: Context?) {
        this.context = context
    }

    private fun validate(): Boolean {
        return getView() != null && getModel() != null
    }

    fun proxyOnClickListener(view: View?) { //获取model中数据设置到view中
        if (validate()) {
            view?.setOnClickListener{
                getView()!!.setText(getModel()!!.text) //在presenter中将model数据传递到view中显示
            }

        }
    }

    override fun onDestroy() { //可以在这里做资源释放等等
    }
}