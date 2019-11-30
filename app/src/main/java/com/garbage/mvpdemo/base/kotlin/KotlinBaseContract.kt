package com.garbage.mvpdemo.base.kotlin

class KotlinBaseContract {
    interface KotlinIModel {
    }
    interface KotlinIPresenter<M,V> {
        fun registerModel(model : M)
        fun registerView(view : V)
        fun onDestroy()
    }

    interface KotlinIView {

    }
}