package com.garbage.mvpdemo.base.kotlin

import com.garbage.mvpdemo.base.kotlin.KotlinBaseContract.*
import java.lang.ref.WeakReference

abstract class KotlinBasePresenter<M : KotlinIModel,V : KotlinIView> :
    KotlinIPresenter<M, V> {
    private lateinit var model:M

    private lateinit var weakReference:WeakReference<V>

    override fun registerModel(model: M) {
        this.model = model
    }

    override fun registerView(view: V) {
        this.weakReference = WeakReference(view)
    }

    fun getView() = this.weakReference.get()

    fun getModel() = this.model
}
