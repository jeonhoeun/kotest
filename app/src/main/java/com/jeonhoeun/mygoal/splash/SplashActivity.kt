package com.jeonhoeun.mygoal.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.jeonhoeun.mygoal.HomeActivity
import com.jeonhoeun.mygoal.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        findViewById<Button>(R.id.button_move_to_home).setOnClickListener {
            finish()
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }
}