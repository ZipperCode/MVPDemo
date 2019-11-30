package com.garbage.mvpdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.garbage.mvpdemo.java.JavaMainActivity
import com.garbage.mvpdemo.kotlin.KotlinMainActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.kt).setOnClickListener{
            val intent:Intent = Intent(
                this@MainActivity,
                KotlinMainActivity::class.java
            )
            startActivity(intent)
        }
        findViewById<Button>(R.id.java).setOnClickListener{
            val intent:Intent = Intent(
                this@MainActivity,
                JavaMainActivity::class.java
            )
            startActivity(intent)
        }
    }
}
