package com.garbage.mvpdemo.base.kotlin

import com.garbage.mvpdemo.base.kotlin.KotlinBaseContract.*

interface KotlinIBaseMVP<M : KotlinIModel, V : KotlinIView,P : KotlinIPresenter<M,V>> {
    fun createView():V
    fun createModel():M
    fun createPresenter():P
}