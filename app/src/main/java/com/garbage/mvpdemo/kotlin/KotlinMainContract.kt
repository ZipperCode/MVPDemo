package com.garbage.mvpdemo.kotlin

import com.garbage.mvpdemo.base.java.JavaBaseContract.JavaIModel
import com.garbage.mvpdemo.base.java.JavaBaseContract.JavaIView
import com.garbage.mvpdemo.base.kotlin.KotlinBaseContract

interface KotlinMainContract {
    interface KotlinMainIView : KotlinBaseContract.KotlinIView {
        fun setText(text: String?) //将数据设置到视图中
        fun getText(): String? //获取视图数据
    }

    interface KotlinMainIModel : KotlinBaseContract.KotlinIModel {
        //获取model数据
        val text: String?
    }
}