package com.garbage.mvpdemo.kotlin

import android.os.Bundle
import android.widget.TextView
import com.garbage.mvpdemo.R
import com.garbage.mvpdemo.base.kotlin.KotlinBaseActivity
import com.garbage.mvpdemo.kotlin.KotlinMainContract.*

class KotlinMainActivity : KotlinBaseActivity<KotlinMainIModel, KotlinMainIView,
        KotlinMainPresenter>(), KotlinMainIView {
    private var textView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java_main)
        textView = findViewById(R.id.tv_java)
        presenter!!.proxyOnClickListener(findViewById(R.id.button))
    }

    override fun setText(text: String?) {
        this.textView!!.text = text!!
    }

    override fun getText(): String? {
        return this.textView!!.text.toString()
    }

    override fun createModel(): KotlinMainIModel = KotlinMainModelImpl()

    override fun createView(): KotlinMainIView  = this

    override fun createPresenter(): KotlinMainPresenter = KotlinMainPresenter()


}