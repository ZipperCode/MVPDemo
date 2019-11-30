package com.garbage.mvpdemo.base.kotlin

import com.garbage.mvpdemo.base.kotlin.KotlinBaseContract.*
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class KotlinBaseActivity <M : KotlinIModel, V : KotlinIView, P :KotlinIPresenter<M,V>>
    : AppCompatActivity(), KotlinIBaseMVP<M, V, P> {
    protected lateinit var presenter:P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = createPresenter()?.apply{
            registerModel(createModel())
            registerView(createView())
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter?.onDestroy()
    }
}
